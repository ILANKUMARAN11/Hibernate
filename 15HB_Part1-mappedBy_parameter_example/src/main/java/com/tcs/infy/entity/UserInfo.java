package com.tcs.infy.entity;


import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class UserInfo 
{
	
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="FirstName")
    private String name;

    @Column
    private String email;
    
    @OneToMany(mappedBy="userRef", fetch=FetchType.LAZY)
    private Collection<Address> listOfAddress=new ArrayList<Address>();
    
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	

}
