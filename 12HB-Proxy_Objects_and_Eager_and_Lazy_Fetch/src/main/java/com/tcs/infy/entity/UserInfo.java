package com.tcs.infy.entity;


import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;


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
    
    @ElementCollection(fetch=FetchType.EAGER)//(fetch=FetchType.LAZY)
    @JoinTable(name="User_Address",joinColumns=@JoinColumn(name="User_ID"))
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
