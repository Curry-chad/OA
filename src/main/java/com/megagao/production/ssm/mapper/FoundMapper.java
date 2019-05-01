package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Found;
import com.megagao.production.ssm.domain.FoundExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.FoundVO;

public interface FoundMapper {
	
	//扩展的mapper接口方法
		List<FoundVO> find(FoundVO foundVO);
		
		//根据文档id查找订单信息
		List<FoundVO> searchFoundByFoundId(String foundId);
		
		
		int deleteBatch(String[] ids);
		
		int updateFoundText(Found found);
	
	//逆向工程生成的mapper接口
	    int countByExample(FoundExample example);

	    int deleteByExample(FoundExample example);

	    int deleteByPrimaryKey(String foundId);

	    int insert(Found record);

	    int insertSelective(Found record);

	    List<FoundVO> selectByExample(FoundExample example);

	    FoundVO selectByPrimaryKey(String foundId);

	    int updateByExampleSelective(@Param("record") Found record, @Param("example") FoundExample example);

	    int updateByExample(@Param("record") Found record, @Param("example") FoundExample example);

	    int updateByPrimaryKeySelective(Found record);

	    int updateByPrimaryKey(Found record);
}