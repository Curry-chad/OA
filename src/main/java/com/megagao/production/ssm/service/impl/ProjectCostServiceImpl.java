package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.ProjectCost;

import com.megagao.production.ssm.domain.ProjectCostExample;

import com.megagao.production.ssm.domain.customize.CustomResult;


import com.megagao.production.ssm.domain.vo.ProjectCostVO;

import com.megagao.production.ssm.mapper.ProjectCostMapper;

import com.megagao.production.ssm.service.ProjectCostService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class ProjectCostServiceImpl implements ProjectCostService {



	

	@Autowired

    ProjectCostMapper ProjectCostMapper;

	@Override

	public List<ProjectCostVO> find() throws Exception{

		ProjectCostExample example = new ProjectCostExample();

		return ProjectCostMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, ProjectCostVO ProjectCostVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<ProjectCostVO> list = ProjectCostMapper.find(ProjectCostVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ProjectCostVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public ProjectCostVO get(String id) throws Exception{

		return ProjectCostMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = ProjectCostMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = ProjectCostMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(ProjectCost ProjectCost) throws Exception{

		int i = ProjectCostMapper.insert(ProjectCost);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(ProjectCost ProjectCost) throws Exception{

		int i = ProjectCostMapper.updateByPrimaryKeySelective(ProjectCost);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(ProjectCost ProjectCost) throws Exception{

		int i = ProjectCostMapper.updateByPrimaryKey(ProjectCost);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	



	

	@Override

	public EUDataGridResult searchProjectCostByProjectCostId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<ProjectCostVO> list = ProjectCostMapper.searchProjectCostByProjectCostId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ProjectCostVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	


	
}