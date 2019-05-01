package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class ForumWorkVO {
	private String workId;
	private Employee employee;
	private String workText;
	private Date workDate;

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getWorkText() {
		return workText;
	}

	public void setWorkText(String workText) {
		this.workText = workText;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

}