package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class test {
	@RequestMapping("/test")
	 public ModelAndView disp() {
		String test = "TEST TEST";
		 return new ModelAndView("hellopage","test", test);
	 }
}
