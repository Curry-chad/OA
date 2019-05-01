package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.JobEntry;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.JobEntryVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface JobEntryService {
	
    List<JobEntryVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, JobEntryVO jobEntryVO) throws Exception;

	JobEntryVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(JobEntry jobEntry) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(JobEntry jobEntry) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(JobEntry jobEntry) throws Exception;
    

    

    //根据文档id查找文档信息
    EUDataGridResult searchJobEntryByJobEntryId(int page, int rows, String jobEntryId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchJobEntryByJobEntrySalary(int page, int rows,
			String entrySalary) throws Exception;
}
