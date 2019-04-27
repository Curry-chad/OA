package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Technology;
import com.megagao.production.ssm.domain.TechnologyExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.TechnologyVO;

public interface TechnologyMapper {
	
	//扩展的mapper接口方法
		List<TechnologyVO> find(TechnologyVO technologyVO);
		
		//根据文档id查找订单信息
		List<TechnologyVO> searchTechnologyByTechnologyId(String technologyId);
		
		List<TechnologyVO> searchTechnologyByTechnologyTheme(String technologyTheme);
		
		List<TechnologyVO> searchTechnologyByTechnologyType(String technologyType);
		
		int deleteBatch(String[] ids);
		
		int updateTechnologyNote(Technology technology);
	
	//逆向工程生成的mapper接口
		int countByExample(TechnologyExample example);

	    int deleteByExample(TechnologyExample example);

	    int deleteByPrimaryKey(String technologyId);

	    int insert(Technology record);

	    int insertSelective(Technology record);

	    List<TechnologyVO> selectByExample(TechnologyExample example);

	    TechnologyVO selectByPrimaryKey(String technologyId);

	    int updateByExampleSelective(@Param("record") Technology record, @Param("example") TechnologyExample example);

	    int updateByExample(@Param("record") Technology record, @Param("example") TechnologyExample example);

	    int updateByPrimaryKeySelective(Technology record);

	    int updateByPrimaryKey(Technology record);
}