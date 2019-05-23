package com.tcs.infy.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "UserInfo") // This tells Hibernate to make a table out of this class
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "FirstName")
	private String name;

	private String email;

	@Embedded
	@AttributeOverride(name = "doorNo", column = @Column(name = "HomeDoorNo"))
	private Address homeAddress;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "doorNo", column = @Column(name = "OfficeNo")),
			@AttributeOverride(name = "street", column = @Column(name = "OfficeStreet")),
			@AttributeOverride(name = "city", column = @Column(name = "OfficeCity")),
			@AttributeOverride(name = "state", column = @Column(name = "OfficeState")),
			@AttributeOverride(name = "pincode", column = @Column(name = "OfficePinCode")) })
	private Address officeAddress;

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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

}
