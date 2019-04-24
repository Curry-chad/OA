package com.megagao.production.ssm.domain;

import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProcessDocumentMapper {
    int countByExample(ProcessDocumentExample example);

    int deleteByExample(ProcessDocumentExample example);

    int deleteByPrimaryKey(String documentId);

    int insert(ProcessDocument record);

    int insertSelective(ProcessDocument record);

    List<ProcessDocument> selectByExample(ProcessDocumentExample example);

    ProcessDocument selectByPrimaryKey(String documentId);

    int updateByExampleSelective(@Param("record") ProcessDocument record, @Param("example") ProcessDocumentExample example);

    int updateByExample(@Param("record") ProcessDocument record, @Param("example") ProcessDocumentExample example);

    int updateByPrimaryKeySelective(ProcessDocument record);

    int updateByPrimaryKey(ProcessDocument record);
}