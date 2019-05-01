package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class ProjectMainVO {
	private String mainId;

    private String mainName;

    private Double mainAmount;

    private Date mainStart;

    private Date mainEnd;
    
    private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMainId() {
		return mainId;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public String getMainName() {
		return mainName;
	}

	public void setMainName(String mainName) {
		this.mainName = mainName;
	}

	public Double getMainAmount() {
		return mainAmount;
	}

	public void setMainAmount(Double mainAmount) {
		this.mainAmount = mainAmount;
	}

	public Date getMainStart() {
		return mainStart;
	}

	public void setMainStart(Date mainStart) {
		this.mainStart = mainStart;
	}

	public Date getMainEnd() {
		return mainEnd;
	}

	public void setMainEnd(Date mainEnd) {
		this.mainEnd = mainEnd;
	}

	



	

	
	

}