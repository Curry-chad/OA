package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.ForumWork;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ForumWorkVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface ForumWorkService {
	
    List<ForumWorkVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, ForumWorkVO forumWorkVO) throws Exception;

	ForumWorkVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(ForumWork forumWork) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(ForumWork forumWork) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(ForumWork forumWork) throws Exception;
    
    CustomResult updateForumWorkText(ForumWork forumWork) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchForumWorkByForumWorkId(int page, int rows, String forumWorkId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchForumWorkByForumWorkText(int page, int rows,
			String forumWorkText) throws Exception;
	
}
