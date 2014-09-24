package com.tmind.lion.bo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.tmind.lion.dao.UserInfoDAO;
import com.tmind.lion.model.UserInfo;
import com.tmind.lion.model.UserLoginToken;
import com.tmind.lion.result.ResultConstants;
import com.tmind.lion.utils.SessionUtils;
import com.tmind.lion.web.SessionNameConstants;

/**
 *
 * <p>Title: Framework </p>
 * <p>Description:Framework</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: xwtech.com</p>
 * @author starxu
 * @version 1.0
 *
 * 登录业务处理
 */
@Service("loginBO")
public class LoginBO
{
  protected static final Logger logger = Logger.getLogger(LoginBO.class);

  @Resource
  private UserInfoDAO userInfoDAO;

//  private String notAccessIp;


  public LoginBO()
  {

  }


  /**
   * 根据登录名和密码登录
   * @param userName
   * @param userPwd
   * @param loginIp
   * @return
   * @throws Exception
   */
  public int login(String userName,String userPwd,HttpServletRequest request) throws Exception
  {

       //记录登录日志
//       	FrameLoginLog frameLoginLog = new FrameLoginLog();
//        frameLoginLog.setLoginName(userName);
//        frameLoginLog.setLoginPwd(userPwd);
//        frameLoginLog.setLoginIp(loginIp);
//        frameLoginLog.setLoginTime(DateUtils.getChar14());

       //检查ip
//       if(notAccessIp != null)
//       {
//         RE regexp = new RE(notAccessIp);
//         if(regexp.match(loginIp) == true) //ip被限制
//         {
//           frameLoginLog.setLoginResultCode(new Long(ResultConstants.LOGIN_IP_NOT_ACCESS));
//           frameLoginLogDAO.save(frameLoginLog);
//           ResultInfo resultInfo = new ResultInfo(ResultConstants.LOGIN_IP_NOT_ACCESS,null);
//           resultInfos.add(resultInfo);
//           return;
//         }
//       }
       
       //检查验证码
//       if(FrameworkApplication.frameworkProperties.getUseCheckCode() == true)//需要验证码验证
//       {
//         if( checkCode == null ||
//             SessionUtils.getObjectAttribute(request,SessionNameConstants.CHECK_CODE) == null ||
//             checkCode.compareTo((String)SessionUtils.getObjectAttribute(request,SessionNameConstants.CHECK_CODE))!=0)//验证失败
//         {
//           frameLoginLog.setLoginResultCode(new Long(ResultConstants.LOGIN_CHECK_CODE_ERROR));
//           frameLoginLogDAO.save(frameLoginLog);
//           ResultInfo resultInfo = new ResultInfo(ResultConstants.LOGIN_CHECK_CODE_ERROR,null);
//           resultInfos.add(resultInfo);
//           SessionUtils.removeObjectAttribute(request,SessionNameConstants.CHECK_CODE);
//           return ;
//         }
//       }
       //检查登录名和密码是否正确



       UserInfo userInfo = userInfoDAO.findUserByNameAndPwd(userName, userPwd);
       if(userInfo == null)
       {
         return ResultConstants.LOGIN_NAME_AND_PWD_ERROR;
       }
       UserLoginToken loginToken = new UserLoginToken();
       //加载登录用户的相关信息到登录令牌
       loginToken.load(userInfo);
//       frameLoginLog.setLoginResultCode(new Long(ResultConstants.LOGIN_SUECCESS));
//       frameLoginLogDAO.save(frameLoginLog);
//       ResultInfo resultInfo = new ResultInfo(ResultConstants.LOGIN_SUECCESS,null);
//       resultInfos.add(resultInfo);
       //保存登录用户信息到http session
        SessionUtils.setObjectAttribute(request,SessionNameConstants.LOGIN_TOKEN, loginToken);
       //修改最后一次登录时间
//       frameLogin.setLoginLastTime(DateUtils.getChar14());
//       frameLoginDAO.saveFrameLogin(frameLogin);
       return ResultConstants.LOGIN_SUECCESS;

  }
}
