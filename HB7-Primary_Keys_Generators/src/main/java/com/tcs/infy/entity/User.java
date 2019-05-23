package com.tcs.infy.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class User {
	
    @Id
    @GeneratedValue
    //@GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    
    /*@GeneratedValue(generator="my_seq")
    @SequenceGenerator(name="my_seq",sequenceName="DB_SEQ", allocationSize=1) */
    private Integer id;

    private String name;

    private String email;
    
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

	
	
}
