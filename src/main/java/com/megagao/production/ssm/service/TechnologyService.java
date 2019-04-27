package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Technology;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.TechnologyVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface TechnologyService {
	
    List<TechnologyVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, TechnologyVO technologyVO) throws Exception;

	TechnologyVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(Technology technology) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(Technology technology) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(Technology technology) throws Exception;
    
    CustomResult updateTechnologyNote(Technology technology) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchTechnologyByTechnologyId(int page, int rows, String technologyId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchTechnologyByTechnologyTheme(int page, int rows,
			String technologyName) throws Exception;
	
	//根据文档类型查找文档信息
	EUDataGridResult searchTechnologyByTechnologyType(int page, int rows,
			String technologyType) throws Exception;
}
