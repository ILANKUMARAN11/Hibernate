package com.tcs.infy.entity;


import java.util.Collection;
import java.util.HashSet;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class User 
{
	
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="FirstName")
    private String name;

    private String email;
    
    @ElementCollection
    @JoinTable(name="User_Address",joinColumns=@JoinColumn(name="User_ID"))
    @GenericGenerator(name = "increment-gen", strategy = "increment")
    @CollectionId(column=@Column(name="Address_ID"),generator="increment-gen")
    private Collection<Address> listOfaddress=new HashSet<Address>();
    
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

	public Collection<Address> getListOfaddress() {
		return listOfaddress;
	}

	public void setListOfaddress(Collection<Address> listOfaddress) {
		this.listOfaddress = listOfaddress;
	}

	


}
