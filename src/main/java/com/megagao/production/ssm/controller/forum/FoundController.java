package com.megagao.production.ssm.controller.forum;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.Found;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.FoundVO;
import com.megagao.production.ssm.service.FoundService;
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
@RequestMapping("/found")
public class FoundController {

	@Autowired
	private FoundService foundService;
	
	@RequestMapping("/get/{foundId}")
	@ResponseBody
	public FoundVO getItemById(@PathVariable String foundId) throws Exception{
		FoundVO foundVO = foundService.get(foundId);
		return foundVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<FoundVO> getData() throws Exception{
		 List<FoundVO> list = foundService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "found_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "found_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "found_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, FoundVO foundVO) throws Exception{
		EUDataGridResult result = foundService.getList(page, rows, foundVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid Found found, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(foundService.get(found.getFoundId()) != null){
			result = new CustomResult(0, "该公告栏编号已经存在，请更换公告栏编号！", null);
		}else{
			result = foundService.insert(found);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid Found found, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return foundService.update(found);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid Found found, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return foundService.updateAll(found);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateText(@Valid Found found, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return foundService.updateFoundText(found);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = foundService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = foundService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_found_by_foundId")
	@ResponseBody
	public EUDataGridResult searchFoundByFoundId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = foundService.searchFoundByFoundId(page, rows, searchValue);
		return result;
	}
	
	
	
	
	
}
