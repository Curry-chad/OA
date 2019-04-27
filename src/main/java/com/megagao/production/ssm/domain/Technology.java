package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-04-27
 */
public class Technology {
    private String technologyId;

    private String technologyType;

    private String technologyTheme;

    private Date technologyDate;

    private String empId;

    private String technologyNote;

    private String technologyFile;

    public String getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId == null ? null : technologyId.trim();
    }

    public String getTechnologyType() {
        return technologyType;
    }

    public void setTechnologyType(String technologyType) {
        this.technologyType = technologyType == null ? null : technologyType.trim();
    }

    public String getTechnologyTheme() {
        return technologyTheme;
    }

    public void setTechnologyTheme(String technologyTheme) {
        this.technologyTheme = technologyTheme == null ? null : technologyTheme.trim();
    }

    public Date getTechnologyDate() {
        return technologyDate;
    }

    public void setTechnologyDate(Date technologyDate) {
        this.technologyDate = technologyDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getTechnologyNote() {
        return technologyNote;
    }

    public void setTechnologyNote(String technologyNote) {
        this.technologyNote = technologyNote == null ? null : technologyNote.trim();
    }

    public String getTechnologyFile() {
        return technologyFile;
    }

    public void setTechnologyFile(String technologyFile) {
        this.technologyFile = technologyFile == null ? null : technologyFile.trim();
    }
}