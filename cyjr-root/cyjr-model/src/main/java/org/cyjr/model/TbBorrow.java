package org.cyjr.model;

import java.math.BigDecimal;

public class TbBorrow {
    private Integer id;

    private Integer userId;

    private String name;

    private Integer status;

    private Integer boOrder;

    private Integer hits;

    private String litpic;

    private Integer borrowType;

    private Integer verifyUser;

    private Integer verifyTime;

    private String verifyRemark;

    private BigDecimal repaymentAccount;

    private BigDecimal repaymentYesaccount;

    private BigDecimal repaymentYesinterest;

    private Integer borrowUse;

    private Integer isday;

    private Integer timeLimit;

    private Integer repaymentStyle;

    private BigDecimal account;

    private BigDecimal accountYes;

    private BigDecimal apr;

    private BigDecimal newapr;

    private BigDecimal lowestAccount;

    private BigDecimal mostAccount;

    private Integer validTime;

    private Integer award;

    private BigDecimal partAccount;

    private BigDecimal funds;

    private Integer publishDate;

    private Integer endTime;

    private String borrowFeeApr;

    private String openAccount;

    private String openBorrow;

    private String openTender;

    private String openCredit;

    private Integer addtime;

    private String addip;

    private String pwd;

    private String features;

    private String trustLevel;

    private Integer version;

    private Integer borrowerUserid;

    private Integer updatetime;

    private String updateip;

    private BigDecimal hongbaoPercent;

    private Integer borrowFeeAprStyle;

    private String content;

    private String insurance;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBoOrder() {
        return boOrder;
    }

    public void setBoOrder(Integer boOrder) {
        this.boOrder = boOrder;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic == null ? null : litpic.trim();
    }

    public Integer getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(Integer borrowType) {
        this.borrowType = borrowType;
    }

    public Integer getVerifyUser() {
        return verifyUser;
    }

    public void setVerifyUser(Integer verifyUser) {
        this.verifyUser = verifyUser;
    }

    public Integer getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Integer verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark == null ? null : verifyRemark.trim();
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

    public BigDecimal getRepaymentYesinterest() {
        return repaymentYesinterest;
    }

    public void setRepaymentYesinterest(BigDecimal repaymentYesinterest) {
        this.repaymentYesinterest = repaymentYesinterest;
    }

    public Integer getBorrowUse() {
        return borrowUse;
    }

    public void setBorrowUse(Integer borrowUse) {
        this.borrowUse = borrowUse;
    }

    public Integer getIsday() {
        return isday;
    }

    public void setIsday(Integer isday) {
        this.isday = isday;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Integer getRepaymentStyle() {
        return repaymentStyle;
    }

    public void setRepaymentStyle(Integer repaymentStyle) {
        this.repaymentStyle = repaymentStyle;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public BigDecimal getAccountYes() {
        return accountYes;
    }

    public void setAccountYes(BigDecimal accountYes) {
        this.accountYes = accountYes;
    }

    public BigDecimal getApr() {
        return apr;
    }

    public void setApr(BigDecimal apr) {
        this.apr = apr;
    }

    public BigDecimal getNewapr() {
        return newapr;
    }

    public void setNewapr(BigDecimal newapr) {
        this.newapr = newapr;
    }

    public BigDecimal getLowestAccount() {
        return lowestAccount;
    }

    public void setLowestAccount(BigDecimal lowestAccount) {
        this.lowestAccount = lowestAccount;
    }

    public BigDecimal getMostAccount() {
        return mostAccount;
    }

    public void setMostAccount(BigDecimal mostAccount) {
        this.mostAccount = mostAccount;
    }

    public Integer getValidTime() {
        return validTime;
    }

    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }

    public Integer getAward() {
        return award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public BigDecimal getPartAccount() {
        return partAccount;
    }

    public void setPartAccount(BigDecimal partAccount) {
        this.partAccount = partAccount;
    }

    public BigDecimal getFunds() {
        return funds;
    }

    public void setFunds(BigDecimal funds) {
        this.funds = funds;
    }

    public Integer getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Integer publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getBorrowFeeApr() {
        return borrowFeeApr;
    }

    public void setBorrowFeeApr(String borrowFeeApr) {
        this.borrowFeeApr = borrowFeeApr == null ? null : borrowFeeApr.trim();
    }

    public String getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(String openAccount) {
        this.openAccount = openAccount == null ? null : openAccount.trim();
    }

    public String getOpenBorrow() {
        return openBorrow;
    }

    public void setOpenBorrow(String openBorrow) {
        this.openBorrow = openBorrow == null ? null : openBorrow.trim();
    }

    public String getOpenTender() {
        return openTender;
    }

    public void setOpenTender(String openTender) {
        this.openTender = openTender == null ? null : openTender.trim();
    }

    public String getOpenCredit() {
        return openCredit;
    }

    public void setOpenCredit(String openCredit) {
        this.openCredit = openCredit == null ? null : openCredit.trim();
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features == null ? null : features.trim();
    }

    public String getTrustLevel() {
        return trustLevel;
    }

    public void setTrustLevel(String trustLevel) {
        this.trustLevel = trustLevel == null ? null : trustLevel.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getBorrowerUserid() {
        return borrowerUserid;
    }

    public void setBorrowerUserid(Integer borrowerUserid) {
        this.borrowerUserid = borrowerUserid;
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

    public BigDecimal getHongbaoPercent() {
        return hongbaoPercent;
    }

    public void setHongbaoPercent(BigDecimal hongbaoPercent) {
        this.hongbaoPercent = hongbaoPercent;
    }

    public Integer getBorrowFeeAprStyle() {
        return borrowFeeAprStyle;
    }

    public void setBorrowFeeAprStyle(Integer borrowFeeAprStyle) {
        this.borrowFeeAprStyle = borrowFeeAprStyle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance == null ? null : insurance.trim();
    }
}