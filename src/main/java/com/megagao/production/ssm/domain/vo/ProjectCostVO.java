package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.ProjectMain;


public class ProjectCostVO {
	private ProjectMain projectMain;
    private String costId;
    private double costExpect;
    private double costFact;
	public ProjectMain getProjectMain() {
		return projectMain;
	}
	public void setProjectMain(ProjectMain projectMain) {
		this.projectMain = projectMain;
	}
	public String getCostId() {
		return costId;
	}
	public void setCostId(String costId) {
		this.costId = costId;
	}
	public double getCostExpect() {
		return costExpect;
	}
	public void setCostExpect(double costExpect) {
		this.costExpect = costExpect;
	}
	public double getCostFact() {
		return costFact;
	}
	public void setCostFact(double costFact) {
		this.costFact = costFact;
	}
    
	
	

	
	

}