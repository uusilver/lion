package com.tmind.lion.biz;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmind.lion.bo.LoginBO;
import com.tmind.lion.model.UserInfo;
import com.tmind.lion.result.ResultConstants;
import com.tmind.lion.utils.MessagesUtils;


/**
 * 登录页面控制
 */
@Controller
public class LoginController
{

  protected static final Logger logger = Logger.getLogger(LoginController.class);

  @Resource
  private LoginBO loginBO;

  @RequestMapping(value="/login",method=RequestMethod.POST)
  public @ResponseBody String login(@RequestBody String parameters,HttpServletRequest request) throws Exception
  {
	  String userName = null;
	  String userPwd = null;
	  String returnCode = "false";
	  String returnMessage = "";
	  Map<String,String> resultMap = new HashMap<String,String>();
	  UserInfo userInfo = null;
	  if(parameters!=null && !"".equals(parameters)){
		  JSONObject jsonObj = JSONObject.fromObject(parameters);
		  userInfo = (UserInfo)JSONObject.toBean(jsonObj, UserInfo.class);
		  userName = userInfo.getUserName();
		  userPwd = userInfo.getUserPwd();
	  }
	  
//	  System.out.println("userName:"+userName+" , userPwd:"+userPwd);
	  
    try
    {
      if(userName==null||"".equals(userName)||userPwd==null||"".equals(userPwd)){
    	  returnMessage = MessagesUtils.getMessage(request, ResultConstants.EMPEY_USERNAME_OR_PWD, null, null);
    	  resultMap.put("returnCode", returnCode);
    	  resultMap.put("returnMessage", returnMessage);
    	  
    	  JSONObject jsonObject = JSONObject.fromObject(resultMap);  
//    	  System.out.println("return value: "+jsonObject.toString());
    	  
    	  return jsonObject.toString();
      }
      
      //调用登录业务逻辑
      String resultCode = loginBO.login(userName,userPwd,request);
      switch(resultCode)
      {
        case ResultConstants.LOGIN_SUECCESS: //登录成功
        	returnMessage = MessagesUtils.getMessage(request, ResultConstants.LOGIN_SUECCESS, new Object[]{userName}, null);
        	returnCode = "true";
        	break;
        case ResultConstants.LOGIN_IP_NOT_ACCESS: //登录失败,IP被限制!
        	returnMessage = MessagesUtils.getMessage(request, ResultConstants.LOGIN_IP_NOT_ACCESS, null, null);
        	break;
        case ResultConstants.LOGIN_CHECK_CODE_ERROR: //登录失败,验证码不正确!
        	returnMessage = MessagesUtils.getMessage(request, ResultConstants.LOGIN_CHECK_CODE_ERROR, null, null);
        	break;
        case ResultConstants.LOGIN_PWD_ERROR: //登录失败,密码不正确!
        	returnMessage = MessagesUtils.getMessage(request, ResultConstants.LOGIN_PWD_ERROR, null, null);
        	break;
        case ResultConstants.USER_NOT_EXIST: //登录失败,用户不存在!
        	returnMessage = MessagesUtils.getMessage(request, ResultConstants.USER_NOT_EXIST, new Object[]{userName}, null);
        	break;
        default:
          logger.info("resultCode = " + resultCode + " not found!");
          break;
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }

	  resultMap.put("returnCode", returnCode);
	  resultMap.put("returnMessage", returnMessage);
	  
	  JSONObject jsonObject = JSONObject.fromObject(resultMap);  
	  System.out.println("return value: "+jsonObject.toString());
	  
	  return jsonObject.toString();
  }

}
