package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbBorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBorrowExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBoOrderIsNull() {
            addCriterion("bo_order is null");
            return (Criteria) this;
        }

        public Criteria andBoOrderIsNotNull() {
            addCriterion("bo_order is not null");
            return (Criteria) this;
        }

        public Criteria andBoOrderEqualTo(Integer value) {
            addCriterion("bo_order =", value, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderNotEqualTo(Integer value) {
            addCriterion("bo_order <>", value, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderGreaterThan(Integer value) {
            addCriterion("bo_order >", value, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("bo_order >=", value, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderLessThan(Integer value) {
            addCriterion("bo_order <", value, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderLessThanOrEqualTo(Integer value) {
            addCriterion("bo_order <=", value, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderIn(List<Integer> values) {
            addCriterion("bo_order in", values, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderNotIn(List<Integer> values) {
            addCriterion("bo_order not in", values, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderBetween(Integer value1, Integer value2) {
            addCriterion("bo_order between", value1, value2, "boOrder");
            return (Criteria) this;
        }

        public Criteria andBoOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("bo_order not between", value1, value2, "boOrder");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
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

        public Criteria andBorrowTypeIsNull() {
            addCriterion("borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIsNotNull() {
            addCriterion("borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeEqualTo(Integer value) {
            addCriterion("borrow_type =", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotEqualTo(Integer value) {
            addCriterion("borrow_type <>", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThan(Integer value) {
            addCriterion("borrow_type >", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_type >=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThan(Integer value) {
            addCriterion("borrow_type <", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_type <=", value, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeIn(List<Integer> values) {
            addCriterion("borrow_type in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotIn(List<Integer> values) {
            addCriterion("borrow_type not in", values, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andBorrowTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_type not between", value1, value2, "borrowType");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIsNull() {
            addCriterion("verify_user is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIsNotNull() {
            addCriterion("verify_user is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserEqualTo(Integer value) {
            addCriterion("verify_user =", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotEqualTo(Integer value) {
            addCriterion("verify_user <>", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserGreaterThan(Integer value) {
            addCriterion("verify_user >", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_user >=", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserLessThan(Integer value) {
            addCriterion("verify_user <", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserLessThanOrEqualTo(Integer value) {
            addCriterion("verify_user <=", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIn(List<Integer> values) {
            addCriterion("verify_user in", values, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotIn(List<Integer> values) {
            addCriterion("verify_user not in", values, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserBetween(Integer value1, Integer value2) {
            addCriterion("verify_user between", value1, value2, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_user not between", value1, value2, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Integer value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Integer value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Integer value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Integer value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Integer> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Integer> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Integer value1, Integer value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNull() {
            addCriterion("verify_remark is null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNotNull() {
            addCriterion("verify_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkEqualTo(String value) {
            addCriterion("verify_remark =", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotEqualTo(String value) {
            addCriterion("verify_remark <>", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThan(String value) {
            addCriterion("verify_remark >", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("verify_remark >=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThan(String value) {
            addCriterion("verify_remark <", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThanOrEqualTo(String value) {
            addCriterion("verify_remark <=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLike(String value) {
            addCriterion("verify_remark like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotLike(String value) {
            addCriterion("verify_remark not like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIn(List<String> values) {
            addCriterion("verify_remark in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotIn(List<String> values) {
            addCriterion("verify_remark not in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkBetween(String value1, String value2) {
            addCriterion("verify_remark between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotBetween(String value1, String value2) {
            addCriterion("verify_remark not between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountIsNull() {
            addCriterion("repayment_account is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountIsNotNull() {
            addCriterion("repayment_account is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountEqualTo(BigDecimal value) {
            addCriterion("repayment_account =", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotEqualTo(BigDecimal value) {
            addCriterion("repayment_account <>", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountGreaterThan(BigDecimal value) {
            addCriterion("repayment_account >", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_account >=", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountLessThan(BigDecimal value) {
            addCriterion("repayment_account <", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_account <=", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountIn(List<BigDecimal> values) {
            addCriterion("repayment_account in", values, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotIn(List<BigDecimal> values) {
            addCriterion("repayment_account not in", values, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_account between", value1, value2, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_account not between", value1, value2, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountIsNull() {
            addCriterion("repayment_yesaccount is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountIsNotNull() {
            addCriterion("repayment_yesaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountEqualTo(BigDecimal value) {
            addCriterion("repayment_yesaccount =", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotEqualTo(BigDecimal value) {
            addCriterion("repayment_yesaccount <>", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountGreaterThan(BigDecimal value) {
            addCriterion("repayment_yesaccount >", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_yesaccount >=", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountLessThan(BigDecimal value) {
            addCriterion("repayment_yesaccount <", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_yesaccount <=", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountIn(List<BigDecimal> values) {
            addCriterion("repayment_yesaccount in", values, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotIn(List<BigDecimal> values) {
            addCriterion("repayment_yesaccount not in", values, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_yesaccount between", value1, value2, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_yesaccount not between", value1, value2, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestIsNull() {
            addCriterion("repayment_yesinterest is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestIsNotNull() {
            addCriterion("repayment_yesinterest is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestEqualTo(BigDecimal value) {
            addCriterion("repayment_yesinterest =", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotEqualTo(BigDecimal value) {
            addCriterion("repayment_yesinterest <>", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestGreaterThan(BigDecimal value) {
            addCriterion("repayment_yesinterest >", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_yesinterest >=", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestLessThan(BigDecimal value) {
            addCriterion("repayment_yesinterest <", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repayment_yesinterest <=", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestIn(List<BigDecimal> values) {
            addCriterion("repayment_yesinterest in", values, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotIn(List<BigDecimal> values) {
            addCriterion("repayment_yesinterest not in", values, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_yesinterest between", value1, value2, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repayment_yesinterest not between", value1, value2, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andBorrowUseIsNull() {
            addCriterion("borrow_use is null");
            return (Criteria) this;
        }

        public Criteria andBorrowUseIsNotNull() {
            addCriterion("borrow_use is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowUseEqualTo(Integer value) {
            addCriterion("borrow_use =", value, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseNotEqualTo(Integer value) {
            addCriterion("borrow_use <>", value, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseGreaterThan(Integer value) {
            addCriterion("borrow_use >", value, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_use >=", value, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseLessThan(Integer value) {
            addCriterion("borrow_use <", value, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_use <=", value, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseIn(List<Integer> values) {
            addCriterion("borrow_use in", values, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseNotIn(List<Integer> values) {
            addCriterion("borrow_use not in", values, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseBetween(Integer value1, Integer value2) {
            addCriterion("borrow_use between", value1, value2, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andBorrowUseNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_use not between", value1, value2, "borrowUse");
            return (Criteria) this;
        }

        public Criteria andIsdayIsNull() {
            addCriterion("isday is null");
            return (Criteria) this;
        }

        public Criteria andIsdayIsNotNull() {
            addCriterion("isday is not null");
            return (Criteria) this;
        }

        public Criteria andIsdayEqualTo(Integer value) {
            addCriterion("isday =", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotEqualTo(Integer value) {
            addCriterion("isday <>", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayGreaterThan(Integer value) {
            addCriterion("isday >", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isday >=", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayLessThan(Integer value) {
            addCriterion("isday <", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayLessThanOrEqualTo(Integer value) {
            addCriterion("isday <=", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayIn(List<Integer> values) {
            addCriterion("isday in", values, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotIn(List<Integer> values) {
            addCriterion("isday not in", values, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayBetween(Integer value1, Integer value2) {
            addCriterion("isday between", value1, value2, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotBetween(Integer value1, Integer value2) {
            addCriterion("isday not between", value1, value2, "isday");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(Integer value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(Integer value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(Integer value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(Integer value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<Integer> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<Integer> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleIsNull() {
            addCriterion("repayment_style is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleIsNotNull() {
            addCriterion("repayment_style is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleEqualTo(Integer value) {
            addCriterion("repayment_style =", value, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleNotEqualTo(Integer value) {
            addCriterion("repayment_style <>", value, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleGreaterThan(Integer value) {
            addCriterion("repayment_style >", value, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_style >=", value, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleLessThan(Integer value) {
            addCriterion("repayment_style <", value, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_style <=", value, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleIn(List<Integer> values) {
            addCriterion("repayment_style in", values, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleNotIn(List<Integer> values) {
            addCriterion("repayment_style not in", values, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleBetween(Integer value1, Integer value2) {
            addCriterion("repayment_style between", value1, value2, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andRepaymentStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_style not between", value1, value2, "repaymentStyle");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(BigDecimal value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(BigDecimal value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(BigDecimal value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(BigDecimal value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<BigDecimal> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<BigDecimal> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountYesIsNull() {
            addCriterion("account_yes is null");
            return (Criteria) this;
        }

        public Criteria andAccountYesIsNotNull() {
            addCriterion("account_yes is not null");
            return (Criteria) this;
        }

        public Criteria andAccountYesEqualTo(BigDecimal value) {
            addCriterion("account_yes =", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotEqualTo(BigDecimal value) {
            addCriterion("account_yes <>", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesGreaterThan(BigDecimal value) {
            addCriterion("account_yes >", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_yes >=", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesLessThan(BigDecimal value) {
            addCriterion("account_yes <", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_yes <=", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesIn(List<BigDecimal> values) {
            addCriterion("account_yes in", values, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotIn(List<BigDecimal> values) {
            addCriterion("account_yes not in", values, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_yes between", value1, value2, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_yes not between", value1, value2, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAprIsNull() {
            addCriterion("apr is null");
            return (Criteria) this;
        }

        public Criteria andAprIsNotNull() {
            addCriterion("apr is not null");
            return (Criteria) this;
        }

        public Criteria andAprEqualTo(BigDecimal value) {
            addCriterion("apr =", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotEqualTo(BigDecimal value) {
            addCriterion("apr <>", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThan(BigDecimal value) {
            addCriterion("apr >", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apr >=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThan(BigDecimal value) {
            addCriterion("apr <", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apr <=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprIn(List<BigDecimal> values) {
            addCriterion("apr in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotIn(List<BigDecimal> values) {
            addCriterion("apr not in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apr between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apr not between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andNewaprIsNull() {
            addCriterion("newapr is null");
            return (Criteria) this;
        }

        public Criteria andNewaprIsNotNull() {
            addCriterion("newapr is not null");
            return (Criteria) this;
        }

        public Criteria andNewaprEqualTo(BigDecimal value) {
            addCriterion("newapr =", value, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprNotEqualTo(BigDecimal value) {
            addCriterion("newapr <>", value, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprGreaterThan(BigDecimal value) {
            addCriterion("newapr >", value, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("newapr >=", value, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprLessThan(BigDecimal value) {
            addCriterion("newapr <", value, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("newapr <=", value, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprIn(List<BigDecimal> values) {
            addCriterion("newapr in", values, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprNotIn(List<BigDecimal> values) {
            addCriterion("newapr not in", values, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("newapr between", value1, value2, "newapr");
            return (Criteria) this;
        }

        public Criteria andNewaprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("newapr not between", value1, value2, "newapr");
            return (Criteria) this;
        }

        public Criteria andLowestAccountIsNull() {
            addCriterion("lowest_account is null");
            return (Criteria) this;
        }

        public Criteria andLowestAccountIsNotNull() {
            addCriterion("lowest_account is not null");
            return (Criteria) this;
        }

        public Criteria andLowestAccountEqualTo(BigDecimal value) {
            addCriterion("lowest_account =", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotEqualTo(BigDecimal value) {
            addCriterion("lowest_account <>", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountGreaterThan(BigDecimal value) {
            addCriterion("lowest_account >", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowest_account >=", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountLessThan(BigDecimal value) {
            addCriterion("lowest_account <", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowest_account <=", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountIn(List<BigDecimal> values) {
            addCriterion("lowest_account in", values, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotIn(List<BigDecimal> values) {
            addCriterion("lowest_account not in", values, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowest_account between", value1, value2, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowest_account not between", value1, value2, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountIsNull() {
            addCriterion("most_account is null");
            return (Criteria) this;
        }

        public Criteria andMostAccountIsNotNull() {
            addCriterion("most_account is not null");
            return (Criteria) this;
        }

        public Criteria andMostAccountEqualTo(BigDecimal value) {
            addCriterion("most_account =", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotEqualTo(BigDecimal value) {
            addCriterion("most_account <>", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountGreaterThan(BigDecimal value) {
            addCriterion("most_account >", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("most_account >=", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountLessThan(BigDecimal value) {
            addCriterion("most_account <", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("most_account <=", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountIn(List<BigDecimal> values) {
            addCriterion("most_account in", values, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotIn(List<BigDecimal> values) {
            addCriterion("most_account not in", values, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("most_account between", value1, value2, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("most_account not between", value1, value2, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(Integer value) {
            addCriterion("valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(Integer value) {
            addCriterion("valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(Integer value) {
            addCriterion("valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(Integer value) {
            addCriterion("valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(Integer value) {
            addCriterion("valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<Integer> values) {
            addCriterion("valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<Integer> values) {
            addCriterion("valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(Integer value1, Integer value2) {
            addCriterion("valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_time not between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andAwardIsNull() {
            addCriterion("award is null");
            return (Criteria) this;
        }

        public Criteria andAwardIsNotNull() {
            addCriterion("award is not null");
            return (Criteria) this;
        }

        public Criteria andAwardEqualTo(Integer value) {
            addCriterion("award =", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotEqualTo(Integer value) {
            addCriterion("award <>", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThan(Integer value) {
            addCriterion("award >", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("award >=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThan(Integer value) {
            addCriterion("award <", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThanOrEqualTo(Integer value) {
            addCriterion("award <=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardIn(List<Integer> values) {
            addCriterion("award in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotIn(List<Integer> values) {
            addCriterion("award not in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardBetween(Integer value1, Integer value2) {
            addCriterion("award between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotBetween(Integer value1, Integer value2) {
            addCriterion("award not between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andPartAccountIsNull() {
            addCriterion("part_account is null");
            return (Criteria) this;
        }

        public Criteria andPartAccountIsNotNull() {
            addCriterion("part_account is not null");
            return (Criteria) this;
        }

        public Criteria andPartAccountEqualTo(BigDecimal value) {
            addCriterion("part_account =", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotEqualTo(BigDecimal value) {
            addCriterion("part_account <>", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountGreaterThan(BigDecimal value) {
            addCriterion("part_account >", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("part_account >=", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountLessThan(BigDecimal value) {
            addCriterion("part_account <", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("part_account <=", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountIn(List<BigDecimal> values) {
            addCriterion("part_account in", values, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotIn(List<BigDecimal> values) {
            addCriterion("part_account not in", values, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("part_account between", value1, value2, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("part_account not between", value1, value2, "partAccount");
            return (Criteria) this;
        }

        public Criteria andFundsIsNull() {
            addCriterion("funds is null");
            return (Criteria) this;
        }

        public Criteria andFundsIsNotNull() {
            addCriterion("funds is not null");
            return (Criteria) this;
        }

        public Criteria andFundsEqualTo(BigDecimal value) {
            addCriterion("funds =", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotEqualTo(BigDecimal value) {
            addCriterion("funds <>", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsGreaterThan(BigDecimal value) {
            addCriterion("funds >", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("funds >=", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLessThan(BigDecimal value) {
            addCriterion("funds <", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("funds <=", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsIn(List<BigDecimal> values) {
            addCriterion("funds in", values, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotIn(List<BigDecimal> values) {
            addCriterion("funds not in", values, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("funds between", value1, value2, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("funds not between", value1, value2, "funds");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Integer value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Integer value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Integer value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Integer value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Integer value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Integer> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Integer> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Integer value1, Integer value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprIsNull() {
            addCriterion("borrow_fee_apr is null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprIsNotNull() {
            addCriterion("borrow_fee_apr is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprEqualTo(String value) {
            addCriterion("borrow_fee_apr =", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprNotEqualTo(String value) {
            addCriterion("borrow_fee_apr <>", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprGreaterThan(String value) {
            addCriterion("borrow_fee_apr >", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_fee_apr >=", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprLessThan(String value) {
            addCriterion("borrow_fee_apr <", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprLessThanOrEqualTo(String value) {
            addCriterion("borrow_fee_apr <=", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprLike(String value) {
            addCriterion("borrow_fee_apr like", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprNotLike(String value) {
            addCriterion("borrow_fee_apr not like", value, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprIn(List<String> values) {
            addCriterion("borrow_fee_apr in", values, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprNotIn(List<String> values) {
            addCriterion("borrow_fee_apr not in", values, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprBetween(String value1, String value2) {
            addCriterion("borrow_fee_apr between", value1, value2, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprNotBetween(String value1, String value2) {
            addCriterion("borrow_fee_apr not between", value1, value2, "borrowFeeApr");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNull() {
            addCriterion("open_account is null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNotNull() {
            addCriterion("open_account is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountEqualTo(String value) {
            addCriterion("open_account =", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotEqualTo(String value) {
            addCriterion("open_account <>", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThan(String value) {
            addCriterion("open_account >", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThanOrEqualTo(String value) {
            addCriterion("open_account >=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThan(String value) {
            addCriterion("open_account <", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThanOrEqualTo(String value) {
            addCriterion("open_account <=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLike(String value) {
            addCriterion("open_account like", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotLike(String value) {
            addCriterion("open_account not like", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIn(List<String> values) {
            addCriterion("open_account in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotIn(List<String> values) {
            addCriterion("open_account not in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountBetween(String value1, String value2) {
            addCriterion("open_account between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotBetween(String value1, String value2) {
            addCriterion("open_account not between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowIsNull() {
            addCriterion("open_borrow is null");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowIsNotNull() {
            addCriterion("open_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowEqualTo(String value) {
            addCriterion("open_borrow =", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotEqualTo(String value) {
            addCriterion("open_borrow <>", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowGreaterThan(String value) {
            addCriterion("open_borrow >", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowGreaterThanOrEqualTo(String value) {
            addCriterion("open_borrow >=", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowLessThan(String value) {
            addCriterion("open_borrow <", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowLessThanOrEqualTo(String value) {
            addCriterion("open_borrow <=", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowLike(String value) {
            addCriterion("open_borrow like", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotLike(String value) {
            addCriterion("open_borrow not like", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowIn(List<String> values) {
            addCriterion("open_borrow in", values, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotIn(List<String> values) {
            addCriterion("open_borrow not in", values, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowBetween(String value1, String value2) {
            addCriterion("open_borrow between", value1, value2, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotBetween(String value1, String value2) {
            addCriterion("open_borrow not between", value1, value2, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenTenderIsNull() {
            addCriterion("open_tender is null");
            return (Criteria) this;
        }

        public Criteria andOpenTenderIsNotNull() {
            addCriterion("open_tender is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTenderEqualTo(String value) {
            addCriterion("open_tender =", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotEqualTo(String value) {
            addCriterion("open_tender <>", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderGreaterThan(String value) {
            addCriterion("open_tender >", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderGreaterThanOrEqualTo(String value) {
            addCriterion("open_tender >=", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderLessThan(String value) {
            addCriterion("open_tender <", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderLessThanOrEqualTo(String value) {
            addCriterion("open_tender <=", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderLike(String value) {
            addCriterion("open_tender like", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotLike(String value) {
            addCriterion("open_tender not like", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderIn(List<String> values) {
            addCriterion("open_tender in", values, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotIn(List<String> values) {
            addCriterion("open_tender not in", values, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderBetween(String value1, String value2) {
            addCriterion("open_tender between", value1, value2, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotBetween(String value1, String value2) {
            addCriterion("open_tender not between", value1, value2, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenCreditIsNull() {
            addCriterion("open_credit is null");
            return (Criteria) this;
        }

        public Criteria andOpenCreditIsNotNull() {
            addCriterion("open_credit is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCreditEqualTo(String value) {
            addCriterion("open_credit =", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotEqualTo(String value) {
            addCriterion("open_credit <>", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditGreaterThan(String value) {
            addCriterion("open_credit >", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditGreaterThanOrEqualTo(String value) {
            addCriterion("open_credit >=", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditLessThan(String value) {
            addCriterion("open_credit <", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditLessThanOrEqualTo(String value) {
            addCriterion("open_credit <=", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditLike(String value) {
            addCriterion("open_credit like", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotLike(String value) {
            addCriterion("open_credit not like", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditIn(List<String> values) {
            addCriterion("open_credit in", values, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotIn(List<String> values) {
            addCriterion("open_credit not in", values, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditBetween(String value1, String value2) {
            addCriterion("open_credit between", value1, value2, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotBetween(String value1, String value2) {
            addCriterion("open_credit not between", value1, value2, "openCredit");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Integer value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Integer value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Integer value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Integer value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Integer> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Integer> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddipIsNull() {
            addCriterion("addip is null");
            return (Criteria) this;
        }

        public Criteria andAddipIsNotNull() {
            addCriterion("addip is not null");
            return (Criteria) this;
        }

        public Criteria andAddipEqualTo(String value) {
            addCriterion("addip =", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotEqualTo(String value) {
            addCriterion("addip <>", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThan(String value) {
            addCriterion("addip >", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThanOrEqualTo(String value) {
            addCriterion("addip >=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThan(String value) {
            addCriterion("addip <", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThanOrEqualTo(String value) {
            addCriterion("addip <=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLike(String value) {
            addCriterion("addip like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotLike(String value) {
            addCriterion("addip not like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipIn(List<String> values) {
            addCriterion("addip in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotIn(List<String> values) {
            addCriterion("addip not in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipBetween(String value1, String value2) {
            addCriterion("addip between", value1, value2, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotBetween(String value1, String value2) {
            addCriterion("addip not between", value1, value2, "addip");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andFeaturesIsNull() {
            addCriterion("features is null");
            return (Criteria) this;
        }

        public Criteria andFeaturesIsNotNull() {
            addCriterion("features is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturesEqualTo(String value) {
            addCriterion("features =", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesNotEqualTo(String value) {
            addCriterion("features <>", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesGreaterThan(String value) {
            addCriterion("features >", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("features >=", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesLessThan(String value) {
            addCriterion("features <", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesLessThanOrEqualTo(String value) {
            addCriterion("features <=", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesLike(String value) {
            addCriterion("features like", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesNotLike(String value) {
            addCriterion("features not like", value, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesIn(List<String> values) {
            addCriterion("features in", values, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesNotIn(List<String> values) {
            addCriterion("features not in", values, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesBetween(String value1, String value2) {
            addCriterion("features between", value1, value2, "features");
            return (Criteria) this;
        }

        public Criteria andFeaturesNotBetween(String value1, String value2) {
            addCriterion("features not between", value1, value2, "features");
            return (Criteria) this;
        }

        public Criteria andTrustLevelIsNull() {
            addCriterion("trust_level is null");
            return (Criteria) this;
        }

        public Criteria andTrustLevelIsNotNull() {
            addCriterion("trust_level is not null");
            return (Criteria) this;
        }

        public Criteria andTrustLevelEqualTo(String value) {
            addCriterion("trust_level =", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelNotEqualTo(String value) {
            addCriterion("trust_level <>", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelGreaterThan(String value) {
            addCriterion("trust_level >", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelGreaterThanOrEqualTo(String value) {
            addCriterion("trust_level >=", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelLessThan(String value) {
            addCriterion("trust_level <", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelLessThanOrEqualTo(String value) {
            addCriterion("trust_level <=", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelLike(String value) {
            addCriterion("trust_level like", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelNotLike(String value) {
            addCriterion("trust_level not like", value, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelIn(List<String> values) {
            addCriterion("trust_level in", values, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelNotIn(List<String> values) {
            addCriterion("trust_level not in", values, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelBetween(String value1, String value2) {
            addCriterion("trust_level between", value1, value2, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andTrustLevelNotBetween(String value1, String value2) {
            addCriterion("trust_level not between", value1, value2, "trustLevel");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridIsNull() {
            addCriterion("borrower_userid is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridIsNotNull() {
            addCriterion("borrower_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridEqualTo(Integer value) {
            addCriterion("borrower_userid =", value, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridNotEqualTo(Integer value) {
            addCriterion("borrower_userid <>", value, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridGreaterThan(Integer value) {
            addCriterion("borrower_userid >", value, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrower_userid >=", value, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridLessThan(Integer value) {
            addCriterion("borrower_userid <", value, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridLessThanOrEqualTo(Integer value) {
            addCriterion("borrower_userid <=", value, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridIn(List<Integer> values) {
            addCriterion("borrower_userid in", values, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridNotIn(List<Integer> values) {
            addCriterion("borrower_userid not in", values, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridBetween(Integer value1, Integer value2) {
            addCriterion("borrower_userid between", value1, value2, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andBorrowerUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("borrower_userid not between", value1, value2, "borrowerUserid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateipIsNull() {
            addCriterion("updateip is null");
            return (Criteria) this;
        }

        public Criteria andUpdateipIsNotNull() {
            addCriterion("updateip is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateipEqualTo(String value) {
            addCriterion("updateip =", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipNotEqualTo(String value) {
            addCriterion("updateip <>", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipGreaterThan(String value) {
            addCriterion("updateip >", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipGreaterThanOrEqualTo(String value) {
            addCriterion("updateip >=", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipLessThan(String value) {
            addCriterion("updateip <", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipLessThanOrEqualTo(String value) {
            addCriterion("updateip <=", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipLike(String value) {
            addCriterion("updateip like", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipNotLike(String value) {
            addCriterion("updateip not like", value, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipIn(List<String> values) {
            addCriterion("updateip in", values, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipNotIn(List<String> values) {
            addCriterion("updateip not in", values, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipBetween(String value1, String value2) {
            addCriterion("updateip between", value1, value2, "updateip");
            return (Criteria) this;
        }

        public Criteria andUpdateipNotBetween(String value1, String value2) {
            addCriterion("updateip not between", value1, value2, "updateip");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentIsNull() {
            addCriterion("hongbao_percent is null");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentIsNotNull() {
            addCriterion("hongbao_percent is not null");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentEqualTo(BigDecimal value) {
            addCriterion("hongbao_percent =", value, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentNotEqualTo(BigDecimal value) {
            addCriterion("hongbao_percent <>", value, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentGreaterThan(BigDecimal value) {
            addCriterion("hongbao_percent >", value, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hongbao_percent >=", value, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentLessThan(BigDecimal value) {
            addCriterion("hongbao_percent <", value, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hongbao_percent <=", value, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentIn(List<BigDecimal> values) {
            addCriterion("hongbao_percent in", values, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentNotIn(List<BigDecimal> values) {
            addCriterion("hongbao_percent not in", values, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hongbao_percent between", value1, value2, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andHongbaoPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hongbao_percent not between", value1, value2, "hongbaoPercent");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleIsNull() {
            addCriterion("borrow_fee_apr_style is null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleIsNotNull() {
            addCriterion("borrow_fee_apr_style is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleEqualTo(Integer value) {
            addCriterion("borrow_fee_apr_style =", value, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleNotEqualTo(Integer value) {
            addCriterion("borrow_fee_apr_style <>", value, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleGreaterThan(Integer value) {
            addCriterion("borrow_fee_apr_style >", value, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_fee_apr_style >=", value, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleLessThan(Integer value) {
            addCriterion("borrow_fee_apr_style <", value, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_fee_apr_style <=", value, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleIn(List<Integer> values) {
            addCriterion("borrow_fee_apr_style in", values, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleNotIn(List<Integer> values) {
            addCriterion("borrow_fee_apr_style not in", values, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleBetween(Integer value1, Integer value2) {
            addCriterion("borrow_fee_apr_style between", value1, value2, "borrowFeeAprStyle");
            return (Criteria) this;
        }

        public Criteria andBorrowFeeAprStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_fee_apr_style not between", value1, value2, "borrowFeeAprStyle");
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