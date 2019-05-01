package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.ProjectCost;
import com.megagao.production.ssm.domain.ProjectCostExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.ProjectCostVO;

public interface ProjectCostMapper {
	
	//扩展的mapper接口方法
		List<ProjectCostVO> find(ProjectCostVO projectCostVO);
		
		//根据文档id查找订单信息
		List<ProjectCostVO> searchProjectCostByProjectCostId(String projectCostId);
		
		
		int deleteBatch(String[] ids);
		
	
	//逆向工程生成的mapper接口
		int countByExample(ProjectCostExample example);

	    int deleteByExample(ProjectCostExample example);

	    int deleteByPrimaryKey(String costId);

	    int insert(ProjectCost record);

	    int insertSelective(ProjectCost record);

	    List<ProjectCostVO> selectByExample(ProjectCostExample example);

	    ProjectCostVO selectByPrimaryKey(String costId);

	    int updateByExampleSelective(@Param("record") ProjectCost record, @Param("example") ProjectCostExample example);

	    int updateByExample(@Param("record") ProjectCost record, @Param("example") ProjectCostExample example);

	    int updateByPrimaryKeySelective(ProjectCost record);

	    int updateByPrimaryKey(ProjectCost record);
}