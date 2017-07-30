package com.javatpoint;  

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;  
@Controller  
class HelloWorldController {  
    @RequestMapping("/add")  
    public ModelAndView helloWorld(
    		@RequestParam(value="t1") int i ,
    		@RequestParam(value="t2") int j) {
    	String message = Integer.toString(i+j);  
        return new ModelAndView("hellopage", "message", message);  
    }  
}  