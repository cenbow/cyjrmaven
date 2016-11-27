package org.cyjr.model;

import java.math.BigDecimal;

public class TbInterest {
    private Long id;

    private Long userId;

    private Byte status;

    private BigDecimal interestRatio;

    private String remark;

    private Integer createdTime;

    private Integer expiredTime;

    private Integer useTime;

    private Integer loanTime;

    private String useInfo;

    private String interestName;

    private Integer borrowId;

    private Integer tenderId;

    private String type;

    private String borrowName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getInterestRatio() {
        return interestRatio;
    }

    public void setInterestRatio(BigDecimal interestRatio) {
        this.interestRatio = interestRatio;
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

    public String getInterestName() {
        return interestName;
    }

    public void setInterestName(String interestName) {
        this.interestName = interestName == null ? null : interestName.trim();
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

    public String getBorrowName() {
        return borrowName;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName == null ? null : borrowName.trim();
    }
}