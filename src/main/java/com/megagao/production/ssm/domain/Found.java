package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-04-30
 */
public class Found {
    private String foundId;

    private String foundText;

    private String empId;

    private Date foundDate;

    public String getFoundId() {
        return foundId;
    }

    public void setFoundId(String foundId) {
        this.foundId = foundId == null ? null : foundId.trim();
    }

    public String getFoundText() {
        return foundText;
    }

    public void setFoundText(String foundText) {
        this.foundText = foundText == null ? null : foundText.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }
}