package com.tmind.lion.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tmind.lion.dao.EmpDAO;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		EmpDAO dao = (EmpDAO) ctx.getBean("empDAO");
		try {
			System.out.println("记录数："+dao.findCount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
