package com.cyjr.model;

public class User {
    private Integer id;

    private Byte role;

    private Byte userType;

    private String username;

    private String userNo;

    private String passwordHash;

    private String passwordPayHash;

    private String passwordResetToken;

    private String authKey;

    private Byte status;

    private String mobile;

    private String email;

    private String realname;

    private String idCard;

    private Byte sex;

    private String litpic;

    private String birthday;

    private Byte emailBindingStatus;

    private Byte mobileBindingStatus;

    private Byte realVerifyStatus;

    private Byte cardBindingStatus;

    private Integer sinaOpenStatus;

    private Integer cardIdBase;

    private Integer createdAt;

    private Integer lastLogintime;

    private Integer updatedAt;

    private String createdIp;

    private Integer inviteUserid;

    private Integer realVerifyTime;

    private String jsessionId;

    private Integer luckydrawLogin;

    private Integer luckydrawTender;

    private Integer logintimes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash == null ? null : passwordHash.trim();
    }

    public String getPasswordPayHash() {
        return passwordPayHash;
    }

    public void setPasswordPayHash(String passwordPayHash) {
        this.passwordPayHash = passwordPayHash == null ? null : passwordPayHash.trim();
    }

    public String getPasswordResetToken() {
        return passwordResetToken;
    }

    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken == null ? null : passwordResetToken.trim();
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey == null ? null : authKey.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic == null ? null : litpic.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Byte getEmailBindingStatus() {
        return emailBindingStatus;
    }

    public void setEmailBindingStatus(Byte emailBindingStatus) {
        this.emailBindingStatus = emailBindingStatus;
    }

    public Byte getMobileBindingStatus() {
        return mobileBindingStatus;
    }

    public void setMobileBindingStatus(Byte mobileBindingStatus) {
        this.mobileBindingStatus = mobileBindingStatus;
    }

    public Byte getRealVerifyStatus() {
        return realVerifyStatus;
    }

    public void setRealVerifyStatus(Byte realVerifyStatus) {
        this.realVerifyStatus = realVerifyStatus;
    }

    public Byte getCardBindingStatus() {
        return cardBindingStatus;
    }

    public void setCardBindingStatus(Byte cardBindingStatus) {
        this.cardBindingStatus = cardBindingStatus;
    }

    public Integer getSinaOpenStatus() {
        return sinaOpenStatus;
    }

    public void setSinaOpenStatus(Integer sinaOpenStatus) {
        this.sinaOpenStatus = sinaOpenStatus;
    }

    public Integer getCardIdBase() {
        return cardIdBase;
    }

    public void setCardIdBase(Integer cardIdBase) {
        this.cardIdBase = cardIdBase;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Integer lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp == null ? null : createdIp.trim();
    }

    public Integer getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(Integer inviteUserid) {
        this.inviteUserid = inviteUserid;
    }

    public Integer getRealVerifyTime() {
        return realVerifyTime;
    }

    public void setRealVerifyTime(Integer realVerifyTime) {
        this.realVerifyTime = realVerifyTime;
    }

    public String getJsessionId() {
        return jsessionId;
    }

    public void setJsessionId(String jsessionId) {
        this.jsessionId = jsessionId == null ? null : jsessionId.trim();
    }

    public Integer getLuckydrawLogin() {
        return luckydrawLogin;
    }

    public void setLuckydrawLogin(Integer luckydrawLogin) {
        this.luckydrawLogin = luckydrawLogin;
    }

    public Integer getLuckydrawTender() {
        return luckydrawTender;
    }

    public void setLuckydrawTender(Integer luckydrawTender) {
        this.luckydrawTender = luckydrawTender;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }
}