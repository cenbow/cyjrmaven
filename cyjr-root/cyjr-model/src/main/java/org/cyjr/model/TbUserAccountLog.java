package org.cyjr.model;

import java.math.BigDecimal;

public class TbUserAccountLog {
    private Integer id;

    private Integer userId;

    private Integer idRelated;

    private Integer type;

    private BigDecimal moneyOperate;

    private BigDecimal moneyTotal;

    private BigDecimal moneyUsable;

    private BigDecimal moneyTenderFreeze;

    private BigDecimal moneyCollection;

    private String remark;

    private Integer createdAt;

    private String createdIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIdRelated() {
        return idRelated;
    }

    public void setIdRelated(Integer idRelated) {
        this.idRelated = idRelated;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getMoneyOperate() {
        return moneyOperate;
    }

    public void setMoneyOperate(BigDecimal moneyOperate) {
        this.moneyOperate = moneyOperate;
    }

    public BigDecimal getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(BigDecimal moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public BigDecimal getMoneyUsable() {
        return moneyUsable;
    }

    public void setMoneyUsable(BigDecimal moneyUsable) {
        this.moneyUsable = moneyUsable;
    }

    public BigDecimal getMoneyTenderFreeze() {
        return moneyTenderFreeze;
    }

    public void setMoneyTenderFreeze(BigDecimal moneyTenderFreeze) {
        this.moneyTenderFreeze = moneyTenderFreeze;
    }

    public BigDecimal getMoneyCollection() {
        return moneyCollection;
    }

    public void setMoneyCollection(BigDecimal moneyCollection) {
        this.moneyCollection = moneyCollection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp == null ? null : createdIp.trim();
    }
}