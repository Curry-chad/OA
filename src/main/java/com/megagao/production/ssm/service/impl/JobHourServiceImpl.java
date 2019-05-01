package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.JobHour;

import com.megagao.production.ssm.domain.JobHourExample;

import com.megagao.production.ssm.domain.customize.CustomResult;



import com.megagao.production.ssm.domain.vo.JobHourVO;

import com.megagao.production.ssm.mapper.JobHourMapper;

import com.megagao.production.ssm.service.JobHourService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class JobHourServiceImpl implements JobHourService {



	

	@Autowired

    JobHourMapper jobHourMapper;

	@Override

	public List<JobHourVO> find() throws Exception{

		JobHourExample example = new JobHourExample();

		return jobHourMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, JobHourVO jobHourVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<JobHourVO> list = jobHourMapper.find(jobHourVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<JobHourVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public JobHourVO get(String id) throws Exception{

		return jobHourMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = jobHourMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = jobHourMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(JobHour jobHour) throws Exception{

		int i = jobHourMapper.insert(jobHour);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(JobHour jobHour) throws Exception{

		int i = jobHourMapper.updateByPrimaryKeySelective(jobHour);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(JobHour jobHour) throws Exception{

		int i = jobHourMapper.updateByPrimaryKey(jobHour);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	

	



	

	@Override

	public EUDataGridResult searchJobHourByJobHourId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<JobHourVO> list = jobHourMapper.searchJobHourByJobHourId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<JobHourVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	



	@Override

	public EUDataGridResult searchJobHourByJobHourTime(int page, int rows, String hourTime)

			throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<JobHourVO> list = jobHourMapper.searchJobHourByJobHourTime(hourTime);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<JobHourVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

}