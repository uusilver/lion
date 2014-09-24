package com.tmind.lion.filter;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import com.tmind.lion.model.UserLoginToken;
import com.tmind.lion.result.ResultConstants;
import com.tmind.lion.result.ResultInfo;
import com.tmind.lion.result.ResultInfos;
import com.tmind.lion.web.FrameworkApplication;
import com.tmind.lion.web.RequestNameConstants;
import com.tmind.lion.web.SessionNameConstants;

/**
 *
 * <p>Title: Framework </p>
 * <p>Description:Framework</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: xwtech.com</p>
 * @author starxu
 * @version 1.0
 *
 * 过滤url,ip,判断是否有权限能够被访问
 */
public class LoginTokenFilter extends OncePerRequestFilter
{
	  protected static final Logger logger = Logger.getLogger(LoginTokenFilter.class);

	  private String loginPageUrl;

	  public void setLoginPageUrl(String loginPageUrl)
	  {
	    this.loginPageUrl = loginPageUrl;
	  }


	  protected void doFilterInternal(
	      HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException
	  {

	    //正常流程登录
	    String currentURI = request.getRequestURI();
	    String compareUrl = currentURI.substring(currentURI.lastIndexOf("/")+1,currentURI.length());
	    String frontUrl = currentURI.substring(0,currentURI.lastIndexOf("/"));
	    UserLoginToken loginToken = (UserLoginToken)(request.getSession().getAttribute(SessionNameConstants.LOGIN_TOKEN));
	    if(loginToken == null) //登录令牌不存
	    {
	      boolean isNeedRedirectLoginPage = true; //是否要跳转到登录页面
	      //尚未登录系统
	      if( FrameworkApplication.frameworkProperties.getNotFilterUrls().contains( compareUrl))
	        {
	          isNeedRedirectLoginPage = false;
	        }
	      //如果在notFilterUrls 指定了路径，则也支持直接通过
	      if (FrameworkApplication.frameworkProperties.getNotFilterUrls().contains(frontUrl))
	        isNeedRedirectLoginPage = false;

	      //跳转到登录页
	      if(isNeedRedirectLoginPage == true)
	       {
	         HashMap map = new HashMap();
	         ResultInfos resultInfos = new ResultInfos();
	         resultInfos.setGotoUrl("/index.jsp");
//	         resultInfos.setIsRedirect(true);
	         resultInfos.add(new ResultInfo(ResultConstants.NOT_LOGIN_NOT_ACCESS_ROLE,null));
	         map.put(RequestNameConstants.RESULTINFOS,resultInfos);
	         map.put("flag","s");
	         request.setAttribute(RequestNameConstants.INFORMATION, map);
	         request.getRequestDispatcher("/mss/jsp/information.jsp").forward(request,response);
	         return;
	       }
	    }
	    else //登录令牌存在
	    {
	       boolean isNeedRedirectNotRolePage = true;//是否要跳转到没有权限的页

	       if(isNeedRedirectNotRolePage == true)
	       {
	         HashMap map = new HashMap();
	         ResultInfos resultInfos = new ResultInfos();
	         resultInfos.add(new ResultInfo(ResultConstants.NOT_ACCESS_ROLE,null));
	         map.put(RequestNameConstants.RESULTINFOS,resultInfos);
	         request.setAttribute(RequestNameConstants.INFORMATION, map);
	         request.getRequestDispatcher("information.jsp").forward(request,response);
	         return;
	       }
	    }

	    long processBeginTime = System.currentTimeMillis();
	    filterChain.doFilter(request, response);
	    long processEndTime = System.currentTimeMillis();
	    logger.debug("Process Time: "+(processEndTime-processBeginTime)+" millisecond");
	  }

	  //清除来自库存系统的用户cookie值
//	  private void clearDmsCookie(HttpServletRequest request, HttpServletResponse response){
//		  Cookie[] cookies = request.getCookies();
//		//清除掉原有cookie
//		for (int i = 0; cookies != null && i < cookies.length; i++)
//		{
//			 if (SessionNameConstants.DMS_COOKIE.equals(cookies[i].getName())){
//				 cookies[i] = new Cookie(cookies[i].getName(), null);
//				 cookies[i].setMaxAge(0);
//				 cookies[i].setPath("/");
//				 //添加至response
//				 response.addCookie(cookies[i]);
//				 break;
//			 }
//		}
	  }
	  
