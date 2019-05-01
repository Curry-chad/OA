package com.megagao.production.ssm.domain;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-05-01
 */
public class ProjectCost {
    private String costId;

    private String mainId;

    private Double costExpect;

    private Double costFact;

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId == null ? null : costId.trim();
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId == null ? null : mainId.trim();
    }

    public Double getCostExpect() {
        return costExpect;
    }

    public void setCostExpect(Double costExpect) {
        this.costExpect = costExpect;
    }

    public Double getCostFact() {
        return costFact;
    }

    public void setCostFact(Double costFact) {
        this.costFact = costFact;
    }
}