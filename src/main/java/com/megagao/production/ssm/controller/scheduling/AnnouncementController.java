package com.megagao.production.ssm.controller.scheduling;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.Announcement;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.AnnouncementVO;
import com.megagao.production.ssm.service.AnnouncementService;
import com.megagao.production.ssm.util.JsonUtils;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/announcement")
public class AnnouncementController {

	@Autowired
	private AnnouncementService announcementService;
	
	@RequestMapping("/get/{announcementId}")
	@ResponseBody
	public AnnouncementVO getItemById(@PathVariable String announcementId) throws Exception{
		AnnouncementVO announcementVO = announcementService.get(announcementId);
		return announcementVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<AnnouncementVO> getData() throws Exception{
		 List<AnnouncementVO> list = announcementService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "announcement_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "announcement_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "announcement_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, AnnouncementVO announcementVO) throws Exception{
		EUDataGridResult result = announcementService.getList(page, rows, announcementVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid Announcement announcement, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(announcementService.get(announcement.getAnnouncementId()) != null){
			result = new CustomResult(0, "该公告栏编号已经存在，请更换公告栏编号！", null);
		}else{
			result = announcementService.insert(announcement);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid Announcement announcement, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return announcementService.update(announcement);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid Announcement announcement, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return announcementService.updateAll(announcement);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateText(@Valid Announcement announcement, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return announcementService.updateAnnouncementText(announcement);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = announcementService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = announcementService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_announcement_by_announcementId")
	@ResponseBody
	public EUDataGridResult searchAnnouncementByAnnouncementId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = announcementService.searchAnnouncementByAnnouncementId(page, rows, searchValue);
		return result;
	}
	
	
	
	
	
}
