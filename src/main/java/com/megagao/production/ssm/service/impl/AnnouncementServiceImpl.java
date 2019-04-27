package com.megagao.production.ssm.service.impl;



import java.util.List;



import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.Announcement;

import com.megagao.production.ssm.domain.AnnouncementExample;

import com.megagao.production.ssm.domain.customize.CustomResult;

import com.megagao.production.ssm.domain.vo.COrderVO;

import com.megagao.production.ssm.domain.vo.AnnouncementVO;

import com.megagao.production.ssm.mapper.AnnouncementMapper;

import com.megagao.production.ssm.service.AnnouncementService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;



@Service

public class AnnouncementServiceImpl implements AnnouncementService {



	

	@Autowired

    AnnouncementMapper AnnouncementMapper;

	@Override

	public List<AnnouncementVO> find() throws Exception{

		AnnouncementExample example = new AnnouncementExample();

		return AnnouncementMapper.selectByExample(example);

	}

	

	@Override

	public EUDataGridResult getList(int page, int rows, AnnouncementVO AnnouncementVO) throws Exception{

		

		//分页处理

		PageHelper.startPage(page, rows);

		List<AnnouncementVO> list = AnnouncementMapper.find(AnnouncementVO);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<AnnouncementVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}



	@Override

	public AnnouncementVO get(String id) throws Exception{

		return AnnouncementMapper.selectByPrimaryKey(id);

	}



	@Override

	public CustomResult delete(String id) throws Exception{

		int i = AnnouncementMapper.deleteByPrimaryKey(id);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception{

		int i = AnnouncementMapper.deleteBatch(ids);

		if(i>0){

			return CustomResult.ok();

		}else{

			return null;

		}

	}



	@Override

	public CustomResult insert(Announcement Announcement) throws Exception{

		int i = AnnouncementMapper.insert(Announcement);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "新增订单失败");

		}

	}



	@Override

	public CustomResult update(Announcement Announcement) throws Exception{

		int i = AnnouncementMapper.updateByPrimaryKeySelective(Announcement);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAll(Announcement Announcement) throws Exception{

		int i = AnnouncementMapper.updateByPrimaryKey(Announcement);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单失败");

		}

	}



	@Override

	public CustomResult updateAnnouncementText(Announcement Announcement) throws Exception{

		int i = AnnouncementMapper.updateAnnouncementText(Announcement);

		if(i>0){

			return CustomResult.ok();

		}else{

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	



	

	@Override

	public EUDataGridResult searchAnnouncementByAnnouncementId(int page, int rows, String orderId) throws Exception{

		//分页处理

		PageHelper.startPage(page, rows);

		List<AnnouncementVO> list = AnnouncementMapper.searchAnnouncementByAnnouncementId(orderId);

		//创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		//取记录总条数

		PageInfo<AnnouncementVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	

	


	
}