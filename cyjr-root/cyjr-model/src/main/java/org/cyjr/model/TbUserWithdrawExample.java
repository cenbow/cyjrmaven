package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbUserWithdrawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserWithdrawExample() {
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

        public Criteria andMoneyWithdrawIsNull() {
            addCriterion("money_withdraw is null");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawIsNotNull() {
            addCriterion("money_withdraw is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawEqualTo(BigDecimal value) {
            addCriterion("money_withdraw =", value, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawNotEqualTo(BigDecimal value) {
            addCriterion("money_withdraw <>", value, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawGreaterThan(BigDecimal value) {
            addCriterion("money_withdraw >", value, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_withdraw >=", value, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawLessThan(BigDecimal value) {
            addCriterion("money_withdraw <", value, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_withdraw <=", value, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawIn(List<BigDecimal> values) {
            addCriterion("money_withdraw in", values, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawNotIn(List<BigDecimal> values) {
            addCriterion("money_withdraw not in", values, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_withdraw between", value1, value2, "moneyWithdraw");
            return (Criteria) this;
        }

        public Criteria andMoneyWithdrawNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_withdraw not between", value1, value2, "moneyWithdraw");
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

        public Criteria andTradeOrderIsNull() {
            addCriterion("trade_order is null");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIsNotNull() {
            addCriterion("trade_order is not null");
            return (Criteria) this;
        }

        public Criteria andTradeOrderEqualTo(String value) {
            addCriterion("trade_order =", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNotEqualTo(String value) {
            addCriterion("trade_order <>", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderGreaterThan(String value) {
            addCriterion("trade_order >", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderGreaterThanOrEqualTo(String value) {
            addCriterion("trade_order >=", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderLessThan(String value) {
            addCriterion("trade_order <", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderLessThanOrEqualTo(String value) {
            addCriterion("trade_order <=", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderLike(String value) {
            addCriterion("trade_order like", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNotLike(String value) {
            addCriterion("trade_order not like", value, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderIn(List<String> values) {
            addCriterion("trade_order in", values, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNotIn(List<String> values) {
            addCriterion("trade_order not in", values, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderBetween(String value1, String value2) {
            addCriterion("trade_order between", value1, value2, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTradeOrderNotBetween(String value1, String value2) {
            addCriterion("trade_order not between", value1, value2, "tradeOrder");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkIsNull() {
            addCriterion("trust_remark is null");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkIsNotNull() {
            addCriterion("trust_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkEqualTo(String value) {
            addCriterion("trust_remark =", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkNotEqualTo(String value) {
            addCriterion("trust_remark <>", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkGreaterThan(String value) {
            addCriterion("trust_remark >", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("trust_remark >=", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkLessThan(String value) {
            addCriterion("trust_remark <", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkLessThanOrEqualTo(String value) {
            addCriterion("trust_remark <=", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkLike(String value) {
            addCriterion("trust_remark like", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkNotLike(String value) {
            addCriterion("trust_remark not like", value, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkIn(List<String> values) {
            addCriterion("trust_remark in", values, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkNotIn(List<String> values) {
            addCriterion("trust_remark not in", values, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkBetween(String value1, String value2) {
            addCriterion("trust_remark between", value1, value2, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustRemarkNotBetween(String value1, String value2) {
            addCriterion("trust_remark not between", value1, value2, "trustRemark");
            return (Criteria) this;
        }

        public Criteria andTrustStatusIsNull() {
            addCriterion("trust_status is null");
            return (Criteria) this;
        }

        public Criteria andTrustStatusIsNotNull() {
            addCriterion("trust_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrustStatusEqualTo(Integer value) {
            addCriterion("trust_status =", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotEqualTo(Integer value) {
            addCriterion("trust_status <>", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusGreaterThan(Integer value) {
            addCriterion("trust_status >", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("trust_status >=", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusLessThan(Integer value) {
            addCriterion("trust_status <", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusLessThanOrEqualTo(Integer value) {
            addCriterion("trust_status <=", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusIn(List<Integer> values) {
            addCriterion("trust_status in", values, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotIn(List<Integer> values) {
            addCriterion("trust_status not in", values, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusBetween(Integer value1, Integer value2) {
            addCriterion("trust_status between", value1, value2, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("trust_status not between", value1, value2, "trustStatus");
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