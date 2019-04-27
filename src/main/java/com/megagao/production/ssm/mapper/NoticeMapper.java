package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Notice;
import com.megagao.production.ssm.domain.NoticeExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.NoticeVO;

public interface NoticeMapper {
	
	//扩展的mapper接口方法
		List<NoticeVO> find(NoticeVO noticeVO);
		
		//根据文档id查找订单信息
		List<NoticeVO> searchNoticeByNoticeId(String noticeId);
		
		List<NoticeVO> searchNoticeByNoticeTheme(String noticeTheme);
		
		List<NoticeVO> searchNoticeByNoticeType(String noticeType);
		
		int deleteBatch(String[] ids);
		
		int updateNoticeNote(Notice notice);
	
	//逆向工程生成的mapper接口
		int countByExample(NoticeExample example);

	    int deleteByExample(NoticeExample example);

	    int deleteByPrimaryKey(String noticeId);

	    int insert(Notice record);

	    int insertSelective(Notice record);

	    List<NoticeVO> selectByExample(NoticeExample example);

	    NoticeVO selectByPrimaryKey(String noticeId);

	    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

	    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

	    int updateByPrimaryKeySelective(Notice record);

	    int updateByPrimaryKey(Notice record);
}