package com.megagao.production.ssm.controller.document;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.Notice;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.NoticeVO;
import com.megagao.production.ssm.service.NoticeService;
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
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/get/{noticeId}")
	@ResponseBody
	public NoticeVO getItemById(@PathVariable String noticeId) throws Exception{
		NoticeVO noticeVO = noticeService.get(noticeId);
		return noticeVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<NoticeVO> getData() throws Exception{
		 List<NoticeVO> list = noticeService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "notice_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "notice_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "notice_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, NoticeVO noticeVO) throws Exception{
		EUDataGridResult result = noticeService.getList(page, rows, noticeVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid Notice notice, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(noticeService.get(notice.getNoticeId()) != null){
			result = new CustomResult(0, "该报表编号已经存在，请更换报表编号！", null);
		}else{
			result = noticeService.insert(notice);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid Notice notice, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return noticeService.update(notice);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid Notice notice, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return noticeService.updateAll(notice);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateNote(@Valid Notice notice, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return noticeService.updateNoticeNote(notice);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = noticeService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = noticeService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_notice_by_noticeId")
	@ResponseBody
	public EUDataGridResult searchNoticeByNoticeId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = noticeService.searchNoticeByNoticeId(page, rows, searchValue);
		return result;
	}
	
	//根据客户名称查找
	@RequestMapping("/search_notice_by_noticeType")
	@ResponseBody
	public EUDataGridResult searchNoticeByNoticeType(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8"); 
		EUDataGridResult result = noticeService.searchNoticeByNoticeType(page, rows, searchValue);
		return result;
	}
	
	//根据产品名称查找
	@RequestMapping("/search_notice_by_noticeTheme")
	@ResponseBody
	public EUDataGridResult searchNoticeByNoticeTheme(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = noticeService.searchNoticeByNoticeTheme(page, rows, searchValue);
		return result;
	}
	
}
