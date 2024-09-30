package com.tcs.infy.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class LoginData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="Login_ID")
	private int loginId;
	
	@Column(name="Journey_ID")
	private int jouernyID;

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public int getJouernyID() {
		return jouernyID;
	}

	public void setJouernyID(int jouernyID) {
		this.jouernyID = jouernyID;
	}
	
	
	
	

}
