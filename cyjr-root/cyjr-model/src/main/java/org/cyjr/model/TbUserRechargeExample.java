package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbUserRechargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserRechargeExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeIsNull() {
            addCriterion("money_recharge is null");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeIsNotNull() {
            addCriterion("money_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeEqualTo(BigDecimal value) {
            addCriterion("money_recharge =", value, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeNotEqualTo(BigDecimal value) {
            addCriterion("money_recharge <>", value, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeGreaterThan(BigDecimal value) {
            addCriterion("money_recharge >", value, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_recharge >=", value, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeLessThan(BigDecimal value) {
            addCriterion("money_recharge <", value, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_recharge <=", value, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeIn(List<BigDecimal> values) {
            addCriterion("money_recharge in", values, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeNotIn(List<BigDecimal> values) {
            addCriterion("money_recharge not in", values, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_recharge between", value1, value2, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andMoneyRechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_recharge not between", value1, value2, "moneyRecharge");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformIsNull() {
            addCriterion("third_platform is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformIsNotNull() {
            addCriterion("third_platform is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformEqualTo(Integer value) {
            addCriterion("third_platform =", value, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformNotEqualTo(Integer value) {
            addCriterion("third_platform <>", value, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformGreaterThan(Integer value) {
            addCriterion("third_platform >", value, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_platform >=", value, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformLessThan(Integer value) {
            addCriterion("third_platform <", value, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("third_platform <=", value, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformIn(List<Integer> values) {
            addCriterion("third_platform in", values, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformNotIn(List<Integer> values) {
            addCriterion("third_platform not in", values, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformBetween(Integer value1, Integer value2) {
            addCriterion("third_platform between", value1, value2, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("third_platform not between", value1, value2, "thirdPlatform");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdIsNull() {
            addCriterion("third_platform_order_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdIsNotNull() {
            addCriterion("third_platform_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdEqualTo(String value) {
            addCriterion("third_platform_order_id =", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdNotEqualTo(String value) {
            addCriterion("third_platform_order_id <>", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdGreaterThan(String value) {
            addCriterion("third_platform_order_id >", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_platform_order_id >=", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdLessThan(String value) {
            addCriterion("third_platform_order_id <", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdLessThanOrEqualTo(String value) {
            addCriterion("third_platform_order_id <=", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdLike(String value) {
            addCriterion("third_platform_order_id like", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdNotLike(String value) {
            addCriterion("third_platform_order_id not like", value, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdIn(List<String> values) {
            addCriterion("third_platform_order_id in", values, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdNotIn(List<String> values) {
            addCriterion("third_platform_order_id not in", values, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdBetween(String value1, String value2) {
            addCriterion("third_platform_order_id between", value1, value2, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdPlatformOrderIdNotBetween(String value1, String value2) {
            addCriterion("third_platform_order_id not between", value1, value2, "thirdPlatformOrderId");
            return (Criteria) this;
        }

        public Criteria andPaySourceIsNull() {
            addCriterion("pay_source is null");
            return (Criteria) this;
        }

        public Criteria andPaySourceIsNotNull() {
            addCriterion("pay_source is not null");
            return (Criteria) this;
        }

        public Criteria andPaySourceEqualTo(String value) {
            addCriterion("pay_source =", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotEqualTo(String value) {
            addCriterion("pay_source <>", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceGreaterThan(String value) {
            addCriterion("pay_source >", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceGreaterThanOrEqualTo(String value) {
            addCriterion("pay_source >=", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceLessThan(String value) {
            addCriterion("pay_source <", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceLessThanOrEqualTo(String value) {
            addCriterion("pay_source <=", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceLike(String value) {
            addCriterion("pay_source like", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotLike(String value) {
            addCriterion("pay_source not like", value, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceIn(List<String> values) {
            addCriterion("pay_source in", values, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotIn(List<String> values) {
            addCriterion("pay_source not in", values, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceBetween(String value1, String value2) {
            addCriterion("pay_source between", value1, value2, "paySource");
            return (Criteria) this;
        }

        public Criteria andPaySourceNotBetween(String value1, String value2) {
            addCriterion("pay_source not between", value1, value2, "paySource");
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

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Integer value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Integer value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Integer value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Integer value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Integer> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Integer> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
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