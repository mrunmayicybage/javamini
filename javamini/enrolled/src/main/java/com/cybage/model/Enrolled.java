package com.cybage.model;

import java.sql.Date;

public class Enrolled {
	private int ecid;
	private int userid;
	private int courseid;
	private int completedcourse;
	private Date startdate;
	private Date enddate;
	private String coursename;
	public Enrolled() {
		super();

	}
	public Enrolled(int ecid, int userid, int courseid, int completedcourse, Date startdate, Date enddate, String coursename) {
		super();
		this.ecid = ecid;
		this.userid = userid;
		this.courseid = courseid;
		this.completedcourse = completedcourse;
		this.startdate = startdate;
		this.enddate = enddate;
		this.coursename = coursename;
		}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getEcid() {
		return ecid;
	}
	public void setEcid(int ecid) {
		this.ecid = ecid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getCompletedcourse() {
		return completedcourse;
	}
	public void setCompletedcourse(int completedcourse) {
		this.completedcourse = completedcourse;
	}
	public Date getStartdate() {
		return startdate;
	}

	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	@Override
	public String toString() {
		return "Enrolled [ecid=" + ecid + ", userid=" + userid + ", courseid=" + courseid + ", completedcourse="
				+ completedcourse + ", startdate=" + startdate + ", enddate=" + enddate + ", coursename=" + coursename
				+ "]";
	}
	public void setStartdate(Date date) {
		this.startdate=date;
		
	}
	
	

}
