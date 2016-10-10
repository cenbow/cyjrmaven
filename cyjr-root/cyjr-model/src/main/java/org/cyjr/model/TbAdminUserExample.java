package org.cyjr.model;

import java.util.ArrayList;
import java.util.List;

public class TbAdminUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAdminUserExample() {
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

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
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

        public Criteria andLastVisitTimeIsNull() {
            addCriterion("last_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIsNotNull() {
            addCriterion("last_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeEqualTo(Integer value) {
            addCriterion("last_visit_time =", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotEqualTo(Integer value) {
            addCriterion("last_visit_time <>", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThan(Integer value) {
            addCriterion("last_visit_time >", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_visit_time >=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThan(Integer value) {
            addCriterion("last_visit_time <", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_visit_time <=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIn(List<Integer> values) {
            addCriterion("last_visit_time in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotIn(List<Integer> values) {
            addCriterion("last_visit_time not in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_visit_time between", value1, value2, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_visit_time not between", value1, value2, "lastVisitTime");
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