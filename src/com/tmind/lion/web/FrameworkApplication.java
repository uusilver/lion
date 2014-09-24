package com.tmind.lion.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.ListOrderedMap;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContextException;

import com.tmind.lion.dao.BaseJdbcDAO;
import com.tmind.lion.utils.DateUtils;

/**
 * 
 * <p>
 * Title: Framework
 * </p>
 * <p>
 * Description: Framework
 * </p>
 * <p>
 * Copyright: Copyright (c) 2005
 * </p>
 * <p>
 * Company: xwtech.com
 * </p>
 * 
 * @author starxu
 * @version 1.0 Framework 的全局变量类
 * 
 * 
 * 
 */
public class FrameworkApplication implements InitializingBean {

	protected static final Logger logger = Logger
			.getLogger(FrameworkApplication.class);

	// 框架配置属性类
	public static FrameworkProperties frameworkProperties;

	// 框架缓存pojo name
	private static Map cachePojoNames;

	//框架缓存constants name
	private static Map constantsNames;

	public static BaseJdbcDAO baseJdbcDAO;

	private static HashMap cacheTableMap = new HashMap();

	public void setFrameworkProperties(FrameworkProperties frameworkProperties) {
		this.frameworkProperties = frameworkProperties;
	}

	public void setCachePojoNames(Map cachePojoNames) {
		this.cachePojoNames = cachePojoNames;
	}

	public static Map getConstantsNames() {
		return constantsNames;
	}

	public void setConstantsNames(Map constantsNames) {
		this.constantsNames = constantsNames;
	}

	public FrameworkProperties getFrameworkProperties() {
		return frameworkProperties;
	}

	public void setBaseJdbcDAO(BaseJdbcDAO baseJdbcDAO) {
		this.baseJdbcDAO = baseJdbcDAO;
	}

	public void afterPropertiesSet() throws Exception {
		if (frameworkProperties == null)
			throw new ApplicationContextException(
					"Must set frameworkProperties property on " + getClass());

		// 初始化缓存 pojo 对象
		refreshCache();
	}

	/**
	 * 取出缓存 pojo 对象
	 * 
	 * @param cachePojoName
	 *            String
	 * @return List
	 */
	public synchronized static List getCacheObjects(String pojoName) {
		return (List) cacheTableMap.get(pojoName);
	}

	/**
	 * 刷新 pojo 缓存
	 * 
	 * @throws Exception
	 */
	public synchronized static void refreshCache() throws Exception {
		if (cachePojoNames != null) {
			Iterator it = cachePojoNames.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry e = (Map.Entry) it.next();
				refreshCacheByPojoName(e.getKey() + "", e.getValue() + "");
			}
		}
	}

	/**
	 * 刷新 pojo 缓存
	 * 
	 * @throws Exception
	 */
	public static void refreshCache(String pojoName) throws Exception {
		if (cachePojoNames != null) {
			Iterator it = cachePojoNames.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry e = (Map.Entry) it.next();
				if (e.getKey().equals(pojoName))
					refreshCacheByPojoName(e.getKey() + "", e.getValue() + "");
			}
		}
	}

	/**
	 * 刷新 pojo 缓存 按pojo名
	 * 
	 * @param pojoName
	 *            String
	 * @throws Exception
	 */
	public static void refreshCacheByPojoName(String pojoName, String sql)
			throws Exception {
		try {
			List l = baseJdbcDAO.getJdbcTemplate().queryForList(sql);
			cacheTableMap.put(pojoName, l);
			logger.info("load cache pojo[ " + pojoName + " ,size = " + l.size()
					+ " ]");
			//设置订单邮箱信息
//			if(pojoName!=null && pojoName.equals("dmsTimeLimit") && l!=null && l.size()>0){
//				for(int i=0;i<l.size();i++){
//					DmsTimeLimit timeLimit = (DmsTimeLimit)l.get(i);					
//					//邮箱帐号
//		        	if(timeLimit.getTimeType()!=null && timeLimit.getTimeType().equals("MF")){;
//		        		frameworkProperties.setMailFrom(timeLimit.getTime());
//		        	}
//		        	//发送邮件服务器SMTP
//		        	if(timeLimit.getTimeType()!=null && timeLimit.getTimeType().equals("MH")){;
//		        		frameworkProperties.setMailHost(timeLimit.getTime());
//		        	}
//		        	//邮箱用户名
//		        	if(timeLimit.getTimeType()!=null && timeLimit.getTimeType().equals("MU")){;
//		        		frameworkProperties.setUserName(timeLimit.getTime());
//		        	}
//		        	//邮箱密码
//		        	if(timeLimit.getTimeType()!=null && timeLimit.getTimeType().equals("MP")){;
//		        		frameworkProperties.setPassword(timeLimit.getTime());
//		        	}
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("load cache pojo fail," + pojoName
					+ " not found!");
		}
	}

	/**
	* 取出缓存 constants 对象
	* @param cachePojoName String
	* @return List
	*/
	public synchronized static String getCacheConstantsObjects(String constantsName){
		return (String)cacheTableMap.get(constantsName);
	}

	/**
	* 刷新 constants 缓存
	* @throws Exception
	*/
	public synchronized static void refreshConstantsCache() throws Exception {
		if(constantsNames != null) {
			Iterator it = constantsNames.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry e = (Map.Entry)it.next();
				refreshCacheByConstantsName(e.getKey()+"",e.getValue()+"", "");
			}
		}
	}
	/**
	* 刷新 constants 缓存
	* @throws Exception
	*/
	public static void refreshConstantsCache(String constantsName) throws Exception {
		if(constantsNames != null) {
			Iterator it = constantsNames.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry e = (Map.Entry)it.next();
				if (e.getKey().equals(constantsName))
				refreshCacheByConstantsName(e.getKey()+"",e.getValue()+"", "");
			}
		}
	}
	
	/**
	*  刷新 constants 缓存 按constants名
	* @param pojoName String
	* @throws Exception
	*/
	public static void refreshCacheByConstantsName(String constantsName,String sql, String value) throws Exception
	{
		try {
			//更新的订单数目
			if(constantsName!=null && (constantsName.equals("orderCount") 
//					|| constantsName.equals("indentCount")
					)){
				if(sql!=null && !sql.equals("")){
					sql = sql.replaceAll("'date'", "'" + DateUtils.getChar8() + "'");
					List l = baseJdbcDAO.queryForList(sql);
					cacheTableMap.put(constantsName, ((ListOrderedMap)l.get(0)).getValue(0).toString());
					logger.info("load cache constant[ " + constantsName + " ,size = " + l.size() + " ]");
				}else if(value!=null && !value.equals("")){
					cacheTableMap.put(constantsName, value);
					logger.info("load cache constant[ " + constantsName + " ,vlue = " + value + " ]");
				}
			}
			//更新的订单日期
			if(constantsName!=null && constantsName.equals("countDate")){
				if(sql!=null && !sql.equals("")){
					sql = sql.replaceFirst("date", DateUtils.getChar8());
					cacheTableMap.put(constantsName, sql);
					logger.info("load cache constant[ " + constantsName + " ,vlue = " + sql + " ]");
				}else if(value!=null && !value.equals("")){
					cacheTableMap.put(constantsName, value);
					logger.info("load cache constant[ " + constantsName + " ,vlue = " + value + " ]");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new Exception("load cache constant fail," + constantsName + " not found!");
		}
	}

	public static void main(String[] args) {
	}

}
