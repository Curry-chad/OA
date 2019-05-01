package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.COrder;
import com.megagao.production.ssm.domain.ProcessDocument;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProcessDocumentVO;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface ProcessDocumentService {
	
    List<ProcessDocumentVO> find() throws Exception;
	
	EUDataGridResult getList(int page, int rows, ProcessDocumentVO processDocumentVO) throws Exception;

	ProcessDocumentVO get(String string) throws Exception;
	
	CustomResult delete(String string) throws Exception;

	CustomResult deleteBatch(String[] ids) throws Exception;

	CustomResult insert(ProcessDocument processDocument) throws Exception;

	//更新部分字段，用的是updateSelective判断非空的字段进行更新
    CustomResult update(ProcessDocument processDocument) throws Exception;
    
    //更新全部字段，不判断非空，直接进行更新
    CustomResult updateAll(ProcessDocument processDocument) throws Exception;
    
    CustomResult updateDocumentNote(ProcessDocument processDocument) throws Exception;

    

    //根据文档id查找文档信息
    EUDataGridResult searchDocumentByDocumentId(int page, int rows, String documentId) throws Exception;
	
    //根据文档名称查找文档信息
	EUDataGridResult searchDocumentByDocumentTheme(int page, int rows,
			String documentName) throws Exception;
	
	//根据文档类型查找文档信息
	EUDataGridResult searchDocumentByDocumentType(int page, int rows,
			String documentType) throws Exception;
}
