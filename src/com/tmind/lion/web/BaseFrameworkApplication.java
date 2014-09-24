package com.tmind.lion.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.tmind.lion.dao.BaseJdbcDAO;

/**
 *
 * <p>Title: Framework </p>
 * <p>Description: Framework</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: xwtech.com</p>
 * @author starxu
 * @version 1.0
 * Framework 的全局变量类

 *
 */
public class BaseFrameworkApplication implements InitializingBean
{
  public static final boolean logTimer = false;

  protected static final Logger logger = Logger.getLogger(BaseFrameworkApplication.class);

  public static String FrameworkWebAppRootPath;  //系统启动时通过FrameworkListener获得
  //查询配置文件目录
  public static String queryConfigFilePath;      //系统启动时通过FrameWorkApplication注入的方式得到
  //查询样式配置文件目录
  public static String queryStyleConfigFilePath;      //系统启动时通过FrameWorkApplication注入的方式得到

  private static BaseJdbcDAO baseJdbcDAO;

  public void setBaseJdbcDAO(BaseJdbcDAO baseJdbcDAO)
  {
    this.baseJdbcDAO = baseJdbcDAO;
  }

  public void afterPropertiesSet() throws Exception
  {
  }

  /**
   * 获取BaseJdbcDAO
   * 如果Spring没有注入，就通过jdbc.properties进行构造
   * @return BaseJdbcDAO
   */
  public static BaseJdbcDAO getBaseJdbcDAO()
  {
    if (baseJdbcDAO==null)
    {
      Properties propJdbc = new Properties();
      try {
        String path = FrameworkWebAppRootPath+"WEB-INF/jdbc.properties";
          propJdbc.load(new FileInputStream(path));
          String driverClassName = (String)propJdbc.get("jdbc.driverClassName");
          String url = (String)propJdbc.get("jdbc.url");
          String username = (String)propJdbc.get("jdbc.username");
          String password = (String)propJdbc.get("jdbc.password");
          DriverManagerDataSource ds = new DriverManagerDataSource(driverClassName,url,username,password);
          baseJdbcDAO = new BaseJdbcDAO();
          baseJdbcDAO.setDataSource(ds);
      } catch (IOException e) {
      }
    }
    return baseJdbcDAO;
  }
}
