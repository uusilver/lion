package com.tmind.lion.biz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class JSONController {

	@RequestMapping(value="/json", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON() {

		//
		Shop shop = new Shop();
		System.out.println("Shop");
		shop.setName("Eric");
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
		
		return shop;

	}
	
}
