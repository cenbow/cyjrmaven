package org.cyjr.model;

import java.math.BigDecimal;

public class TbUserAccount {
    private Integer id;

    private Integer userId;

    private BigDecimal moneyTotal;

    private BigDecimal moneyUsable;

    private BigDecimal moneyTenderFreeze;

    private BigDecimal moneyCollection;

    private BigDecimal profitsTotal;

    private Integer createdAt;

    private Integer updatedAt;

    private BigDecimal sinaInterestAll;

    private BigDecimal sinaInterestLast;

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

    public BigDecimal getProfitsTotal() {
        return profitsTotal;
    }

    public void setProfitsTotal(BigDecimal profitsTotal) {
        this.profitsTotal = profitsTotal;
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

    public BigDecimal getSinaInterestAll() {
        return sinaInterestAll;
    }

    public void setSinaInterestAll(BigDecimal sinaInterestAll) {
        this.sinaInterestAll = sinaInterestAll;
    }

    public BigDecimal getSinaInterestLast() {
        return sinaInterestLast;
    }

    public void setSinaInterestLast(BigDecimal sinaInterestLast) {
        this.sinaInterestLast = sinaInterestLast;
    }
}