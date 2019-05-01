package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.JobExit;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.JobExitVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface JobExitService {
	
    List<JobExitVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, JobExitVO jobExitVO) throws Exception;

	JobExitVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(JobExit jobExit) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(JobExit jobExit) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(JobExit jobExit) throws Exception;
    

    

    //根据文档id查找文档信息
    EUDataGridResult searchJobExitByJobExitId(int page, int rows, String jobExitId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchJobExitByJobExitSalary(int page, int rows,
			String exitSalary) throws Exception;
}
