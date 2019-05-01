package com.megagao.production.ssm.mapper;
import java.util.List;

import com.megagao.production.ssm.domain.COrder;
import com.megagao.production.ssm.domain.ProcessDocument;
import com.megagao.production.ssm.domain.ProcessDocumentExample;
import org.apache.ibatis.annotations.Param;

import com.megagao.production.ssm.domain.vo.ProcessDocumentVO;

public interface ProcessDocumentMapper {
	
	//扩展的mapper接口方法
		List<ProcessDocumentVO> find(ProcessDocumentVO processDocumentVO);
		
		//根据文档id查找订单信息
		List<ProcessDocumentVO> searchDocumentByDocumentId(String documentId);
		
		List<ProcessDocumentVO> searchDocumentByDocumentTheme(String documentTheme);
		
		List<ProcessDocumentVO> searchDocumentByDocumentType(String documentType);
		
		int deleteBatch(String[] ids);
		
		int updateDocumentNote(ProcessDocument processDocument);
	
	//逆向工程生成的mapper接口
	int countByExample(ProcessDocumentExample example);

    int deleteByExample(ProcessDocumentExample example);

    int deleteByPrimaryKey(String documentId);

    int insert(ProcessDocument record);

    int insertSelective(ProcessDocument record);

    List<ProcessDocumentVO> selectByExample(ProcessDocumentExample example);

    ProcessDocumentVO selectByPrimaryKey(String documentId);

    int updateByExampleSelective(@Param("record") ProcessDocument record, @Param("example") ProcessDocumentExample example);

    int updateByExample(@Param("record") ProcessDocument record, @Param("example") ProcessDocumentExample example);

    int updateByPrimaryKeySelective(ProcessDocument record);

    int updateByPrimaryKey(ProcessDocument record);
}