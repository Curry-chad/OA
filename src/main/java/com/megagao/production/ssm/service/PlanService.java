package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Plan;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.PlanVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface PlanService {
	
    List<PlanVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, PlanVO planVO) throws Exception;

	PlanVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Plan plan) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Plan plan) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Plan plan) throws Exception;
    
    CustomResult updatePlanNote(Plan plan) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchPlanByPlanId(int page, int rows, String planId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchPlanByPlanTheme(int page, int rows,
			String planName) throws Exception;
	
	//根据文档类型查找文档信息
	EUDataGridResult searchPlanByPlanType(int page, int rows,
			String planType) throws Exception;
}
