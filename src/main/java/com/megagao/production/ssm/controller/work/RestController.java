package com.megagao.production.ssm.controller.work;

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
@RequestMapping("/workRest")
public class RestController {

	
	
	@RequestMapping("/find")
	public String find() throws Exception{
		return "workRest_list";                                                                                                                                                                                                                                                                                                 
	}
	
	
	
	
	
	
}
