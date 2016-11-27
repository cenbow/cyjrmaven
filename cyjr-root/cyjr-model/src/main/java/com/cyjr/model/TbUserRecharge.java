package org.cyjr.model;

import java.math.BigDecimal;

public class TbUserRecharge {
    private Integer id;

    private String orderId;

    private String account;

    private String cardNo;

    private BigDecimal moneyRecharge;

    private String remark;

    private Integer thirdPlatform;

    private String thirdPlatformOrderId;

    private String paySource;

    private Byte status;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer createdAt;

    private Integer updatedAt;

    private String createdIp;

    private String payResult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public BigDecimal getMoneyRecharge() {
        return moneyRecharge;
    }

    public void setMoneyRecharge(BigDecimal moneyRecharge) {
        this.moneyRecharge = moneyRecharge;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getThirdPlatform() {
        return thirdPlatform;
    }

    public void setThirdPlatform(Integer thirdPlatform) {
        this.thirdPlatform = thirdPlatform;
    }

    public String getThirdPlatformOrderId() {
        return thirdPlatformOrderId;
    }

    public void setThirdPlatformOrderId(String thirdPlatformOrderId) {
        this.thirdPlatformOrderId = thirdPlatformOrderId == null ? null : thirdPlatformOrderId.trim();
    }

    public String getPaySource() {
        return paySource;
    }

    public void setPaySource(String paySource) {
        this.paySource = paySource == null ? null : paySource.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp == null ? null : createdIp.trim();
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult == null ? null : payResult.trim();
    }
}