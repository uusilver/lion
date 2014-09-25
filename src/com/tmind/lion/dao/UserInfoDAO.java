package com.tmind.lion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.tmind.lion.model.UserInfo;

/**
 * Data access object (DAO) for domain model class UserInfo.
 * @see com.tmind.lion.dao.UserInfoDAO
 * @author MyEclipse - Hibernate Tools
 */
@Repository(value="userInforDAO")
public class UserInfoDAO extends JdbcDaoSupport {

    private static final Log log = LogFactory.getLog(UserInfoDAO.class);

	//property constants
	public static final String USER_NAME = "user_name";
	public static final String LOGIN_PWD = "user_pwd";
	public static final String REG_DATE = "reg_date";
	public static final String USER_TYPE = "userType";
	public static final String USER_LVL = "user_lvl";
	public static final String USER_TEL = "tel_no";
	public static final String EMAIL_ADR = "email_adr";
	public static final String WILLING_CART_TABLE_NAME = "willing_cart_table_name";
	public static final String USER_HISTORY_TABLE_NAME = "user_history_table_name";
	public static final String REMARKS1 = "remarks1";
	public static final String REMARKS2 = "remarks2";
	public static final String REMARKS3 = "remarks3";

	@Resource
	public void setJDTemplate(JdbcTemplate jdbcTemplate) {
		super.setJdbcTemplate(jdbcTemplate);
	}
    
	/**
	 * 保存用户信息
	 * @param userInfo
	 * @return
	 */
    public UserInfo save(UserInfo userInfo) {
        log.debug("saving UserInfo instance");
        
        String sql ="insert into m_user ("
        		+ this.USER_NAME +","+ this.LOGIN_PWD +","
        		+ this.REG_DATE+","+ this.USER_TEL+","+ this.EMAIL_ADR+","+ this.USER_LVL+","+ this.USER_TYPE+","
        		+ this.WILLING_CART_TABLE_NAME+","+ this.USER_HISTORY_TABLE_NAME+","+ this.REMARKS1+","
        		+ this.REMARKS2+","+ this.REMARKS3 +")"
        		+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
		Object args[] = {userInfo.getUserName() ,userInfo.getUserPwd(),userInfo.getRegDate(),
				userInfo.getTel(),userInfo.getEmail(),userInfo.getUserLevel(),
				userInfo.getUserType(),userInfo.getWillingCartTable(),userInfo.getUserHistoryTable(),
				userInfo.getRemarks1(),userInfo.getRemarks2(),userInfo.getRemarks3()};
		
        try {
        	this.getJdbcTemplate().update(sql, args);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
        return userInfo;
    }
    
    /**
     * 删除用户信息，逻辑删除，设置remarks3字段为‘D’表示删除
     * @param userInfo
     */
	public void delete(UserInfo userInfo) {
        log.debug("deleting UserInfo instance");
        
        String sql = "update m_user set "
        		+ this.REMARKS3 +"='D' " 
        		+ "where id = ?";
        
        Object args[] = {userInfo.getUserId()};
        
        
        try {
        	this.getJdbcTemplate().update(sql,args);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
	/**
	 * 根据用户ID查找用户信息
	 * @param id
	 * @return
	 */
    public UserInfo findById(Integer id) {
        log.debug("getting UserInfo instance with id: " + id);
        
        String sql = "select * from m_user "
        		+ "where id=?";
        
        Object args[] = {id}; 
        try {
            @SuppressWarnings({ "rawtypes", "unchecked" })
			List list = this.getJdbcTemplate().query(sql, args, new RowMapper(){  
                public Object mapRow(ResultSet rs, int rowNum) throws SQLException { //rowNum没有用上  
                	UserInfo userInfo=new UserInfo();  
                    userInfo.setUserId(rs.getInt("id"));  
                    return userInfo;  
                }  
            });
            return list.size()>0?(UserInfo)list.get(0):null; 
        } catch (RuntimeException re) {
            log.error("get UserInfo instance failed with id["+id+"]", re);
            throw re;
        }
    }
    
    
	/**
     * 根据用户名、密码进行系统登陆
     * @param loginName String
     * @param loginPwd String
     * @param role String
     * @return SysUser
     */
    public UserInfo findUserByNameAndPwd(String loginName,String loginPwd) {
    	UserInfo sysUser = null;
        String sql = "select * from m_user where "
                     + this.USER_NAME+"= ? and "
                     + this.LOGIN_PWD+"= ? and remarks3 !='D' ";
        Object args[] = {loginName,loginPwd}; 


        try {
            @SuppressWarnings({ "rawtypes", "unchecked" })
			List list = this.getJdbcTemplate().query(sql, args, new RowMapper(){  
                public Object mapRow(ResultSet rs, int rowNum) throws SQLException { //rowNum没有用上  
                	UserInfo userInfo=new UserInfo();  
                    userInfo.setUserId(rs.getInt("id"));  
                    return userInfo;  
                }  
            });
            
            if (list.isEmpty()) {
                logger.info("Couldn't find User, loginName=" + loginName +
                            " ,loginPwd=" + loginPwd);
            } else {
            	sysUser = (UserInfo) list.get(0);
            }

        } catch (RuntimeException re) {
            log.error("get UserInfo instance failed with userName["+loginName+"]", re);
            throw re;
        }
        return sysUser;
    }

	
	/**
	 * 校验用户是否存在
	 * @param userName
	 * @return
	 */
	public Boolean isUserExist(String userName)
	{
		String sql= "select count(0) from m_user user where "
					+this.REMARKS3+"!='D'"
					+ " and "+this.USER_NAME+"=?";
		
		Object[] args = {userName};
		
		try {
            @SuppressWarnings({ "rawtypes", "unchecked" })
			List list = this.getJdbcTemplate().query(sql, args, new RowMapper(){  
                public Object mapRow(ResultSet rs, int rowNum) throws SQLException { //rowNum没有用上  
                	UserInfo userInfo=new UserInfo();  
                    userInfo.setUserId(rs.getInt("id"));  
                    return userInfo;  
                }  
            });
            
            return list.size()>1?true:false; 
            
        } catch (RuntimeException re) {
            log.error("get UserInfo instance failed with userName["+userName+"]", re);
            throw re;
        }
	}
	
}