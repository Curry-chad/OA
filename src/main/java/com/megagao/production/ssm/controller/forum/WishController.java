package com.megagao.production.ssm.controller.forum;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.Wish;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.WishVO;
import com.megagao.production.ssm.service.WishService;
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
@RequestMapping("/wish")
public class WishController {

	@Autowired
	private WishService wishService;
	
	@RequestMapping("/get/{wishId}")
	@ResponseBody
	public WishVO getItemById(@PathVariable String wishId) throws Exception{
		WishVO wishVO = wishService.get(wishId);
		return wishVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<WishVO> getData() throws Exception{
		 List<WishVO> list = wishService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "wish_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "wish_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "wish_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, WishVO wishVO) throws Exception{
		EUDataGridResult result = wishService.getList(page, rows, wishVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid Wish wish, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(wishService.get(wish.getWishId()) != null){
			result = new CustomResult(0, "该公告栏编号已经存在，请更换公告栏编号！", null);
		}else{
			result = wishService.insert(wish);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid Wish wish, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return wishService.update(wish);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid Wish wish, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return wishService.updateAll(wish);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateText(@Valid Wish wish, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return wishService.updateWishText(wish);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = wishService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = wishService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_wish_by_wishId")
	@ResponseBody
	public EUDataGridResult searchWishByWishId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = wishService.searchWishByWishId(page, rows, searchValue);
		return result;
	}
	
	
	
	
	
}
