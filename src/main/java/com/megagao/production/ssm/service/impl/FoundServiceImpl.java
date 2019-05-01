package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.Found;

import com.megagao.production.ssm.domain.FoundExample;

import com.megagao.production.ssm.domain.customize.CustomResult;



import com.megagao.production.ssm.domain.vo.FoundVO;

import com.megagao.production.ssm.mapper.FoundMapper;

import com.megagao.production.ssm.service.FoundService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class FoundServiceImpl implements FoundService {



	

	@Autowired

    FoundMapper FoundMapper;

	@Override

	public List<FoundVO> find() throws Exception{

		FoundExample example = new FoundExample();

		return FoundMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, FoundVO FoundVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<FoundVO> list = FoundMapper.find(FoundVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<FoundVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public FoundVO get(String id) throws Exception{

		return FoundMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = FoundMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = FoundMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(Found Found) throws Exception{

		int i = FoundMapper.insert(Found);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(Found Found) throws Exception{

		int i = FoundMapper.updateByPrimaryKeySelective(Found);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(Found Found) throws Exception{

		int i = FoundMapper.updateByPrimaryKey(Found);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateFoundText(Found Found) throws Exception{

		int i = FoundMapper.updateFoundText(Found);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	



	

	@Override

	public EUDataGridResult searchFoundByFoundId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<FoundVO> list = FoundMapper.searchFoundByFoundId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<FoundVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	


	
}