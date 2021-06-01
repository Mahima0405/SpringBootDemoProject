package com.telusko.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
//	@GeneratedValue
	private int rollnum;
	
	@Column(nullable = false)
	private String stname;
	private String tech;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getName() {
		return stname;
	}
	public void setName(String stname) {
		this.stname = stname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + stname + ", tech=" + tech + "]";
	}
	
	
	
}
