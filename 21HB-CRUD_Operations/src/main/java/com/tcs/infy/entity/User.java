package com.tcs.infy.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class User {
    @Id
    private Integer id;

    @Column(name="FirstName")
    private String name;

    private String email;
    
    @Temporal(TemporalType.DATE)
    private Date DOB;

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

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	@Override
	public String toString()
	{
		return "ID="+this.id+" NAME="+this.name+" EMAIL="+this.email+" DOB="+this.DOB;
	}

		

}
