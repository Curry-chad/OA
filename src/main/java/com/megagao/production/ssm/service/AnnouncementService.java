package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Announcement;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.AnnouncementVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface AnnouncementService {
	
    List<AnnouncementVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, AnnouncementVO announcementVO) throws Exception;

	AnnouncementVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Announcement announcement) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Announcement announcement) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Announcement announcement) throws Exception;
    
    CustomResult updateAnnouncementText(Announcement announcement) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchAnnouncementByAnnouncementId(int page, int rows, String announcementId) throws Exception;
	
}
