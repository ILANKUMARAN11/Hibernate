package com.tcs.infy.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {

	@Id
	private int vehicleNumber;

	@Column
	private String vehcileType;
	
	@Column
	private String vehcileBrand;

	@ManyToMany
	@JoinTable(name="Join_Ref_Vehicle",joinColumns=@JoinColumn(name="Vehicle_ID_Ref"),inverseJoinColumns=@JoinColumn(name="User_ID_Ref"))
	private Collection<UserInfo> userInfo = new ArrayList<UserInfo>();

	
	
	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehcileType() {
		return vehcileType;
	}

	public void setVehcileType(String vehcileType) {
		this.vehcileType = vehcileType;
	}

	public String getVehcileBrand() {
		return vehcileBrand;
	}

	public void setVehcileBrand(String vehcileBrand) {
		this.vehcileBrand = vehcileBrand;
	}

	public Collection<UserInfo> getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(Collection<UserInfo> userInfo) {
		this.userInfo = userInfo;
	}

}
