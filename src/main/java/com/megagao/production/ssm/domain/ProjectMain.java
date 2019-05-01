package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-04-30
 */
public class ProjectMain {
    private String mainId;

    private String mainName;

    private Double mainAmount;

    private String empId;

    private Date mainStart;

    private Date mainEnd;

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName == null ? null : mainName.trim();
    }

    public Double getMainAmount() {
        return mainAmount;
    }

    public void setMainAmount(Double mainAmount) {
        this.mainAmount = mainAmount;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
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