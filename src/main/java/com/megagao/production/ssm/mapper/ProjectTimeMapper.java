package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.ProjectTime;
import com.megagao.production.ssm.domain.ProjectTimeExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.ProjectTimeVO;

public interface ProjectTimeMapper {
	
	//扩展的mapper接口方法
		List<ProjectTimeVO> find(ProjectTimeVO projectTimeVO);
		
		//根据文档id查找订单信息
		List<ProjectTimeVO> searchProjectTimeByProjectTimeId(String projectTimeId);
		
		
		int deleteBatch(String[] ids);
		
	
	//逆向工程生成的mapper接口
		int countByExample(ProjectTimeExample example);

	    int deleteByExample(ProjectTimeExample example);

	    int deleteByPrimaryKey(String timeId);

	    int insert(ProjectTime record);

	    int insertSelective(ProjectTime record);

	    List<ProjectTimeVO> selectByExample(ProjectTimeExample example);

	    ProjectTimeVO selectByPrimaryKey(String timeId);

	    int updateByExampleSelective(@Param("record") ProjectTime record, @Param("example") ProjectTimeExample example);

	    int updateByExample(@Param("record") ProjectTime record, @Param("example") ProjectTimeExample example);

	    int updateByPrimaryKeySelective(ProjectTime record);

	    int updateByPrimaryKey(ProjectTime record);
}