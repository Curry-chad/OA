package com.megagao.production.ssm.mapper;
import java.util.List;
import com.megagao.production.ssm.domain.Announcement;
import com.megagao.production.ssm.domain.AnnouncementExample;
import org.apache.ibatis.annotations.Param;
import com.megagao.production.ssm.domain.vo.AnnouncementVO;

public interface AnnouncementMapper {
	
	//扩展的mapper接口方法
		List<AnnouncementVO> find(AnnouncementVO announcementVO);
		
		//根据文档id查找订单信息
		List<AnnouncementVO> searchAnnouncementByAnnouncementId(String announcementId);
		
		
		int deleteBatch(String[] ids);
		
		int updateAnnouncementText(Announcement announcement);
	
	//逆向工程生成的mapper接口
		int countByExample(AnnouncementExample example);

	    int deleteByExample(AnnouncementExample example);

	    int deleteByPrimaryKey(String announcementId);

	    int insert(Announcement record);

	    int insertSelective(Announcement record);

	    List<AnnouncementVO> selectByExample(AnnouncementExample example);

	    AnnouncementVO selectByPrimaryKey(String announcementId);

	    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

	    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

	    int updateByPrimaryKeySelective(Announcement record);

	    int updateByPrimaryKey(Announcement record);
}