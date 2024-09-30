package com.tcs.infy.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="UserInfo")

//Below annotation @NamedQueries helps us to have multiple named queries in single block.
@NamedQueries({
    @NamedQuery(name="User.selectAll",
                query="SELECT c FROM User c"),
    @NamedQuery(name="User.readByName",
                query="SELECT c FROM User c WHERE c.name = :name"),
}) 

//Consider you have a situation that u need only one named query then below is the sample.
@NamedQuery(name="User.selectIlanOnly",query="SELECT c FROM User c where c.name=:name")
//##############################################################################
@NamedNativeQuery(name = "User.fetchByEmail" ,
query="SELECT * FROM user_info WHERE email = 'HHH@gamil.com'",
resultClass = User.class
)

@NamedNativeQueries
({
	@NamedNativeQuery(name="User.fetchAll",
                query="SELECT * FROM user_info"),
	@NamedNativeQuery(name="User.fecthRanjani",
                query="SELECT * FROM user_info WHERE first_name = :wifeName",resultClass = User.class),
}) 
public class User {
    @Id
    private Integer id;

    @Column(name="FirstName")
    private String name;

    private String email;
    
    @Temporal(TemporalType.DATE)
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
	
	@Override
	public String toString()
	{
		return "ID="+this.id+" NAME="+this.name+" EMAIL="+this.email+" DOB="+this.DOB;
	}

		

}
