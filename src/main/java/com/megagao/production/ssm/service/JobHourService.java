package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.JobHour;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.JobHourVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface JobHourService {
	
    List<JobHourVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, JobHourVO jobHourVO) throws Exception;

	JobHourVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(JobHour jobHour) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(JobHour jobHour) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(JobHour jobHour) throws Exception;
    

    

    //根据文档id查找文档信息
    EUDataGridResult searchJobHourByJobHourId(int page, int rows, String jobHourId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchJobHourByJobHourTime(int page, int rows,
			String hourTime) throws Exception;
}
