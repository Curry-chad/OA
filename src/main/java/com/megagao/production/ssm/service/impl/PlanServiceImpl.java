package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.Plan;

import com.megagao.production.ssm.domain.PlanExample;

import com.megagao.production.ssm.domain.customize.CustomResult;

import com.megagao.production.ssm.domain.vo.COrderVO;

import com.megagao.production.ssm.domain.vo.PlanVO;

import com.megagao.production.ssm.mapper.PlanMapper;

import com.megagao.production.ssm.service.PlanService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class PlanServiceImpl implements PlanService {



	

	@Autowired

    PlanMapper planMapper;

	@Override

	public List<PlanVO> find() throws Exception{

		PlanExample example = new PlanExample();

		return planMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, PlanVO planVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<PlanVO> list = planMapper.find(planVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<PlanVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public PlanVO get(String id) throws Exception{

		return planMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = planMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = planMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(Plan plan) throws Exception{

		int i = planMapper.insert(plan);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(Plan plan) throws Exception{

		int i = planMapper.updateByPrimaryKeySelective(plan);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(Plan plan) throws Exception{

		int i = planMapper.updateByPrimaryKey(plan);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updatePlanNote(Plan plan) throws Exception{

		int i = planMapper.updatePlanNote(plan);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	



	

	@Override

	public EUDataGridResult searchPlanByPlanId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<PlanVO> list = planMapper.searchPlanByPlanId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<PlanVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	@Override

	public EUDataGridResult searchPlanByPlanTheme(int page, int rows, String planName)

			throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<PlanVO> list = planMapper.searchPlanByPlanTheme(planName);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<PlanVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public EUDataGridResult searchPlanByPlanType(int page, int rows, String planType)

			throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<PlanVO> list = planMapper.searchPlanByPlanType(planType);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<PlanVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

}