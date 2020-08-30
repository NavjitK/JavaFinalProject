package com.eventhub.userconnection.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GeneratorType;
import org.json.simple.JSONObject;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int userid;
	@Column
	private String name;
	
	@Column
	private String password;
	@Column
	private Date dob;
	@Column
	private String jdoc;
	
	public User() {
		
	}
	
	public User( String name, int usernid, String password, Date dob, String jo) {
		super();

		this.name = name;
		this.userid = userid;
		this.password = password;
		this.dob = dob;
		this.jdoc = jo;
	}

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getJdoc() {
		return jdoc;
	}

	public void setJdoc(String jdoc) {
		this.jdoc = jdoc;
	}
	
	
}
