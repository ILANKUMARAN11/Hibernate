package com.tcs.infy.entity;


import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class User 
{
	
    @Id
    @GeneratedValue
    private Integer userId;

    @Column(name="FirstName")
    private String name;

    private String email;
    
    @ElementCollection
    private Set<Address> listOfaddress=new HashSet<Address>();
    
	

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Set<Address> getListOfaddress() {
		return listOfaddress;
	}

	public void setListOfaddress(Set<Address> listOfaddress) {
		this.listOfaddress = listOfaddress;
	}

	

	

	

}
