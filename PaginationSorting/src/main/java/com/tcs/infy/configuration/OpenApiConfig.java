package com.tcs.infy.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springdoc.core.utils.Constants.ALL_PATTERN;

@Configuration
@RequiredArgsConstructor
public class OpenApiConfig {

    private final SpringDocUrl springDocUrl;

    String[] packagesToScan = {"com.tcs.infy.controller"};

    @Bean
    public GroupedOpenApi blogApis() {
        return GroupedOpenApi.builder()
                .group("PAGINATION & SORTING")
                //.pathsToExclude("/api/v1/**", "/v1/**")
                .packagesToScan(packagesToScan)
                .pathsToMatch(ALL_PATTERN)
                .build();
    }


    @ConditionalOnProperty(prefix = "springdoc", name = "security.enabled", havingValue = "false", matchIfMissing = true)
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(this.getInfo())
                .servers(getServers());
    }

    private Info getInfo() {
        return new Info()
                .title("Blog Owner Management API")
                .version("1.0")
                .contact(this.getContact())
                .description("This API exposes endpoints to manage tutorials.")
                .termsOfService("https://www.google.com/terms")
                .license(this.getLicense());
    }

    private Contact getContact() {
        return new Contact()
                .email("ilankumaran@gmail.com")
                .name("ILANKUMARAN ILANGOVAN")
                .url("https://www.google.com");
    }

    private License getLicense() {
        return new License()
                .name("ILAN License")
                .url("https://choosealicense.com/licenses/mit/");
    }

    public List<Server> getServers() {
        return springDocUrl
                .getBaseUrl()
                .entrySet()
                .stream()
                .map(entrySet -> {
                    Server server = new Server();
                    server.setUrl(entrySet.getValue());
                    server.setDescription(String.format("%s environment Base URL", entrySet.getKey()));
                    return server;
                }).collect(Collectors.toList());
    }


}


@Configuration
@ConfigurationProperties("springdoc")
@Data
class SpringDocUrl {
    private Map<String, String> baseUrl = new HashMap<>();

}
