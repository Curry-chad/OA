package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.Report;

import com.megagao.production.ssm.domain.ReportExample;

import com.megagao.production.ssm.domain.customize.CustomResult;


import com.megagao.production.ssm.domain.vo.ReportVO;

import com.megagao.production.ssm.mapper.ReportMapper;

import com.megagao.production.ssm.service.ReportService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class ReportServiceImpl implements ReportService {



	

	@Autowired

    ReportMapper reportMapper;

	@Override

	public List<ReportVO> find() throws Exception{

		ReportExample example = new ReportExample();

		return reportMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, ReportVO reportVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<ReportVO> list = reportMapper.find(reportVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ReportVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public ReportVO get(String id) throws Exception{

		return reportMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = reportMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = reportMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(Report report) throws Exception{

		int i = reportMapper.insert(report);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(Report report) throws Exception{

		int i = reportMapper.updateByPrimaryKeySelective(report);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(Report report) throws Exception{

		int i = reportMapper.updateByPrimaryKey(report);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateReportNote(Report report) throws Exception{

		int i = reportMapper.updateReportNote(report);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	



	

	@Override

	public EUDataGridResult searchReportByReportId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<ReportVO> list = reportMapper.searchReportByReportId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ReportVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	@Override

	public EUDataGridResult searchReportByReportTheme(int page, int rows, String reportName)

			throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<ReportVO> list = reportMapper.searchReportByReportTheme(reportName);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ReportVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public EUDataGridResult searchReportByReportType(int page, int rows, String reportType)

			throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<ReportVO> list = reportMapper.searchReportByReportType(reportType);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ReportVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

}