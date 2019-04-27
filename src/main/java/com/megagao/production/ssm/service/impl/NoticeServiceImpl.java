package com.megagao.production.ssm.service.impl;

import java.util.List;
import com.megagao.production.ssm.domain.Notice;
import com.megagao.production.ssm.domain.NoticeExample;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.COrderVO;
import com.megagao.production.ssm.domain.vo.NoticeVO;
import com.megagao.production.ssm.mapper.NoticeMapper;
import com.megagao.production.ssm.service.NoticeService;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class NoticeServiceImpl implements NoticeService {

	
	@Autowired
    NoticeMapper noticeMapper;
	@Override
	public List<NoticeVO> find() throws Exception{
		NoticeExample example = new NoticeExample();
		return noticeMapper.selectByExample(example);
	}
	
	@Override
	public EUDataGridResult getList(int page, int rows, NoticeVO noticeVO) throws Exception{
		
		//分页处理
		PageHelper.startPage(page, rows);
		List<NoticeVO> list = noticeMapper.find(noticeVO);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<NoticeVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public NoticeVO get(String id) throws Exception{
		return noticeMapper.selectByPrimaryKey(id);
	}

	@Override
	public CustomResult delete(String id) throws Exception{
		int i = noticeMapper.deleteByPrimaryKey(id);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult deleteBatch(String[] ids) throws Exception{
		int i = noticeMapper.deleteBatch(ids);
		if(i>0){
			return CustomResult.ok();
		}else{
			return null;
		}
	}

	@Override
	public CustomResult insert(Notice notice) throws Exception{
		int i = noticeMapper.insert(notice);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "新增订单失败");
		}
	}

	@Override
	public CustomResult update(Notice notice) throws Exception{
		int i = noticeMapper.updateByPrimaryKeySelective(notice);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单失败");
		}
	}

	@Override
	public CustomResult updateAll(Notice notice) throws Exception{
		int i = noticeMapper.updateByPrimaryKey(notice);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单失败");
		}
	}

	@Override
	public CustomResult updateNoticeNote(Notice notice) throws Exception{
		int i = noticeMapper.updateNoticeNote(notice);
		if(i>0){
			return CustomResult.ok();
		}else{
			return CustomResult.build(101, "修改订单要求失败");
		}
	}
	

	
	@Override
	public EUDataGridResult searchNoticeByNoticeId(int page, int rows, String orderId) throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<NoticeVO> list = noticeMapper.searchNoticeByNoticeId(orderId);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<NoticeVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	
	@Override
	public EUDataGridResult searchNoticeByNoticeTheme(int page, int rows, String noticeName)
			throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<NoticeVO> list = noticeMapper.searchNoticeByNoticeTheme(noticeName);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<NoticeVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public EUDataGridResult searchNoticeByNoticeType(int page, int rows, String noticeType)
			throws Exception{
		//分页处理
		PageHelper.startPage(page, rows);
		List<NoticeVO> list = noticeMapper.searchNoticeByNoticeType(noticeType);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<NoticeVO> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
}
