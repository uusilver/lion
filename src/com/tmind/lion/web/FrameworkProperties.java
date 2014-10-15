package com.tmind.lion.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * <p>Title: Framework </p>
 * <p>Description: Framework</p>
 * <p>Copyright: Copyright (c) 2005</p>
 * <p>Company: xwtech.com</p>
 * @author starxu
 * @version 1.0
 * Framework 的配置文件类
 */
public class FrameworkProperties implements InitializingBean
{
	protected static final Logger logger = Logger
			.getLogger(FrameworkProperties.class);

	private boolean useCheckCode;

	private List notFilterUrls;

	private boolean notFilterItems;

	private String mailFrom;

	private String mailHost;

	private String userName;

	private String password;

	private boolean mailSendSwitch = true;

	private String msgServiceID;

	private String msgSourceAddr;

	private boolean commonOrderMsgSendSwitch = true;

	private boolean networkOrderMsgSendSwitch = true;

	private boolean tradeOrderMsgSendSwitch = true;

	private boolean signContractMsgSendSwitch = true;

	private boolean comparePriceMsgSendSwitch = true;

	private String prefixPath;

	private String annexPathPrefix;

	private String webAddress;

	private String reviewFilePath;

	private String importFilePath;

	private String exportFilePath;
	
	private boolean skipOverHourStatistics = false;

	public String getExportFilePath()
	{
		return exportFilePath;
	}

	public void setExportFilePath(String exportFilePath)
	{
		this.exportFilePath = exportFilePath;
	}

	public void setUseCheckCode(boolean useCheckCode)
	{
		this.useCheckCode = useCheckCode;
	}

	public boolean getUseCheckCode()
	{
		return useCheckCode;
	}

	public void setNotFilterUrls(List notFilterUrls)
	{
		this.notFilterUrls = notFilterUrls;
	}

	public List getNotFilterUrls()
	{
		return this.notFilterUrls;
	}

	public boolean isNotFilterItems()
	{
		return notFilterItems;
	}

	public void setNotFilterItems(boolean notFilterItems)
	{
		this.notFilterItems = notFilterItems;
	}

	public void afterPropertiesSet() throws Exception
	{

	}

	public FrameworkProperties()
	{
	}

	public String getMailFrom()
	{
		return mailFrom;
	}

	public void setMailFrom(String mailFrom)
	{
		this.mailFrom = mailFrom;
	}

	public String getMailHost()
	{
		return mailHost;
	}

	public void setMailHost(String mailHost)
	{
		this.mailHost = mailHost;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public boolean getMailSendSwitch()
	{
		return mailSendSwitch;
	}

	public void setMailSendSwitch(boolean mailSendSwitch)
	{
		this.mailSendSwitch = mailSendSwitch;
	}

	public boolean getCommonOrderMsgSendSwitch()
	{
		return commonOrderMsgSendSwitch;
	}

	public void setCommonOrderMsgSendSwitch(boolean commonOrderMsgSendSwitch)
	{
		this.commonOrderMsgSendSwitch = commonOrderMsgSendSwitch;
	}

	public boolean getComparePriceMsgSendSwitch()
	{
		return comparePriceMsgSendSwitch;
	}

	public void setComparePriceMsgSendSwitch(boolean comparePriceMsgSendSwitch)
	{
		this.comparePriceMsgSendSwitch = comparePriceMsgSendSwitch;
	}

	public boolean getNetworkOrderMsgSendSwitch()
	{
		return networkOrderMsgSendSwitch;
	}

	public void setNetworkOrderMsgSendSwitch(boolean networkOrderMsgSendSwitch)
	{
		this.networkOrderMsgSendSwitch = networkOrderMsgSendSwitch;
	}

	public boolean getSignContractMsgSendSwitch()
	{
		return signContractMsgSendSwitch;
	}

	public void setSignContractMsgSendSwitch(boolean signContractMsgSendSwitch)
	{
		this.signContractMsgSendSwitch = signContractMsgSendSwitch;
	}

	public boolean getTradeOrderMsgSendSwitch()
	{
		return tradeOrderMsgSendSwitch;
	}

	public void setTradeOrderMsgSendSwitch(boolean tradeOrderMsgSendSwitch)
	{
		this.tradeOrderMsgSendSwitch = tradeOrderMsgSendSwitch;
	}

	public String getAnnexPathPrefix()
	{
		return annexPathPrefix;
	}

	public void setAnnexPathPrefix(String annexPathPrefix)
	{
		this.annexPathPrefix = annexPathPrefix;
	}

	public String getPrefixPath()
	{
		return prefixPath;
	}

	public void setPrefixPath(String prefixPath)
	{
		this.prefixPath = prefixPath;
	}

	public String getWebAddress()
	{
		return webAddress;
	}

	public void setWebAddress(String webAddress)
	{
		this.webAddress = webAddress;
	}

	public String getMsgServiceID()
	{
		return msgServiceID;
	}

	public void setMsgServiceID(String msgServiceID)
	{
		this.msgServiceID = msgServiceID;
	}

	public String getMsgSourceAddr()
	{
		return msgSourceAddr;
	}

	public void setMsgSourceAddr(String msgSourceAddr)
	{
		this.msgSourceAddr = msgSourceAddr;
	}

	public String getReviewFilePath()
	{
		return reviewFilePath;
	}

	public void setReviewFilePath(String reviewFilePath)
	{
		this.reviewFilePath = reviewFilePath;
	}

	public String getImportFilePath()
	{
		return importFilePath;
	}

	public void setImportFilePath(String importFilePath)
	{
		this.importFilePath = importFilePath;
	}

	public boolean isSkipOverHourStatistics()
	{
		return skipOverHourStatistics;
	}

	public void setSkipOverHourStatistics(boolean skipOverHourStatistics)
	{
		this.skipOverHourStatistics = skipOverHourStatistics;
	}


}
