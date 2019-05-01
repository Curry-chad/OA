package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.ProjectMain;
import com.megagao.production.ssm.domain.ProjectMainExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.ProjectMainVO;

public interface ProjectMainMapper {
	
	//扩展的mapper接口方法
		List<ProjectMainVO> find(ProjectMainVO projectMainVO);
		
		//根据文档id查找订单信息
		List<ProjectMainVO> searchProjectMainByProjectMainId(String projectMainId);
		
		
		int deleteBatch(String[] ids);
		
		int updateProjectMainName(ProjectMain projectMain);
	
	//逆向工程生成的mapper接口
		int countByExample(ProjectMainExample example);

	    int deleteByExample(ProjectMainExample example);

	    int deleteByPrimaryKey(String mainId);

	    int insert(ProjectMain record);

	    int insertSelective(ProjectMain record);

	    List<ProjectMainVO> selectByExample(ProjectMainExample example);

	    ProjectMainVO selectByPrimaryKey(String mainId);

	    int updateByExampleSelective(@Param("record") ProjectMain record, @Param("example") ProjectMainExample example);

	    int updateByExample(@Param("record") ProjectMain record, @Param("example") ProjectMainExample example);

	    int updateByPrimaryKeySelective(ProjectMain record);

	    int updateByPrimaryKey(ProjectMain record);
}