package com.tmind.lion.biz;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmind.lion.bo.LoginBO;
import com.tmind.lion.result.ResultConstants;


/**
 * 登录页面控制
 */
@Controller
public class LoginController
{

  protected static final Logger logger = Logger.getLogger(LoginController.class);

  @Resource
  private LoginBO loginBO;

//  public void afterPropertiesSet() throws Exception
//  {
//    if(loginBO == null)
//      throw new ApplicationContextException("Must set loginBO property on " + getClass());
//  }


  @RequestMapping(value="/login",method=RequestMethod.POST)
  public @ResponseBody String login(@RequestBody String userName,@RequestBody String userPwd,HttpServletRequest request) throws Exception
  {
	  String loginResult = "";
    try
    {
    	System.out.println("userName : "+userName+",userPwd: "+userPwd);
      if(userName==null||"".equals(userName)||userPwd==null||"".equals(userPwd)){
    	  loginResult = "用户名或密码为空，请填写正确的用户名和密码后再登录！";
    	  return "false";
      }
      
      //调用登录业务逻辑
      int resultCode = loginBO.login(userName,userPwd,request);
      switch(resultCode)
      {
        case ResultConstants.LOGIN_SUECCESS: //登录成功
        	loginResult = "登录成功";
        	break;
        case ResultConstants.LOGIN_IP_NOT_ACCESS: //登录失败,IP被限制!
        	loginResult = "登录失败,IP被限制!";
        	break;
        case ResultConstants.LOGIN_CHECK_CODE_ERROR: //登录失败,验证码不正确!
        	loginResult = "登录失败,验证码不正确!";
        	break;
        case ResultConstants.LOGIN_NAME_AND_PWD_ERROR: //登录失败,登录名和密码不正确!
        	loginResult = "登录失败,密码不正确!";
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
    return loginResult;
  }

}
