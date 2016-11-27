package org.cyjr.model;

public class TbBorrowWish {
    private Integer id;

    private String wishMoney;

    private String wishApr;

    private String wishTime;

    private String wishUse;

    private String wishRepayStyle;

    private String userPhone;

    private String userPhone2;

    private String userSecurity;

    private String userSecurity2;

    private String userHomeAddress;

    private Integer userId;

    private String username;

    private Integer createTime;

    private Integer status;

    private String realname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWishMoney() {
        return wishMoney;
    }

    public void setWishMoney(String wishMoney) {
        this.wishMoney = wishMoney == null ? null : wishMoney.trim();
    }

    public String getWishApr() {
        return wishApr;
    }

    public void setWishApr(String wishApr) {
        this.wishApr = wishApr == null ? null : wishApr.trim();
    }

    public String getWishTime() {
        return wishTime;
    }

    public void setWishTime(String wishTime) {
        this.wishTime = wishTime == null ? null : wishTime.trim();
    }

    public String getWishUse() {
        return wishUse;
    }

    public void setWishUse(String wishUse) {
        this.wishUse = wishUse == null ? null : wishUse.trim();
    }

    public String getWishRepayStyle() {
        return wishRepayStyle;
    }

    public void setWishRepayStyle(String wishRepayStyle) {
        this.wishRepayStyle = wishRepayStyle == null ? null : wishRepayStyle.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPhone2() {
        return userPhone2;
    }

    public void setUserPhone2(String userPhone2) {
        this.userPhone2 = userPhone2 == null ? null : userPhone2.trim();
    }

    public String getUserSecurity() {
        return userSecurity;
    }

    public void setUserSecurity(String userSecurity) {
        this.userSecurity = userSecurity == null ? null : userSecurity.trim();
    }

    public String getUserSecurity2() {
        return userSecurity2;
    }

    public void setUserSecurity2(String userSecurity2) {
        this.userSecurity2 = userSecurity2 == null ? null : userSecurity2.trim();
    }

    public String getUserHomeAddress() {
        return userHomeAddress;
    }

    public void setUserHomeAddress(String userHomeAddress) {
        this.userHomeAddress = userHomeAddress == null ? null : userHomeAddress.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }
}