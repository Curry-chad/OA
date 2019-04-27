package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-04-27
 */
public class Notice {
    private String noticeId;

    private String noticeType;

    private String noticeTheme;

    private Date noticeDate;

    private String empId;

    private String noticeNote;

    private String noticeFile;

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId == null ? null : noticeId.trim();
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType == null ? null : noticeType.trim();
    }

    public String getNoticeTheme() {
        return noticeTheme;
    }

    public void setNoticeTheme(String noticeTheme) {
        this.noticeTheme = noticeTheme == null ? null : noticeTheme.trim();
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getNoticeNote() {
        return noticeNote;
    }

    public void setNoticeNote(String noticeNote) {
        this.noticeNote = noticeNote == null ? null : noticeNote.trim();
    }

    public String getNoticeFile() {
        return noticeFile;
    }

    public void setNoticeFile(String noticeFile) {
        this.noticeFile = noticeFile == null ? null : noticeFile.trim();
    }
}