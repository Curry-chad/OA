package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Found;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.FoundVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface FoundService {
	
    List<FoundVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, FoundVO foundVO) throws Exception;

	FoundVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Found found) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Found found) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Found found) throws Exception;
    
    CustomResult updateFoundText(Found found) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchFoundByFoundId(int page, int rows, String foundId) throws Exception;
	
}
