package com.megagao.production.ssm.controller.project;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.ProjectTime;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProjectTimeVO;
import com.megagao.production.ssm.service.ProjectTimeService;
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
@RequestMapping("/projectTime")
public class ProjectTimeController {

	@Autowired
	private ProjectTimeService projectTimeService;
	
	@RequestMapping("/get/{projectTimeId}")
	@ResponseBody
	public ProjectTimeVO getItemById(@PathVariable String projectTimeId) throws Exception{
		ProjectTimeVO projectTimeVO = projectTimeService.get(projectTimeId);
		return projectTimeVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<ProjectTimeVO> getData() throws Exception{
		 List<ProjectTimeVO> list = projectTimeService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "projectTime_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "projectTime_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "projectTime_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, ProjectTimeVO projectTimeVO) throws Exception{
		EUDataGridResult result = projectTimeService.getList(page, rows, projectTimeVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid ProjectTime projectTime, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(projectTimeService.get(projectTime.getTimeId()) != null){
			result = new CustomResult(0, "该公告栏编号已经存在，请更换公告栏编号！", null);
		}else{
			result = projectTimeService.insert(projectTime);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid ProjectTime projectTime, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectTimeService.update(projectTime);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid ProjectTime projectTime, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectTimeService.updateAll(projectTime);
	}
	
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = projectTimeService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = projectTimeService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_projectTime_by_projectTimeId")
	@ResponseBody
	public EUDataGridResult searchProjectTimeByProjectTimeId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = projectTimeService.searchProjectTimeByProjectTimeId(page, rows, searchValue);
		return result;
	}
	
	
	
	
	
}
