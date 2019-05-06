package com.megagao.production.ssm.controller.email;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/email")
public class EmailController {

	@RequestMapping("/find")
	public String find() throws Exception {
		return "email";
	}
}
