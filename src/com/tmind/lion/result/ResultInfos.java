package com.tmind.lion.result;

import java.util.*;

public class ResultInfos
{
  private ArrayList resultInfos = new ArrayList();

  private String gotoUrl = null;

  private String gotoUrlBack = null;

  private boolean isRedirect = false;

  private boolean isRefreshParentWindow = false;

  private boolean isRefreshOpenerWindow = false;
  
  private boolean isCloseWindow;

  private boolean isAlert = false;
  /**
   * 返回对象
   * 主要用于存储BO处理结果需要返回的对象
   */
  private Object returnObject = null;


  public ResultInfos()
  {
    super();
  }

  public ResultInfos(boolean isAlert,boolean isRedirect,ResultInfo resultInfo,String gotoUrl)
  {
    super();
    this.setIsAlert(isAlert);
    this.setIsRedirect(isRedirect);
    this.add(resultInfo);
    this.setGotoUrl(gotoUrl);
  }
  
  public void setIsRefreshParentWindow(boolean isRefreshParentWindow)
  {
    this.isRefreshParentWindow = isRefreshParentWindow;
  }

  public boolean getIsRefreshParentWindow()
  {
    return this.isRefreshParentWindow;
  }

  public void setIsRefreshOpenerWindow(boolean isRefreshOpenerWindow)
  {
    this.isRefreshOpenerWindow = isRefreshOpenerWindow;
  }

  public boolean getIsRefreshOpenerWindow()
  {
    return this.isRefreshOpenerWindow;
  }

public void setIsRedirect(boolean isRedirect)
  {
    this.isRedirect = isRedirect;
  }

  public boolean getIsRedirect()
  {
    return this.isRedirect;
  }

  public void setIsAlert(boolean isAlert)
  {
    this.isAlert = isAlert;
  }

  public boolean getIsAlert()
  {
    return this.isAlert;
  }

  public void add(ResultInfo resultInfo)
  {
    resultInfos.add(resultInfo);
  }

  public void add(ResultInfo resultInfo, String gotoUrl)
  {
    resultInfos.add(resultInfo);
    this.gotoUrl = gotoUrl;
  }

  public void clear()
  {
    resultInfos.clear();
  }

  public int indexOf(ResultInfo resultInfo)
  {
    return resultInfos.indexOf(resultInfo);
  }

  public Iterator iterator()
  {
    return resultInfos.iterator();
  }

  public void remover(ResultInfo resultInfo)
  {
    resultInfos.remove(resultInfo);
  }

  public boolean isEmpty()
  {
    return resultInfos.isEmpty();
  }

  public String getGotoUrl()
  {
    return gotoUrl;
  }

  public String getGotoUrlBack()
  {
    return gotoUrlBack;
  }


  public boolean getIsCloseWindow()
  {
    return isCloseWindow;
  }

  public int size()
  {
    return resultInfos.size();
  }

  public void setGotoUrl(String gotoUrl)
  {
    this.gotoUrl = gotoUrl;
  }

  public void setGotoUrlBack(String gotoUrlBack)
  {
    this.gotoUrlBack = gotoUrlBack;
  }

  public void setIsCloseWindow(boolean isCloseWindow)
  {
    this.isCloseWindow = isCloseWindow;
  }

  public ResultInfo get(int i)
  {
    return(ResultInfo)resultInfos.get(i);
  }
  /**
   * set返回对象
   * @param returnObject Object
   */
  public void setReturnObject(Object returnObject)
  {
    this.returnObject = returnObject;
  }
  /**
   * 获取执行后的返回对象
   * @return Object
   */
  public Object getReturnObject()
  {
    return this.returnObject;
  }

}
