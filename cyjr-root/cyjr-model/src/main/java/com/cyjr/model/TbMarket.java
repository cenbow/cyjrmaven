package org.cyjr.model;

import java.math.BigDecimal;

public class TbMarket {
    private Integer id;

    private Integer borrowId;

    private Integer tenderId;

    private Integer tenderUserId;

    private BigDecimal tenderPrice;

    private BigDecimal transferPrice;

    private BigDecimal collectionMoney;

    private Integer repayOrder;

    private Integer repayTotalOrder;

    private BigDecimal borrowApr;

    private String borrowName;

    private Integer remainingDays;

    private Integer status;

    private Integer createdAt;

    private Integer createdBy;

    private Integer updateAt;

    private Integer updateBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Integer getTenderId() {
        return tenderId;
    }

    public void setTenderId(Integer tenderId) {
        this.tenderId = tenderId;
    }

    public Integer getTenderUserId() {
        return tenderUserId;
    }

    public void setTenderUserId(Integer tenderUserId) {
        this.tenderUserId = tenderUserId;
    }

    public BigDecimal getTenderPrice() {
        return tenderPrice;
    }

    public void setTenderPrice(BigDecimal tenderPrice) {
        this.tenderPrice = tenderPrice;
    }

    public BigDecimal getTransferPrice() {
        return transferPrice;
    }

    public void setTransferPrice(BigDecimal transferPrice) {
        this.transferPrice = transferPrice;
    }

    public BigDecimal getCollectionMoney() {
        return collectionMoney;
    }

    public void setCollectionMoney(BigDecimal collectionMoney) {
        this.collectionMoney = collectionMoney;
    }

    public Integer getRepayOrder() {
        return repayOrder;
    }

    public void setRepayOrder(Integer repayOrder) {
        this.repayOrder = repayOrder;
    }

    public Integer getRepayTotalOrder() {
        return repayTotalOrder;
    }

    public void setRepayTotalOrder(Integer repayTotalOrder) {
        this.repayTotalOrder = repayTotalOrder;
    }

    public BigDecimal getBorrowApr() {
        return borrowApr;
    }

    public void setBorrowApr(BigDecimal borrowApr) {
        this.borrowApr = borrowApr;
    }

    public String getBorrowName() {
        return borrowName;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName == null ? null : borrowName.trim();
    }

    public Integer getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(Integer remainingDays) {
        this.remainingDays = remainingDays;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}