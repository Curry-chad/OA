package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Wish;
import com.megagao.production.ssm.domain.WishExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.WishVO;

public interface WishMapper {
	
	//扩展的mapper接口方法
		List<WishVO> find(WishVO wishVO);
		
		//根据文档id查找订单信息
		List<WishVO> searchWishByWishId(String wishId);
		
		
		int deleteBatch(String[] ids);
		
		int updateWishText(Wish wish);
	
	//逆向工程生成的mapper接口
		int countByExample(WishExample example);

	    int deleteByExample(WishExample example);

	    int deleteByPrimaryKey(String wishId);

	    int insert(Wish record);

	    int insertSelective(Wish record);

	    List<WishVO> selectByExample(WishExample example);

	    WishVO selectByPrimaryKey(String wishId);

	    int updateByExampleSelective(@Param("record") Wish record, @Param("example") WishExample example);

	    int updateByExample(@Param("record") Wish record, @Param("example") WishExample example);

	    int updateByPrimaryKeySelective(Wish record);

	    int updateByPrimaryKey(Wish record);
}