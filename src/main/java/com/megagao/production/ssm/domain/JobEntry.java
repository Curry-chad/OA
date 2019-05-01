package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-05-01
 */
public class JobEntry {
    private String entryId;

    private String empId;

    private String entryPost;

    private Double entrySalary;

    private Date entryDate;

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId == null ? null : entryId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEntryPost() {
        return entryPost;
    }

    public void setEntryPost(String entryPost) {
        this.entryPost = entryPost == null ? null : entryPost.trim();
    }

    public Double getEntrySalary() {
        return entrySalary;
    }

    public void setEntrySalary(Double entrySalary) {
        this.entrySalary = entrySalary;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}