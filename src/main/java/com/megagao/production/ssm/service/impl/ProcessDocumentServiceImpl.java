package com.megagao.production.ssm.service.impl;

import java.util.List;

import com.megagao.production.ssm.domain.COrder;
import com.megagao.production.ssm.domain.COrderExample;
import com.megagao.production.ssm.domain.ProcessDocument;
import com.megagao.production.ssm.domain.ProcessDocumentExample;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.COrderVO;
import com.megagao.production.ssm.domain.vo.ProcessDocumentVO;
import com.megagao.production.ssm.mapper.ProcessDocumentMapper;
import com.megagao.production.ssm.service.ProcessDocumentService;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ProcessDocumentServiceImpl implements ProcessDocumentService {

	
	@Autowired
    ProcessDocumentMapper processDocumentMapper;
	@Override
	public List<ProcessDocumentVO> find() throws Exception{
		ProcessDocumentExample example = new ProcessDocumentExample();
		return processDocumentMapper.selectByExample(example);
	}
	
	@Override
	public EUDataGridResult getList(int page, int rows, ProcessDocumentVO processDocumentVO) throws Exception{
		
		//分页处理
		PageHelper.startPage(page, rows);
		List<ProcessDocumentVO> list = processDocumentMapper.find(processDocumentVO);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<ProcessDocumentVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public ProcessDocumentVO get(String id) throws Exception{
		return processDocumentMapper.selectByPrimaryKey(id);
	}

	@Override
	public CustomResult delete(String id) throws Exception{
		int i = processDocumentMapper.deleteByPrimaryKey(id);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult deleteBatch(String[] ids) throws Exception{
		int i = processDocumentMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult insert(ProcessDocument processDocument) throws Exception{
		int i = processDocumentMapper.insert(processDocument);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "新增订单失败");
		}
	}

	@Override
	public CustomResult update(ProcessDocument processDocument) throws Exception{
		int i = processDocumentMapper.updateByPrimaryKeySelective(processDocument);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单失败");
		}
	}

	@Override
	public CustomResult updateAll(ProcessDocument processDocument) throws Exception{
		int i = processDocumentMapper.updateByPrimaryKey(processDocument);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单失败");
		}
	}

	@Override
	public CustomResult updateDocumentNote(ProcessDocument processDocument) throws Exception{
		int i = processDocumentMapper.updateDocumentNote(processDocument);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单要求失败");
		}
	}
	

	
	@Override
	public EUDataGridResult searchDocumentByDocumentId(int page, int rows, String orderId) throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<ProcessDocumentVO> list = processDocumentMapper.searchDocumentByDocumentId(orderId);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<ProcessDocumentVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@Override
	public EUDataGridResult searchDocumentByDocumentTheme(int page, int rows, String documentName)
			throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<ProcessDocumentVO> list = processDocumentMapper.searchDocumentByDocumentTheme(documentName);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<ProcessDocumentVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchDocumentByDocumentType(int page, int rows, String documentType)
			throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<ProcessDocumentVO> list = processDocumentMapper.searchDocumentByDocumentType(documentType);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<ProcessDocumentVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
