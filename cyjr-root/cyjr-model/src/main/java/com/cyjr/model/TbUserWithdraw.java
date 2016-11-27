package org.cyjr.model;

import java.math.BigDecimal;

public class TbUserWithdraw {
    private Integer id;

    private BigDecimal moneyWithdraw;

    private String remark;

    private Byte status;

    private String tradeOrder;

    private String trustRemark;

    private Integer trustStatus;

    private Integer createdBy;

    private Integer createdAt;

    private Integer updatedBy;

    private Integer updatedAt;

    private String createdIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMoneyWithdraw() {
        return moneyWithdraw;
    }

    public void setMoneyWithdraw(BigDecimal moneyWithdraw) {
        this.moneyWithdraw = moneyWithdraw;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getTradeOrder() {
        return tradeOrder;
    }

    public void setTradeOrder(String tradeOrder) {
        this.tradeOrder = tradeOrder == null ? null : tradeOrder.trim();
    }

    public String getTrustRemark() {
        return trustRemark;
    }

    public void setTrustRemark(String trustRemark) {
        this.trustRemark = trustRemark == null ? null : trustRemark.trim();
    }

    public Integer getTrustStatus() {
        return trustStatus;
    }

    public void setTrustStatus(Integer trustStatus) {
        this.trustStatus = trustStatus;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
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
}