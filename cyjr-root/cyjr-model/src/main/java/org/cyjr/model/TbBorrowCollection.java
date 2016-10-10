package org.cyjr.model;

import java.math.BigDecimal;

public class TbBorrowCollection {
    private Integer id;

    private Integer status;

    private Integer colOrder;

    private Integer tenderId;

    private Integer repayTime;

    private Integer repayYestime;

    private BigDecimal repayAccount;

    private BigDecimal repayYesaccount;

    private BigDecimal interest;

    private BigDecimal capital;

    private Integer lateDays;

    private BigDecimal lateInterest;

    private Integer addtime;

    private String addip;

    private Integer updatetime;

    private String updateip;

    private Integer isTransfer;

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

    public Integer getColOrder() {
        return colOrder;
    }

    public void setColOrder(Integer colOrder) {
        this.colOrder = colOrder;
    }

    public Integer getTenderId() {
        return tenderId;
    }

    public void setTenderId(Integer tenderId) {
        this.tenderId = tenderId;
    }

    public Integer getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(Integer repayTime) {
        this.repayTime = repayTime;
    }

    public Integer getRepayYestime() {
        return repayYestime;
    }

    public void setRepayYestime(Integer repayYestime) {
        this.repayYestime = repayYestime;
    }

    public BigDecimal getRepayAccount() {
        return repayAccount;
    }

    public void setRepayAccount(BigDecimal repayAccount) {
        this.repayAccount = repayAccount;
    }

    public BigDecimal getRepayYesaccount() {
        return repayYesaccount;
    }

    public void setRepayYesaccount(BigDecimal repayYesaccount) {
        this.repayYesaccount = repayYesaccount;
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

    public Integer getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Integer isTransfer) {
        this.isTransfer = isTransfer;
    }
}