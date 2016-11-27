package org.cyjr.model;

import java.math.BigDecimal;

public class TbHongbao {
    private Integer id;

    private Integer userId;

    private Integer borrowId;

    private Integer tenderId;

    private String type;

    private Byte status;

    private BigDecimal hongbaoMoney;

    private String remark;

    private Integer createdTime;

    private Integer expiredTime;

    private Integer useTime;

    private Integer loanTime;

    private String useInfo;

    private BigDecimal tenderRatio;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getHongbaoMoney() {
        return hongbaoMoney;
    }

    public void setHongbaoMoney(BigDecimal hongbaoMoney) {
        this.hongbaoMoney = hongbaoMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Integer getUseTime() {
        return useTime;
    }

    public void setUseTime(Integer useTime) {
        this.useTime = useTime;
    }

    public Integer getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(Integer loanTime) {
        this.loanTime = loanTime;
    }

    public String getUseInfo() {
        return useInfo;
    }

    public void setUseInfo(String useInfo) {
        this.useInfo = useInfo == null ? null : useInfo.trim();
    }

    public BigDecimal getTenderRatio() {
        return tenderRatio;
    }

    public void setTenderRatio(BigDecimal tenderRatio) {
        this.tenderRatio = tenderRatio;
    }
}