package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.JobEntry;
import com.megagao.production.ssm.domain.JobEntryExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.JobEntryVO;

public interface JobEntryMapper {
	
	//扩展的mapper接口方法
		List<JobEntryVO> find(JobEntryVO jobEntryVO);
		
		//根据文档id查找订单信息
		List<JobEntryVO> searchJobEntryByJobEntryId(String jobEntryId);
		
		List<JobEntryVO> searchJobEntryByJobEntrySalary(String entrySalary);
		
		
		int deleteBatch(String[] ids);
		
	
	//逆向工程生成的mapper接口
		int countByExample(JobEntryExample example);

	    int deleteByExample(JobEntryExample example);

	    int deleteByPrimaryKey(String entryId);

	    int insert(JobEntry record);

	    int insertSelective(JobEntry record);

	    List<JobEntryVO> selectByExample(JobEntryExample example);

	    JobEntryVO selectByPrimaryKey(String entryId);

	    int updateByExampleSelective(@Param("record") JobEntry record, @Param("example") JobEntryExample example);

	    int updateByExample(@Param("record") JobEntry record, @Param("example") JobEntryExample example);

	    int updateByPrimaryKeySelective(JobEntry record);

	    int updateByPrimaryKey(JobEntry record);
}