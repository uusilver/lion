package com.tmind.lion.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tmind.lion.model.FrameLoginLog;

public class FrameLoginLogDAO extends HibernateDaoSupport
{

  protected static final Logger logger = Logger.getLogger(FrameLoginLogDAO.class);

  public void saveFrameLoginLog(FrameLoginLog frameLoginLog)
  {
    getHibernateTemplate().saveOrUpdate(frameLoginLog);
  }

  public void save(FrameLoginLog transientInstance) {
	  logger.debug("saving FrameLoginLog instance");
      try {
          getHibernateTemplate().save(transientInstance);
          logger.debug("save successful");
      } catch (RuntimeException re) {
    	  logger.error("save failed", re);
          throw re;
      }
  }
  
  public FrameLoginLog getFrameLoginLog(Long id)
  {
    FrameLoginLog frameLoginLog = (FrameLoginLog)getHibernateTemplate().get(FrameLoginLog.class, id);
    if(frameLoginLog == null)
    {
      logger.warn("uh oh, FrameLoginLog " + id + "' not found...");
      throw new ObjectRetrievalFailureException(FrameLoginLog.class, id);
    }
  return frameLoginLog;
  }

  public List getFrameLoginLogs()
  {
    return getHibernateTemplate().loadAll(FrameLoginLog.class);
  }

  public void removeFrameLoginLog(Long id)
  {
    getHibernateTemplate().delete(getFrameLoginLog(id));
  }

}
