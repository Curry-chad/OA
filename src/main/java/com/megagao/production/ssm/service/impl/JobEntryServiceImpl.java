package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.JobEntry;

import com.megagao.production.ssm.domain.JobEntryExample;

import com.megagao.production.ssm.domain.customize.CustomResult;



import com.megagao.production.ssm.domain.vo.JobEntryVO;

import com.megagao.production.ssm.mapper.JobEntryMapper;

import com.megagao.production.ssm.service.JobEntryService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class JobEntryServiceImpl implements JobEntryService {



	

	@Autowired

    JobEntryMapper jobEntryMapper;

	@Override

	public List<JobEntryVO> find() throws Exception{

		JobEntryExample example = new JobEntryExample();

		return jobEntryMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, JobEntryVO jobEntryVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<JobEntryVO> list = jobEntryMapper.find(jobEntryVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<JobEntryVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public JobEntryVO get(String id) throws Exception{

		return jobEntryMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = jobEntryMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = jobEntryMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(JobEntry jobEntry) throws Exception{

		int i = jobEntryMapper.insert(jobEntry);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(JobEntry jobEntry) throws Exception{

		int i = jobEntryMapper.updateByPrimaryKeySelective(jobEntry);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(JobEntry jobEntry) throws Exception{

		int i = jobEntryMapper.updateByPrimaryKey(jobEntry);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	

	



	

	@Override

	public EUDataGridResult searchJobEntryByJobEntryId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<JobEntryVO> list = jobEntryMapper.searchJobEntryByJobEntryId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<JobEntryVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	



	@Override

	public EUDataGridResult searchJobEntryByJobEntrySalary(int page, int rows, String entrySalary)

			throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<JobEntryVO> list = jobEntryMapper.searchJobEntryByJobEntrySalary(entrySalary);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<JobEntryVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

}