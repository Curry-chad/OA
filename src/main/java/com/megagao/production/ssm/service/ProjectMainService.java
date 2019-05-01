package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.ProjectMain;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProjectMainVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface ProjectMainService {
	
    List<ProjectMainVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, ProjectMainVO projectMainVO) throws Exception;

	ProjectMainVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(ProjectMain projectMain) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(ProjectMain projectMain) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(ProjectMain projectMain) throws Exception;
    
    CustomResult updateProjectMainName(ProjectMain projectMain) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchProjectMainByProjectMainId(int page, int rows, String projectMainId) throws Exception;
	
}
