package com.tcs.infy.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;


@Entity(name="UserInfo") // This tells Hibernate to make a table out of this class
public class UserInfo 
{
	
    @Id
    private Integer id;

    @Column(name="FirstName")
    private String name;

    @Column
    private String email;
    
    @OneToOne
    //@JoinTable(name="USER_VEHICLE",joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
    private Vehicle vehicle;
    
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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


}