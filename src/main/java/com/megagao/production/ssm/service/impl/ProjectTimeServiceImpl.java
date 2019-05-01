package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.ProjectTime;

import com.megagao.production.ssm.domain.ProjectTimeExample;

import com.megagao.production.ssm.domain.customize.CustomResult;


import com.megagao.production.ssm.domain.vo.ProjectTimeVO;

import com.megagao.production.ssm.mapper.ProjectTimeMapper;

import com.megagao.production.ssm.service.ProjectTimeService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class ProjectTimeServiceImpl implements ProjectTimeService {



	

	@Autowired

    ProjectTimeMapper ProjectTimeMapper;

	@Override

	public List<ProjectTimeVO> find() throws Exception{

		ProjectTimeExample example = new ProjectTimeExample();

		return ProjectTimeMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, ProjectTimeVO ProjectTimeVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<ProjectTimeVO> list = ProjectTimeMapper.find(ProjectTimeVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ProjectTimeVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public ProjectTimeVO get(String id) throws Exception{

		return ProjectTimeMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = ProjectTimeMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = ProjectTimeMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(ProjectTime ProjectTime) throws Exception{

		int i = ProjectTimeMapper.insert(ProjectTime);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(ProjectTime ProjectTime) throws Exception{

		int i = ProjectTimeMapper.updateByPrimaryKeySelective(ProjectTime);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(ProjectTime ProjectTime) throws Exception{

		int i = ProjectTimeMapper.updateByPrimaryKey(ProjectTime);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	



	

	@Override

	public EUDataGridResult searchProjectTimeByProjectTimeId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<ProjectTimeVO> list = ProjectTimeMapper.searchProjectTimeByProjectTimeId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ProjectTimeVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	


	
}