package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class ProcessDocumentVO {
	private String documentId;

	private String documentType;

	private String documentTheme;

	private Date documentDate;

	private Employee employee;

	private String documentNote;

	private String documentFile;

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentTheme() {
		return documentTheme;
	}

	public void setDocumentTheme(String documentTheme) {
		this.documentTheme = documentTheme;
	}

	public Date getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDocumentNote() {
		return documentNote;
	}

	public void setDocumentNote(String documentNote) {
		this.documentNote = documentNote;
	}

	public String getDocumentFile() {
		return documentFile;
	}

	public void setDocumentFile(String documentFile) {
		this.documentFile = documentFile;
	}

}