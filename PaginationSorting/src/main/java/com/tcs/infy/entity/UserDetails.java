package com.tcs.infy.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@NamedQuery(name="UserInfo.getById",query="from UserDetails where id=:uID")
@NamedNativeQuery(name="UserInfo.getByName",query="from UserInfo where name=?",resultClass=UserDetails.class)
/*@org.hibernate.annotations.NamedNativeQueries({
	@org.hibernate.annotations.NamedNativeQuery(name="UserInfo.getByName",query="from UserInfo where name=?")
})
@org.hibernate.annotations.NamedQueries({
	@org.hibernate.annotations.NamedQuery(name = "DeptEmployee_FindByEmployeeNumber", query = "from DeptEmployee where employeeNumber = :employeeNo"),
	@org.hibernate.annotations.NamedQuery(name = "DeptEmployee_FindAllByDesgination", query = "from DeptEmployee where designation = :designation"),
	@org.hibernate.annotations.NamedQuery(name = "DeptEmployee_UpdateEmployeeDepartment", 
	query = "Update DeptEmployee set department = :newDepartment where employeeNumber = :employeeNo")
})*/
@Table(name="UserInfo") // This tells Hibernate to make a table out of this class
public class UserDetails 
{
	
    @Id
    private Integer id;

    @Column(name="FirstName")
    private String name;

    @Column
    private String email;
    
  
    
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

	


}