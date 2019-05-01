package com.megagao.production.ssm.service.impl;

import java.util.List;

import com.megagao.production.ssm.domain.COrder;
import com.megagao.production.ssm.domain.COrderExample;
import com.megagao.production.ssm.domain.Technology;
import com.megagao.production.ssm.domain.TechnologyExample;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.TechnologyVO;
import com.megagao.production.ssm.mapper.TechnologyMapper;
import com.megagao.production.ssm.service.TechnologyService;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class TechnologyServiceImpl implements TechnologyService {

	
	@Autowired
    TechnologyMapper technologyMapper;
	@Override
	public List<TechnologyVO> find() throws Exception{
		TechnologyExample example = new TechnologyExample();
		return technologyMapper.selectByExample(example);
	}
	
	@Override
	public EUDataGridResult getList(int page, int rows, TechnologyVO technologyVO) throws Exception{
		
		//分页处理
		PageHelper.startPage(page, rows);
		List<TechnologyVO> list = technologyMapper.find(technologyVO);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TechnologyVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public TechnologyVO get(String id) throws Exception{
		return technologyMapper.selectByPrimaryKey(id);
	}

	@Override
	public CustomResult delete(String id) throws Exception{
		int i = technologyMapper.deleteByPrimaryKey(id);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult deleteBatch(String[] ids) throws Exception{
		int i = technologyMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult insert(Technology technology) throws Exception{
		int i = technologyMapper.insert(technology);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "新增订单失败");
		}
	}

	@Override
	public CustomResult update(Technology technology) throws Exception{
		int i = technologyMapper.updateByPrimaryKeySelective(technology);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单失败");
		}
	}

	@Override
	public CustomResult updateAll(Technology technology) throws Exception{
		int i = technologyMapper.updateByPrimaryKey(technology);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单失败");
		}
	}

	@Override
	public CustomResult updateTechnologyNote(Technology technology) throws Exception{
		int i = technologyMapper.updateTechnologyNote(technology);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单要求失败");
		}
	}
	

	
	@Override
	public EUDataGridResult searchTechnologyByTechnologyId(int page, int rows, String orderId) throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<TechnologyVO> list = technologyMapper.searchTechnologyByTechnologyId(orderId);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TechnologyVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@Override
	public EUDataGridResult searchTechnologyByTechnologyTheme(int page, int rows, String technologyName)
			throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<TechnologyVO> list = technologyMapper.searchTechnologyByTechnologyTheme(technologyName);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TechnologyVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchTechnologyByTechnologyType(int page, int rows, String technologyType)
			throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<TechnologyVO> list = technologyMapper.searchTechnologyByTechnologyType(technologyType);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TechnologyVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
