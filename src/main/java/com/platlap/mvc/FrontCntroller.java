package com.platlap.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontCntroller {

	@RequestMapping("/idam-servlet")
	public ModelAndView homepage(Map<String, Object> model) {
		model.put("number", 1234);
	    model.put("message", "Hello from Spring MVC");
	    return new ModelAndView("index");
	}
}
