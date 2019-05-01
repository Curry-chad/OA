package com.megagao.production.ssm.controller.project;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.ProjectMain;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.ProjectMainVO;
import com.megagao.production.ssm.service.ProjectMainService;
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
@RequestMapping("/projectMain")
public class ProjectMainController {

	@Autowired
	private ProjectMainService projectMainService;
	
	@RequestMapping("/get/{projectMainId}")
	@ResponseBody
	public ProjectMainVO getItemById(@PathVariable String projectMainId) throws Exception{
		ProjectMainVO projectMainVO = projectMainService.get(projectMainId);
		return projectMainVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<ProjectMainVO> getData() throws Exception{
		 List<ProjectMainVO> list = projectMainService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "projectMain_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "projectMain_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "projectMain_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, ProjectMainVO projectMainVO) throws Exception{
		EUDataGridResult result = projectMainService.getList(page, rows, projectMainVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid ProjectMain projectMain, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(projectMainService.get(projectMain.getMainId()) != null){
			result = new CustomResult(0, "该公告栏编号已经存在，请更换公告栏编号！", null);
		}else{
			result = projectMainService.insert(projectMain);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid ProjectMain projectMain, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectMainService.update(projectMain);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid ProjectMain projectMain, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectMainService.updateAll(projectMain);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateText(@Valid ProjectMain projectMain, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return projectMainService.updateProjectMainName(projectMain);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = projectMainService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = projectMainService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_projectMain_by_projectMainId")
	@ResponseBody
	public EUDataGridResult searchProjectMainByProjectMainId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = projectMainService.searchProjectMainByProjectMainId(page, rows, searchValue);
		return result;
	}
	
	
	
	
	
}
