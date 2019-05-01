package com.megagao.production.ssm.controller.project;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.ProjectCost;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProjectCostVO;
import com.megagao.production.ssm.service.ProjectCostService;
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
@RequestMapping("/projectCost")
public class ProjectCostController {

	@Autowired
	private ProjectCostService projectCostService;
	
	@RequestMapping("/get/{projectCostId}")
	@ResponseBody
	public ProjectCostVO getItemById(@PathVariable String projectCostId) throws Exception{
		ProjectCostVO projectCostVO = projectCostService.get(projectCostId);
		return projectCostVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<ProjectCostVO> getData() throws Exception{
		 List<ProjectCostVO> list = projectCostService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "projectCost_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "projectCost_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "projectCost_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, ProjectCostVO projectCostVO) throws Exception{
		EUDataGridResult result = projectCostService.getList(page, rows, projectCostVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid ProjectCost projectCost, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(projectCostService.get(projectCost.getCostId()) != null){
			result = new CustomResult(0, "该公告栏编号已经存在，请更换公告栏编号！", null);
		}else{
			result = projectCostService.insert(projectCost);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid ProjectCost projectCost, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectCostService.update(projectCost);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid ProjectCost projectCost, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectCostService.updateAll(projectCost);
	}
	
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = projectCostService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = projectCostService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_projectCost_by_projectCostId")
	@ResponseBody
	public EUDataGridResult searchProjectCostByProjectCostId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = projectCostService.searchProjectCostByProjectCostId(page, rows, searchValue);
		return result;
	}
	
	
	
	
	
}
