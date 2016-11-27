package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbBorrowTenderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBorrowTenderExample() {
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
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

        public Criteria andWaitAccountIsNull() {
            addCriterion("wait_account is null");
            return (Criteria) this;
        }

        public Criteria andWaitAccountIsNotNull() {
            addCriterion("wait_account is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAccountEqualTo(BigDecimal value) {
            addCriterion("wait_account =", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotEqualTo(BigDecimal value) {
            addCriterion("wait_account <>", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountGreaterThan(BigDecimal value) {
            addCriterion("wait_account >", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_account >=", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountLessThan(BigDecimal value) {
            addCriterion("wait_account <", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_account <=", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountIn(List<BigDecimal> values) {
            addCriterion("wait_account in", values, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotIn(List<BigDecimal> values) {
            addCriterion("wait_account not in", values, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_account between", value1, value2, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_account not between", value1, value2, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitInterestIsNull() {
            addCriterion("wait_interest is null");
            return (Criteria) this;
        }

        public Criteria andWaitInterestIsNotNull() {
            addCriterion("wait_interest is not null");
            return (Criteria) this;
        }

        public Criteria andWaitInterestEqualTo(BigDecimal value) {
            addCriterion("wait_interest =", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotEqualTo(BigDecimal value) {
            addCriterion("wait_interest <>", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestGreaterThan(BigDecimal value) {
            addCriterion("wait_interest >", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_interest >=", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestLessThan(BigDecimal value) {
            addCriterion("wait_interest <", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_interest <=", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestIn(List<BigDecimal> values) {
            addCriterion("wait_interest in", values, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotIn(List<BigDecimal> values) {
            addCriterion("wait_interest not in", values, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_interest between", value1, value2, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_interest not between", value1, value2, "waitInterest");
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

        public Criteria andPlanHidsIsNull() {
            addCriterion("plan_hids is null");
            return (Criteria) this;
        }

        public Criteria andPlanHidsIsNotNull() {
            addCriterion("plan_hids is not null");
            return (Criteria) this;
        }

        public Criteria andPlanHidsEqualTo(String value) {
            addCriterion("plan_hids =", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsNotEqualTo(String value) {
            addCriterion("plan_hids <>", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsGreaterThan(String value) {
            addCriterion("plan_hids >", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsGreaterThanOrEqualTo(String value) {
            addCriterion("plan_hids >=", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsLessThan(String value) {
            addCriterion("plan_hids <", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsLessThanOrEqualTo(String value) {
            addCriterion("plan_hids <=", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsLike(String value) {
            addCriterion("plan_hids like", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsNotLike(String value) {
            addCriterion("plan_hids not like", value, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsIn(List<String> values) {
            addCriterion("plan_hids in", values, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsNotIn(List<String> values) {
            addCriterion("plan_hids not in", values, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsBetween(String value1, String value2) {
            addCriterion("plan_hids between", value1, value2, "planHids");
            return (Criteria) this;
        }

        public Criteria andPlanHidsNotBetween(String value1, String value2) {
            addCriterion("plan_hids not between", value1, value2, "planHids");
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