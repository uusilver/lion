package com.tmind.lion.result;

public class ResultConstants {
	public static final int SUCCESS_COMPLETELY = 0; // 成功（已经完成请求的操作）。

	public static final int CODE_OK = 0; // 操作成功

	public static final int SUCCESS_ACCEPT = 1; // 成功受理。

	public static final int SUCCESS_WITHOUT_TONE = 2; // 添加套餐成功或者修改套餐成功，无提示音。

	public static final int DOWNTONEASK_ACCEPT = 3; // 已接受下载请求，等待开户后下载（非实时开户的下载即开户）。

	// add by jzy 09-02-11 部门操作提示

	public static final int ORG_ADD_SUCCESS = 80047;	//新增部门成功

	public static final int ORG_ADD_FAILED = 80048;		//新增部门失败

	public static final int ORG_UPDATE_SUCCESS = 80049;	//更新部门成功

	public static final int ORG_UPDATE_FAILED = 80050; //更新部门失败
	
	public static final int  ORG_DEL_SUCCESS= 80051; //删除部门成功
	
	public static final int ORG_DEL_FAILED = 80052; //删除部门失败

	public static final int ORG_UPORG_WRONG = 80053; //上级部门不能包含自己
	
	public static final int LOGIN_SUECCESS = 10000; // 登录成功

	public static final int LOGIN_IP_NOT_ACCESS = 10001; // 登录失败,IP被限制!

	public static final int LOGIN_CHECK_CODE_ERROR = 10002; // 登录失败,验证码不正确!

	public static final int LOGIN_NAME_AND_PWD_ERROR = 10003; // 登录失败,登录名和密码不正确!

	public static final int NOT_ACCESS_ROLE = 10004; // 权限验证失败,您没有访问权限,请联系管理员!

	public static final int NOT_LOGIN_NOT_ACCESS_ROLE = 10005; // 您尚未登录系统，没有权限进行此操作！

	public static final int USER_RINGSETTING_SUCCESS = 10200; // 铃音设置成功

	public static final int USER_RINGSETTING_FAILURE = 10201; // 铃音设置失败

	public static final int USER_RINGSETTING_EXISTSTIMEDUPLICATE = 10202; // 铃音设置时发现存在时间段重叠的分时段设置

	public static final int USER_RINGSETTING_DELETE_SUCCESS = 10203; // 铃音设置删除成功

	public static final int USER_RINGSETTING_DELETE_FAILURE = 10204; // 编号为{0}的铃音设置删除失败

	public static final int USER_RINGSETTING_EXISTS_PERIOD_FOR_SMSORAUTO = 10205; // 存在分时段设置

	public static final int USER_RINGSETTING_NOT_EXISTS_RINGCODE = 10206; // 设置默认铃音时铃音编号不存在

	public static final int USER_RINGSETTING_NOT_EXISTS_USERNUM = 10207; // 用户号码不存在

	public static final int USER_CALL_NUMBER_SUCCESS = 10300; // 保存用户号码组成功

	public static final int USER_CALL_NUMBER_EXISTS_CALL_NUM = 10301; // 保存用户号码时用户联系人号码中已存在此号码

	public static final int USER_CALL_NUMBER_EXISTS_CALL_NUM_GROUP = 10302; // 保存用户号码时用户其它号码组中已存在此号码

	public static final int USER_CALL_NUMBER_DELETE_CALLNUM_SUCCESS = 10303; // 删除联系人成功

	public static final int USER_CALL_NUMBER_DELETE_CALLNUM_FAILURE = 10304; // 删除编号为{0}的联系人失败

	public static final int USER_CALL_NUMBER_DELETE_NUMGROUP_SUCCESS = 10305; // 删除号码组或者号码成功

	public static final int USER_CALL_NUMBER_DELETE_NUMGROUP_FAILURE = 10306; // 删除编号为{0}的号码组或者号码失败

	public static final int USER_CALL_NUMBER_EXISTS_SAMENAME_NUMGROUP = 10307; // 增加号码组时存在相同名称的号码组

	public static final int USER_CALL_NUMBER_OVER_MAXTELEGROUPAMOUNT = 10308; // 增加号码组时已超出号码组的最大限制

	public static final int USER_CALL_NUMBER_OVER_MAXTELEAMOUNT_INGROUP = 10309; // 增加号码组联系人时已超出号码组内号码数的最大限制

	public static final int USER_CALL_NUMBER_OVER_MAXTELEAMOUNT = 10310; // 超过最大主叫号码数

	public static final int USER_ADD_TELEGROUP_SUCCESS = 10311; // 增加号码组成功

	public static final int USER_ADD_TELEGROUPTELE_SUCCESS = 10312; // 增加号码组号码成功

	public static final int USER_ADD_TELEGROUP_FAILURE = 10313; // 增加号码组失败

	public static final int USER_ADD_TELEGROUPTELE_FAILURE = 10314; // 增加号码组号码失败

	public static final int USER_MODIFY_TELE_SUCCESS = 10315; // 修改联系人成功

	public static final int USER_MODIFY_TELE_FAILURE = 10316; // 修改联系人失败

	public static final int USER_DELETE_TELEGROUPTELE_SUCCESS = 10317; // 删除号码组号码成功

	public static final int USER_DELETE_TELEGROUPTELE_FAILURE = 10318; // 删除号码组号码失败

	public static final int USER_CALL_NUMBER_FAILURE = 10319; // 保存用户号码组失败

	public static final int USER_EXISTS_SAMECALLNUM_IN_TELEGROUP = 10320; // 号码组中存在重复的号码

	public static final int USER_EXISTS_SAMECALLNUM_IN_TELE = 10321; // 单个联系人中存在重复的号码

	public static final int USER_MODIFY_TELE_GROUP_SUCCESS = 10322; // 修改号码组信息成功

	public static final int USER_MODIFY_TELE_GROUP_FAILURE = 10323; // 修改号码组信息失败

	public static final int USER_WEB_SUES_SUBMIT_SUCCESS = 10400; // 网上投诉提交成功

	public static final int USER_WEB_SUES_SUBMIT_FAILURE = 10401; // 网上投诉提交失败

	public static final int USER_WEB_SUES_SP_SUBMIT_SUCCESS = 10402; // 网上投诉sp处理完成提交审核成功

	public static final int USER_WEB_SUES_SP_SUBMIT_FAILURE = 10403; // 网上投诉sp处理完成提交审核失败

	public static final int USER_WEB_SUES_DISTRIBUTE_SUCCESS = 10404; // 网上投诉admin分发成功

	public static final int USER_WEB_SUES_DISTRIBUTE_FAILURE = 10405; // 网上投诉admin分发失败

	public static final int USER_WEB_SUES_APPROVE_SUCCESS = 10406; // 网上投诉admin审核成功

	public static final int USER_WEB_SUES_APPROVE_FAILURE = 10407; // 网上投诉admin审核失败

	public static final int USER_ORDER_RING_OVER_MAXRINGAMOUNT = 10500; // 定购铃音时已超过铃音库最大限制

	public static final int USER_DELETE_RIINGSTOREAGE_RING_SUCCESS = 10520; // 从铃音库中删除铃音成功

	public static final int USER_DELETE_RIINGSTOREAGE_RING_FAILURE = 10521; // 从铃音库中删除铃音失败

	public static final int USER_ORDER_RING_EXISTSRINGINRINGSTORAGE = 10522; // 铃音库中已有此铃音

	public static final int USER_ORDER_RING_INVALID_RINGCODE = 10523; // 下载铃音时无效的铃音标号

	public static final int USER_ORDER_RING_OFFERNUM_NOTEXISTS = 10524; // 赠送用户号码不是彩铃用户

	public static final int SP_UPLOADRING_FAILURE = 10525; // sp上传铃音失败

	public static final int SP_UPLOADRING_SUCCESS = 10526; // sp上传铃音成功

	public static final int SP_DELETERING_SUCCESS = 10527; // 删除铃音成功

	public static final int SP_DELETERING_FAILURE = 10528; // 删除铃音失败

	public static final int USER_ORDER_RING_SUCCESS = 10529; // 铃音定购成功，铃音有效期至{0}

	public static final int USER_ORDER_RING_FAILURE = 10530; // 铃音定购失败

	public static final int USER_DELETE_RING_EXISTS_RINGSETTING = 10531; // 删除铃音时存在铃音设置

	public static final int USER_ORDER_PRESENT_SUCCESS = 10532; // 定购大礼包成功，大礼包有效期至{0}

	public static final int USER_ORDER_PRESENT_FAILURE = 10533; // 定购大礼包失败

	public static final int USER_ORDER_PERSONALPRESENT_SUCCESS = 10534; // 定购个性礼包成功，个性礼包有效期至{0}

	public static final int USER_ORDER_PERSONALPRESENT_FAILURE = 10535; // 定购个性礼包失败

	public static final int USER_COPYRING_SUCCESS = 10536; // 复制用户铃音成功

	public static final int USER_COPYRING_FAILURE = 10537; // 复制用户铃音失败

	public static final int USER_RING_OFFER_SUCCESS = 10538; // 铃音赠送成功，铃音有效期至{0}

	public static final int USER_RING_OFFER_FAILURE = 10539; // 铃音赠送失败

	public static final int SP_BATCH_DELETERINIG_SUCCESS = 10540; // 批量删除铃音成功

	public static final int SP_BATCH_DELETERINIG_FAILURE = 10541; // 批量删除铃音失败

	public static final int SP_MODIFY_RING_HIDEFLAG_SUCCESS = 10542; // 铃音的隐藏标志设置成功

	public static final int SP_MODIFY_RING_HIDEFLAG_FAILURE = 10543; // 铃音的隐藏标志设置失败

	public static final int USER_ORDER_RING_NO_CLUSER = 10544; // 铃音定购时非彩铃用户

	public static final int USER_ORDER_PERSONALPRESENT_RINGSTORE_OVERFLOW = 10545; // 定购个性礼包时铃音库剩余铃音数不足

	public static final int USER_COPYRING_NO_VALIDRING = 10546; // 复制铃音时没有可复制的铃音（在铃音库中已存在）

	public static final int USER_COPYRING_CANNOT_COPYSELF = 10547; // 用户不能复制自己的铃音

	public static final int USER_COPYRING_RINGSTORE_OVERFLOW = 10548; // 用户复制铃音时铃音库剩余铃音数不足

	public static final int SP_DELETERING_FAILURE_RINGWAITAPPROVE = 10549; // SP删除铃音时铃音处于待审批状态

	public static final int SP_BATCH_DELETERINIG_FAILURE_INUSEING = 10550; // sp批量删除铃音时有铃音正在使用

	public static final int USER_ORDER_PERSONALPRESENT_NORIGHT_RINGCOUNT = 10551; // 定购个性礼包失败，铃音数不正确

	public static final int USER_DOWNANDSETTING_SUCCESS = 10552; // 用户下载、设置铃音成功

	public static final int USER_DOWNANDSETTING_SET_FAILURE = 10553; // 用户下载成功但设置铃音失败

	public static final int USER_DOWNANDSETTING_DOWN_FAILURE = 10554; // 用户下载失败

	public static final int USER_ORDER_RINGBOX_SUCCESS = 10555; // 定购音乐盒成功

	public static final int USER_ORDER_RINGBOX_FAILURE = 10556; // 定购音乐盒失败

	public static final int USER_ORDER_SERVICERING_SUCCESS = 10557; // 用户订购业务铃音成功

	public static final int USER_ORDER_SERVICERING_FAILURE = 10558; // 用户订购业务铃音失败

	public static final int USER_DOWN_AND_SETTING_SERVICERING_SUCCESS = 10559; // 用户下载并设置业务铃音成功

	public static final int USER_DOWN_AND_SETTING_SERVICERING_FAILURE = 10560; // 用户下载并设置业务铃音失败

	public static final int USER_MODIFY_USERPROPERTIES_SUCCESS = 10600; // 修改用户属性成功

	public static final int USER_MODIFY_USERPROPERTIES_FAILURE = 10601; // 修改用户属性失败

	public static final int USER_READ_INFORMATION_FAILURE = 10602; // 读取信息失败

	public static final int USER_MODIFY_COPYFLAG_SUCCESS = 10603; // 修改用户的铃音复制设置方式成功

	public static final int USER_MODIFY_COPYFLAG_FAILURE = 10604; // 修改用户的铃音复制设置方式失败

	public static final int USER_ORDER_SERVICE_SUCCESS = 10700; // 用户定购业务成功

	public static final int USER_ORDER_SERVICE_FAILURE = 10701; // 用户定购业务失败

	public static final int USER_DISORDER_SERVICE_SUCCESS = 10702; // 用户退定业务成功

	public static final int USER_DISORDER_SERVICE_FAILURE = 10703; // 用户退定业务失败

	public static final int USER_ORDER_SERVICE_ALREADY_ORDER = 10704; // 用户定购业务时提示已定购此业务

	public static final int USER_DISORDER_SERVICE_NO_ORDERSERVICE = 10705; // 用户退定业务时尚未定购此业务

	public static final int USER_ORDER_SERVICE_SERVICE_NOTEXISTS = 10706; // 业务不存在

	public static final int USER_NO_ORDERSERVICE = 10707; // 用户没有订购彩铃之家业务

	public static final int USER_COMMON_NOT_CLUSER = 11000; // 非彩铃用户

	public static final int USER_COMMON_RINGCODE_NOTEXISTS = 11001; // 铃音编码不存在

	public static final int USER_ORDER_RING_EXCEEDS_USERFUALLIFE = 11002; // 超过铃音的使用有效期

	public static final int SP_RING_RECOMMEND_SUBMIT_SUCCESS = 21000; // sp铃音推荐提交成功

	public static final int SP_RING_RECOMMEND_SUBMIT_FAILURE = 21001; // sp铃音推荐提交失败

	public static final int SP_MODIFYRING_SUCCESS = 21002; // sp修改铃音成功

	public static final int SP_MODIFYRING_FAILURE = 21003; // sp修改铃音失败

	public static final int SP_RING_RECOMMEND_APPROVE_SUCCESS = 21004; // sp铃音推荐审核成功

	public static final int SP_RING_RECOMMEND_APPROVE_FAILURE = 21005; // sp铃音推荐审核失败

	public static final int SP_RING_RECOMMEND_DELETE_SUCCESS = 21006; // sp铃音推荐删除成功

	public static final int SP_RING_RECOMMEND_DELETE_FAILURE = 21007; // sp铃音推荐删除失败

	public static final int SP_RING_RECOMMEND_MODIFYORDER_SUCCESS = 21008; // sp铃音推荐修改顺序成功

	public static final int SP_RING_RECOMMEND_MODIFYORDER_FAILURE = 21009; // sp铃音推荐修改顺序失败

	public static final int SP_BATCHUPLOAD_SUCCESS = 21010; // sp批量上传铃音成功

	public static final int SP_BATCHUPLOAD_FAILURE_NOWEBFILEURL = 21011; // sp批量上传铃音失败（无web视听文件）

	public static final int SP_BATCHUPLOAD_FAILURE_NOAIPFILEURL = 21012; // sp批量上传铃音失败（aip文件）

	public static final int SP_BATCHUPLOAD_FAILURE_SINGER_ERROR = 21013; // sp批量上传铃音失败（歌手简拼有误）

	public static final int SP_BATCHUPLOAD_FAILURE_RINGLIFE_ERROR = 21014; // sp批量上传铃音失败（铃音有效期格式有误）

	public static final int SP_BATCHUPLOAD_FAILURE_RINGNAME_ERROR = 21015; // sp批量上传铃音失败（歌曲名称有误）

	public static final int SP_BATCHUPLOAD_FAILURE_RINGLETTER_ERROR = 21016; // sp批量上传铃音失败（无歌曲简拼）

	public static final int SP_BATCHUPLOAD_FAILURE_FIRSTTYPE_ERROR = 21017; // sp批量上传铃音失败（一级分类有误）

	public static final int SP_BATCHUPLOAD_FAILURE_SECONDTYPE_ERROR = 21018; // sp批量上传铃音失败（二级分类有误）

	public static final int SP_BATCHUPLOAD_FAILURE_INF_FILE_ERROR = 21019; // sp批量上传铃音失败，inf文件第{0}行第{1}列有错误！

	public static final int SP_BATCHUPLOAD_FAILURE_NORINGPRICE = 21020; // sp批量上传铃音失败（无铃音价格）

	public static final int SP_BATCHUPLOAD_FAILURE_INF_FILE_FORMAT_ERROR = 21021; // sp批量上传铃音失败，inf文件格式不正确！

	public static final int SP_UPLOAD_RINGGROUP_SUCCESS = 21022; // sp上传铃音套餐成功

	public static final int SP_UPLOAD_RINGGROUP_FAILURE = 21023; // sp上传铃音套餐失败

	public static final int SP_DELETE_RING_FROM_RINGGROUP_SUCCESS = 21024; // sp将铃音从铃音套餐中删除成功

	public static final int SP_DELETE_RING_FROM_RINGGROUP_FAILURE = 21025; // sp将铃音从铃音套餐中删除失败

	public static final int SP_ADD_RING_TO_RINGGROUP_SUCCESS = 21026; // sp将铃音增加到铃音套餐中成功

	public static final int SP_ADD_RING_TO_RINGGROUP_FAILURE = 21027; // sp将铃音增加到铃音套餐中失败

	public static final int SP_UPLOAD_RING_EXCEEDS_MAXAMOUNT = 21028; // sp上传铃音时超过最大铃音数

	public static final int SP_MODIFYRING_EXISTS_RINGMODIFYSHEET = 21029; // SP修改铃音时已经存在铃音修改申请单

	public static final int SP_UPLOAD_RING_AIPFILE_EXCEED_SIZE = 21030; // ＡＩＰ文件过大，上传失败

	public static final int SP_UPLOAD_RING_WEBFILE_EXCEED_SIZE = 21031; // ＷＥＢ文件过大，上传失败！

	public static final int SP_UPLOAD_RING_ZIPFILE_EXCEED_SIZE = 21032; // ZIP文件过大，上传失败！

	public static final int SP_UPLOAD_RING_INFFILE_EXCEED_SIZE = 21033; // ＩＮＦ文件过大，上传失败

	public static final int SP_BATCHUPLOAD_EXCEED_TIMESEGMENT = 21034; // 超过SP批量上传时间段

	public static final int SP_COMPAIGN_SUBMIT_SUCCESS = 21100; // 活动提交成功

	public static final int SP_COMPAIGN_SUBMIT_FAILURE = 21101; // 活动提交失败

	public static final int SP_COMPAIGN_APPROVE_SUCCESS = 21102; // 活动审核成功

	public static final int SP_COMPAIGN_APPROVE_FAILURE = 21103; // 活动审核失败

	public static final int SP_COMPAIGN_DELETE_SUCCESS = 21104; // 删除活动成功

	public static final int SP_COMPAIGN_DELETE_FAILURE = 21105; // 删除活动失败

	public static final int SP_COMPAIGN_ADDRING_SUCCESS = 21106; // 增加活动铃音成功

	public static final int SP_COMPAIGN_ADDRING_FAILURE = 21107; // 增加活动铃音失败

	public static final int ADMIN_DISCOUNT_ACTIVITY_SAVE_SUCCESS = 21200; // 优惠活动保存成功

	public static final int ADMIN_DISCOUNT_ACTIVITY_SAVE_FAILURE = 21201; // 优惠活动保存失败

	public static final int ADMIN_DISCOUNT_ACTIVITY_CONFIRM_SUCCESS = 21202; // 优惠活动审核成功

	public static final int ADMIN_DISCOUNT_ACTIVITY_CONFIRM_FAILURE = 21203; // 优惠活动审核失败

	public static final int ADMIN_DISCOUNT_ACTIVITY_MODIFY_SUCCESS = 21204; // 优惠活动修改成功

	public static final int ADMIN_DISCOUNT_ACTIVITY_MODIFY_FAILURE = 21205; // 优惠活动修改失败

	public static final int ADMIN_DISCOUNT_ACTIVITY_DELETE_SUCCESS = 21206; // 优惠活动删除成功

	public static final int ADMIN_DISCOUNT_ACTIVITY_DELETE_FAILURE = 21207; // 优惠活动删除失败

	public static final int ADMIN_RINGAPPROVE_SUCCESS = 30000; // admin铃音审核成功

	public static final int ADMIN_RINGAPPROVE_FAILURE = 30001; // admin铃音审核失败

	public static final int ADMIN_SYSCONFIG_SUCCESS = 31000; // 系统配置保存成功

	public static final int ADMIN_SYSCONFIG_FAILURE = 31001; // 系统配置保存失败

	public static final int ADMIN_SYSCONFIG_EXISTS_CONFIGNAME = 31002; // 系统配置失败,已存在配置名称

	public static final int ADMIN_SYSCONFIG_DELETE_SUCCESS = 31003; // 系统配置删除成功

	public static final int ADMIN_SYSCONFIG_DELETE_FAILURE = 31004; // 系统配置删除失败

	public static final int ADMIN_SYSCONFIG_BATCH_SAVE_SUCCESS = 31005; // admin系统配置表sysconfig批量保存成功

	public static final int ADMIN_SYSCONFIG_BATCH_SAVE_FAILURE = 31006; // admin系统配置表sysconfig批量保存失败

	public static final int ADMIN_SYSUSERINFO_SUCCESS = 31020; // 系统用户保存成功

	public static final int ADMIN_SYSUSERINFO_FAILURE = 31021; // 系统用户保存失败

	public static final int ADMIN_SYSUSERINFO_EXISTS_LOGINNAME = 31022; // 已存在此登陆名

	public static final int ADMIN_SYSUSERINFO_DELETE_SUCCESS = 31023; // 系统用户删除成功

	public static final int ADMIN_SYSUSERINFO_DELETE_FAILURE = 31024; // 系统用户删除失败

	public static final int ADMIN_SYSUSERINFO_DELETE_NO_RECORD = 31025; // 系统用户删除时无相关记录

	public static final int ADMIN_OFFER_SAVE_SUCCESS = 31030; // 赠送保存成功

	public static final int ADMIN_OFFER_SAVE_FAILURE = 31031; // 赠送保存失败

	public static final int ADMIN_OFFER_DELETE_SUCCESS = 31032; // 赠送删除成功

	public static final int ADMIN_OFFER_DELETE_FAILURE = 31033; // 赠送删除失败

	public static final int ADMIN_MANUALOFFER_CONFIRM_SUCCESS = 31034; // 人工赠送确认成功

	public static final int ADMIN_MANUALOFFER_CONFIRM_FAILURE = 31035; // 人工赠送确认失败

	public static final int ADMIN_AUTOOFFER_CONFIRM_SUCCESS = 31036; // 自动赠送确认成功

	public static final int ADMIN_AUTOOFFER_CONFIRM_FAILURE = 31037; // 自动赠送确认失败

	public static final int ADMIN_APPROVE_RINGGROUP_SUCCESS = 31038; // admin审核铃音套餐成功

	public static final int ADMIN_APPROVE_RINGGROUP_FAILURE = 31039; // admin审核铃音套餐失败

	public static final int ADMIN_SUBMIT_RINGGROUP_SUCCESS = 31040; // sp提交铃音套餐成功

	public static final int ADMIN_SUBMIT_RINGGROUP_FAILURE = 31041; // sp提交铃音套餐失败

	public static final int ADMIN_OFFER_EXCEED_FILESIZE = 31043; // 导入文件过大，上传失败！

	public static final int ADMIN_SERVICE_SAVE_SUCCESS = 31050; // 保存业务信息成功

	public static final int ADMIN_SERVICE_SAVE_FAILURE = 31051; // 保存业务信息失败

	public static final int ADMIN_SERVICEGROUP_SAVE_SUCCESS = 31052; // 保存业务套餐成功

	public static final int ADMIN_SERVICEGROUP_SAVE_FAILURE = 31053; // 保存业务套餐失败

	public static final int ADMIN_SERVICEGROUP_DELETE_SUCCESS = 31054; // 删除业务套餐成功

	public static final int ADMIN_SERVICEGROUP_DELETE_FAILURE = 31055; // 删除业务套餐失败

	public static final int ADMIN_DETACH_SERVICE_FROM_SERVICEGROUP_SUCCESS = 31056; // 将业务从业务套餐中剥离成功

	public static final int ADMIN_DETACH_SERVICE_FROM_SERVICEGROUP_FAILURE = 31057; // 将业务从业务套餐中剥离失败

	public static final int ADMIN_SERVICE_DELETE_SUCCESS = 31058; // 删除业务成功

	public static final int ADMIN_SERVICE_DELETE_FAILURE = 31059; // 删除业务失败

	public static final int ADMIN_ADD_SERVICE_TO_SERVICEGROUP_SUCCESS = 31060; // 将业务添加到业务套餐中成功

	public static final int ADMIN_ADD_SERVICE_TO_SERVICEGROUP_FAILURE = 31061; // 将业务添加到业务套餐中失败

	public static final int ADMIN_SAVE_USER_GRADE_SUCCESS = 31070; // admin保存用户级别信息成功

	public static final int ADMIN_SAVE_USER_GRADE_FAILURE = 31071; // admin保存用户级别信息失败

	public static final int ADMIN_DELETE_USER_GRADE_SUCCESS = 31072; // admin删除用户级别信息成功

	public static final int ADMIN_DELETE_USER_GRADE_FAILURE = 31073; // admin删除用户级别信息失败,有用户是该级别{0}

	public static final int ADMIN_UPDATE_USER_GRADE_FAILURE = 31074; // admin更新用户级别信息失败

	public static final int ADMIN_UPDATE_USER_GRADE_SUCCESS = 31075; // admin更新用户级别信息成功

	public static final int ADMIN_SAVE_SP_INFO_SUCCESS = 31080; // admin保存SP信息成功

	public static final int ADMIN_SAVE_SP_INFO_FAILURE = 31081; // admin保存SP信息失败

	public static final int ADMIN_DELETE_SP_INFO_SUCCESS = 31082; // admin删除SP信息成功

	public static final int ADMIN_DELETE_SP_INFO_FAILURE = 31083; // admin删除SP信息失败

	public static final int ADMIN_SAVE_RING_CONTEND_TYPE_SUCCESS = 31090; // admin保存铃音内容分类信息成功

	public static final int ADMIN_SAVE_RING_CONTEND_TYPE_FAILURE = 31091; // admin保存铃音内容分类信息失败

	public static final int ADMIN_SAVE_RING_CONTEND_TYPE_EXIST_TYPENAME = 31092; // admin保存铃音内容分类信息失败,有重名的类型名称

	public static final int ADMIN_SAVE_RING_CONTEND_TYPE_OVERNUM = 31093; // admin保存铃音内容分类信息失败,超过分类允许的个数

	public static final int ADMIN_DELETE_RING_CONTEND_TYPE_SUCCESS = 31094; // admin删除铃音内容分类信息成功

	public static final int ADMIN_DELETE_RING_CONTEND_TYPE_EXIST_RING = 31095; // admin删除铃音内容分类信息失败,有铃音属于该分类{0}

	public static final int ADMIN_SAVE_PROMOTION_PRICE_POLICY_SUCCESS = 31100; // admin保存资费套餐信息成功

	public static final int ADMIN_SAVE_PROMOTION_PRICE_POLICY_FAILURE = 31101; // admin保存资费套餐信息失败

	public static final int ADMIN_DELETE_PROMOTION_PRICE_POLICY_SUCCESS = 31102; // admin删除资费套餐信息成功

	public static final int ADMIN_DELETE_PROMOTION_PRICE_POLICY_FAILURE = 31103; // admin删除资费套餐信息失败

	public static final int ADMIN_RINGREJECT_SUCCESS = 31104; // admin驳回铃音成功

	public static final int ADMIN_RINGREJECT_FAILURE = 31105; // admin驳回铃音失败

	public static final int ADMIN_BATCH_DELETERINIG_FAILURE_INUSEING = 31107; // 删除铃音失败（有铃音正在使用中）

	public static final int ADMIN_SAVE_BLACKLIST_SUCCESS = 31200; // admin增加黑名单成功

	public static final int ADMIN_SAVE_BLACKLIST_FAILURE = 31201; // admin增加黑名单失败

	public static final int ADMIN_DELETE_BLACKLIST_SUCCESS = 31202; // admin删除黑名单成功

	public static final int ADMIN_DELETE_BLACKLIST_FAILURE = 31203; // admin删除黑名单失败

	public static final int ADMIN_BATCH_SAVE_BLACKLIST_SUCCESS = 31204; // admin批量增加黑名单成功

	public static final int ADMIN_BATCH_SAVE_BLACKLIST_FAILURE = 31205; // admin批量增加黑名单失败

	public static final int BLACKLIST_UPLOAD_FILE_EXCEED_SIZE = 31206; // 黑名单导入文件大小超过最大值

	public static final int ADMIN_SAVE_BUSINESS_ACTIVITY_SUCCESS = 31300; // admin增加业务活动成功

	public static final int ADMIN_SAVE_BUSINESS_ACTIVITY_FAILURE = 31301; // admin增加业务活动失败

	public static final int ADMIN_UPDATE_BUSINESS_ACTIVITY_SUCCESS = 31302; // admin更新业务活动成功

	public static final int ADMIN_UPDATE_BUSINESS_ACTIVITY_FAILURE = 31303; // admin更新业务活动失败

	public static final int ADMIN_DELETE_BUSINESS_ACTIVITY_SUCCESS = 31304; // admin删除业务活动成功

	public static final int ADMIN_DELETE_BUSINESS_ACTIVITY_FAILURE = 31305; // admin删除业务活动失败

	public static final int ADMIN_SAVE_BATCH_MSG_SUCCESS = 31400; // admin增加群发成功

	public static final int ADMIN_SAVE_BATCH_MSG_FAILURE = 31401; // admin增加群发失败

	public static final int ADMIN_UPDATE_BATCH_MSG_SUCCESS = 31402; // admin更新群发成功

	public static final int ADMIN_UPDATE_BATCH_MSG_FAILURE = 31403; // admin更新群发失败

	public static final int ADMIN_DELETE_BATCH_MSG_SUCCESS = 31404; // admin删除群发成功

	public static final int ADMIN_DELETE_BATCH_MSG_FAILURE = 31405; // admin删除群发失败

	public static final int IP_RESULT_SUCCESS = 40000; // 调用IP返回成功结果

	public static final int IP_HTTPSTATUS_FAILURE = 40001; // IP调用http后返回的httpStatus状态为其它
															// 即连接失败

	public static final int IP_RESULT_HTTPERROR = 40002; // 错误的http异常

	public static final int IP_RESULT_ERROR = 40003; // 错误异常

	public static final int IP_ADD_TELEGROUP_SUCCESS = 40100; // 增加号码组成功

	public static final int IP_ADD_TELEGROUP_FAILURE = 40101; // 增加号码组失败

	public static final int IP_ADD_TELEGROUPTELE_SUCCESS = 40102; // 增加号码组号码成功

	public static final int IP_ADD_TELEGROUPTELE_FAILURE = 40103; // 增加号码组号码失败

	public static final int IP_DELETE_TELEGROUP_SUCCESS = 40104; // 删除号码组成功

	public static final int IP_DELETE_TELEGROUP_FAILURE = 40105; // 删除号码组失败

	public static final int IP_DELETE_TELE_SUCCESS = 40106; // 删除主叫号码成功

	public static final int IP_DELETE_TELE_FAILURE = 40107; // 删除主叫号码失败

	public static final int IP_DELETE_TELEGROUPTELE_SUCCESS = 40108; // 删除号码组号码成功

	public static final int IP_DELETE_TELEGROUPTELE_FAILURE = 40109; // 删除号码组号码失败

	public static final int IP_DOWNRING_SUCCESS = 40200; // 下载成功

	public static final int IP_DOWNRING_FAILURE = 40201; // 下载失败

	public static final int IP_DELETERING_FROM_RINGSTOREAGE_SUCCESS = 40202; // 从铃音库中删除铃音成功

	public static final int IP_DELETERING_FROM_RINGSTOREAGE_FAILURE = 40203; // 从铃音库中删除铃音失败

	public static final int SYS_NOTE_SAVE_SUECCESS = 40301; // 系统公告设置成功

	public static final int SYS_NOTE_SAVE_FAILURE = 40302; // 系统公告设置失败

	public static final int SYS_NOTE_MODIFY_SUECCESS = 40303; // 系统公告修改成功

	public static final int SYS_NOTE_MODIFY_FAILURE = 40304; // 系统公告修改失败

	public static final int SYS_NOTE_DELETE_SUECCESS = 40305; // 系统公告删除成功

	public static final int SYS_NOTE_DELETE_FAILURE = 40306; // 系统公告删除失败

	public static final int STAT_WIRELESS_RING_TAXIS_SAVE_SUECCESS = 40401; // 保存无线音乐排行榜成功

	public static final int STAT_WIRELESS_RING_TAXIS_SAVE_FAILURE = 40402; // 保存无线音乐排行榜失败

	public static final int STAT_WIRELESS_RING_TAXIS_SAVE_NORINGNAME_FAILURE = 40403; // 保存无线音乐排行榜失败，没有铃音名称为{0}的记录

	public static final int CUSTOM_SAVE_SUCCESS = 50001; // 保存集团基本信息成功

	public static final int CUSTOM_SAVE_FAILURE = 50002; // 保存集团基本信息失败

	public static final int CUSTOM_TRANSFER_FROMGROUPTOGROUP_SUCCESS = 50003; // 将集团用户号码从一个号码组迁移到另外一个号码组成功

	public static final int CUSTOM_TRANSFER_FROMGROUPTOGROUP_FAILURE = 50004; // 将集团用户号码从一个号码组迁移到另外一个号码组失败

	public static final int CUSTOM_MODIFY_CALLNUMGROUP_SUCCESS = 50005; // 修改集团群组名称成功

	public static final int CUSTOM_MODIFY_CALLNUMGROUP_FAILURE = 50006; // 修改集团群组名称失败

	public static final int CUSTOM_MODIFY_CALLNUMGROUP_SAMENAME = 50007; // 有相同的集团群组名称

	public static final int CUSTOM_UPLOAD_RING_EXCEED_MAXRINGAMOUNT = 50008; // 集团用户上传铃音时超过最大铃音数

	public static final int CUSTOM_UPLOAD_RING_SUCCESS = 50009; // 集团用户上传铃音成功

	public static final int CUSTOM_BATCHDELETERING_EXISTS_RINGSETTING = 50010; // 集团用户批量删除铃音时铃音存在铃音设置

	public static final int DIY_RING_APPROVE_SUCCESS = 60001; // DIY铃音{0},审核成功!

	public static final int DIY_RING_APPROVE_FAILURE = 60002; // DIY铃音{0},审核失败!

	public static final int DIY_RING_PLUS_APPROVE_SUCCESS = 60003; // 剪辑或伴奏铃音审核成功

	public static final int DIY_RING_PLUS_APPROVE_FAILURE = 60004; // 剪辑或伴奏铃音审核失败

	public static final int DIY_RING_PLUS_UNAPPROVE_SUCCESS = 60005; // 剪辑或伴奏铃音驳回成功

	public static final int DIY_RING_PLUS_UNAPPROVE_FAILURE = 60006; // 剪辑或伴奏铃音驳回失败

	public static final int DIY_RING_UNAPPROVE_SUCCESS = 60007; // DIY铃音{0},驳回成功

	public static final int DIY_RING_UNAPPROVE_FAILURE = 60008; // DIY铃音{0},驳回失败

	public static final int DIY_RING_UPLOAD_SUCCESS = 61001; // DIY铃音上传成功

	public static final int DIY_RING_UPLOAD_FAILURE = 61002; // DIY铃音上传失败

	public static final int DIY_RING_PLUS_UPLOAD_SUCCESS = 61003; // 伴奏或剪辑铃音上传成功

	public static final int DIY_RING_PLUS_UPLOAD_FAILURE = 61004; // 伴奏或剪辑铃音上传失败

	public static final int DIY_USER_REG_SUCCESS = 61005; // 用户注册成功！

	public static final int DIY_USER_REG_ERROR_NBR_ISEXIST = 61006; // 用户注册失败,手机号码已存在！

	public static final int DIY_USER_REG_ERROR_NICK_ISEXIST = 61007; // 用户注册失败,昵称已存在！

	public static final int DIY_USER_REG_CHECK_CODE_SEND_SUCCESS = 61008; // 用户验证码已发送！

	public static final int DIY_USER_REG_INFO_NOTFULL_FAILURE = 61009; // 用户信息不完整！

	public static final int DIY_USER_REG_CHECK_CODE_VERIFY_FAILURE = 61010; // 用户验证码校验失败！

	public static final int DIY_USER_MODIFY_SUCCESS = 61011; // 用户修改信息成功！

	public static final int DIY_USER_MODIFY_FAILURE = 61012; // 用户修改信息失败{0}！

	public static final int DIY_RING_DELETE_SUCCESS = 61013; // DIY铃音{0},删除成功！

	public static final int DIY_RING_DELETE_FAILURE = 61014; // DIY铃音{0},删除失败！

	public static final int DIY_FANS_DELETE_SUCCESS = 61015; // Fans{0},删除成功！

	public static final int DIY_FANS_DELETE_FAILURE = 61016; // Fans{0},删除失败！

	public static final int DIY_RING_DELETE_FAILURE_NO_ACCESS = 61017; // DIY铃音{0},删除失败,操作无权限！

	public static final int DIY_FANS_DELETE_FAILURE_NO_ACCESS = 61018; // Fans{0},删除失败,操作无权限！

	public static final int DIY_BBS_SUBJECT_DELETE_FAILURE = 61019; // 主题{0},删除失败！

	public static final int DIY_BBS_SUBJECT_DELETE_SUCCESS = 61020; // 主题{0},删除成功！

	public static final int DIY_BBS_SUBJECT_DELETE_FAILURE_NO_ACCESS = 61021; // 主题{0},删除失败,操作无权限！

	public static final int DIY_BBS_SUBJECT_ADD_SUCCESS = 61022; // 主题发表成功！

	public static final int DIY_BBS_SUBJECT_ADD_FAILURE = 61023; // 主题发表失败,原因{0}！

	public static final int DIY_BBS_THREAD_ADD_SUCCESS = 61024; // 回贴成功！

	public static final int DIY_BBS_THREAD_ADD_FAILURE = 61025; // 回贴失败,原因{0}！

	public static final int DIY_FANS_RELATION_ADD_FAILURE_BY_SELF = 61026; // 自己不能成为自己的fans！

	public static final int DIY_FANS_RELATION_ADD_FAILURE_BY_EXIST = 61027; // 您已经是该用户的fans！

	public static final int DIY_FANS_RELATION_ADD_SUCCESS = 61028; // 您成为该用户的fans！

	public static final int DIY_RING_DOWNLOAD_SUCCESS = 61029; // DIY铃音{0},下载成功！

	public static final int DIY_RING_DOWNLOAD_FAILURE = 61030; // DIY铃音{0},下载失败！

	public static final int DIY_RING_FAVORITE_ADD_SUCCESS = 61031; // 用户收藏{0}成功！

	public static final int DIY_RING_FAVORITE_ADD_FAILURE = 61032; // 用户收藏{0}失败！

	public static final int DIY_RING_FAVORITE_DEL_SUCCESS = 61033; // 用户取消收藏{0}成功！

	public static final int DIY_RING_FAVORITE_DEL_FAILURE = 61034; // 用户取消收藏{0}失败！

	public static final int DIY_USER_GET_PASSWORD_SUCCESS = 61035; // DIY用户取回密码成功！

	public static final int DIY_USER_GET_PASSWORD_FAILURE = 61036; // DIY用户取回密码失败！

	public static final int DIY_RING_SECOND_APPROVE_SUCCESS = 61037; // 铃音{0},审核成功！

	public static final int DIY_RING_SECOND_APPROVE_FAILURE = 61038; // 铃音{0},审核失败！

	public static final int DIY_USER_REG_CHECK_CODE_SEND_FAILURE = 61039; // 用户验证码发送失败{0}！

	public static final int DIY_USER_SETTING_BGMUSIC_FAILURE = 61040; // 背景音乐文件过大，上传失败！

	public static final int DIY_USER_SETTING_BGMUSIC_SUCCESS = 61041; // 上传背景音乐成功！

	public static final int DIY_USER_FAVORITE_ADD_SUCCESS = 61042; // DIY用户收藏成功！

	public static final int DIY_USER_FAVORITE_ADD_FAILURE = 61043; // DIY用户收藏失败

	public static final int DIY_LOGIN_CHECK_MOBILE_ERROR = 61044; // 登录失败

	public static final int DIY_USER_FAVORITE_DEL_SUCCESS = 61045; // DIY用户取消收藏成功！

	public static final int DIY_USER_REG_CHECK_CODE_FAILURE = 61046; // 验证校验码失败！

	public static final int DIY_RING_RECOMMEND_SAVE_SUCCESS = 61047; // 保存铃音推荐成功！

	public static final int DIY_RING_RECOMMEND_SAVE_FAILURE = 61048; // 保存铃音推荐失败！

	public static final int DIY_USER_RECOMMEND_SAVE_SUCCESS = 61049; // 保存乐窝推荐成功！

	public static final int DIY_USER_RECOMMEND_SAVE_FAILURE = 61050; // 保存乐窝推荐失败！

	public static final int DIY_USER_RING_OPEN_SUCCESS = 61051; // 铃音业务开通成功！

	public static final int DIY_USER_RING_OPEN_FAILURE = 61052; // 铃音业务开通失败！

	public static final int DIY_USER_LOGIN_TIMEOUT = 61053; // DIY登陆,系统超时！

	public static final int LOGIN_MOBILE_ERROR = 61054; // DIY登陆,号码错误或号码不存在！

	public static final int LOGIN_MOBILE_PWSD_ERROR = 61055; // DIY登陆,密码验证失败！

	public static final int INTERFACE_WWW_RANDOMSESSIONKEY_NULL = 70001; // 网站randomsessionkey为空

	public static final int INTERFACE_WWW_SID_NULL = 70002; // 网站sid为空

	public static final int INTERFACE_WWW_SIDPWD_NULL = 70003; // 网站sidpwd为空

	public static final int INTERFACE_TONECODE_NULL = 70004; // tonecode为空

	public static final int INTERFACE_SMS_RANDOMSESSIONKEY_NULL = 70005; // 短信randomsessionkey为空

	public static final int INTERFACE_SMS_SID_NULL = 70006; // 短信sid为空

	public static final int INTERFACE_SMS_SIDPWD_NULL = 70007; // 短信sidpwd为空

	public static final int INTERFACE_SP_ERR = 70008; // SP的用户名和密码错误

	public static final int INTERFACE_NOT_LOGIN = 70009; // 用户未登录

	public static final int INTERFACE_NOT_SMS_USER = 70010; // 没查到此短信用户

	public static final int INTERFACE_SERVER_FAILED = 70011; // 与服务器交互失败

	public static final int INTERFACE_SINGER_NULL = 70012; // 歌手名称为空

	public static final int INTERFACE_WWW_GROUPNAME_NULL = 70013; // 网站groupname为空

	public static final int INTERFACE_SMS_GROUPNAME_NULL = 70014; // 短信groupname为空

	public static final int INTERFACE_WWW_GROUPID_NULL = 70015; // 网站groupid为空

	public static final int INTERFACE_SMS_GROUPID_NULL = 70016; // 短信groupid为空

	public static final int INTERFACE_WWW_MEMBERTYPE_NULL = 70017; // 网站membertype为空

	public static final int INTERFACE_SMS_MEMBERTYPE_NULL = 70018; // 短信membertype为空

	public static final int INTERFACE_WWW_MEMBERNUMBER_NULL = 70019; // 网站membernumber为空

	public static final int INTERFACE_SMS_MEMBERNUMBER_NULL = 70020; // 短信membernumber为空

	public static final int INTERFACE_WWW_MEMBERNAME_NULL = 70021; // 网站membername为空

	public static final int INTERFACE_SMS_MEMBERNAME_NULL = 70022; // 短信membername为空

	public static final int INTERFACE_WWW_GROUPMEMBERID_NULL = 70023; // 网站groupmemberid为空

	public static final int INTERFACE_SMS_GROUPMEMBERID_NULL = 70024; // 短信groupmemberid为空

	public static final int INTERFACE_WWW_CALLERTYPE_NULL = 70025; // 网站callertype为空

	public static final int INTERFACE_SMS_CALLERTYPE_NULL = 70026; // 短信callertype为空

	public static final int INTERFACE_WWW_CALLERNUMBER_NULL = 70027; // 网站callernumber为空

	public static final int INTERFACE_SMS_CALLERNUMBER_NULL = 70028; // 短信callernumber为空

	public static final int INTERFACE_WWW_CALLERNAME_NULL = 70029; // 网站callername为空

	public static final int INTERFACE_SMS_CALLERNAME_NULL = 70030; // 短信callername为空

	public static final int INTERFACE_WWW_CALLMEMBERID_NULL = 70031; // 网站callmemberid为空

	public static final int INTERFACE_SMS_CALLMEMBERID_NULL = 70032; // 短信callmemberid为空

	public static final int INTERFACE_WWW_SETTYPE_NULL = 70033; // 网站settype为空

	public static final int INTERFACE_SMS_SETTYPE_NULL = 70034; // 短信settype为空

	public static final int INTERFACE_WWW_PLAYMODE_NULL = 70035; // 网站playmode为空

	public static final int INTERFACE_SMS_PLAYMODE_NULL = 70036; // 短信playmode为空

	public static final int INTERFACE_WWW_TIMETYPE_NULL = 70037; // 网站timetype为空

	public static final int INTERFACE_SMS_TIMETYPE_NULL = 70038; // 短信timetype为空

	public static final int INTERFACE_WWW_STARTTIME_NULL = 70039; // 网站starttime为空

	public static final int INTERFACE_SMS_STARTTIME_NULL = 70040; // 短信starttime为空

	public static final int INTERFACE_WWW_ENDTIME_NULL = 70041; // 网站endtime为空

	public static final int INTERFACE_SMS_ENDTIME_NULL = 70042; // 短信endtime为空

	public static final int INTERFACE_WWW_SETID_NULL = 70043; // 网站setid为空

	public static final int INTERFACE_SMS_SETID_NULL = 70044; // 短信setid为空

	public static final int INTERFACE_WWW_SERVICECODE_NULL = 70045; // 网站servicecode为空

	public static final int INTERFACE_SMS_SERVICECODE_NULL = 70046; // 短信servicecode为空

	public static final int INTERFACE_WWW_FLAG_NULL = 70047; // 网站flag为空

	public static final int INTERFACE_SMS_FLAG_NULL = 70048; // 短信flag为空

	public static final int INTERFACE_WWW_OPERATOR_NULL = 70049; // 网站operator为空

	public static final int INTERFACE_SMS_OPERATOR_NULL = 70050; // 短信operator为空

	public static final int INTERFACE_TONENAME_NULL = 70051; // tonename为空

	public static final int SYS_DB_EXCEPTION = 90001; // 数据库异常

	public static final int CODE_ERROR = 90002; // 操作失败

	public static final int UNKNOWN_ERROR = 100001; // 未知错误。

	public static final int SYSTEM_BUSY = 100002; // 系统忙或者其它未定义的错误。

	public static final int OPERATION_OVERTIME = 100003; // 操作超时。

	public static final int NETWORK_EXCEPTION = 100004; // 网络异常。

	public static final int DATABASE_OPERATION_EXCEPTION = 100005; // 数据库操作异常。

	public static final int DATABASE_OPERATION_FAILED = 100006; // 数据库操作失败。

	public static final int HAS_NOT_SERVICE = 100007; // 当前没有相应的业务。

	public static final int DATABASE_INNER_OPERATION_FAILED = 100008; // 数据库内部执行过程失败。

	public static final int CONFIG_NO_EXIST = 100009; // 相关配置项不存在

	public static final int PARAM_CONFIG_NOT_EXIST = 200000; // 参数的校验配置不存在。

	public static final int REQUIRED_PARAM_IS_EMPTY = 200001; // 必选参数输入为空。

	public static final int PARAM_FORMAT_ERROR = 200002; // 参数格式错误。

	public static final int PARAM_LONG_OUT_RANGE = 200003; // 参数长度超出范围。

	public static final int ALL_PARAM_NULL = 200004; // 所有输入参数都为空。

	public static final int SET_TIME_FORMAT_ERROR = 200005; // 设置铃音时间格式错误。

	public static final int IN_SPILTH_PARAM = 200006; // 输入多余参数。

	public static final int ACCESS_ACCOUNT_OR_PWD_IS_WRONG = 200007; // 接入帐号的不存在或者密码错误。?

	public static final int ACCESS_CREDIT_RANK_IS_LOW = 200008; // 接入帐号的信任等级不够，不能访问。

	public static final int TIME_TYPE_ERROR = 200009; // 时间类型不正确

	public static final int START_TIME_LATER_THEN_END_TIME = 200010; // 开始时间大于结束时间。?

	public static final int PHONENUMBER_FORMAT_ERROR = 201001; // 电话号码格式错误。

	public static final int PWD_INVALID = 201002; // 输入的密码无效。

	public static final int PWD_NOT_EXIST = 201003; // 密码不存在。

	public static final int TONEBOXCODE_FORMAT_ERROR = 202001; // 铃音群组编码格式错误。

	public static final int TONECODE_FORMAT_ERROR = 202002; // 铃音编码格式错误。

	public static final int MEMBER_NUM_OVER_RANGE = 300001; // 成员已经达到上限。

	public static final int GET_MESSAGE_FIALED = 300002; // 获取信息失败。

	public static final int USER_NOT_EXIST = 301001; // 用户不存在。

	public static final int USER_ALREADY_EXIST = 301002; // 用户已经存在。

	public static final int PWD_ERROR = 301003; // 密码错误。

	public static final int SEND_USER_SMS_FAIL = 301004; // 向用户发送短信失败。

	public static final int CHECKOUT_VALIDATECODE_FAIL = 301005; // 校验验证码失败。

	public static final int USER_STATUS_IS_ALREADY_THIS = 301006; // 该用户已经是所要修改后的状态。

	public static final int CANNOT_GET_VALIDATECODE_FOR_ERROR_STATUS = 301008; // 用户状态错误，不能获取验证码。

	public static final int CANNOT_SUBSCRIBE_FOR_ERROR_STATUS = 301009; // 用户状态错误，不能执行开户。

	public static final int CANNOT_UNSUBSCRIBE_FOR_ERROR_STATUS = 301010; // 用户状态错误，不能执行销户。

	public static final int USER_OUTOF_MONEY = 301011; // 用户已经欠费。

	public static final int NOT_CREATE_PWD = 301012; // 未生成验证码。

	public static final int USER_STATUS_NOT_ALLOW_DOWNTONE = 301013; // 用户业务状态不允许下载。

	public static final int USER_STATUS_NOT_ALLOW_SETTONE = 301014; // 用户业务状态不允许设置。

	public static final int USER_STATUS_NOT_ALLOW_OPERATE = 301015; // 用户业务状态不允许进行此操作

	public static final int NO_ALLOW_COPY_BY_PHONE_SET = 301016; // 被复制方用户不允许被复制

	public static final int SYSTEM_NO_ALLOW_COPY = 301017; // 系统配置该项不可以被复制。

	public static final int BY_COPY_USER_NO_EXIST = 301018; // 被复制用户号码不存在。

	public static final int LOOPTONE_EXIST_NO_USE_TONE = 301019; // 铃音轮含有非法铃音（铃音不属于集团，铃音状态不正确）。

	public static final int LOOPTONE_NO_THIS_DEPART = 301020; // 铃音轮编号不属于该集团部门。

	public static final int QUOTA_EXISTS = 301021; // 已指定消费限额。

	public static final int QUOTAID_NOT_EXIST = 301022; // 该消费限额编号不存在。

	public static final int EXCEED_CONSUME_QUOTA = 301023; // 已超过消费限额。

	public static final int BRANDID_NOT_EXIST = 301024; // 该品牌不存在。

	public static final int LOCATION_EXIST = 301025; // 新的计费系统与原来相同，不需要更改?

	public static final int SUBCOSID_EXIST = 301026; // 新的服务品牌与原来相同，不需要更改?

	public static final int UNSUPPORTED_LANGUAGE = 301027; // 不支持该语种编码。?

	public static final int EXCEED_TIMES_LIMIT = 301028; // 用户取回密码超过次数限制?

	public static final int THE_TONG_IS_ALREADY_EXIST = 302001; // 该铃声已经存在。

	public static final int TRANSMISSION_TONE_FAIL = 302002; // 传送铃声文件失败。

	public static final int THE_TONE_NOT_EXIST = 302003; // 该铃声不存在。

	public static final int THE_TONE_IS_APPLYING_FOR_DEL = 302004; // 该铃声已经申请了删除请求。

	public static final int OPERATEOR_ISNOT_THE_TONE_OWNER = 302005; // 该CP申请操作的铃声不是该CP上传的铃声。

	public static final int THE_TONE_IS_APPLYING_FOR_MODIFY = 302006; // 该铃声已经申请了修改请求。

	public static final int NOTHING_IN_QUERY_RESULT = 302007; // 查询结果数为0。

	public static final int TONE_STATUS_IS_ALREADY_THIS = 302008; // 该铃声已经是所要修改后的状态。

	public static final int ERROR_AT_UPLOAD_CATALOG_PROMPT_TONE = 302009; // 上传目录提示音发生错误。

	public static final int CHARGE_FAIL = 302010; // 计费失败。

	public static final int REPART_ORDER_TONE = 302011; // 重复订购铃音。

	public static final int NO_TONE_IN_TEMP_CATALOG = 302012; // 在临时目录中没有发现上传的铃音文件或试听文件。

	public static final int UPLOAD_TONE_FORMAT_ERROR = 302013; // 上传的铃音文件格式错误。

	public static final int UPLOAD_AUDITION_TONE_FORMAT_ERROR = 302014; // 上传的试听文件格式错误。

	public static final int TONE_STATUS_IS_ALREADY_HIDE = 302015; // 该铃声已经是隐藏状态。

	public static final int TONE_STATUS_IS_ALREADY_SHOW = 302016; // 该铃声已经是显示状态。

	public static final int TONEBOX_NOT_EXIST = 302017; // 该音乐盒不存在。

	public static final int TONE_NOT_ORDERED = 302018; // 铃音还未被订购。

	public static final int TONE_OVERDUE = 302019; // 该铃音已经过期。

	public static final int REACH_TONEBOX_MAX_CONTENT_TONE_NUM = 302020; // 超过音乐盒可容纳最大铃音数。

	public static final int CATALOG_TYPE_NOT_EXIST = 302021; // 目录类别不存在。

	public static final int CATALONG_SYS_CODE_NOT_EXIST = 302022; // 目录系统内部唯一编号不存在。

	public static final int ADD_CATALONG_FAILED = 302023; // 创建目录失败。

	public static final int TONE_IS_NOT_BELONG_TO_SP = 302024; // 该SP不拥有该铃音。

	public static final int SP_IN_NOT_UPLOAD_STATUS = 302025; // SP为不可上传铃音状态。

	public static final int TONE_CANNOT_BE_HIDDEN = 302026; // 铃音当前状态不可以隐藏。

	public static final int TONE_CANNOT_BE_SHOWMN = 302027; // 铃音当前状态不可以显示。

	public static final int TONE_IN_CHECK_STATUS = 302028; // 铃音正处在待审批状态。

	public static final int TONE_VALIDDAY_NOT_NORMAL = 302029; // 铃音绝对有效期输入非法（小于当前时间或者小于铃音已经订购的相对有效期时间的时限）。

	public static final int SETTING_TIME_OVERLAP = 302030; // 用户彩铃设置时间重叠。

	public static final int CATEGORY_NO_EXIST = 302031; // 目录分类编号不存在（或不为正常状态）。

	public static final int CATAGORY_BELONG_NO_LEAF_SUBDIRECOTRY = 302032; // 目录为非叶子目录，不可以置入铃音。

	public static final int CATAGORY_BELONG_LEAF_SUBDIRECOTRY = 302033; // 父目录是叶子目录且有铃音（只有叶子目录下才能置入铃音）。

	public static final int TONEDIR_HAS_TONE = 302034; // 目录中还有铃音，不能删除目录。

	public static final int TONEDIR_HAS_TONEDIR = 302035; // 目录中还有目录，不能删除目录。

	public static final int BATCH_COPY_ALL_FAIL = 302037; // 批量复制铃音全部失败。

	public static final int BATCH_COPY_PARTLY_FAIL = 302038; // 批量复制铃音部分失败。

	public static final int CANNOT_CHANGE_CENSOR_RECORD_FOR_DELETE = 302039; // 不可修改待审批表记录，该记录处于删除待审批状态。

	public static final int LANGUAGE_NOT_EXIST = 302040; // 语种不存在。

	public static final int CORP_NOT_EXIST = 302041; // 集团不存在。

	public static final int AREA_NOT_EXIST = 302042; // 地区不存在。

	public static final int PROMPT_TONE_FILE_FORMAT_ERROR = 302043; // 上传的音乐盒或者铃音目录的提示音文件名称或者内容格式错误。

	public static final int TONE_BELONG_A_TONEBOX = 302044; // 铃音存在于音乐盒，不可隐藏或删除。

	public static final int CATALOG_KIND_CAN_NOT_CHANGE = 302045; // 无法更改目录的资源属性，

	public static final int FATHER_CATALOG_IS_NOT_EXIST = 302046; // 父目录不存在。

	public static final int TONECATALOG_IS_ALREADY_EXIST = 302047; // 铃音目录已经存在。

	public static final int TONEBOX_IS_ALREADY_EXIST = 302048; // 音乐盒已经存在。

	public static final int REACH_SP_MAX_UPLOAD_NUM = 302049; // 达到SP铃音最大上传限制。

	public static final int DIY_USER_NOT_VALID = 302050; // 用户当前状态不能上传DIY铃音。

	public static final int REACH_CORP_MAX_UPLOAD_NUM = 302051; // 达到集团最大铃音限制。

	public static final int TONEBOX_IS_OVERDUE = 302052; // 音乐盒已过期。

	public static final int TONEBOX_IS_IN_CHECK_STATUS = 302053; // 音乐盒正处于待审批状态。

	public static final int TONEBOX_CANNOT_HIDE = 302054; // 音乐盒当前状态不可以隐藏。

	public static final int TONEBOX_CANNOT_RESUME = 302055; // 音乐盒当前状态不可以显示。

	public static final int TONECATALOG_NOT_EXIST = 302056; // 铃音目录不存在。

	public static final int TONECATALOG_IS_IN_CHECK_STATUS = 302057; // 铃音目录处于待审批状态。

	public static final int TONECATALOG_CANNOT_HIDE = 302058; // 铃音目录当前状态不可以隐藏。

	public static final int TONECATALOG_CANNOT_RESUME = 302059; // 铃音目录当前状态不可以显示。

	public static final int BATCH_APPROVE_PARTLY_FAILED = 302060; // 批量审批过程部分失败。

	public static final int BATCH_APPROVE_ALL_FAILED = 302061; // 批量审批全部失败。

	public static final int DIYTONE_DOWN_FAIL_AFTER_APPROVED = 302062; // 审批通过DIY铃音后，下载铃音失败。

	public static final int CORPTONE_CHARGE_FAIL_AFTER_APPROVED = 302063; // 审批通过集团铃音后，计费失败。

	public static final int UPLOAD_REARCH_TONEBOX_MAX = 302064; // 达到SP可上载的最大音乐盒数。

	public static final int VALID_NO_NORMAL = 302065; // 音乐盒有效期小于当前时间。

	public static final int TONEBOX_DELETE_STAY_APPROVE_STATUS = 302066; // 音乐盒处在删除待审批，不可修改。

	public static final int TONEBOX_NO_MODIFY = 302067; // 该音乐盒不可修改。

	public static final int TONE_AT_LOOPTONE_NO_EXIST = 302068; // 含有不存在于铃音轮中的铃音。

	public static final int DELETE_LOOPTONE_ALL = 302069; // 包含铃音轮中所有铃音，请直接删除铃音轮。

	public static final int TONEBOX_FILE_DIR_FAIL = 302070; // 获取音乐盒提示铃音文件工作目录失败。

	public static final int CALLER_AND_CALL_REPEAT = 302071; // 主被叫记录重复。

	public static final int CALLER_AND_CALL_NO_EXIST = 302072; // 主被叫记录不存在。

	public static final int USER_OR_TONE_NO_EXIST = 302073; // 用户或铃音资源不存在。

	public static final int TONE_NO_CUT = 302074; // ?有铃音不能剪辑。

	public static final int CONFIG_BACKGROUND_MUSIC_CODE_NO_EXIST = 302075; // 配置项中背景音编码不存在。

	public static final int BACKGROUND_MUSIC_NO_EXIST = 302076; // 背景音不存在。

	public static final int TYPE_OF_COLOR_RING_NO_MATCH_BACKGROUND_MUSIC = 302077; // 彩铃和背景音类型不匹配(合成时)

	public static final int MIX_COLOR_RING_FAILED_WITH__BACKGROUND_MUSIC = 302078; // 合成铃音失败。

	public static final int MAIN_CALLER_SETED = 302079; // 主叫号码已经被设置。

	public static final int TONE_RELATIVE_VALID_ABNORMAL = 302080; // 相对有效期无效（超出了铃音的绝对有效期）

	public static final int TYPE_IS_ERROR = 302081; // 试听铃音文件与配置的类型不相符。?

	public static final int USERTYPE_IS_SAME = 302083; // 新用户类型与旧用户类型相同。

	public static final int CHANNL_IS_NOT_UPDATE = 302084; // 音乐频道不能上传。

	public static final int NO_CONFIGURE_DEVICETYPE = 302086; // 系统支持的设备及类型未配置。

	public static final int FILE_FOLDER_IS_NOT_SET = 302087; // 保存试听铃音文件的文件夹未配置。

	public static final int USER_NOT_ORDER_TONE = 302088; // 用户未下载该铃音或音乐盒。

	public static final int NO_WEB_OR_IVR_DEVICETYPE = 302089; // Web或者IVR设备没有配置.

	public static final int NOT_IN_RELATIVE_VALIDITY_MODEL_NOT_TO_REORDER = 302090; // 铃音处于非相对有效期模式，不能续定。

	public static final int TONE_HAVE_NOT_REORDER_BY_OVER = 302091; // 铃音、音乐盒已经过期，不能续定。

	public static final int PACK_VALID_NO_NORMAL = 302093; // 套餐有效期小于当前时间。

	public static final int CP_NO_EXIST = 302094; // 该CP不存在。

	public static final int CP_NAME_DUPLICATE = 302095; // 已存在该CP同名套餐。

	public static final int PACK_NO_EXIST = 302096; // 套餐不存在。

	public static final int PACK_ABNORMAL = 302098; // 套餐处于不正常状态或隐藏状态。

	public static final int ADMIN_NO_EXIST = 302099; // 管理员不存在。

	public static final int TONE_DUPLICATE = 302100; // 已存在同CP、同歌曲名、同歌手名的铃音。

	public static final int COPY_FAIL = 302102; // 复制提示音失败。

	public static final int SYS_DEFAULT_TONE_ID = 302103; // 系统默认铃音记录编号不存在。

	public static final int STATUS_NOT_NORMAL = 302104; // 套餐当前状态不允许隐藏。

	public static final int STATUS_NOT_HIDDEN = 302105; // 套餐当前状态不可显示。

	public static final int CPCODE_CAN_NOT_EDIT = 302106; // 当铃音套餐类型为不区分SP的套餐时，不需要提供SP标识。

	public static final int CPCODE_NEEDED = 302107; // 当铃音套餐类型为区分SP的套餐时，需要提供SP标识。

	public static final int USER_DOWMLOAD_ALL_TONE = 302108; // 用户已下载了大礼包中的所有铃音。

	public static final int ACTIVE_COOKIE_FAIL = 302109; // 添加套餐成功、修改套餐成功或激活套餐失败，该套餐就处于新上传状态。

	public static final int TONEBOX_RELATIVE_VALID_ABNORMAL = 302110; // 相对有效期无效，相对有效期已超过其绝对有效期。

	public static final int SP_NOT_EXIST = 302111; // SP不存在或状态不正常。

	public static final int MONPACKOBJECT_NOT_IN_THE_NEWUPSET_STATE = 302113; // 套餐对象不处于新上传状态。

	public static final int EDIT_RECORD_UPDATED = 302114; // 待审批表中记录已被修改。

	public static final int SUBINFO_NOT_EXIST = 302115; // 资源附属信息不存在。

	public static final int SUBINFO_IS_EXIST = 302116; // 资源附属信息已经存在。

	public static final int SUBINFO_NOT_IN_CENSOR = 302117; // 资源附属信息未处于待审批状态。

	public static final int SUBINFO_IN_CENSOR = 302118; // 资源附属信息已处于待审批状态。

	public static final int TONE_STATUS_NOT_RIGHT = 302119; // 铃音状态不正确

	public static final int CATAGORY_RESOUCETYPE_CATAGORYTYPE_NOMATCH = 302120; // 资源类型与目录类型不一致

	public static final int FATHER_NO_NORMAL = 302121; // 父目录处于待审批状态，不允许添加子目录

	public static final int FATHER_NO_NORMAL_NOT_APPROVE = 302122; // 父目录处于待审批状态，无法审批子目录

	public static final int TONE_IN_PERSONALLIB = 302123; // 个人铃音库中已有该铃音

	public static final int TONE_TYPE_NOT_CONSISTENT = 302124; // 铃音类型不一致。（既有plus铃音，又有普通铃音）

	public static final int TONE_TYPE_NOT_ACCORD = 302125; // 铃音类型不符合。（设置类型和铃音轮中的铃音类型不相符，一个为plus，另一个为普通）

	public static final int TONE_IS_NOT_CP_UPLOAD = 302126; // 该铃音不为cp上传的普通铃音

	public static final int CATALOG_OWER_INVALIDATE = 302200; // 目录的所有者无效

	public static final int IMPACT_WHIH_EXIST_GROUP = 303001; // 主叫群组和现有记录冲突
																// （包括名称、序号等）

	public static final int GROUP_NOT_EXIST = 303002; // 在删除、修改、查询某主叫群组时，该主叫群组不存在。

	public static final int NUM_OF_GROUP_UP_LIMITED = 303003; // 主叫群组数超出最大值，不能添加。

	public static final int GROUP_CANNOT_DEL_FOR_MEMBER_EXIST = 303004; // 主叫群组中还有存在成员不能删除。

	public static final int MEMBER_OF_GROUP_IMPACT = 303011; // 在增加主叫群组成员时，该成员记录已存在该主叫群组中。

	public static final int MEMBER_NOT_IN_THE_GROUP = 303012; // 在删除、修改、查询某主叫群组中的某成员时，该主叫群组中某成员不存在。

	public static final int MEMBER_OUT_OF_LIMIT = 303013; // 该群组中群组成员已经达到最大上限。

	public static final int MEMBER_ALREADY_IN_THE_GROUP = 303014; // 需修改成的主叫号码已经是被叫号码的群组成员。

	public static final int CALLER_OUT_OF_LIMIT = 303015; // 已达到最大主叫数?

	public static final int TONE_IMPACT_WHIH_EXIST = 303021; // 在下载铃音到个人铃音库中时，个人铃音库中已经存在该铃音。

	public static final int DOWNLOAD_NUM_UP_LIMITED = 303023; // 下载铃声已经达到最大限制。

	public static final int SET_TONE_NUM_UP_LIMITED = 303024; // 设置铃声已经达到最大限制。

	public static final int THE_COOKIE_NOT_EXIST = 303025; // 订购的套餐不存在。

	public static final int REPART_ORDER_SPCOOKIE_IS_ALLOWED = 303026; // 用户已订购不区分SP的套餐，不允许再订购区分SP的套餐。

	public static final int LIMITLESS_ORDER_SPCOOKIE_NOT_ALLOWED = 303027; // 用户已订购区分SP的套餐，不允许再订购不区分SP的套餐。

	public static final int THE_COOKIE_IS_ALREADY_EXIST = 303028; // 已经订购的套餐已经订购过。

	public static final int USER_WITHOUT_SHARE_COOKIE = 303029; // 用户未订购该套餐。

	public static final int SAME_ORDER_SPCOOKIES_NOT_ALLOWED = 303030; // 不允许订购同一SP的多个套餐。

	public static final int TONE_GROUP_IMPACT_WITH_EXIST = 303031; // 铃声群组和现有记录冲突。

	public static final int THE_TONE_GROUP_NOT_EXIST = 303032; // 该铃声群组不存在。

	public static final int TONE_GROUP_OWNER_NOT_EXIST = 303033; // 该铃音群组所有者不存在。

	public static final int TONE_IS_ALREADY_IN_GROUP = 303041; // 在向某铃声群组中添加铃声时，该成员铃声和目标铃声群组中记录冲突。

	public static final int MEMBER_TONE_NOT_EXIST = 303042; // 在删除、修改、查询铃音是，该成员铃声不存在。

	public static final int TONE_BOX_NO_MODIFY = 303043; // 该铃音群组不允许修改内容（例如音乐盒）。

	public static final int TONE_SET_IMPACT_WITH_NOW = 303051; // 在设置铃音时，添加的铃声设置与现有的记录冲突。

	public static final int TONE_SET_NOT_EXIST = 303052; // 该铃声设置不存在。

	public static final int CORPDEPT_NOT_EXIST = 303053; // 集团、部门不存在。

	public static final int CORPDEPT_HAS_ILLEGAL_STATUS = 303054; // 集团、部门业务状态不正常。

	public static final int NO_MODIFY_TONEBOX = 303055; // 设置收费不允许修改已设置的铃声群组。

	public static final int TONE_NO_EXIST_AT_TONELIB = 303056; // 资源不在被复制方个人铃音库里。

	public static final int SYSTEM_CONFIG_LACK = 303057; // 缺少必要的系统相关配置信息。

	public static final int USER_NON_CORP_USER = 303058; // 用户非该铃音所属集团用户，不能下载该集团铃音

	public static final int STAT_VALUE_NOT_EXIST = 304001; // 没找到统计值。

	public static final int SYS_DEFULT_TONE_NOT_EXIST = 306001; // 系统默认铃音不存在。

	public static final int CODE_TO_ID_ERROR = 306002; // 铃音显示编码转化为内部编码时出错。

	public static final int ID_TO_CODE_ERROR = 306003; // 内部编码转化为铃音显示编码时出错。

	public static final int UP_PHONESECTION_NO_EXIST = 306004; // 输入类型不正确

	public static final int UP_PHONESECTION_IS_LEAF = 306005; // 上级号段为叶子号段，不能在下面添加子号段。

	public static final int PHONESECTION_IS_REFEAT = 306006; // 和同一号段分类下的其他具体号段存在重叠。

	public static final int PHONESECTION_NO_EXIST = 306007; // 号段不存在。

	public static final int PHONESECTION_EXIST_SUBSECTION = 306008; // 该号段下包含子号段。

	public static final int UPLOCALCODE_NO_EXIST = 306009; // 上级地区不存在。

	public static final int UPLOCALCODE_IS_LEAST_NODE = 306010; // 上级地区为叶子最小地区。

	public static final int LOCALCODE_IS_EXIST = 306011; // 地区编码已存在。

	public static final int LOCALCODE_NO_EXIST = 306012; // 地区编码不存在。

	public static final int ISLEASLOCAL_DNOT_MODIFY = 306013; // 不能把包含子地区的地区修改为最小地区。

	public static final int ISLEASLOCAL_DNOT_DELETE = 306014; // 不能删除包含子地区的地区

	public static final int THE_DEPARTMENT_ALREADY_EXIST = 307001; // 该部门已存在。

	public static final int THE_DEPARTMENT_NOT_EXIST = 307002; // 该部门编号不存在。

	public static final int CORP_MEMBER_ILLEGAL_SERVICE = 307003; // 该成员没有开通相应的业务。

	public static final int CORP_DEPT_GROUP_MEMBER_OVERFLOW = 307004; // 集团部门的群组成员超过最大数

	public static final int USER_NOT_BELONG_CORPDEPT = 307005; // 该成员不属于该集团部门成员。

	public static final int STATUS_DONOT_ADMITED_MODIFY = 307006; // 该集团彩铃的状态不允许修改。

	public static final int MEMBER_OPEN_ACCOUNT_PARTIAL_FIALED = 307007; // 开户部分成员失败。

	public static final int MEMBER_CLOSE_ACCOUNT_PARTIAL_FIALED = 307008; // 销户部分成员失败。

	public static final int CORP_GROUP_NO_EXIST = 307009; // 集团部门群组不存在。

	public static final int GOURP_MEMEBER_ALREADY_EXIST = 307010; // 该成员已是该集团部门群组成员。

	public static final int THE_UP_DEPARTMENT_NO_EXIST = 307011; // 该部门的上级部门不存在。

	public static final int MEMBER_ALREADY_BELONG_ANOTHER_DEPARTMENT = 307012; // 已经属于其它部门成员。

	public static final int VALID_TIME_ALREADY_EXIST = 307013; // 该时间段有重复。

	public static final int SPECIAL_HOLIDAY_ALREADY_EXIST = 307014; // 该节假日重复。

	public static final int CORP_ABNORMAL_STATUS = 307015; // 集团状态非正常?

	public static final int CORP_GROUP_ALREADY_SET = 307016; // 该群组已被设置。

	public static final int VALID_TIME_NOT_EXIST = 307017; // 时间段编号不存在

	public static final int SPECIAL_HOLIDAY_NOT_EXIST = 307018; // 特殊节假日不存在

	public static final int BATCH_ADD_DEPT_MEMBER_ALL_FAIL = 307019; // 增加部门成员全部失败

	public static final int BATCH_ADD_DEPT_MEMBER_PARTLY_FAIL = 307020; // 增加部门成员部分成功

	public static final int BATCH_DEL_DEPT_MEMBER_ALL_FAIL = 307021; // 删除部门成员全部失败

	public static final int BATCH_DEL_DEPT_MEMBER_PARTLY_FAIL = 307022; // 删除部门成员部分成功

	public static final int BATCH_ACTIVE_OR_PAUSE_MEMBER_STATUS_ALL_FAIL = 307023; // 激活/暂停
																					// 集团成员的集团彩铃全部失败

	public static final int BATCH_ACTIVE_OR_PAUSE_MEMBER_STATUS_PARTLY_FAIL = 307024; // 激活/暂停
																						// 集团成员的集团彩铃部分成功

	public static final int CORP_STATUS_DONOT_ADMITED_CHANGE = 307025; // 该集团的业务状态不允许修改

	public static final int THE_CORP_NOT_EXIST = 307181; // 该集团不存在。

	public static final int USER_NOT_BE_COLOERING_USER = 308001; // 被赠送用户还未开通彩铃。

	public static final int USER_PERSONAL_LIB_ISFULL = 308002; // 被赠送用户个人铃音库已满。

	public static final int USERB_NOT_ISLOCAL = 308003; // 彩铃月功能赠送的被赠送用户非本地用户。

	public static final int USERB_ALREADY_BE_PRESENTED = 308004; // 被赠送方本月已经被赠送过彩铃月功能。

	public static final int USERA_ALREADY_LIMITED = 308005; // 赠送方本月赠送彩铃月功能月份总数已经超过系统限制。

	public static final int USER_ALREADY_BE_COLOERING_USER = 308006; // 彩铃月功能赠送的被赠送用户已经是彩铃用户。

	public static final int USERB_IS_INVALID_USER = 308007; // 被赠送方不符合业务规定（受限用户、不能赠送给自己）。

	public static final int REPLY_IS_OVERTIME = 308008; // 该业务已经过期。

	public static final int BATCH_ORDER_PART_FAIL = 308009; // 批量下载部分失败。

	public static final int DEFAULTTONE_ALREADY_EXSIT = 308010; // 用户已有默认彩铃，本次设置不成功。

	public static final int TONEBOX_CAN_NOT_ADD_TONE = 308011; // 铃音不能插入到音乐盒中。

	public static final int TONE_EXISTED_TONEBOX = 308012; // 铃音轮中已经有该铃音。

	public static final int BATCH_ORDER_ALL_FAIL = 308013; // 批量下载全部失败。

	public static final int BATCH_PRESENT_ALL_FAIL = 308014; // 批量赠送全部失败。

	public static final int BATCH_SET_ALL_FAIL = 308015; // 批量设置全部失败。

	public static final int BATCH_PRESENT_PART_FAIL = 308016; // 批量赠送部分失败。

	public static final int BATCH_SET_PART_FAIL = 308017; // 批量设置部分失败。

	public static final int PRESENT_ID_NO_EXIST = 308019; // 赠送编号不存在(暂时没用，业务扩展用)

	public static final int GENERATE_PRESENT_KEY_FAIL = 308020; // 生成赠送密钥失败

	public static final int AUDITION_KEY_NO_EXIST = 308021; // 赠送密钥不存在

	public static final int SYS_MAX_REGISTER_RESTRICT = 309001; // 系统容量超限。

	public static final int PORTAL_NEEDED_PWD = 309002; // 需要验证码。

	public static final int PORTAL_NO_STRATEGY = 309003; // 没有找到开销户策略。

	public static final int PORTAL_OPEN_FAILED = 309004; // Portal开户失败。

	public static final int NO_ACCESS_TYPE = 309005; // 没有设置接入类型。

	public static final int DAY_MAX_REGISTER_RESTRICT = 309006; // 日开户数达到最大。

	public static final int OPEN_CLOSE_FIALED = 309007; // 开销户失败。

	public static final int PORTAL_DELETE_DEALING = 309008; // 开/销户正在处理。

	public static final int ORDINARY_CORP_USER_NO_EXIST = 309009; // 待开户的集团成员不是普通彩铃用户。

	public static final int CORP_MAX_REGISTER_RESTRICT = 309010; // 集团注册用户达到最大数。

	public static final int CORP_USER_NOT_EXIST = 309011; // 集团成员不存在（已销户）。

	public static final int CORP_USER_ALREADY_EXIST = 309012; // 集团成员已开户。

	public static final int PORTAL_STATUS_CANNOT_REGISTER = 309113; // 当前状态不能注册。

	public static final int PORTAL_STATUS_CANNOT_UNREGISTER = 309114; // 当前状态不能销户。

	public static final int NO_USER_TYPE = 309115; // 没有设置用户类型。

	public static final int NO_USER_TYPE_AND_ACCESS_TYPE = 309116; // 没有设置用户类型和接入类型。

	public static final int DAY_DELETE_USER_REARCH_MAX = 309117; // 日销户数达到最大。

	public static final int USER_AT_LIMIT_SECTION = 309118; // 用户所在的号段不允许用户开户。

	public static final int LOCAL_IS_LIMIT = 309119; // 用户所在地区不允许个人开销户。

	public static final int LOCAL_TIME_IS_LIMIT = 309120; // 该用户个人开销户操作时间在受限时间段内。

	public static final int USER_HAS_BELONG_ANOTHER_CORP = 309121; // 该用户已经属于其他集团。

	public static final int OPEN_SUCCEED_SM_FAIL = 309122; // 开户已成功处理，发送通知短消息失败，请通知用户通过WEB页面获取密码。

	public static final int USER_MAX_DAY_REGISTER_RESTRICT = 309123; // 单个用户日开户次数达到限制

	public static final int CORPUSER_LICENSEFILE_ISNOTFOUND = 309124; // 没有找到CorpLicense文件?

	public static final int CORPUSER_NUMBER_ISMAX = 309125; // 集团用户开户达到了CorpLicense的限制?

	public static final int USER_INSUFFICIENT_BALANCE = 310001; // 用户余额不足

	public static final int CHARGE_DEVICE_URL_INVALID = 311001; // 计费设备地址错误

	public static final int CHARGE_DEVICE_IOEXCEPTION = 311002; // 计费设备发生I/O异常

	public static final int CAN_NOT_DELETE_SP = 312002; // SP存在可用铃音，不可删除。

	public static final int LOCALID_NOT_EXIST = 312003; // 地区编号不存在。

	public static final int USER_WITHOUT_OP_RIGHT = 312004; // 用户帐号无对应操作权限。

	public static final int ROLE_ID_NOT_EXIST = 312005; // 角色编号不存在。

	public static final int PHONE_SCOPE_NOT_EXIST = 312006; // 含有不存在的号段。

	public static final int REAPT_OF_SP_INDEX = 312007; // SP索引号重复。

	public static final int ADMIN_NOT_EXIST = 312008; // 管理员不存在。

	public static final int OPERATOR_ALREADY_EXIST = 312009; // 系统内部鉴权帐号重复。

	public static final int OPERATOR_NOT_EXIST = 312010; // 系统内部鉴权帐号不存在。

	public static final int OLD_PASSWORD_WRONG = 312011; // 修改密码时，旧密码错误。

	public static final int CORP_OR_DEPT_ADMIN_ALREADY_EXIST = 312012; // 集团、部门管理员帐号重复。

	public static final int CORP_OR_DEPT_NOT_EXIST = 312013; // 集团、部门内部编号不存在。

	public static final int CORP_OR_DEPT_ADMIN_NOT_EXIST = 312014; // 集团、部门管理员内部编号不存在。

	public static final int XYZCODE_ALREADY_EXIST = 312015; // SP接入码重复。

	public static final int PHONESECTION_ILLEGAL = 312016; // 修改后的管理员号段不能包含所有该管理员管理的下一级管理员所管理的号段

	public static final int ADMIN_NO_POPEDOM = 312017; // 管理员无权限操作用户

	public static final int TASKMANAGEMENT_TASKS_NO_FOUND = 313001; // 没有任何任务项返回码。

	public static final int TASKMANAGEMENT_STOP_TASKS_INCOMPLETE = 313002; // 停止任务操作不完全成功（原因：存在未知的任务名）。

	public static final int TASKMANAGEMENT_RESUME_TASKS_INCOMPLETE = 313003; // 恢复任务操作不完全成功（原因：存在未知的任务名）。

	public static final int TASKMANAGEMENT_MOD_TASK_FAILED = 313004; // 修改任务运行时间操作不成功。

	public static final int CONFIGNAME_NO_FOUND = 314001; // 参数名称不存在。

	public static final int CONFIGVALUE_NO_FOLLOWRULE = 314002; // 新参数值不符合校验规则。

	public static final int CONFIGITEM_RENEWABLE_NO_FOUND = 314003; // 没有可更新的参数项。

	public static final int CONFIGTYPE_NO_FOUND = 314004; // 查询参数类型不存在。

	public static final int DB_RETURNCODE_UNKNOWN = 314005; // 未知的数据库返回码。

	public static final int THE_CONFIG_ALREADY_EXIST = 314006; // 配置项重复

	public static final int IN_PARAM_ERROR = 314007; // 输入参数有误或与配置策略项不匹配。

	public static final int UPDATE_CLUSTER_CONFIG_FAILED = 314008; // 更新其它集群内机器的配置项失败

	public static final int TAXIS_NO_FOUND = 315001; // 榜单不存在。

	public static final int TAIXS_INDEX_NO_INVALID = 315002; // 输入的榜单名次无效。

	public static final int TAXIS_CONTENT_NO_FOUND = 315003; // 榜单内容信息无效。

	public static final int TAXIS_SETTING_REPEAT = 315004; // 榜单设置重复。

	public static final int TAXIS_STAUTS_NO_DELETE = 315005; // 该榜单当前状态不能删除。

	public static final int TAXIS_GRADE_REPEAT = 315006; // 榜单名次重复。

	public static final int TAXIS_VALIDATE_LESS_CURRENTDATE = 315007; // 榜单生效时间小于当前时间。

	public static final int REQUEST_ALREADY_EXIISTS = 316001; // 事务请求重复

	public static final int INDEX_WITHOUT_TONE = 316002; // 该名次无对应的铃音

	public static final int MUSICID_NO_EXIST = 316003; // 音乐ID不存在

	public static final int ACTIVE_TONE_NO_EXIST = 316004; // 激活的铃音不存在或状态不正常

	public static final int THE_PLUS_IS_ALREADY_EXIST = 317001; // 用户已定购过PLUS业务

	public static final int THE_USER_IS_NOT_RBT = 317002; // 非正常彩铃用户，不能开通PLUS业务

	public static final int THE_PLUS_IS_NOT_BE_ORDERED = 317003; // 用户没有PLUS业务

	public static final int THE_PLUS_USER_IS_NOT_NORMAL = 317004; // 非正常彩铃用户，不能退订PLUS业务

	public static final int THE_SP_NOT_CUT = 317005; // 该SP没有被赋予上传可剪切铃音的权利

	public static final int IS_NOT_PLUS_TONE = 317006; // 该铃音不是PLUS铃音

	public static final int PLUS_DOWNLOAD_NUM_UP_LIMITED = 317007; // 用户铃音库已满，不能上传Plus铃音

	public static final int USER_STATUS_NOT_ALLOW_OPERATE_PLUS = 317008; // 用户当前状态不能上传Plus铃音

	public static final int PLUS_USER_STATUS_NOT_NORMAL = 317009; // PLUS用户不存在或状态不正确

	public static final int PLUSTONE_DOWN_FAIL_AFTER_APPROVED = 317010; // 审批通过Plus铃音后，下载铃音失败。

	public static final int CENSOR_FLOW_NOT_EXIST = 318001; // 操作对应的审批流程不存在

	public static final int CENSOR_STEP_INDEX_NOT_EXIST = 318002; // 操作对应的流程步骤不在流程步骤范围内

	public static final int CENSOR_OPERATOR_NOT_EXIST = 318003; // 审批流程指定的审批者不存在

	public static final int CENSOR_NOT_COMPLETED = 318004; // 流程存在未审批完毕记录，不能修改、删除

	public static final int CENSOR_ASKER_NOT_EXIST = 318005; // 操作对应的审批发起人不存在

	public static final int CENSOR_RELATION_ID_NOT_EXIST = 318006; // 操作的审批流程与发起人对应的关系ID不存在

	public static final int CENSOR_FLOW_REPEAT = 318007; // 审批流程重复定义（相同的审批流程：流程信息相同，流程审批步骤相同）

	public static final int CENSOR_STEP_REPEAT = 318008; // 审批步骤出现连续重复审批（连续同一审批人）的情况

	public static final int CENSOR_FLOW_RELATION_REPEAT = 318009; // 同一操作员相同操作对应多个流程（流程信息相同，流程步骤可能不同）

	public static final int CENSOR_FLOW_STRING_NOT_EXIST = 318010; // 审批步骤字符串中间存在不需要审批的步骤信息

	public static final int THIS_RULE_NOT_FOR_INFO_SERVICE = 319003; // 该规则规则不能用于信息类业务

	public static final int THIS_RULE_NOT_FOR_FUNC_SERVICE = 319004; // 该规则规则不能用于功能类业务

	public static final int SERVICE_ORDERED_NOT_DELETE = 319005; // 业务被订购不允许删除

	public static final int SERVICE_NOT_FULL = 319006; // 业务不完整，不能够定购

	public static final int STRATEGY_IN_SERVICE_NOT_DELETE = 319007; // 计费策略处于业务规则中，不允许删除

	public static final int SERVICE_FEE_RULE_EXIST = 319008; // 业务费用规则重复

	public static final int SERVICE_EXIST = 319009; // 业务重复。

	public static final int SERVICE_RULE_EXIST = 319010; // 业务规则重复。

	public static final int SERVICE_NOT_EXIST = 319011; // 业务不存在、或者业务已隐藏。

	public static final int SERVICE_RULE_NOT_EXIST = 319012; // 业务规则不存在。

	public static final int CHARGE_STRATEGY_NOT_EXIST = 319013; // 计费策略不存在。

	public static final int CHARGE_STRATEGY_DETAIL_NOT_EXIT = 319014; // 计费策略明细不存在。

	public static final int ORDER_SERVICE_NOT_EXIST = 319015; // 定购关系不存在。

	public static final int SERVICE_ONWER_NOT_EXIST = 319016; // 业务所属者不存在

	public static final int ORDER_SERVICE_EXIST = 319017; // 定购关系已存在，重复定购。

	public static final int ORDER_FUNC_SERVICE_EXIST = 319018; // 重复定购功能性业务

	public static final int RELATIVE_FLAG_NOT_IDENTICAL = 319019; // 相对时间标志不同

	public static final int CHARGE_STRATEGY_EXIST = 319020; // 计费策略重复

	public static final int ORDER_SERVICE_MEMBER_OUT_OF_LIMIT = 319021; // 用户达到了最大的业务定购数

	public static final int USER_PHONENUMBER_NOT_IN_PHONESECTION = 319022; // 用户不处于号段中，不能定购

	public static final int HAS_ORDERED_CALLING_TONE = 320001; // 用户已经定购该主叫业务

	public static final int NOT_ORDER_CALLING_TONE = 320002; // 用户未定购主叫业务

	public static final int PHONE_NUMBER_EXIT = 321001; // 电话号码设置重复（D70）

	public static final int USER_RBT_SET_NOT_EXIT = 321002; // 用记号码的回铃音设置不存在（D70）

	public static final int USER_SET_NUMBER_EXCEPT = 321003; // 普通回铃音设置个数超过默认值（D70）

	public static final int TO_BOSS_CHECK_EXCEPTION = 322001; // 到BOSS端鉴权发生异常

	public static final int TO_BOSS_CHECK_STATUS_INVALID = 322002; // 到BOSS端鉴权返回用户号码状态异常

	public static final int TO_BOSS_OPEN_EXCEPTION = 322003; // 到BOSS端开户发生异常

	public static final int TO_BOSS_OPEN_FAILED = 322004; // 到BOSS端开户返回失败

	public static final int TO_BOSS_DEL_EXCEPTION = 322005; // 到BOSS端销户发生异常

	public static final int TO_BOSS_DEL_FAILED = 322006; // 到BOSS端销户返回失败

	public static final int GROUP_AD_RING_UPLOAD_SUCCESS = 501000; // 铃音上传成功

	public static final int GROUP_AD_RING_UPLOAD_FAILED = 501001; // 铃音上传失败

	public static final int GROUP_AD_RING_APPLY_SUCCESS = 501002; // 铃音申请单提交成功

	public static final int GROUP_AD_RING_APPROVE_SUCCESS = 501003; // 铃音[{0}]审核成功

	public static final int GROUP_AD_RING_APPROVE_FAILED = 501004; // 铃音[{0}]审核失败

	public static final int GROUP_AD_RING_UNAPPROVE_SUCCESS = 501005; // 铃音[{0}]驳回成功

	public static final int GROUP_AD_RING_UNAPPROVE_FAILED = 501006; // 铃音[{0}]驳回失败

	public static final int GROUP_ADD_SUCCESS = 501007; // 集团{0}增加成功

	public static final int GROUP_ADD_FAILED = 501008; // 集团{0}增加失败

	public static final int DIY_VIDEO_UPLOAD_SUCCESS = 61060; // DIY音频文件上传成功

	public static final int DIY_VIDEO_UPLOAD_FAILED = 61061; // DIY音频文件上传失败

	public static final int DIY_VIDEO_THREAD_SUCCESS = 61062; // 回帖成功

	public static final int DIY_VIDEO_THREAD_FAILED = 61063; // 回帖失败

	public static final int DIY_VIDEO_THREAD_DELETE_SUCCESS = 61064; // 删除帖子成功

	public static final int DIY_VIDEO_THREAD_DELETE_FAILED = 61065; // 删除帖子失败

	public static final int DIY_VIDEO_AUTIT_SUCCESS = 61066; // 视频审核成功

	public static final int DIY_VIDEO_AUTIT_FAILED = 61067; // 视频审核失败

	public static final int DIY_VIDEO_AUTIT_BH_SUCCESS = 61068; // 视频驳回成功

	public static final int DIY_VIDEO_AUTIT_BH_FAILED = 61069; // 视频驳回失败

	public static final int DIY_VIDEO_SORT_SUCCESS = 61070; // 视频推荐成功

	public static final int DIY_VIDEO_SORT_FAILED = 61071; // 视频推荐失败

	public static final int DIY_RING_WORD_UPLOAD_SUCCESS = 61072; // 歌词上传成功

	public static final int DIY_RING_WORD_UPLOAD_FAILED = 61073; // 歌词上传失败

}
