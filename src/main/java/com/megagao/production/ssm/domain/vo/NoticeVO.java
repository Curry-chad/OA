package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;

import java.util.Date;

public class NoticeVO {
	private String noticeId;

	private String noticeType;

	private String noticeTheme;

	private Date noticeDate;

	private Employee employee;

	private String noticeNote;

	private String noticeFile;

	public String getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getNoticeTheme() {
		return noticeTheme;
	}

	public void setNoticeTheme(String noticeTheme) {
		this.noticeTheme = noticeTheme;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getNoticeNote() {
		return noticeNote;
	}

	public void setNoticeNote(String noticeNote) {
		this.noticeNote = noticeNote;
	}

	public String getNoticeFile() {
		return noticeFile;
	}

	public void setNoticeFile(String noticeFile) {
		this.noticeFile = noticeFile;
	}

	
	

}