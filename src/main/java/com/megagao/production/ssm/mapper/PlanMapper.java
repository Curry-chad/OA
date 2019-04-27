package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Plan;
import com.megagao.production.ssm.domain.PlanExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.PlanVO;

public interface PlanMapper {
	
	//扩展的mapper接口方法
		List<PlanVO> find(PlanVO planVO);
		
		//根据文档id查找订单信息
		List<PlanVO> searchPlanByPlanId(String planId);
		
		List<PlanVO> searchPlanByPlanTheme(String planTheme);
		
		List<PlanVO> searchPlanByPlanType(String planType);
		
		int deleteBatch(String[] ids);
		
		int updatePlanNote(Plan plan);
	
	//逆向工程生成的mapper接口
		 int countByExample(PlanExample example);

		    int deleteByExample(PlanExample example);

		    int deleteByPrimaryKey(String planId);

		    int insert(Plan record);

		    int insertSelective(Plan record);

		    List<PlanVO> selectByExample(PlanExample example);

		    PlanVO selectByPrimaryKey(String planId);

		    int updateByExampleSelective(@Param("record") Plan record, @Param("example") PlanExample example);

		    int updateByExample(@Param("record") Plan record, @Param("example") PlanExample example);

		    int updateByPrimaryKeySelective(Plan record);

		    int updateByPrimaryKey(Plan record);
}