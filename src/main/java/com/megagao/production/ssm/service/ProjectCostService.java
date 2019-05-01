package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.ProjectCost;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProjectCostVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface ProjectCostService {
	
    List<ProjectCostVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, ProjectCostVO projectCostVO) throws Exception;

	ProjectCostVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(ProjectCost projectCost) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(ProjectCost projectCost) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(ProjectCost projectCost) throws Exception;
    
   
    

    //根据文档id查找文档信息
    EUDataGridResult searchProjectCostByProjectCostId(int page, int rows, String projectCostId) throws Exception;
	
}
