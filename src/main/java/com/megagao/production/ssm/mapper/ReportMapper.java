package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Report;
import com.megagao.production.ssm.domain.ReportExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.ReportVO;

public interface ReportMapper {
	
	//扩展的mapper接口方法
		List<ReportVO> find(ReportVO reportVO);
		
		//根据文档id查找订单信息
		List<ReportVO> searchReportByReportId(String reportId);
		
		List<ReportVO> searchReportByReportTheme(String reportTheme);
		
		List<ReportVO> searchReportByReportType(String reportType);
		
		int deleteBatch(String[] ids);
		
		int updateReportNote(Report report);
	
	//逆向工程生成的mapper接口
	int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(String reportId);

    int insert(Report record);

    int insertSelective(Report record);

    List<ReportVO> selectByExample(ReportExample example);

    ReportVO selectByPrimaryKey(String reportId);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}