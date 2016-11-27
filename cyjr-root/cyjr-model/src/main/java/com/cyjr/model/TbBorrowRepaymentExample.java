package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbBorrowRepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBorrowRepaymentExample() {
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

        public Criteria andWebstatusIsNull() {
            addCriterion("webstatus is null");
            return (Criteria) this;
        }

        public Criteria andWebstatusIsNotNull() {
            addCriterion("webstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWebstatusEqualTo(Integer value) {
            addCriterion("webstatus =", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusNotEqualTo(Integer value) {
            addCriterion("webstatus <>", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusGreaterThan(Integer value) {
            addCriterion("webstatus >", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("webstatus >=", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusLessThan(Integer value) {
            addCriterion("webstatus <", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusLessThanOrEqualTo(Integer value) {
            addCriterion("webstatus <=", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusIn(List<Integer> values) {
            addCriterion("webstatus in", values, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusNotIn(List<Integer> values) {
            addCriterion("webstatus not in", values, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusBetween(Integer value1, Integer value2) {
            addCriterion("webstatus between", value1, value2, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("webstatus not between", value1, value2, "webstatus");
            return (Criteria) this;
        }

        public Criteria andRepOrderIsNull() {
            addCriterion("rep_order is null");
            return (Criteria) this;
        }

        public Criteria andRepOrderIsNotNull() {
            addCriterion("rep_order is not null");
            return (Criteria) this;
        }

        public Criteria andRepOrderEqualTo(Integer value) {
            addCriterion("rep_order =", value, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderNotEqualTo(Integer value) {
            addCriterion("rep_order <>", value, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderGreaterThan(Integer value) {
            addCriterion("rep_order >", value, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("rep_order >=", value, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderLessThan(Integer value) {
            addCriterion("rep_order <", value, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderLessThanOrEqualTo(Integer value) {
            addCriterion("rep_order <=", value, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderIn(List<Integer> values) {
            addCriterion("rep_order in", values, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderNotIn(List<Integer> values) {
            addCriterion("rep_order not in", values, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderBetween(Integer value1, Integer value2) {
            addCriterion("rep_order between", value1, value2, "repOrder");
            return (Criteria) this;
        }

        public Criteria andRepOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("rep_order not between", value1, value2, "repOrder");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNull() {
            addCriterion("borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdEqualTo(Integer value) {
            addCriterion("borrow_id =", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotEqualTo(Integer value) {
            addCriterion("borrow_id <>", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThan(Integer value) {
            addCriterion("borrow_id >", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_id >=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThan(Integer value) {
            addCriterion("borrow_id <", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_id <=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIn(List<Integer> values) {
            addCriterion("borrow_id in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotIn(List<Integer> values) {
            addCriterion("borrow_id not in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id not between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIsNull() {
            addCriterion("repayment_time is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIsNotNull() {
            addCriterion("repayment_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeEqualTo(Integer value) {
            addCriterion("repayment_time =", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotEqualTo(Integer value) {
            addCriterion("repayment_time <>", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeGreaterThan(Integer value) {
            addCriterion("repayment_time >", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_time >=", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeLessThan(Integer value) {
            addCriterion("repayment_time <", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_time <=", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIn(List<Integer> values) {
            addCriterion("repayment_time in", values, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotIn(List<Integer> values) {
            addCriterion("repayment_time not in", values, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeBetween(Integer value1, Integer value2) {
            addCriterion("repayment_time between", value1, value2, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_time not between", value1, value2, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeIsNull() {
            addCriterion("repayment_yestime is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeIsNotNull() {
            addCriterion("repayment_yestime is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeEqualTo(Integer value) {
            addCriterion("repayment_yestime =", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeNotEqualTo(Integer value) {
            addCriterion("repayment_yestime <>", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeGreaterThan(Integer value) {
            addCriterion("repayment_yestime >", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_yestime >=", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeLessThan(Integer value) {
            addCriterion("repayment_yestime <", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_yestime <=", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeIn(List<Integer> values) {
            addCriterion("repayment_yestime in", values, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeNotIn(List<Integer> values) {
            addCriterion("repayment_yestime not in", values, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeBetween(Integer value1, Integer value2) {
            addCriterion("repayment_yestime between", value1, value2, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_yestime not between", value1, value2, "repaymentYestime");
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

        public Criteria andForfeitIsNull() {
            addCriterion("forfeit is null");
            return (Criteria) this;
        }

        public Criteria andForfeitIsNotNull() {
            addCriterion("forfeit is not null");
            return (Criteria) this;
        }

        public Criteria andForfeitEqualTo(BigDecimal value) {
            addCriterion("forfeit =", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotEqualTo(BigDecimal value) {
            addCriterion("forfeit <>", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitGreaterThan(BigDecimal value) {
            addCriterion("forfeit >", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("forfeit >=", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLessThan(BigDecimal value) {
            addCriterion("forfeit <", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("forfeit <=", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitIn(List<BigDecimal> values) {
            addCriterion("forfeit in", values, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotIn(List<BigDecimal> values) {
            addCriterion("forfeit not in", values, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("forfeit between", value1, value2, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("forfeit not between", value1, value2, "forfeit");
            return (Criteria) this;
        }

        public Criteria andReminderFeeIsNull() {
            addCriterion("reminder_fee is null");
            return (Criteria) this;
        }

        public Criteria andReminderFeeIsNotNull() {
            addCriterion("reminder_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReminderFeeEqualTo(BigDecimal value) {
            addCriterion("reminder_fee =", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotEqualTo(BigDecimal value) {
            addCriterion("reminder_fee <>", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeGreaterThan(BigDecimal value) {
            addCriterion("reminder_fee >", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reminder_fee >=", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeLessThan(BigDecimal value) {
            addCriterion("reminder_fee <", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reminder_fee <=", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeIn(List<BigDecimal> values) {
            addCriterion("reminder_fee in", values, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotIn(List<BigDecimal> values) {
            addCriterion("reminder_fee not in", values, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reminder_fee between", value1, value2, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reminder_fee not between", value1, value2, "reminderFee");
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

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoIsNull() {
            addCriterion("inner_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoIsNotNull() {
            addCriterion("inner_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoEqualTo(String value) {
            addCriterion("inner_trade_no =", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoNotEqualTo(String value) {
            addCriterion("inner_trade_no <>", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoGreaterThan(String value) {
            addCriterion("inner_trade_no >", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("inner_trade_no >=", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoLessThan(String value) {
            addCriterion("inner_trade_no <", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoLessThanOrEqualTo(String value) {
            addCriterion("inner_trade_no <=", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoLike(String value) {
            addCriterion("inner_trade_no like", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoNotLike(String value) {
            addCriterion("inner_trade_no not like", value, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoIn(List<String> values) {
            addCriterion("inner_trade_no in", values, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoNotIn(List<String> values) {
            addCriterion("inner_trade_no not in", values, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoBetween(String value1, String value2) {
            addCriterion("inner_trade_no between", value1, value2, "innerTradeNo");
            return (Criteria) this;
        }

        public Criteria andInnerTradeNoNotBetween(String value1, String value2) {
            addCriterion("inner_trade_no not between", value1, value2, "innerTradeNo");
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