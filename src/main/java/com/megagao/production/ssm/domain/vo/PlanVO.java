package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class PlanVO {
	private String planId;

	private String planType;

	private String planTheme;

	private Date planDate;

	private Employee employee;

	private String planNote;

	private String planFile;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getPlanTheme() {
		return planTheme;
	}

	public void setPlanTheme(String planTheme) {
		this.planTheme = planTheme;
	}

	public Date getPlanDate() {
		return planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getPlanNote() {
		return planNote;
	}

	public void setPlanNote(String planNote) {
		this.planNote = planNote;
	}

	public String getPlanFile() {
		return planFile;
	}

	public void setPlanFile(String planFile) {
		this.planFile = planFile;
	}

	
	

}