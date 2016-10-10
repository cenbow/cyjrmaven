package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbMarketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMarketExample() {
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

        public Criteria andTenderUserIdIsNull() {
            addCriterion("tender_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdIsNotNull() {
            addCriterion("tender_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdEqualTo(Integer value) {
            addCriterion("tender_user_id =", value, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdNotEqualTo(Integer value) {
            addCriterion("tender_user_id <>", value, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdGreaterThan(Integer value) {
            addCriterion("tender_user_id >", value, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tender_user_id >=", value, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdLessThan(Integer value) {
            addCriterion("tender_user_id <", value, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("tender_user_id <=", value, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdIn(List<Integer> values) {
            addCriterion("tender_user_id in", values, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdNotIn(List<Integer> values) {
            addCriterion("tender_user_id not in", values, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("tender_user_id between", value1, value2, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tender_user_id not between", value1, value2, "tenderUserId");
            return (Criteria) this;
        }

        public Criteria andTenderPriceIsNull() {
            addCriterion("tender_price is null");
            return (Criteria) this;
        }

        public Criteria andTenderPriceIsNotNull() {
            addCriterion("tender_price is not null");
            return (Criteria) this;
        }

        public Criteria andTenderPriceEqualTo(BigDecimal value) {
            addCriterion("tender_price =", value, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceNotEqualTo(BigDecimal value) {
            addCriterion("tender_price <>", value, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceGreaterThan(BigDecimal value) {
            addCriterion("tender_price >", value, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_price >=", value, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceLessThan(BigDecimal value) {
            addCriterion("tender_price <", value, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tender_price <=", value, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceIn(List<BigDecimal> values) {
            addCriterion("tender_price in", values, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceNotIn(List<BigDecimal> values) {
            addCriterion("tender_price not in", values, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_price between", value1, value2, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTenderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tender_price not between", value1, value2, "tenderPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceIsNull() {
            addCriterion("transfer_price is null");
            return (Criteria) this;
        }

        public Criteria andTransferPriceIsNotNull() {
            addCriterion("transfer_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransferPriceEqualTo(BigDecimal value) {
            addCriterion("transfer_price =", value, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceNotEqualTo(BigDecimal value) {
            addCriterion("transfer_price <>", value, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceGreaterThan(BigDecimal value) {
            addCriterion("transfer_price >", value, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_price >=", value, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceLessThan(BigDecimal value) {
            addCriterion("transfer_price <", value, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transfer_price <=", value, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceIn(List<BigDecimal> values) {
            addCriterion("transfer_price in", values, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceNotIn(List<BigDecimal> values) {
            addCriterion("transfer_price not in", values, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_price between", value1, value2, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andTransferPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transfer_price not between", value1, value2, "transferPrice");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyIsNull() {
            addCriterion("collection_money is null");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyIsNotNull() {
            addCriterion("collection_money is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyEqualTo(BigDecimal value) {
            addCriterion("collection_money =", value, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("collection_money <>", value, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyGreaterThan(BigDecimal value) {
            addCriterion("collection_money >", value, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_money >=", value, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyLessThan(BigDecimal value) {
            addCriterion("collection_money <", value, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collection_money <=", value, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyIn(List<BigDecimal> values) {
            addCriterion("collection_money in", values, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("collection_money not in", values, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_money between", value1, value2, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection_money not between", value1, value2, "collectionMoney");
            return (Criteria) this;
        }

        public Criteria andRepayOrderIsNull() {
            addCriterion("repay_order is null");
            return (Criteria) this;
        }

        public Criteria andRepayOrderIsNotNull() {
            addCriterion("repay_order is not null");
            return (Criteria) this;
        }

        public Criteria andRepayOrderEqualTo(Integer value) {
            addCriterion("repay_order =", value, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderNotEqualTo(Integer value) {
            addCriterion("repay_order <>", value, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderGreaterThan(Integer value) {
            addCriterion("repay_order >", value, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_order >=", value, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderLessThan(Integer value) {
            addCriterion("repay_order <", value, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("repay_order <=", value, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderIn(List<Integer> values) {
            addCriterion("repay_order in", values, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderNotIn(List<Integer> values) {
            addCriterion("repay_order not in", values, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderBetween(Integer value1, Integer value2) {
            addCriterion("repay_order between", value1, value2, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_order not between", value1, value2, "repayOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderIsNull() {
            addCriterion("repay_total_order is null");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderIsNotNull() {
            addCriterion("repay_total_order is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderEqualTo(Integer value) {
            addCriterion("repay_total_order =", value, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderNotEqualTo(Integer value) {
            addCriterion("repay_total_order <>", value, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderGreaterThan(Integer value) {
            addCriterion("repay_total_order >", value, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_total_order >=", value, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderLessThan(Integer value) {
            addCriterion("repay_total_order <", value, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderLessThanOrEqualTo(Integer value) {
            addCriterion("repay_total_order <=", value, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderIn(List<Integer> values) {
            addCriterion("repay_total_order in", values, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderNotIn(List<Integer> values) {
            addCriterion("repay_total_order not in", values, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderBetween(Integer value1, Integer value2) {
            addCriterion("repay_total_order between", value1, value2, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andRepayTotalOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_total_order not between", value1, value2, "repayTotalOrder");
            return (Criteria) this;
        }

        public Criteria andBorrowAprIsNull() {
            addCriterion("borrow_apr is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAprIsNotNull() {
            addCriterion("borrow_apr is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAprEqualTo(BigDecimal value) {
            addCriterion("borrow_apr =", value, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprNotEqualTo(BigDecimal value) {
            addCriterion("borrow_apr <>", value, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprGreaterThan(BigDecimal value) {
            addCriterion("borrow_apr >", value, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_apr >=", value, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprLessThan(BigDecimal value) {
            addCriterion("borrow_apr <", value, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_apr <=", value, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprIn(List<BigDecimal> values) {
            addCriterion("borrow_apr in", values, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprNotIn(List<BigDecimal> values) {
            addCriterion("borrow_apr not in", values, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_apr between", value1, value2, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowAprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_apr not between", value1, value2, "borrowApr");
            return (Criteria) this;
        }

        public Criteria andBorrowNameIsNull() {
            addCriterion("borrow_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowNameIsNotNull() {
            addCriterion("borrow_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowNameEqualTo(String value) {
            addCriterion("borrow_name =", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotEqualTo(String value) {
            addCriterion("borrow_name <>", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameGreaterThan(String value) {
            addCriterion("borrow_name >", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_name >=", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameLessThan(String value) {
            addCriterion("borrow_name <", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameLessThanOrEqualTo(String value) {
            addCriterion("borrow_name <=", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameLike(String value) {
            addCriterion("borrow_name like", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotLike(String value) {
            addCriterion("borrow_name not like", value, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameIn(List<String> values) {
            addCriterion("borrow_name in", values, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotIn(List<String> values) {
            addCriterion("borrow_name not in", values, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameBetween(String value1, String value2) {
            addCriterion("borrow_name between", value1, value2, "borrowName");
            return (Criteria) this;
        }

        public Criteria andBorrowNameNotBetween(String value1, String value2) {
            addCriterion("borrow_name not between", value1, value2, "borrowName");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysIsNull() {
            addCriterion("remaining_days is null");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysIsNotNull() {
            addCriterion("remaining_days is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysEqualTo(Integer value) {
            addCriterion("remaining_days =", value, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysNotEqualTo(Integer value) {
            addCriterion("remaining_days <>", value, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysGreaterThan(Integer value) {
            addCriterion("remaining_days >", value, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining_days >=", value, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysLessThan(Integer value) {
            addCriterion("remaining_days <", value, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysLessThanOrEqualTo(Integer value) {
            addCriterion("remaining_days <=", value, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysIn(List<Integer> values) {
            addCriterion("remaining_days in", values, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysNotIn(List<Integer> values) {
            addCriterion("remaining_days not in", values, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysBetween(Integer value1, Integer value2) {
            addCriterion("remaining_days between", value1, value2, "remainingDays");
            return (Criteria) this;
        }

        public Criteria andRemainingDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining_days not between", value1, value2, "remainingDays");
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

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Integer value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Integer value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Integer value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Integer value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Integer value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Integer> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Integer> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Integer value1, Integer value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Integer value1, Integer value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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