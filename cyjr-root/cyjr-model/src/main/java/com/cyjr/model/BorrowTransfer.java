package org.cyjr.model;

import java.math.BigDecimal;

public class BorrowTransfer {
    private Integer id;

    private String orderno;

    private Integer borrowid;

    private Integer tenderid;

    private Integer tenderuserid;

    private Integer transfereeuserid;

    private Integer status;

    private String collectmoney;

    private String transfermoney;

    private BigDecimal transferfee;

    private BigDecimal account;

    private BigDecimal leaveinterest;

    private String transferday;

    private String transferapr;

    private String remark;

    private Integer addtime;

    private Integer endtime;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getBorrowid() {
        return borrowid;
    }

    public void setBorrowid(Integer borrowid) {
        this.borrowid = borrowid;
    }

    public Integer getTenderid() {
        return tenderid;
    }

    public void setTenderid(Integer tenderid) {
        this.tenderid = tenderid;
    }

    public Integer getTenderuserid() {
        return tenderuserid;
    }

    public void setTenderuserid(Integer tenderuserid) {
        this.tenderuserid = tenderuserid;
    }

    public Integer getTransfereeuserid() {
        return transfereeuserid;
    }

    public void setTransfereeuserid(Integer transfereeuserid) {
        this.transfereeuserid = transfereeuserid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCollectmoney() {
        return collectmoney;
    }

    public void setCollectmoney(String collectmoney) {
        this.collectmoney = collectmoney == null ? null : collectmoney.trim();
    }

    public String getTransfermoney() {
        return transfermoney;
    }

    public void setTransfermoney(String transfermoney) {
        this.transfermoney = transfermoney == null ? null : transfermoney.trim();
    }

    public BigDecimal getTransferfee() {
        return transferfee;
    }

    public void setTransferfee(BigDecimal transferfee) {
        this.transferfee = transferfee;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public BigDecimal getLeaveinterest() {
        return leaveinterest;
    }

    public void setLeaveinterest(BigDecimal leaveinterest) {
        this.leaveinterest = leaveinterest;
    }

    public String getTransferday() {
        return transferday;
    }

    public void setTransferday(String transferday) {
        this.transferday = transferday == null ? null : transferday.trim();
    }

    public String getTransferapr() {
        return transferapr;
    }

    public void setTransferapr(String transferapr) {
        this.transferapr = transferapr == null ? null : transferapr.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}