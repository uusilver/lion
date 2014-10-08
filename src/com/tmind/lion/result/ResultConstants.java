package com.tmind.lion.result;

public class ResultConstants {
	
	public static final String LOGIN_SUECCESS = "10000"; // 登录成功，{0}欢迎回来！

	public static final String LOGIN_IP_NOT_ACCESS = "10001"; // 登录失败,IP被限制!

	public static final String LOGIN_CHECK_CODE_ERROR = "10002"; // 登录失败,验证码不正确!

	public static final String LOGIN_PWD_ERROR = "10003"; // 登录失败,密码不正确!

	public static final String USER_NOT_EXIST = "10004"; // 登录失败,用户名{0}不存在!

	public static final String EMPEY_USERNAME_OR_PWD = "10005"; // 用户名或密码为空，请填写正确的用户名和密码后再登录！

	public static final String NOT_LOGIN_NO_PERMISSION = "10006"; // 您尚未登录，没有权限进行此操作，请先登录！

	public static final String SYS_INTERNAL_EXCEPTION = "10007"; // 系统异常,请稍后再试！

	public static final String USER_REG_SUCCESS = "10008"; // 用户注册成功！

	public static final String USER_ALREADY_EXIST = "10009"; // 用户名{0}已经存在，请更改后再尝试！

	public static final String FAVORITE_ADD_SUCCESS = "10010"; // 用户收藏{0}成功！

	public static final String FAVORITE_ADDL_FAILURE = "10011"; // 用户收藏{0}失败！

	public static final String FAVORITE_DEL_SUCCESS = "10012"; // 用户取消收藏{0}成功！

	public static final String FAVORITE_DEL_FAILURE = "10013"; // 用户取消收藏{0}失败！

	public static final String SYS_DB_EXCEPTION = "20001"; // 数据库异常

}
