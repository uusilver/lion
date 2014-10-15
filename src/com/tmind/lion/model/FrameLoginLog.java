package com.tmind.lion.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class FrameLoginLog implements Serializable {

    /** identifier field */
    private Long loginLogId;

    /** persistent field */
    private String loginIp;

    /** persistent field */
    private String loginName;

    /** persistent field */
    private String loginPwd;

    /** persistent field */
    private String loginTime;

    /** persistent field */
    private Long loginResultCode;

    /** full constructor */
    public FrameLoginLog(Long loginLogId, String loginIp, String loginName, String loginPwd, String loginTime, Long loginResultCode) {
        this.loginLogId = loginLogId;
        this.loginIp = loginIp;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.loginTime = loginTime;
        this.loginResultCode = loginResultCode;
    }

    /** default constructor */
    public FrameLoginLog() {
    }

    public Long getLoginLogId() {
        return this.loginLogId;
    }

    public void setLoginLogId(Long loginLogId) {
        this.loginLogId = loginLogId;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return this.loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getLoginTime() {
        return this.loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public Long getLoginResultCode() {
        return this.loginResultCode;
    }

    public void setLoginResultCode(Long loginResultCode) {
        this.loginResultCode = loginResultCode;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("loginLogId", getLoginLogId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof FrameLoginLog) ) return false;
        FrameLoginLog castOther = (FrameLoginLog) other;
        return new EqualsBuilder()
            .append(this.getLoginLogId(), castOther.getLoginLogId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getLoginLogId())
            .toHashCode();
    }

}
