package com.tmind.lion.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.tmind.lion.cache.Contact;

@Controller
@SessionAttributes
public class ContactController {
	
	@RequestMapping("/contact")
	public ModelAndView showContracts(){
		System.out.println("showContracts!");
		return new ModelAndView("contact","command",new Contact());
	}
	
	@RequestMapping(value="/addContact",method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result){
		System.out.println("FirstName:"+contact.getFirstname()+"LastName:"+contact.getLastname());
		
		return "redirect:contact.do";
	}
	
	//jsonTest
	@RequestMapping(value="/getjson",method=RequestMethod.GET)
	@ResponseBody
	public String getData(){
		String json_text=null;
		List<Object> list=new ArrayList<Object>();
		list.add("1");
		list.add("aaa");
		list.add("bb");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("Json", "Eric");
		return json_text;
	}
	
}
