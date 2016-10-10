package com.cyjr.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Byte value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Byte value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Byte value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Byte value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Byte value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Byte value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Byte> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Byte> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Byte value1, Byte value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Byte value1, Byte value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andPasswordHashIsNull() {
            addCriterion("password_hash is null");
            return (Criteria) this;
        }

        public Criteria andPasswordHashIsNotNull() {
            addCriterion("password_hash is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordHashEqualTo(String value) {
            addCriterion("password_hash =", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotEqualTo(String value) {
            addCriterion("password_hash <>", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashGreaterThan(String value) {
            addCriterion("password_hash >", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashGreaterThanOrEqualTo(String value) {
            addCriterion("password_hash >=", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashLessThan(String value) {
            addCriterion("password_hash <", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashLessThanOrEqualTo(String value) {
            addCriterion("password_hash <=", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashLike(String value) {
            addCriterion("password_hash like", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotLike(String value) {
            addCriterion("password_hash not like", value, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashIn(List<String> values) {
            addCriterion("password_hash in", values, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotIn(List<String> values) {
            addCriterion("password_hash not in", values, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashBetween(String value1, String value2) {
            addCriterion("password_hash between", value1, value2, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordHashNotBetween(String value1, String value2) {
            addCriterion("password_hash not between", value1, value2, "passwordHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashIsNull() {
            addCriterion("password_pay_hash is null");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashIsNotNull() {
            addCriterion("password_pay_hash is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashEqualTo(String value) {
            addCriterion("password_pay_hash =", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashNotEqualTo(String value) {
            addCriterion("password_pay_hash <>", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashGreaterThan(String value) {
            addCriterion("password_pay_hash >", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashGreaterThanOrEqualTo(String value) {
            addCriterion("password_pay_hash >=", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashLessThan(String value) {
            addCriterion("password_pay_hash <", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashLessThanOrEqualTo(String value) {
            addCriterion("password_pay_hash <=", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashLike(String value) {
            addCriterion("password_pay_hash like", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashNotLike(String value) {
            addCriterion("password_pay_hash not like", value, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashIn(List<String> values) {
            addCriterion("password_pay_hash in", values, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashNotIn(List<String> values) {
            addCriterion("password_pay_hash not in", values, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashBetween(String value1, String value2) {
            addCriterion("password_pay_hash between", value1, value2, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordPayHashNotBetween(String value1, String value2) {
            addCriterion("password_pay_hash not between", value1, value2, "passwordPayHash");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenIsNull() {
            addCriterion("password_reset_token is null");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenIsNotNull() {
            addCriterion("password_reset_token is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenEqualTo(String value) {
            addCriterion("password_reset_token =", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenNotEqualTo(String value) {
            addCriterion("password_reset_token <>", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenGreaterThan(String value) {
            addCriterion("password_reset_token >", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenGreaterThanOrEqualTo(String value) {
            addCriterion("password_reset_token >=", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenLessThan(String value) {
            addCriterion("password_reset_token <", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenLessThanOrEqualTo(String value) {
            addCriterion("password_reset_token <=", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenLike(String value) {
            addCriterion("password_reset_token like", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenNotLike(String value) {
            addCriterion("password_reset_token not like", value, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenIn(List<String> values) {
            addCriterion("password_reset_token in", values, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenNotIn(List<String> values) {
            addCriterion("password_reset_token not in", values, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenBetween(String value1, String value2) {
            addCriterion("password_reset_token between", value1, value2, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andPasswordResetTokenNotBetween(String value1, String value2) {
            addCriterion("password_reset_token not between", value1, value2, "passwordResetToken");
            return (Criteria) this;
        }

        public Criteria andAuthKeyIsNull() {
            addCriterion("auth_key is null");
            return (Criteria) this;
        }

        public Criteria andAuthKeyIsNotNull() {
            addCriterion("auth_key is not null");
            return (Criteria) this;
        }

        public Criteria andAuthKeyEqualTo(String value) {
            addCriterion("auth_key =", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotEqualTo(String value) {
            addCriterion("auth_key <>", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyGreaterThan(String value) {
            addCriterion("auth_key >", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyGreaterThanOrEqualTo(String value) {
            addCriterion("auth_key >=", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyLessThan(String value) {
            addCriterion("auth_key <", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyLessThanOrEqualTo(String value) {
            addCriterion("auth_key <=", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyLike(String value) {
            addCriterion("auth_key like", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotLike(String value) {
            addCriterion("auth_key not like", value, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyIn(List<String> values) {
            addCriterion("auth_key in", values, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotIn(List<String> values) {
            addCriterion("auth_key not in", values, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyBetween(String value1, String value2) {
            addCriterion("auth_key between", value1, value2, "authKey");
            return (Criteria) this;
        }

        public Criteria andAuthKeyNotBetween(String value1, String value2) {
            addCriterion("auth_key not between", value1, value2, "authKey");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLitpicIsNull() {
            addCriterion("litpic is null");
            return (Criteria) this;
        }

        public Criteria andLitpicIsNotNull() {
            addCriterion("litpic is not null");
            return (Criteria) this;
        }

        public Criteria andLitpicEqualTo(String value) {
            addCriterion("litpic =", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotEqualTo(String value) {
            addCriterion("litpic <>", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicGreaterThan(String value) {
            addCriterion("litpic >", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicGreaterThanOrEqualTo(String value) {
            addCriterion("litpic >=", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLessThan(String value) {
            addCriterion("litpic <", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLessThanOrEqualTo(String value) {
            addCriterion("litpic <=", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLike(String value) {
            addCriterion("litpic like", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotLike(String value) {
            addCriterion("litpic not like", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicIn(List<String> values) {
            addCriterion("litpic in", values, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotIn(List<String> values) {
            addCriterion("litpic not in", values, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicBetween(String value1, String value2) {
            addCriterion("litpic between", value1, value2, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotBetween(String value1, String value2) {
            addCriterion("litpic not between", value1, value2, "litpic");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusIsNull() {
            addCriterion("email_binding_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusIsNotNull() {
            addCriterion("email_binding_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusEqualTo(Byte value) {
            addCriterion("email_binding_status =", value, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusNotEqualTo(Byte value) {
            addCriterion("email_binding_status <>", value, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusGreaterThan(Byte value) {
            addCriterion("email_binding_status >", value, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("email_binding_status >=", value, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusLessThan(Byte value) {
            addCriterion("email_binding_status <", value, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("email_binding_status <=", value, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusIn(List<Byte> values) {
            addCriterion("email_binding_status in", values, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusNotIn(List<Byte> values) {
            addCriterion("email_binding_status not in", values, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusBetween(Byte value1, Byte value2) {
            addCriterion("email_binding_status between", value1, value2, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andEmailBindingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("email_binding_status not between", value1, value2, "emailBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusIsNull() {
            addCriterion("mobile_binding_status is null");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusIsNotNull() {
            addCriterion("mobile_binding_status is not null");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusEqualTo(Byte value) {
            addCriterion("mobile_binding_status =", value, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusNotEqualTo(Byte value) {
            addCriterion("mobile_binding_status <>", value, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusGreaterThan(Byte value) {
            addCriterion("mobile_binding_status >", value, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mobile_binding_status >=", value, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusLessThan(Byte value) {
            addCriterion("mobile_binding_status <", value, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("mobile_binding_status <=", value, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusIn(List<Byte> values) {
            addCriterion("mobile_binding_status in", values, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusNotIn(List<Byte> values) {
            addCriterion("mobile_binding_status not in", values, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusBetween(Byte value1, Byte value2) {
            addCriterion("mobile_binding_status between", value1, value2, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andMobileBindingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("mobile_binding_status not between", value1, value2, "mobileBindingStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusIsNull() {
            addCriterion("real_verify_status is null");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusIsNotNull() {
            addCriterion("real_verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusEqualTo(Byte value) {
            addCriterion("real_verify_status =", value, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusNotEqualTo(Byte value) {
            addCriterion("real_verify_status <>", value, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusGreaterThan(Byte value) {
            addCriterion("real_verify_status >", value, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("real_verify_status >=", value, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusLessThan(Byte value) {
            addCriterion("real_verify_status <", value, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("real_verify_status <=", value, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusIn(List<Byte> values) {
            addCriterion("real_verify_status in", values, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusNotIn(List<Byte> values) {
            addCriterion("real_verify_status not in", values, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusBetween(Byte value1, Byte value2) {
            addCriterion("real_verify_status between", value1, value2, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andRealVerifyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("real_verify_status not between", value1, value2, "realVerifyStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusIsNull() {
            addCriterion("card_binding_status is null");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusIsNotNull() {
            addCriterion("card_binding_status is not null");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusEqualTo(Byte value) {
            addCriterion("card_binding_status =", value, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusNotEqualTo(Byte value) {
            addCriterion("card_binding_status <>", value, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusGreaterThan(Byte value) {
            addCriterion("card_binding_status >", value, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_binding_status >=", value, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusLessThan(Byte value) {
            addCriterion("card_binding_status <", value, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("card_binding_status <=", value, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusIn(List<Byte> values) {
            addCriterion("card_binding_status in", values, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusNotIn(List<Byte> values) {
            addCriterion("card_binding_status not in", values, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusBetween(Byte value1, Byte value2) {
            addCriterion("card_binding_status between", value1, value2, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andCardBindingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("card_binding_status not between", value1, value2, "cardBindingStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusIsNull() {
            addCriterion("sina_open_status is null");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusIsNotNull() {
            addCriterion("sina_open_status is not null");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusEqualTo(Integer value) {
            addCriterion("sina_open_status =", value, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusNotEqualTo(Integer value) {
            addCriterion("sina_open_status <>", value, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusGreaterThan(Integer value) {
            addCriterion("sina_open_status >", value, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sina_open_status >=", value, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusLessThan(Integer value) {
            addCriterion("sina_open_status <", value, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sina_open_status <=", value, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusIn(List<Integer> values) {
            addCriterion("sina_open_status in", values, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusNotIn(List<Integer> values) {
            addCriterion("sina_open_status not in", values, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusBetween(Integer value1, Integer value2) {
            addCriterion("sina_open_status between", value1, value2, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andSinaOpenStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sina_open_status not between", value1, value2, "sinaOpenStatus");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseIsNull() {
            addCriterion("card_id_base is null");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseIsNotNull() {
            addCriterion("card_id_base is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseEqualTo(Integer value) {
            addCriterion("card_id_base =", value, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseNotEqualTo(Integer value) {
            addCriterion("card_id_base <>", value, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseGreaterThan(Integer value) {
            addCriterion("card_id_base >", value, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id_base >=", value, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseLessThan(Integer value) {
            addCriterion("card_id_base <", value, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseLessThanOrEqualTo(Integer value) {
            addCriterion("card_id_base <=", value, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseIn(List<Integer> values) {
            addCriterion("card_id_base in", values, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseNotIn(List<Integer> values) {
            addCriterion("card_id_base not in", values, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseBetween(Integer value1, Integer value2) {
            addCriterion("card_id_base between", value1, value2, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCardIdBaseNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id_base not between", value1, value2, "cardIdBase");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Integer value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Integer value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Integer value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Integer value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Integer> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Integer> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Integer value1, Integer value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNull() {
            addCriterion("last_logintime is null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNotNull() {
            addCriterion("last_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeEqualTo(Integer value) {
            addCriterion("last_logintime =", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotEqualTo(Integer value) {
            addCriterion("last_logintime <>", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThan(Integer value) {
            addCriterion("last_logintime >", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_logintime >=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThan(Integer value) {
            addCriterion("last_logintime <", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_logintime <=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIn(List<Integer> values) {
            addCriterion("last_logintime in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotIn(List<Integer> values) {
            addCriterion("last_logintime not in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeBetween(Integer value1, Integer value2) {
            addCriterion("last_logintime between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_logintime not between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Integer value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Integer value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Integer value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Integer value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Integer value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Integer> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Integer> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Integer value1, Integer value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedIpIsNull() {
            addCriterion("created_ip is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIpIsNotNull() {
            addCriterion("created_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedIpEqualTo(String value) {
            addCriterion("created_ip =", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpNotEqualTo(String value) {
            addCriterion("created_ip <>", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpGreaterThan(String value) {
            addCriterion("created_ip >", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpGreaterThanOrEqualTo(String value) {
            addCriterion("created_ip >=", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpLessThan(String value) {
            addCriterion("created_ip <", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpLessThanOrEqualTo(String value) {
            addCriterion("created_ip <=", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpLike(String value) {
            addCriterion("created_ip like", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpNotLike(String value) {
            addCriterion("created_ip not like", value, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpIn(List<String> values) {
            addCriterion("created_ip in", values, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpNotIn(List<String> values) {
            addCriterion("created_ip not in", values, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpBetween(String value1, String value2) {
            addCriterion("created_ip between", value1, value2, "createdIp");
            return (Criteria) this;
        }

        public Criteria andCreatedIpNotBetween(String value1, String value2) {
            addCriterion("created_ip not between", value1, value2, "createdIp");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNull() {
            addCriterion("invite_userid is null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNotNull() {
            addCriterion("invite_userid is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridEqualTo(Integer value) {
            addCriterion("invite_userid =", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotEqualTo(Integer value) {
            addCriterion("invite_userid <>", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThan(Integer value) {
            addCriterion("invite_userid >", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_userid >=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThan(Integer value) {
            addCriterion("invite_userid <", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThanOrEqualTo(Integer value) {
            addCriterion("invite_userid <=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIn(List<Integer> values) {
            addCriterion("invite_userid in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotIn(List<Integer> values) {
            addCriterion("invite_userid not in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid not between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeIsNull() {
            addCriterion("real_verify_time is null");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeIsNotNull() {
            addCriterion("real_verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeEqualTo(Integer value) {
            addCriterion("real_verify_time =", value, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeNotEqualTo(Integer value) {
            addCriterion("real_verify_time <>", value, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeGreaterThan(Integer value) {
            addCriterion("real_verify_time >", value, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_verify_time >=", value, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeLessThan(Integer value) {
            addCriterion("real_verify_time <", value, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("real_verify_time <=", value, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeIn(List<Integer> values) {
            addCriterion("real_verify_time in", values, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeNotIn(List<Integer> values) {
            addCriterion("real_verify_time not in", values, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeBetween(Integer value1, Integer value2) {
            addCriterion("real_verify_time between", value1, value2, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRealVerifyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("real_verify_time not between", value1, value2, "realVerifyTime");
            return (Criteria) this;
        }

        public Criteria andJsessionIdIsNull() {
            addCriterion("jsession_id is null");
            return (Criteria) this;
        }

        public Criteria andJsessionIdIsNotNull() {
            addCriterion("jsession_id is not null");
            return (Criteria) this;
        }

        public Criteria andJsessionIdEqualTo(String value) {
            addCriterion("jsession_id =", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdNotEqualTo(String value) {
            addCriterion("jsession_id <>", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdGreaterThan(String value) {
            addCriterion("jsession_id >", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("jsession_id >=", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdLessThan(String value) {
            addCriterion("jsession_id <", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdLessThanOrEqualTo(String value) {
            addCriterion("jsession_id <=", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdLike(String value) {
            addCriterion("jsession_id like", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdNotLike(String value) {
            addCriterion("jsession_id not like", value, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdIn(List<String> values) {
            addCriterion("jsession_id in", values, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdNotIn(List<String> values) {
            addCriterion("jsession_id not in", values, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdBetween(String value1, String value2) {
            addCriterion("jsession_id between", value1, value2, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andJsessionIdNotBetween(String value1, String value2) {
            addCriterion("jsession_id not between", value1, value2, "jsessionId");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginIsNull() {
            addCriterion("luckydraw_login is null");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginIsNotNull() {
            addCriterion("luckydraw_login is not null");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginEqualTo(Integer value) {
            addCriterion("luckydraw_login =", value, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginNotEqualTo(Integer value) {
            addCriterion("luckydraw_login <>", value, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginGreaterThan(Integer value) {
            addCriterion("luckydraw_login >", value, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("luckydraw_login >=", value, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginLessThan(Integer value) {
            addCriterion("luckydraw_login <", value, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginLessThanOrEqualTo(Integer value) {
            addCriterion("luckydraw_login <=", value, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginIn(List<Integer> values) {
            addCriterion("luckydraw_login in", values, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginNotIn(List<Integer> values) {
            addCriterion("luckydraw_login not in", values, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginBetween(Integer value1, Integer value2) {
            addCriterion("luckydraw_login between", value1, value2, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("luckydraw_login not between", value1, value2, "luckydrawLogin");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderIsNull() {
            addCriterion("luckydraw_tender is null");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderIsNotNull() {
            addCriterion("luckydraw_tender is not null");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderEqualTo(Integer value) {
            addCriterion("luckydraw_tender =", value, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderNotEqualTo(Integer value) {
            addCriterion("luckydraw_tender <>", value, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderGreaterThan(Integer value) {
            addCriterion("luckydraw_tender >", value, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("luckydraw_tender >=", value, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderLessThan(Integer value) {
            addCriterion("luckydraw_tender <", value, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderLessThanOrEqualTo(Integer value) {
            addCriterion("luckydraw_tender <=", value, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderIn(List<Integer> values) {
            addCriterion("luckydraw_tender in", values, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderNotIn(List<Integer> values) {
            addCriterion("luckydraw_tender not in", values, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderBetween(Integer value1, Integer value2) {
            addCriterion("luckydraw_tender between", value1, value2, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLuckydrawTenderNotBetween(Integer value1, Integer value2) {
            addCriterion("luckydraw_tender not between", value1, value2, "luckydrawTender");
            return (Criteria) this;
        }

        public Criteria andLogintimesIsNull() {
            addCriterion("loginTimes is null");
            return (Criteria) this;
        }

        public Criteria andLogintimesIsNotNull() {
            addCriterion("loginTimes is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimesEqualTo(Integer value) {
            addCriterion("loginTimes =", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotEqualTo(Integer value) {
            addCriterion("loginTimes <>", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesGreaterThan(Integer value) {
            addCriterion("loginTimes >", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginTimes >=", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesLessThan(Integer value) {
            addCriterion("loginTimes <", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesLessThanOrEqualTo(Integer value) {
            addCriterion("loginTimes <=", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesIn(List<Integer> values) {
            addCriterion("loginTimes in", values, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotIn(List<Integer> values) {
            addCriterion("loginTimes not in", values, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesBetween(Integer value1, Integer value2) {
            addCriterion("loginTimes between", value1, value2, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotBetween(Integer value1, Integer value2) {
            addCriterion("loginTimes not between", value1, value2, "logintimes");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}