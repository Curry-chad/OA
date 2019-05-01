package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.Wish;

import com.megagao.production.ssm.domain.WishExample;

import com.megagao.production.ssm.domain.customize.CustomResult;


import com.megagao.production.ssm.domain.vo.WishVO;

import com.megagao.production.ssm.mapper.WishMapper;

import com.megagao.production.ssm.service.WishService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class WishServiceImpl implements WishService {



	

	@Autowired

    WishMapper WishMapper;

	@Override

	public List<WishVO> find() throws Exception{

		WishExample example = new WishExample();

		return WishMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, WishVO WishVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<WishVO> list = WishMapper.find(WishVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<WishVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public WishVO get(String id) throws Exception{

		return WishMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = WishMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = WishMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(Wish Wish) throws Exception{

		int i = WishMapper.insert(Wish);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(Wish Wish) throws Exception{

		int i = WishMapper.updateByPrimaryKeySelective(Wish);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(Wish Wish) throws Exception{

		int i = WishMapper.updateByPrimaryKey(Wish);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateWishText(Wish Wish) throws Exception{

		int i = WishMapper.updateWishText(Wish);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	



	

	@Override

	public EUDataGridResult searchWishByWishId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<WishVO> list = WishMapper.searchWishByWishId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<WishVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	


	
}