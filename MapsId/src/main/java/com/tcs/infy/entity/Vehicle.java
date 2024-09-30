package com.tcs.infy.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
public class Vehicle {
	
	@Id
	@Column(name="USER_ID")
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
	
	@MapsId
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="USER_VEHICLE",joinColumns=@JoinColumn(name="USER_ID"),inverseJoinColumns=@JoinColumn(name="VH_ID"))
	private UserInfo user;

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}
	
	
	

}
