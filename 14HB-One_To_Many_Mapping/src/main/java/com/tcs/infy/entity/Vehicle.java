package com.tcs.infy.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicle {
	
	@Id 
	@GeneratedValue
	private int vehicleid;
	
	@Column
	private String vehcilename;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_ID")
	private UserInfo userInfo;

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

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	

}
