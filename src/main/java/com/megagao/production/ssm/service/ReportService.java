package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Report;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ReportVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface ReportService {
	
    List<ReportVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, ReportVO reportVO) throws Exception;

	ReportVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Report report) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Report report) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Report report) throws Exception;
    
    CustomResult updateReportNote(Report report) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchReportByReportId(int page, int rows, String reportId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchReportByReportTheme(int page, int rows,
			String reportName) throws Exception;
	
	//根据文档类型查找文档信息
	EUDataGridResult searchReportByReportType(int page, int rows,
			String reportType) throws Exception;
}
