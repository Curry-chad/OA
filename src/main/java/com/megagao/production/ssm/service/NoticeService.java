package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Notice;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.NoticeVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface NoticeService {
	
    List<NoticeVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, NoticeVO noticeVO) throws Exception;

	NoticeVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Notice notice) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Notice notice) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Notice notice) throws Exception;
    
    CustomResult updateNoticeNote(Notice notice) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchNoticeByNoticeId(int page, int rows, String noticeId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchNoticeByNoticeTheme(int page, int rows,
			String noticeName) throws Exception;
	
	//根据文档类型查找文档信息
	EUDataGridResult searchNoticeByNoticeType(int page, int rows,
			String noticeType) throws Exception;
}
