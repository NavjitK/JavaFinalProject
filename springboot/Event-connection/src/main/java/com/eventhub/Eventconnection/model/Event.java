package com.eventhub.Eventconnection.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String ename;
	@Column
	private Date edate;
	@Column
	private Time etime;
	@Column
	private String eplace;
	@Column
	private String etype;
	@Column
	private String sdesc;
	@Column
	private String ldesc;
	
	public Event() {
		
	}
	public Event(int id, String ename, Date edate, Time etime, String eplace, String etype, String sdesc,
			String ldesc) {
		
		this.id = id;
		this.ename = ename;
		this.edate = edate;
		this.etime = etime;
		this.eplace = eplace;
		this.etype = etype;
		this.sdesc = sdesc;
		this.ldesc = ldesc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public Time getEtime() {
		return etime;
	}
	public void setEtime(Time etime) {
		this.etime = etime;
	}
	public String getEplace() {
		return eplace;
	}
	public void setEplace(String eplace) {
		this.eplace = eplace;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public String getSdesc() {
		return sdesc;
	}
	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}
	public String getLdesc() {
		return ldesc;
	}
	public void setLdesc(String ldesc) {
		this.ldesc = ldesc;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", ename=" + ename + ", edate=" + edate + ", etime=" + etime + ", eplace=" + eplace
				+ ", etype=" + etype + ", sdesc=" + sdesc + ", ldesc=" + ldesc + "]";
	}
	
	
}
