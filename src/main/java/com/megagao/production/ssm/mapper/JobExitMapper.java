package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.JobExit;
import com.megagao.production.ssm.domain.JobExitExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.JobExitVO;

public interface JobExitMapper {
	
	//扩展的mapper接口方法
		List<JobExitVO> find(JobExitVO jobExitVO);
		
		//根据文档id查找订单信息
		List<JobExitVO> searchJobExitByJobExitId(String jobExitId);
		
		List<JobExitVO> searchJobExitByJobExitSalary(String exitSalary);
		
		
		int deleteBatch(String[] ids);
		
	
	//逆向工程生成的mapper接口
		int countByExample(JobExitExample example);

	    int deleteByExample(JobExitExample example);

	    int deleteByPrimaryKey(String exitId);

	    int insert(JobExit record);

	    int insertSelective(JobExit record);

	    List<JobExitVO> selectByExample(JobExitExample example);

	    JobExitVO selectByPrimaryKey(String exitId);

	    int updateByExampleSelective(@Param("record") JobExit record, @Param("example") JobExitExample example);

	    int updateByExample(@Param("record") JobExit record, @Param("example") JobExitExample example);

	    int updateByPrimaryKeySelective(JobExit record);

	    int updateByPrimaryKey(JobExit record);
}