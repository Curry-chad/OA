package com.megagao.production.ssm.domain.vo;

import com.megagao.production.ssm.domain.Employee;
import com.megagao.production.ssm.domain.ProjectMain;

import java.util.Date;

public class ProjectTimeVO {
	private ProjectMain projectMain;
    private String timeId;
    
	public ProjectMain getProjectMain() {
		return projectMain;
	}

	public void setProjectMain(ProjectMain projectMain) {
		this.projectMain = projectMain;
	}

	public String getTimeId() {
		return timeId;
	}

	public void setTimeId(String timeId) {
		this.timeId = timeId;
	}

	private Date timeStart;

	private Date timeEnd;

	

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	

	
	

}