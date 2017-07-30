package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class bye {
	@RequestMapping("/bye")
	 public ModelAndView disp() {
		String Bye = "BYE BYE";
		 return new ModelAndView("hellopage","Bye",Bye);
	 }
}
