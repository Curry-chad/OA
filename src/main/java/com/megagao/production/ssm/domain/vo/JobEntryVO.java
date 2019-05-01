package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class JobEntryVO {
	private String entryId;
	private Employee employee;
	private String entryPost;

	private double entrySalary;
	private Date entryDate;

	public String getEntryId() {
		return entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getEntryPost() {
		return entryPost;
	}

	public void setEntryPost(String entryPost) {
		this.entryPost = entryPost;
	}

	public double getEntrySalary() {
		return entrySalary;
	}

	public void setEntrySalary(double entrySalary) {
		this.entrySalary = entrySalary;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

}