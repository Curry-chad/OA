package com.megagao.production.ssm.domain;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-04-17
 */
public class ProcessDocument {
    private String documentId;

    private String documentType;

    private String documentTheme;

    private Date documentDate;

    private String empId;

    private String documentNote;

    private String documentFile;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId == null ? null : documentId.trim();
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    public String getDocumentTheme() {
        return documentTheme;
    }

    public void setDocumentTheme(String documentTheme) {
        this.documentTheme = documentTheme == null ? null : documentTheme.trim();
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getDocumentNote() {
        return documentNote;
    }

    public void setDocumentNote(String documentNote) {
        this.documentNote = documentNote == null ? null : documentNote.trim();
    }

    public String getDocumentFile() {
        return documentFile;
    }

    public void setDocumentFile(String documentFile) {
        this.documentFile = documentFile == null ? null : documentFile.trim();
    }
}