package com.megagao.production.ssm.domain;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-05-01
 */
public class JobHour {
    private String hourId;

    private String empId;

    private Integer hourTime;

    private Integer hourRest;

    public String getHourId() {
        return hourId;
    }

    public void setHourId(String hourId) {
        this.hourId = hourId == null ? null : hourId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public Integer getHourTime() {
        return hourTime;
    }

    public void setHourTime(Integer hourTime) {
        this.hourTime = hourTime;
    }

    public Integer getHourRest() {
        return hourRest;
    }

    public void setHourRest(Integer hourRest) {
        this.hourRest = hourRest;
    }
}