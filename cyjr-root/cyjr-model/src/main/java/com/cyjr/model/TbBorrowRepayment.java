package org.cyjr.model;

import java.math.BigDecimal;

public class TbBorrowRepayment {
    private Integer id;

    private Integer status;

    private Integer webstatus;

    private Integer repOrder;

    private Integer borrowId;

    private Integer repaymentTime;

    private Integer repaymentYestime;

    private BigDecimal repaymentAccount;

    private BigDecimal repaymentYesaccount;

    private Integer lateDays;

    private BigDecimal lateInterest;

    private BigDecimal interest;

    private BigDecimal capital;

    private BigDecimal forfeit;

    private BigDecimal reminderFee;

    private Integer addtime;

    private String addip;

    private Integer updatetime;

    private String updateip;

    private String outTradeNo;

    private String innerTradeNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWebstatus() {
        return webstatus;
    }

    public void setWebstatus(Integer webstatus) {
        this.webstatus = webstatus;
    }

    public Integer getRepOrder() {
        return repOrder;
    }

    public void setRepOrder(Integer repOrder) {
        this.repOrder = repOrder;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Integer getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Integer repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public Integer getRepaymentYestime() {
        return repaymentYestime;
    }

    public void setRepaymentYestime(Integer repaymentYestime) {
        this.repaymentYestime = repaymentYestime;
    }

    public BigDecimal getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(BigDecimal repaymentAccount) {
        this.repaymentAccount = repaymentAccount;
    }

    public BigDecimal getRepaymentYesaccount() {
        return repaymentYesaccount;
    }

    public void setRepaymentYesaccount(BigDecimal repaymentYesaccount) {
        this.repaymentYesaccount = repaymentYesaccount;
    }

    public Integer getLateDays() {
        return lateDays;
    }

    public void setLateDays(Integer lateDays) {
        this.lateDays = lateDays;
    }

    public BigDecimal getLateInterest() {
        return lateInterest;
    }

    public void setLateInterest(BigDecimal lateInterest) {
        this.lateInterest = lateInterest;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getForfeit() {
        return forfeit;
    }

    public void setForfeit(BigDecimal forfeit) {
        this.forfeit = forfeit;
    }

    public BigDecimal getReminderFee() {
        return reminderFee;
    }

    public void setReminderFee(BigDecimal reminderFee) {
        this.reminderFee = reminderFee;
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