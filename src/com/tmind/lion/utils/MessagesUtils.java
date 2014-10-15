package com.tmind.lion.utils;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.support.RequestContext;

public class MessagesUtils {

	/**
	 * 根据消息code，参数和Locale获取消息内容
	 * @param request
	 * @param code
	 * @param params
	 * @param locale
	 * @return
	 * @throws Exception
	 */
	public static String getMessage(HttpServletRequest request,String code, Object[] params,Locale locale) throws Exception{
		
		  RequestContext requestContext = new RequestContext(request);

		  if(locale==null){
			  locale = requestContext.getLocale();
		  }
		  
		  String message = requestContext.getMessageSource().getMessage(code, params, locale);
		  
		  System.out.println(message);
		
		return message;
		
	}
}
