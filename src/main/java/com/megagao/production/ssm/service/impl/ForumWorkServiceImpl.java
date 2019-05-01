package com.megagao.production.ssm.service.impl;

import java.util.List;

import com.megagao.production.ssm.domain.COrder;

import com.megagao.production.ssm.domain.COrderExample;

import com.megagao.production.ssm.domain.ForumWork;

import com.megagao.production.ssm.domain.ForumWorkExample;

import com.megagao.production.ssm.domain.customize.CustomResult;


import com.megagao.production.ssm.domain.vo.ForumWorkVO;

import com.megagao.production.ssm.mapper.ForumWorkMapper;

import com.megagao.production.ssm.service.ForumWorkService;

import com.megagao.production.ssm.domain.customize.EUDataGridResult;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;

@Service

public class ForumWorkServiceImpl implements ForumWorkService {

	@Autowired

	ForumWorkMapper forumWorkMapper;

	@Override

	public List<ForumWorkVO> find() throws Exception {

		ForumWorkExample example = new ForumWorkExample();

		return forumWorkMapper.selectByExample(example);

	}

	@Override

	public EUDataGridResult getList(int page, int rows, ForumWorkVO forumWorkVO) throws Exception {

		// 分页处理

		PageHelper.startPage(page, rows);

		List<ForumWorkVO> list = forumWorkMapper.find(forumWorkVO);

		// 创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		// 取记录总条数

		PageInfo<ForumWorkVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	@Override

	public ForumWorkVO get(String id) throws Exception {

		return forumWorkMapper.selectByPrimaryKey(id);

	}

	@Override

	public CustomResult delete(String id) throws Exception {

		int i = forumWorkMapper.deleteByPrimaryKey(id);

		if (i > 0) {

			return CustomResult.ok();

		} else {

			return null;

		}

	}

	@Override

	public CustomResult deleteBatch(String[] ids) throws Exception {

		int i = forumWorkMapper.deleteBatch(ids);

		if (i > 0) {

			return CustomResult.ok();

		} else {

			return null;

		}

	}

	@Override

	public CustomResult insert(ForumWork forumWork) throws Exception {

		int i = forumWorkMapper.insert(forumWork);

		if (i > 0) {

			return CustomResult.ok();

		} else {

			return CustomResult.build(101, "新增订单失败");

		}

	}

	@Override

	public CustomResult update(ForumWork forumWork) throws Exception {

		int i = forumWorkMapper.updateByPrimaryKeySelective(forumWork);

		if (i > 0) {

			return CustomResult.ok();

		} else {

			return CustomResult.build(101, "修改订单失败");

		}

	}

	@Override

	public CustomResult updateAll(ForumWork forumWork) throws Exception {

		int i = forumWorkMapper.updateByPrimaryKey(forumWork);

		if (i > 0) {

			return CustomResult.ok();

		} else {

			return CustomResult.build(101, "修改订单失败");

		}

	}

	@Override

	public CustomResult updateForumWorkText(ForumWork forumWork) throws Exception {

		int i = forumWorkMapper.updateForumWorkText(forumWork);

		if (i > 0) {

			return CustomResult.ok();

		} else {

			return CustomResult.build(101, "修改订单要求失败");

		}

	}

	@Override

	public EUDataGridResult searchForumWorkByForumWorkId(int page, int rows, String orderId) throws Exception {

		// 分页处理

		PageHelper.startPage(page, rows);

		List<ForumWorkVO> list = forumWorkMapper.searchForumWorkByForumWorkId(orderId);

		// 创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		// 取记录总条数

		PageInfo<ForumWorkVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

	@Override

	public EUDataGridResult searchForumWorkByForumWorkText(int page, int rows, String forumWorkText)

			throws Exception {

		// 分页处理

		PageHelper.startPage(page, rows);

		List<ForumWorkVO> list = forumWorkMapper.searchForumWorkByForumWorkText(forumWorkText);

		// 创建一个返回值对象

		EUDataGridResult result = new EUDataGridResult();

		result.setRows(list);

		// 取记录总条数

		PageInfo<ForumWorkVO> pageInfo = new PageInfo<>(list);

		result.setTotal(pageInfo.getTotal());

		return result;

	}

}