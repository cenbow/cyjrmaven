package org.cyjr.model;

import java.math.BigDecimal;

public class TbLoanOrder {
    private Integer id;

    private Integer tenderId;

    private String outTradeNo;

    private String outTradeCode;

    private String payeeIdentityId;

    private String payeeIdentityType;

    private String accountType;

    private BigDecimal amount;

    private Integer status;

    private String summary;

    private String userIp;

    private String createTime;

    private String updateTime;

    private String failMsg;

    private String extend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenderId() {
        return tenderId;
    }

    public void setTenderId(Integer tenderId) {
        this.tenderId = tenderId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getOutTradeCode() {
        return outTradeCode;
    }

    public void setOutTradeCode(String outTradeCode) {
        this.outTradeCode = outTradeCode == null ? null : outTradeCode.trim();
    }

    public String getPayeeIdentityId() {
        return payeeIdentityId;
    }

    public void setPayeeIdentityId(String payeeIdentityId) {
        this.payeeIdentityId = payeeIdentityId == null ? null : payeeIdentityId.trim();
    }

    public String getPayeeIdentityType() {
        return payeeIdentityType;
    }

    public void setPayeeIdentityType(String payeeIdentityType) {
        this.payeeIdentityType = payeeIdentityType == null ? null : payeeIdentityType.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg == null ? null : failMsg.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }
}