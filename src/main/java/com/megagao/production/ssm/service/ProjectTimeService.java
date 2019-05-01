package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.ProjectTime;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProjectTimeVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface ProjectTimeService {
	
    List<ProjectTimeVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, ProjectTimeVO projectTimeVO) throws Exception;

	ProjectTimeVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(ProjectTime projectTime) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(ProjectTime projectTime) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(ProjectTime projectTime) throws Exception;
    
   
    

    //根据文档id查找文档信息
    EUDataGridResult searchProjectTimeByProjectTimeId(int page, int rows, String projectTimeId) throws Exception;
	
}
