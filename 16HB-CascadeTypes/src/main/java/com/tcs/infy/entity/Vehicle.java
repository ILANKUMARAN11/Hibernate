package com.tcs.infy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Vehicle {
	
	@Id 
	@GeneratedValue
	private int vehicleid;
	
	@Column
	private String vehcilename;
	
	@ManyToOne(cascade=CascadeType.ALL)
	//Below annotation helps us to ignore the Error if USER is not found for the vehicle.
	@NotFound(action=NotFoundAction.IGNORE)
    private UserInfo user;
	

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVehcilename() {
		return vehcilename;
	}

	public void setVehcilename(String vehcilename) {
		this.vehcilename = vehcilename;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	

}
