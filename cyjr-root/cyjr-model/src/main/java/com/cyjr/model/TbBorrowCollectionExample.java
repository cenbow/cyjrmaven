package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbBorrowCollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBorrowCollectionExample() {
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

        public Criteria andColOrderIsNull() {
            addCriterion("col_order is null");
            return (Criteria) this;
        }

        public Criteria andColOrderIsNotNull() {
            addCriterion("col_order is not null");
            return (Criteria) this;
        }

        public Criteria andColOrderEqualTo(Integer value) {
            addCriterion("col_order =", value, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderNotEqualTo(Integer value) {
            addCriterion("col_order <>", value, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderGreaterThan(Integer value) {
            addCriterion("col_order >", value, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("col_order >=", value, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderLessThan(Integer value) {
            addCriterion("col_order <", value, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderLessThanOrEqualTo(Integer value) {
            addCriterion("col_order <=", value, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderIn(List<Integer> values) {
            addCriterion("col_order in", values, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderNotIn(List<Integer> values) {
            addCriterion("col_order not in", values, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderBetween(Integer value1, Integer value2) {
            addCriterion("col_order between", value1, value2, "colOrder");
            return (Criteria) this;
        }

        public Criteria andColOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("col_order not between", value1, value2, "colOrder");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNull() {
            addCriterion("tender_id is null");
            return (Criteria) this;
        }

        public Criteria andTenderIdIsNotNull() {
            addCriterion("tender_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenderIdEqualTo(Integer value) {
            addCriterion("tender_id =", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotEqualTo(Integer value) {
            addCriterion("tender_id <>", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThan(Integer value) {
            addCriterion("tender_id >", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tender_id >=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThan(Integer value) {
            addCriterion("tender_id <", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("tender_id <=", value, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdIn(List<Integer> values) {
            addCriterion("tender_id in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotIn(List<Integer> values) {
            addCriterion("tender_id not in", values, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdBetween(Integer value1, Integer value2) {
            addCriterion("tender_id between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andTenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tender_id not between", value1, value2, "tenderId");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNull() {
            addCriterion("repay_time is null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIsNotNull() {
            addCriterion("repay_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTimeEqualTo(Integer value) {
            addCriterion("repay_time =", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotEqualTo(Integer value) {
            addCriterion("repay_time <>", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThan(Integer value) {
            addCriterion("repay_time >", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_time >=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThan(Integer value) {
            addCriterion("repay_time <", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("repay_time <=", value, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeIn(List<Integer> values) {
            addCriterion("repay_time in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotIn(List<Integer> values) {
            addCriterion("repay_time not in", values, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeBetween(Integer value1, Integer value2) {
            addCriterion("repay_time between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_time not between", value1, value2, "repayTime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeIsNull() {
            addCriterion("repay_yestime is null");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeIsNotNull() {
            addCriterion("repay_yestime is not null");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeEqualTo(Integer value) {
            addCriterion("repay_yestime =", value, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeNotEqualTo(Integer value) {
            addCriterion("repay_yestime <>", value, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeGreaterThan(Integer value) {
            addCriterion("repay_yestime >", value, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_yestime >=", value, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeLessThan(Integer value) {
            addCriterion("repay_yestime <", value, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeLessThanOrEqualTo(Integer value) {
            addCriterion("repay_yestime <=", value, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeIn(List<Integer> values) {
            addCriterion("repay_yestime in", values, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeNotIn(List<Integer> values) {
            addCriterion("repay_yestime not in", values, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeBetween(Integer value1, Integer value2) {
            addCriterion("repay_yestime between", value1, value2, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayYestimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_yestime not between", value1, value2, "repayYestime");
            return (Criteria) this;
        }

        public Criteria andRepayAccountIsNull() {
            addCriterion("repay_account is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountIsNotNull() {
            addCriterion("repay_account is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountEqualTo(BigDecimal value) {
            addCriterion("repay_account =", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotEqualTo(BigDecimal value) {
            addCriterion("repay_account <>", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountGreaterThan(BigDecimal value) {
            addCriterion("repay_account >", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_account >=", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountLessThan(BigDecimal value) {
            addCriterion("repay_account <", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_account <=", value, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountIn(List<BigDecimal> values) {
            addCriterion("repay_account in", values, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotIn(List<BigDecimal> values) {
            addCriterion("repay_account not in", values, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_account between", value1, value2, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_account not between", value1, value2, "repayAccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountIsNull() {
            addCriterion("repay_yesaccount is null");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountIsNotNull() {
            addCriterion("repay_yesaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountEqualTo(BigDecimal value) {
            addCriterion("repay_yesaccount =", value, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountNotEqualTo(BigDecimal value) {
            addCriterion("repay_yesaccount <>", value, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountGreaterThan(BigDecimal value) {
            addCriterion("repay_yesaccount >", value, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_yesaccount >=", value, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountLessThan(BigDecimal value) {
            addCriterion("repay_yesaccount <", value, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_yesaccount <=", value, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountIn(List<BigDecimal> values) {
            addCriterion("repay_yesaccount in", values, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountNotIn(List<BigDecimal> values) {
            addCriterion("repay_yesaccount not in", values, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_yesaccount between", value1, value2, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepayYesaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_yesaccount not between", value1, value2, "repayYesaccount");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(BigDecimal value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(BigDecimal value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(BigDecimal value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(BigDecimal value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<BigDecimal> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<BigDecimal> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andLateDaysIsNull() {
            addCriterion("late_days is null");
            return (Criteria) this;
        }

        public Criteria andLateDaysIsNotNull() {
            addCriterion("late_days is not null");
            return (Criteria) this;
        }

        public Criteria andLateDaysEqualTo(Integer value) {
            addCriterion("late_days =", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysNotEqualTo(Integer value) {
            addCriterion("late_days <>", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysGreaterThan(Integer value) {
            addCriterion("late_days >", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("late_days >=", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysLessThan(Integer value) {
            addCriterion("late_days <", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysLessThanOrEqualTo(Integer value) {
            addCriterion("late_days <=", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysIn(List<Integer> values) {
            addCriterion("late_days in", values, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysNotIn(List<Integer> values) {
            addCriterion("late_days not in", values, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysBetween(Integer value1, Integer value2) {
            addCriterion("late_days between", value1, value2, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("late_days not between", value1, value2, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateInterestIsNull() {
            addCriterion("late_interest is null");
            return (Criteria) this;
        }

        public Criteria andLateInterestIsNotNull() {
            addCriterion("late_interest is not null");
            return (Criteria) this;
        }

        public Criteria andLateInterestEqualTo(BigDecimal value) {
            addCriterion("late_interest =", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotEqualTo(BigDecimal value) {
            addCriterion("late_interest <>", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestGreaterThan(BigDecimal value) {
            addCriterion("late_interest >", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("late_interest >=", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestLessThan(BigDecimal value) {
            addCriterion("late_interest <", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("late_interest <=", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestIn(List<BigDecimal> values) {
            addCriterion("late_interest in", values, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotIn(List<BigDecimal> values) {
            addCriterion("late_interest not in", values, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("late_interest between", value1, value2, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("late_interest not between", value1, value2, "lateInterest");
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

        public Criteria andIsTransferIsNull() {
            addCriterion("is_transfer is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNotNull() {
            addCriterion("is_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferEqualTo(Integer value) {
            addCriterion("is_transfer =", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotEqualTo(Integer value) {
            addCriterion("is_transfer <>", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThan(Integer value) {
            addCriterion("is_transfer >", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_transfer >=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThan(Integer value) {
            addCriterion("is_transfer <", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThanOrEqualTo(Integer value) {
            addCriterion("is_transfer <=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferIn(List<Integer> values) {
            addCriterion("is_transfer in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotIn(List<Integer> values) {
            addCriterion("is_transfer not in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferBetween(Integer value1, Integer value2) {
            addCriterion("is_transfer between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotBetween(Integer value1, Integer value2) {
            addCriterion("is_transfer not between", value1, value2, "isTransfer");
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