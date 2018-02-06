package kr.or.dgit.jdbc_study.dto;

import java.util.Date;

public class Student {
	private int studid;
	private String name;
	private String email;
	private Date dob;
	
	
	
	public Student(int studid, String name, String email, Date dob) {
		super();
		this.studid = studid;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Student() {
	
	}
	@Override
	public String toString() {
		return String.format("Student [studid=%s, name=%s, email=%s, dob=%s]", studid, name, email, dob);
	}
	
	
}
