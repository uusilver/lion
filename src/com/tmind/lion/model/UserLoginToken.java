package com.tmind.lion.model;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tmind.lion.dao.UserInfoDAO;
import com.tmind.lion.model.UserInfo;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
@Service("userLoginToken")
public class UserLoginToken
{
	@Resource
	private UserInfoDAO userInfoDAO;
  
	public void load(UserInfo sysUser)
	{
		int userId = sysUser.getUserId();
//	    //查询用户购物车和收藏夹信息,放入session中
//	    List willingCartList = userInfoDAO.queryCartAndFavoritesByUserId(userId);
//	
//	    List favoritesList = userInfoDAO.findFavoritesByUserId(userId);
//	    
//		//加载用户收货地址信息
//		List shippingAdrList = userInfoDAO.findshippingAdrsByUserId(userId);
	}

}
