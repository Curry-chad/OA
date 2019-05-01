package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.ProjectMain;

import com.megagao.production.ssm.domain.ProjectMainExample;

import com.megagao.production.ssm.domain.customize.CustomResult;


import com.megagao.production.ssm.domain.vo.ProjectMainVO;

import com.megagao.production.ssm.mapper.ProjectMainMapper;

import com.megagao.production.ssm.service.ProjectMainService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class ProjectMainServiceImpl implements ProjectMainService {



	

	@Autowired

    ProjectMainMapper ProjectMainMapper;

	@Override

	public List<ProjectMainVO> find() throws Exception{

		ProjectMainExample example = new ProjectMainExample();

		return ProjectMainMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, ProjectMainVO ProjectMainVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<ProjectMainVO> list = ProjectMainMapper.find(ProjectMainVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ProjectMainVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public ProjectMainVO get(String id) throws Exception{

		return ProjectMainMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = ProjectMainMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = ProjectMainMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(ProjectMain ProjectMain) throws Exception{

		int i = ProjectMainMapper.insert(ProjectMain);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(ProjectMain ProjectMain) throws Exception{

		int i = ProjectMainMapper.updateByPrimaryKeySelective(ProjectMain);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(ProjectMain ProjectMain) throws Exception{

		int i = ProjectMainMapper.updateByPrimaryKey(ProjectMain);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateProjectMainName(ProjectMain ProjectMain) throws Exception{

		int i = ProjectMainMapper.updateProjectMainName(ProjectMain);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	



	

	@Override

	public EUDataGridResult searchProjectMainByProjectMainId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<ProjectMainVO> list = ProjectMainMapper.searchProjectMainByProjectMainId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<ProjectMainVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	


	
}