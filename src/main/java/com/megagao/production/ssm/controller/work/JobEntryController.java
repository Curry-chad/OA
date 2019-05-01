package com.megagao.production.ssm.controller.work;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.JobEntry;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.JobEntryVO;
import com.megagao.production.ssm.service.JobEntryService;
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
@RequestMapping("/jobEntry")
public class JobEntryController {

	@Autowired
	private JobEntryService jobEntryService;
	
	@RequestMapping("/get/{jobEntryId}")
	@ResponseBody
	public JobEntryVO getItemById(@PathVariable String jobEntryId) throws Exception{
		JobEntryVO jobEntryVO = jobEntryService.get(jobEntryId);
		return jobEntryVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<JobEntryVO> getData() throws Exception{
		 List<JobEntryVO> list = jobEntryService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "jobEntry_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "jobEntry_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "jobEntry_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, JobEntryVO jobEntryVO) throws Exception{
		EUDataGridResult result = jobEntryService.getList(page, rows, jobEntryVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid JobEntry jobEntry, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(jobEntryService.get(jobEntry.getEntryId()) != null){
			result = new CustomResult(0, "该报表编号已经存在，请更换报表编号！", null);
		}else{
			result = jobEntryService.insert(jobEntry);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid JobEntry jobEntry, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return jobEntryService.update(jobEntry);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid JobEntry jobEntry, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return jobEntryService.updateAll(jobEntry);
	}
	
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = jobEntryService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = jobEntryService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_jobEntry_by_jobEntryId")
	@ResponseBody
	public EUDataGridResult searchJobEntryByJobEntryId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = jobEntryService.searchJobEntryByJobEntryId(page, rows, searchValue);
		return result;
	}
	
	//根据客户名称查找
	@RequestMapping("/search_jobEntry_by_jobEntrySalary")
	@ResponseBody
	public EUDataGridResult searchJobEntryByJobEntryType(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8"); 
		EUDataGridResult result = jobEntryService.searchJobEntryByJobEntrySalary(page, rows, searchValue);
		return result;
	}
	
	
	
}
