package com.tmind.lion.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 
 * <p>
 * Title: Framework
 * </p>
 * <p>
 * Description: Framework
 * </p>
 * <p>
 * Copyright: Copyright (c) 2001
 * </p>
 * <p>
 * Company: xwtech.com
 * </p>
 * 
 * @author not attributable
 * @version 1.0
 * 
 * 基本 jdbc DAO操作
 */
public class BaseJdbcDAO extends JdbcDaoSupport {
	protected static final Logger logger = Logger.getLogger(BaseJdbcDAO.class);

	public List queryForList(String sql) {
		return getJdbcTemplate().queryForList(sql);
	}
	
	public long queryForLong(String sql) {
		return getJdbcTemplate().queryForLong(sql);
	}

	public int update(String sql) {
		return getJdbcTemplate().update(sql);
	}

	public int update(String sql, Object[] param) {
		return getJdbcTemplate().update(sql, param);
	}
}
