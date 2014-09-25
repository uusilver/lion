package com.tmind.lion.model;

import java.util.HashSet;
import java.util.Set;

/**
 * MssUserInfo generated by MyEclipse - Hibernate Tools
 */

public class UserInfo  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 4575427311134246652L;

    // Fields    
	 private Integer userId;
     private String userName;
     private String userPwd;
     private String regDate;
     private String userType;
     private Integer userLevel;
     private String tel;
     private String email;
     private String willingCartTable;
     private String userHistoryTable;
     private String remarks1;
     private String remarks2;
     private String remarks3;

    /** default constructor */
    public UserInfo() {
    }

	/** minimal constructor */
    public UserInfo(Integer userId, String userName, String userPwd, Integer userLevel, 
    				String userType, String email,String tel,
    				String willingCartTable,String userHistoryTable) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userLevel = userLevel;
        this.userType = userType;
        this.email = email;
        this.tel = tel;
        this.willingCartTable = willingCartTable;
        this.userHistoryTable = userHistoryTable;
    }
    
    /** full constructor */
    public UserInfo(Integer userId, String userName, String userPwd, Integer userLevel, 
			String userType, String email,String tel,
			String willingCartTable,String userHistoryTable,String remarks1,
			String remarks2,String remarks3) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userLevel = userLevel;
		this.userType = userType;
		this.email = email;
		this.tel = tel;
		this.willingCartTable = willingCartTable;
		this.userHistoryTable = userHistoryTable;
		this.remarks1 = remarks1;
		this.remarks2 = remarks2;
		this.remarks3 = remarks3;
	}

   
    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWillingCartTable() {
		return willingCartTable;
	}

	public void setWillingCartTable(String willingCartTable) {
		this.willingCartTable = willingCartTable;
	}

	public String getUserHistoryTable() {
		return userHistoryTable;
	}

	public void setUserHistoryTable(String userHistoryTable) {
		this.userHistoryTable = userHistoryTable;
	}

	public String getRemarks1() {
		return remarks1;
	}

	public void setRemarks1(String remarks1) {
		this.remarks1 = remarks1;
	}

	public String getRemarks2() {
		return remarks2;
	}

	public void setRemarks2(String remarks2) {
		this.remarks2 = remarks2;
	}

	public String getRemarks3() {
		return remarks3;
	}

	public void setRemarks3(String remarks3) {
		this.remarks3 = remarks3;
	}

}