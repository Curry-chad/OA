package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Wish;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.WishVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface WishService {
	
    List<WishVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, WishVO wishVO) throws Exception;

	WishVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Wish wish) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Wish wish) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Wish wish) throws Exception;
    
    CustomResult updateWishText(Wish wish) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchWishByWishId(int page, int rows, String wishId) throws Exception;
	
}
