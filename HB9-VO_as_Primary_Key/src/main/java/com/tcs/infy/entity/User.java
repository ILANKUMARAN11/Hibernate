package com.tcs.infy.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class User 
{
	@EmbeddedId
    private LoginData loginData;

    @Column(name="FirstName")
    private String name;

    private String email;
    

	public LoginData getLoginData() {
		return loginData;
	}

	public void setLoginData(LoginData loginData) {
		this.loginData = loginData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	

}
