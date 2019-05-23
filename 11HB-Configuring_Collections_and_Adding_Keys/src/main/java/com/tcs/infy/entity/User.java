package com.tcs.infy.entity;


import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

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
    @CollectionId(columns=@Column(name="Address_ID"),generator="increment-gen",type=@Type(type="long"))
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
