package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.ForumWork;
import com.megagao.production.ssm.domain.ForumWorkExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.ForumWorkVO;

public interface ForumWorkMapper {
	
	//扩展的mapper接口方法
		List<ForumWorkVO> find(ForumWorkVO forumWorkVO);
		
		//根据文档id查找订单信息
		List<ForumWorkVO> searchForumWorkByForumWorkId(String forumWorkId);
		
		List<ForumWorkVO> searchForumWorkByForumWorkText(String forumWorkText);
		
		int deleteBatch(String[] ids);
		
		int updateForumWorkText(ForumWork forumWork);
	
	//逆向工程生成的mapper接口
		int countByExample(ForumWorkExample example);

	    int deleteByExample(ForumWorkExample example);

	    int deleteByPrimaryKey(String workId);

	    int insert(ForumWork record);

	    int insertSelective(ForumWork record);

	    List<ForumWorkVO> selectByExample(ForumWorkExample example);

	    ForumWorkVO selectByPrimaryKey(String workId);

	    int updateByExampleSelective(@Param("record") ForumWork record, @Param("example") ForumWorkExample example);

	    int updateByExample(@Param("record") ForumWork record, @Param("example") ForumWorkExample example);

	    int updateByPrimaryKeySelective(ForumWork record);

	    int updateByPrimaryKey(ForumWork record);
}