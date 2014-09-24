package com.tmind.lion.web;

public class SessionNameConstants
{
  public static final String LOGIN_TOKEN = "frameLoginToken";//登录令牌的session名称
  public static final String DMS_COOKIE = "dmsCookie";//库存的cookie名称
  public static final String MPMS_COOKIE = "mpmsCookie";//物资的cookie名称
  public static final String CHECK_CODE = "checkCode";//验证码的session名称
  public static final String SQL_CACHE_MAP = "sqlCacheMap"; //查询中Sql结果集的缓存名称
  public static final String DEFAULT_RING_ID = "setDefaultRingId"; //设置默认玲音时保存的ringId值
  public static final int iCookieTime = 60 * 60 * 24 * 30;
  
  public static final int iCookieForCurrentPage = -1;


  public static final String DEFAULT_RING_CODE = "setDefaultRingCode"; //设置默认玲音时保存的ringCode值





  public static final String DEFAULT_PAGE = "page";//判断是从哪个页面传过来的
  public static final String DEFAULT_RING_SETTING_ID = "defaultRingSettingId"; //设置默认玲音时保存的defaultRingSettingId值
  public static final String RING_SETTING_ID = "caller"; //修改玲音时保存的联系人或者群组的id值
  public static final String RING_SETTING_TYPE = "setType"; //修改玲音时保存是联系人还是群组





  public static final String DEFAULT_RING_SETTING = "userRingSetting"; //设置默认玲音时保存的userRingSetting值





  public static final String DEFAULT_RING_HOLIDAY = "holiday"; //设置默认玲音时保存的holiday值





  public static final String CALLNUM_ID = "callnumId"; //设置单个联系人玲音时保存联系人id的值





  public static final String CALLNUM_NAME = "name"; //设置单个联系人玲音时保存联系人的名称
  public static final String CALLNUM_NUM = "num"; //设置单个联系人玲音时保存联系人的号码
  public static final String CALLNUM_GROUP = "group"; //设置单个联系人玲音时保存联系人的所属群组





  public static final String GROUP_NAME = "groupName"; //新增群组时保存的群组名称
  public static final String GROUP_ID = "groupId"; //新增群组时保存的群组ID
  public static final String DEFAULT_RING_NAME = "defaultRingName"; //保存的铃音名称的值





  public static final String DEFAULT_RING_DATE = "ringDate"; //保存的铃音有效期的值





  public static final String DEFAULT_RING_DESC = "ringDesc"; //保存的铃音描述的值





  public static final String DEFAULT_RING_PRICE = "ringPrice"; //保存的铃音价格的值





  public static final String CALLNUM_TYPE = "type"; //设置单个联系人玲音时保存联系人的号码类型
  public static final String GROUP_NUM = "groupNum"; //修改群组时保存的群组内的联系人数量





  public static final String SELECT_NAME = "selectName"; //保存选择的联系人
  public static final String SELECT_GROUP = "selectGroup"; //保存选择的群组联系人
  public static final String SELECT_GROUP_NAME = "selectGroupName"; //保存选择的群组




  public static final String DOWN_URL = "downloadUrl"; //保存铃音下载时返回页面的UERL
  public static final String DOWN_TYPE = "downloadType"; //保存铃音下的下载类型
  public static final String FREE_ID = "freeId"; //保存个性大礼包id
  public static final String FREE_MAXCOUNT = "freeMaxCount"; //保存个性大礼包最大数量





  public static final String FREE_COUNT = "freeCount"; //保存个性大礼包可选数量提示





  public static final String FREE_COUNTS= "freeCounts"; //保存个性大礼包可选数量





  public static final String FREE_RING_ID = "freeRingId"; //保存个性大礼包所选铃音id
  public static final String FREE_NAME = "freeName"; //保存个性大礼包名称

  public static final String SELECT_COPY_ID = "selectCopyId"; //保存选择的联系人ID
  public static final String SELECT_COPY_NAME = "selectCopyName"; //保存选择的联系人名称
  public static final String SELECT_COPY_NUMBER = "selectCopyNumber"; //保存已有允许复制的联系人
  public static final String COPY_NUMBER = "copyNumber"; //保存被复制的联系人号码




  public static final String RING_NAME = "ringname"; //保存查询的铃音名称




  public static final String LOGIN_NAME = "loginName";//用户注册名(手机号码)
  public static final String RESULT_CODE = "resultCode";//用户注册操作的结果码
}
