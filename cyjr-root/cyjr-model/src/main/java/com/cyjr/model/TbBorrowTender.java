package org.cyjr.model;

import java.math.BigDecimal;

public class TbBorrowTender {
    private Integer id;

    private Integer userId;

    private Integer status;

    private Integer borrowId;

    private BigDecimal money;

    private BigDecimal account;

    private BigDecimal repaymentAccount;

    private BigDecimal interest;

    private BigDecimal repaymentYesaccount;

    private BigDecimal waitAccount;

    private BigDecimal waitInterest;

    private BigDecimal repaymentYesinterest;

    private Integer addtime;

    private String addip;

    private Integer updatetime;

    private String updateip;

    private String planHids;

    private String outTradeNo;

    private String innerTradeNo;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public BigDecimal getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(BigDecimal repaymentAccount) {
        this.repaymentAccount = repaymentAccount;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getRepaymentYesaccount() {
        return repaymentYesaccount;
    }

    public void setRepaymentYesaccount(BigDecimal repaymentYesaccount) {
        this.repaymentYesaccount = repaymentYesaccount;
    }

    public BigDecimal getWaitAccount() {
        return waitAccount;
    }

    public void setWaitAccount(BigDecimal waitAccount) {
        this.waitAccount = waitAccount;
    }

    public BigDecimal getWaitInterest() {
        return waitInterest;
    }

    public void setWaitInterest(BigDecimal waitInterest) {
        this.waitInterest = waitInterest;
    }

    public BigDecimal getRepaymentYesinterest() {
        return repaymentYesinterest;
    }

    public void setRepaymentYesinterest(BigDecimal repaymentYesinterest) {
        this.repaymentYesinterest = repaymentYesinterest;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getAddip() {
        return addip;
    }

    public void setAddip(String addip) {
        this.addip = addip == null ? null : addip.trim();
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateip() {
        return updateip;
    }

    public void setUpdateip(String updateip) {
        this.updateip = updateip == null ? null : updateip.trim();
    }

    public String getPlanHids() {
        return planHids;
    }

    public void setPlanHids(String planHids) {
        this.planHids = planHids == null ? null : planHids.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getInnerTradeNo() {
        return innerTradeNo;
    }

    public void setInnerTradeNo(String innerTradeNo) {
        this.innerTradeNo = innerTradeNo == null ? null : innerTradeNo.trim();
    }
}