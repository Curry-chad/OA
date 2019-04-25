package com.megagao.production.ssm.controller.scheduling;

import java.net.URLDecoder;
import java.util.List;

import javax.validation.Valid;

import com.megagao.production.ssm.domain.COrder;
import com.megagao.production.ssm.domain.ProcessDocument;
import com.megagao.production.ssm.domain.customize.CustomResult;
import com.megagao.production.ssm.domain.vo.COrderVO;
import com.megagao.production.ssm.domain.vo.ProcessDocumentVO;
import com.megagao.production.ssm.service.ProcessDocumentService;
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
@RequestMapping("/processDocument")
public class ProcessDocumentController {

	@Autowired
	private ProcessDocumentService processService;
	
	@RequestMapping("/get/{documentId}")
	@ResponseBody
	public ProcessDocumentVO getItemById(@PathVariable String documentId) throws Exception{
		ProcessDocumentVO processDocumentVO = processService.get(documentId);
		return processDocumentVO;
	}
	
	@RequestMapping("/get_data")
	@ResponseBody
	public List<ProcessDocumentVO> getData() throws Exception{
		 List<ProcessDocumentVO> list = processService.find();
		return list;
	}
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "processDocument_list";                                                                                                                                                                                                                                                                                                 
	}
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "document_add";
	}
	
	@RequestMapping("/edit")
	public String edit() throws Exception{
		return "document_edit";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getList(Integer page, Integer rows, ProcessDocumentVO processDocumentVO) throws Exception{
		EUDataGridResult result = processService.getList(page, rows, processDocumentVO);
		return result;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	@ResponseBody
	private CustomResult insert(@Valid ProcessDocument processDocument, BindingResult bindingResult) throws Exception {
		CustomResult result;
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			System.out.println(fieldError.getDefaultMessage());
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		if(processService.get(processDocument.getDocumentId()) != null){
			result = new CustomResult(0, "该文档编号已经存在，请更换文档编号！", null);
		}else{
			result = processService.insert(processDocument);
		}
		return result;
	}
	@RequestMapping(value="/update")
	@ResponseBody
	private CustomResult update(@Valid ProcessDocument processDocument, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return processService.update(processDocument);
	}
	
	@RequestMapping(value="/update_all")
	@ResponseBody
	private CustomResult updateAll(@Valid ProcessDocument processDocument, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return processService.updateAll(processDocument);
	}
	
	@RequestMapping(value="/update_note")
	@ResponseBody
	private CustomResult updateNote(@Valid ProcessDocument processDocument, BindingResult bindingResult) throws Exception {
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			return CustomResult.build(100, fieldError.getDefaultMessage());
		}
		return processService.updateDocumentNote(processDocument);
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	private CustomResult delete(String id) throws Exception {
		CustomResult result = processService.delete(id);
		return result;
	}
	
	@RequestMapping(value="/delete_batch")
	@ResponseBody
	private CustomResult deleteBatch(String[] ids) throws Exception {
		CustomResult result = processService.deleteBatch(ids);
		return result;
	}
	
	
	//根据订单id查找
	@RequestMapping("/search_document_by_documentId")
	@ResponseBody
	public EUDataGridResult searchDocumentByDocumentId(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = processService.searchDocumentByDocumentId(page, rows, searchValue);
		return result;
	}
	
	//根据客户名称查找
	@RequestMapping("/search_document_by_documentType")
	@ResponseBody
	public EUDataGridResult searchDocumentByDocumentType(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8"); 
		EUDataGridResult result = processService.searchDocumentByDocumentType(page, rows, searchValue);
		return result;
	}
	
	//根据产品名称查找
	@RequestMapping("/search_document_by_documentTheme")
	@ResponseBody
	public EUDataGridResult searchDocumentByDocumentTheme(Integer page, Integer rows, String searchValue) throws Exception{
		searchValue=URLDecoder.decode(searchValue,"UTF-8");   
		EUDataGridResult result = processService.searchDocumentByDocumentTheme(page, rows, searchValue);
		return result;
	}
	
}
