package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class TechnologyVO {
	private String technologyId;

	private String technologyType;

	private String technologyTheme;

	private Date technologyDate;

	private Employee employee;

	private String technologyNote;

	private String technologyFile;

	public String getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(String technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyType() {
		return technologyType;
	}

	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}

	public String getTechnologyTheme() {
		return technologyTheme;
	}

	public void setTechnologyTheme(String technologyTheme) {
		this.technologyTheme = technologyTheme;
	}

	public Date getTechnologyDate() {
		return technologyDate;
	}

	public void setTechnologyDate(Date technologyDate) {
		this.technologyDate = technologyDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTechnologyNote() {
		return technologyNote;
	}

	public void setTechnologyNote(String technologyNote) {
		this.technologyNote = technologyNote;
	}

	public String getTechnologyFile() {
		return technologyFile;
	}

	public void setTechnologyFile(String technologyFile) {
		this.technologyFile = technologyFile;
	}

	

	

}