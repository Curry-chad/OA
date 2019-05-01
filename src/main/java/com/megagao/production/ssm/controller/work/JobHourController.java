package com.megagao.production.ssm.controller.work;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;
import com.megagao.production.ssm.domain.JobHour;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.JobHourVO;
import com.megagao.production.ssm.service.JobHourService;
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
@RequestMapping("/jobHour")
public class JobHourController {

	@Autowired
	private JobHourService jobHourService;
	
	@RequestMapping("/get/{jobHourId}")
	@ResponseBody
	public JobHourVO getItemById(@PathVariable String jobHourId) throws Exception{
		JobHourVO jobHourVO = jobHourService.get(jobHourId);
		return jobHourVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<JobHourVO> getData() throws Exception{
		 List<JobHourVO> list = jobHourService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "jobHour_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "jobHour_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "jobHour_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, JobHourVO jobHourVO) throws Exception{
		EUDataGridResult result = jobHourService.getList(page, rows, jobHourVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid JobHour jobHour, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(jobHourService.get(jobHour.getHourId()) != null){
			result = new CustomResult(0, "该报表编号已经存在，请更换报表编号！", null);
		}else{
			result = jobHourService.insert(jobHour);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid JobHour jobHour, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return jobHourService.update(jobHour);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid JobHour jobHour, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return jobHourService.updateAll(jobHour);
	}
	
	
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = jobHourService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = jobHourService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_jobHour_by_jobHourId")
	@ResponseBody
	public EUDataGridResult searchJobHourByJobHourId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = jobHourService.searchJobHourByJobHourId(page, rows, searchValue);
		return result;
	}
	
	//根据客户名称查找
	@RequestMapping("/search_jobHour_by_jobHourTime")
	@ResponseBody
	public EUDataGridResult searchJobHourByJobHourTIme(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8"); 
		EUDataGridResult result = jobHourService.searchJobHourByJobHourTime(page, rows, searchValue);
		return result;
	}
	
	
	
}
