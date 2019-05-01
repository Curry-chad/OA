package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-05-01
 */
public class JobExit {
    private String exitId;

    private String empId;

    private String exitPost;

    private Double exitSalary;

    private Date exitDate;

    public String getExitId() {
        return exitId;
    }

    public void setExitId(String exitId) {
        this.exitId = exitId == null ? null : exitId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getExitPost() {
        return exitPost;
    }

    public void setExitPost(String exitPost) {
        this.exitPost = exitPost == null ? null : exitPost.trim();
    }

    public Double getExitSalary() {
        return exitSalary;
    }

    public void setExitSalary(Double exitSalary) {
        this.exitSalary = exitSalary;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }
}