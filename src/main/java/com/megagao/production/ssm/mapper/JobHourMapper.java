package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.JobHour;
import com.megagao.production.ssm.domain.JobHourExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.JobHourVO;

public interface JobHourMapper {
	
	//扩展的mapper接口方法
		List<JobHourVO> find(JobHourVO jobHourVO);
		
		//根据文档id查找订单信息
		List<JobHourVO> searchJobHourByJobHourId(String jobHourId);
		
		List<JobHourVO> searchJobHourByJobHourTime(String jobHourTime);
		
		
		int deleteBatch(String[] ids);
		
	
	//逆向工程生成的mapper接口
		 int countByExample(JobHourExample example);

		    int deleteByExample(JobHourExample example);

		    int deleteByPrimaryKey(String hourId);

		    int insert(JobHour record);

		    int insertSelective(JobHour record);

		    List<JobHourVO> selectByExample(JobHourExample example);

		    JobHourVO selectByPrimaryKey(String hourId);

		    int updateByExampleSelective(@Param("record") JobHour record, @Param("example") JobHourExample example);

		    int updateByExample(@Param("record") JobHour record, @Param("example") JobHourExample example);

		    int updateByPrimaryKeySelective(JobHour record);

		    int updateByPrimaryKey(JobHour record);
}