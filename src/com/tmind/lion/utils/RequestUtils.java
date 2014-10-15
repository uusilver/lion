package com.tmind.lion.utils;
/**
 * <p>Title: Framework </p>
 *
 * <p>Description: Framework</p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: xwtech.com</p>
 *
 * @author FrameWork Team
 * @version 1.0
 */

import javax.servlet.http.HttpServletRequest;

public class RequestUtils extends org.springframework.web.bind.ServletRequestUtils
{
  public static String getRequiredStringsParameter(HttpServletRequest request,String name) throws Exception
  {
    StringBuffer result = new StringBuffer();;
    String[] temp = getRequiredStringParameters(request,name);
    for(int i=0;i<temp.length;i++)
    {
      if(i==temp.length-1)
       result.append(temp[i]);
     else
       result.append(temp[i]+",");
    }
    return result.toString();
  }
}
