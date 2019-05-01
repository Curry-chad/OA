package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class JobExitVO {
	private String exitId;
	private Employee employee;
	private String exitPost;

	private double exitSalary;
	private Date exitDate;
	public String getExitId() {
		return exitId;
	}
	public void setExitId(String exitId) {
		this.exitId = exitId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getExitPost() {
		return exitPost;
	}
	public void setExitPost(String exitPost) {
		this.exitPost = exitPost;
	}
	public double getExitSalary() {
		return exitSalary;
	}
	public void setExitSalary(double exitSalary) {
		this.exitSalary = exitSalary;
	}
	public Date getExitDate() {
		return exitDate;
	}
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	
}