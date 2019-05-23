package com.tcs.infy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id 
	@GeneratedValue
	private int vehicleid;
	
	@Column
	private String vehcilename;

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
	

}