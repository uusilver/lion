package com.tmind.lion.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.log4j.Logger;

public class FrameworkListener implements ServletContextListener
{
  protected static final Logger logger = Logger.getLogger(FrameworkListener.class);
  public void contextInitialized(ServletContextEvent event)
  {
    BaseFrameworkApplication.FrameworkWebAppRootPath = event.getServletContext().getRealPath("/");
    System.getProperties().list(System.out);
  }

  public void contextDestroyed(ServletContextEvent event)
  {

  }
}

