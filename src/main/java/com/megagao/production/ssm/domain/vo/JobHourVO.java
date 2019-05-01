package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class JobHourVO {
	private String hourId;
	private Employee employee;
	private int hourTime;

	private int hourRest;

	public String getHourId() {
		return hourId;
	}

	public void setHourId(String hourId) {
		this.hourId = hourId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getHourTime() {
		return hourTime;
	}

	public void setHourTime(int hourTime) {
		this.hourTime = hourTime;
	}

	public int getHourRest() {
		return hourRest;
	}

	public void setHourRest(int hourRest) {
		this.hourRest = hourRest;
	}
	

}