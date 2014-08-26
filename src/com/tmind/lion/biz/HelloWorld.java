package com.tmind.lion.biz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView helloworld(){
		
		String message="Hello Wrold Spring 3.0!";
		
		return new ModelAndView("hello","message",message);
	}
}
