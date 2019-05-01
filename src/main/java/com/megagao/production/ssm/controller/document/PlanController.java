package com.megagao.production.ssm.controller.document;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.Plan;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.PlanVO;
import com.megagao.production.ssm.service.PlanService;
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
@RequestMapping("/plan")
public class PlanController {

	@Autowired
	private PlanService planService;
	
	@RequestMapping("/get/{planId}")
	@ResponseBody
	public PlanVO getItemById(@PathVariable String planId) throws Exception{
		PlanVO planVO = planService.get(planId);
		return planVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<PlanVO> getData() throws Exception{
		 List<PlanVO> list = planService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "plan_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "plan_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "plan_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, PlanVO planVO) throws Exception{
		EUDataGridResult result = planService.getList(page, rows, planVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid Plan plan, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(planService.get(plan.getPlanId()) != null){
			result = new CustomResult(0, "该报表编号已经存在，请更换报表编号！", null);
		}else{
			result = planService.insert(plan);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid Plan plan, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return planService.update(plan);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid Plan plan, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return planService.updateAll(plan);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateNote(@Valid Plan plan, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return planService.updatePlanNote(plan);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = planService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = planService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_plan_by_planId")
	@ResponseBody
	public EUDataGridResult searchPlanByPlanId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = planService.searchPlanByPlanId(page, rows, searchValue);
		return result;
	}
	
	//根据客户名称查找
	@RequestMapping("/search_plan_by_planType")
	@ResponseBody
	public EUDataGridResult searchPlanByPlanType(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8"); 
		EUDataGridResult result = planService.searchPlanByPlanType(page, rows, searchValue);
		return result;
	}
	
	//根据产品名称查找
	@RequestMapping("/search_plan_by_planTheme")
	@ResponseBody
	public EUDataGridResult searchPlanByPlanTheme(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = planService.searchPlanByPlanTheme(page, rows, searchValue);
		return result;
	}
	
}
