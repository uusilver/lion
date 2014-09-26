package com.tmind.lion.result;

public class ResultConstants {
	
	public static final int LOGIN_SUECCESS = 10000; // 登录成功

	public static final int LOGIN_IP_NOT_ACCESS = 10001; // 登录失败,IP被限制!

	public static final int LOGIN_CHECK_CODE_ERROR = 10002; // 登录失败,验证码不正确!

	public static final int LOGIN_NAME_AND_PWD_ERROR = 10003; // 登录失败,登录名和密码不正确!

	public static final int NOT_ACCESS_ROLE = 10004; // 权限验证失败,您没有访问权限,请联系管理员!

	public static final int NOT_LOGIN_NOT_ACCESS_ROLE = 10005; // 您尚未登录系统，没有权限进行此操作！

	public static final int DIY_USER_REG_SUCCESS = 61005; // 用户注册成功！

	public static final int DIY_RING_FAVORITE_ADD_SUCCESS = 61031; // 用户收藏{0}成功！

	public static final int DIY_RING_FAVORITE_ADD_FAILURE = 61032; // 用户收藏{0}失败！

	public static final int DIY_RING_FAVORITE_DEL_SUCCESS = 61033; // 用户取消收藏{0}成功！

	public static final int DIY_RING_FAVORITE_DEL_FAILURE = 61034; // 用户取消收藏{0}失败！

	public static final int SYS_DB_EXCEPTION = 90001; // 数据库异常

	public static final int USER_NOT_EXIST = 301001; // 用户不存在。

	public static final int USER_ALREADY_EXIST = 301002; // 用户已经存在。

}
