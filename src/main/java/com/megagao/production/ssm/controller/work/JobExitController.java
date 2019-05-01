package com.megagao.production.ssm.controller.work;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.JobExit;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.JobExitVO;
import com.megagao.production.ssm.service.JobExitService;
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
@RequestMapping("/jobExit")
public class JobExitController {

	@Autowired
	private JobExitService jobExitService;
	
	@RequestMapping("/get/{jobExitId}")
	@ResponseBody
	public JobExitVO getItemById(@PathVariable String jobExitId) throws Exception{
		JobExitVO jobExitVO = jobExitService.get(jobExitId);
		return jobExitVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<JobExitVO> getData() throws Exception{
		 List<JobExitVO> list = jobExitService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "jobExit_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "jobExit_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "jobExit_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, JobExitVO jobExitVO) throws Exception{
		EUDataGridResult result = jobExitService.getList(page, rows, jobExitVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid JobExit jobExit, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(jobExitService.get(jobExit.getExitId()) != null){
			result = new CustomResult(0, "该报表编号已经存在，请更换报表编号！", null);
		}else{
			result = jobExitService.insert(jobExit);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid JobExit jobExit, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return jobExitService.update(jobExit);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid JobExit jobExit, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return jobExitService.updateAll(jobExit);
	}
	
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = jobExitService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = jobExitService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_jobExit_by_jobExitId")
	@ResponseBody
	public EUDataGridResult searchJobExitByJobExitId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = jobExitService.searchJobExitByJobExitId(page, rows, searchValue);
		return result;
	}
	
	//根据客户名称查找
	@RequestMapping("/search_jobExit_by_jobExitSalary")
	@ResponseBody
	public EUDataGridResult searchJobExitByJobExitType(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8"); 
		EUDataGridResult result = jobExitService.searchJobExitByJobExitSalary(page, rows, searchValue);
		return result;
	}
	
	
	
}
