package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BorrowTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowTransferExample() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andBorrowidIsNull() {
            addCriterion("borrowId is null");
            return (Criteria) this;
        }

        public Criteria andBorrowidIsNotNull() {
            addCriterion("borrowId is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowidEqualTo(Integer value) {
            addCriterion("borrowId =", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotEqualTo(Integer value) {
            addCriterion("borrowId <>", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThan(Integer value) {
            addCriterion("borrowId >", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrowId >=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThan(Integer value) {
            addCriterion("borrowId <", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidLessThanOrEqualTo(Integer value) {
            addCriterion("borrowId <=", value, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidIn(List<Integer> values) {
            addCriterion("borrowId in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotIn(List<Integer> values) {
            addCriterion("borrowId not in", values, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidBetween(Integer value1, Integer value2) {
            addCriterion("borrowId between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andBorrowidNotBetween(Integer value1, Integer value2) {
            addCriterion("borrowId not between", value1, value2, "borrowid");
            return (Criteria) this;
        }

        public Criteria andTenderidIsNull() {
            addCriterion("tenderId is null");
            return (Criteria) this;
        }

        public Criteria andTenderidIsNotNull() {
            addCriterion("tenderId is not null");
            return (Criteria) this;
        }

        public Criteria andTenderidEqualTo(Integer value) {
            addCriterion("tenderId =", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotEqualTo(Integer value) {
            addCriterion("tenderId <>", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidGreaterThan(Integer value) {
            addCriterion("tenderId >", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tenderId >=", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidLessThan(Integer value) {
            addCriterion("tenderId <", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidLessThanOrEqualTo(Integer value) {
            addCriterion("tenderId <=", value, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidIn(List<Integer> values) {
            addCriterion("tenderId in", values, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotIn(List<Integer> values) {
            addCriterion("tenderId not in", values, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidBetween(Integer value1, Integer value2) {
            addCriterion("tenderId between", value1, value2, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderidNotBetween(Integer value1, Integer value2) {
            addCriterion("tenderId not between", value1, value2, "tenderid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridIsNull() {
            addCriterion("tenderUserId is null");
            return (Criteria) this;
        }

        public Criteria andTenderuseridIsNotNull() {
            addCriterion("tenderUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTenderuseridEqualTo(Integer value) {
            addCriterion("tenderUserId =", value, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridNotEqualTo(Integer value) {
            addCriterion("tenderUserId <>", value, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridGreaterThan(Integer value) {
            addCriterion("tenderUserId >", value, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("tenderUserId >=", value, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridLessThan(Integer value) {
            addCriterion("tenderUserId <", value, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridLessThanOrEqualTo(Integer value) {
            addCriterion("tenderUserId <=", value, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridIn(List<Integer> values) {
            addCriterion("tenderUserId in", values, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridNotIn(List<Integer> values) {
            addCriterion("tenderUserId not in", values, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridBetween(Integer value1, Integer value2) {
            addCriterion("tenderUserId between", value1, value2, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTenderuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("tenderUserId not between", value1, value2, "tenderuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridIsNull() {
            addCriterion("transfereeUserId is null");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridIsNotNull() {
            addCriterion("transfereeUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridEqualTo(Integer value) {
            addCriterion("transfereeUserId =", value, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridNotEqualTo(Integer value) {
            addCriterion("transfereeUserId <>", value, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridGreaterThan(Integer value) {
            addCriterion("transfereeUserId >", value, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("transfereeUserId >=", value, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridLessThan(Integer value) {
            addCriterion("transfereeUserId <", value, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridLessThanOrEqualTo(Integer value) {
            addCriterion("transfereeUserId <=", value, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridIn(List<Integer> values) {
            addCriterion("transfereeUserId in", values, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridNotIn(List<Integer> values) {
            addCriterion("transfereeUserId not in", values, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridBetween(Integer value1, Integer value2) {
            addCriterion("transfereeUserId between", value1, value2, "transfereeuserid");
            return (Criteria) this;
        }

        public Criteria andTransfereeuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("transfereeUserId not between", value1, value2, "transfereeuserid");
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

        public Criteria andCollectmoneyIsNull() {
            addCriterion("collectMoney is null");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyIsNotNull() {
            addCriterion("collectMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyEqualTo(String value) {
            addCriterion("collectMoney =", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyNotEqualTo(String value) {
            addCriterion("collectMoney <>", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyGreaterThan(String value) {
            addCriterion("collectMoney >", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("collectMoney >=", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyLessThan(String value) {
            addCriterion("collectMoney <", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyLessThanOrEqualTo(String value) {
            addCriterion("collectMoney <=", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyLike(String value) {
            addCriterion("collectMoney like", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyNotLike(String value) {
            addCriterion("collectMoney not like", value, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyIn(List<String> values) {
            addCriterion("collectMoney in", values, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyNotIn(List<String> values) {
            addCriterion("collectMoney not in", values, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyBetween(String value1, String value2) {
            addCriterion("collectMoney between", value1, value2, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andCollectmoneyNotBetween(String value1, String value2) {
            addCriterion("collectMoney not between", value1, value2, "collectmoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyIsNull() {
            addCriterion("transferMoney is null");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyIsNotNull() {
            addCriterion("transferMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyEqualTo(String value) {
            addCriterion("transferMoney =", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyNotEqualTo(String value) {
            addCriterion("transferMoney <>", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyGreaterThan(String value) {
            addCriterion("transferMoney >", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyGreaterThanOrEqualTo(String value) {
            addCriterion("transferMoney >=", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyLessThan(String value) {
            addCriterion("transferMoney <", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyLessThanOrEqualTo(String value) {
            addCriterion("transferMoney <=", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyLike(String value) {
            addCriterion("transferMoney like", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyNotLike(String value) {
            addCriterion("transferMoney not like", value, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyIn(List<String> values) {
            addCriterion("transferMoney in", values, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyNotIn(List<String> values) {
            addCriterion("transferMoney not in", values, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyBetween(String value1, String value2) {
            addCriterion("transferMoney between", value1, value2, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransfermoneyNotBetween(String value1, String value2) {
            addCriterion("transferMoney not between", value1, value2, "transfermoney");
            return (Criteria) this;
        }

        public Criteria andTransferfeeIsNull() {
            addCriterion("transferFee is null");
            return (Criteria) this;
        }

        public Criteria andTransferfeeIsNotNull() {
            addCriterion("transferFee is not null");
            return (Criteria) this;
        }

        public Criteria andTransferfeeEqualTo(BigDecimal value) {
            addCriterion("transferFee =", value, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeNotEqualTo(BigDecimal value) {
            addCriterion("transferFee <>", value, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeGreaterThan(BigDecimal value) {
            addCriterion("transferFee >", value, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("transferFee >=", value, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeLessThan(BigDecimal value) {
            addCriterion("transferFee <", value, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("transferFee <=", value, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeIn(List<BigDecimal> values) {
            addCriterion("transferFee in", values, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeNotIn(List<BigDecimal> values) {
            addCriterion("transferFee not in", values, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transferFee between", value1, value2, "transferfee");
            return (Criteria) this;
        }

        public Criteria andTransferfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("transferFee not between", value1, value2, "transferfee");
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

        public Criteria andLeaveinterestIsNull() {
            addCriterion("leaveInterest is null");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestIsNotNull() {
            addCriterion("leaveInterest is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestEqualTo(BigDecimal value) {
            addCriterion("leaveInterest =", value, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestNotEqualTo(BigDecimal value) {
            addCriterion("leaveInterest <>", value, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestGreaterThan(BigDecimal value) {
            addCriterion("leaveInterest >", value, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("leaveInterest >=", value, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestLessThan(BigDecimal value) {
            addCriterion("leaveInterest <", value, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("leaveInterest <=", value, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestIn(List<BigDecimal> values) {
            addCriterion("leaveInterest in", values, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestNotIn(List<BigDecimal> values) {
            addCriterion("leaveInterest not in", values, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("leaveInterest between", value1, value2, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andLeaveinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("leaveInterest not between", value1, value2, "leaveinterest");
            return (Criteria) this;
        }

        public Criteria andTransferdayIsNull() {
            addCriterion("transferDay is null");
            return (Criteria) this;
        }

        public Criteria andTransferdayIsNotNull() {
            addCriterion("transferDay is not null");
            return (Criteria) this;
        }

        public Criteria andTransferdayEqualTo(String value) {
            addCriterion("transferDay =", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayNotEqualTo(String value) {
            addCriterion("transferDay <>", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayGreaterThan(String value) {
            addCriterion("transferDay >", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayGreaterThanOrEqualTo(String value) {
            addCriterion("transferDay >=", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayLessThan(String value) {
            addCriterion("transferDay <", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayLessThanOrEqualTo(String value) {
            addCriterion("transferDay <=", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayLike(String value) {
            addCriterion("transferDay like", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayNotLike(String value) {
            addCriterion("transferDay not like", value, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayIn(List<String> values) {
            addCriterion("transferDay in", values, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayNotIn(List<String> values) {
            addCriterion("transferDay not in", values, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayBetween(String value1, String value2) {
            addCriterion("transferDay between", value1, value2, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferdayNotBetween(String value1, String value2) {
            addCriterion("transferDay not between", value1, value2, "transferday");
            return (Criteria) this;
        }

        public Criteria andTransferaprIsNull() {
            addCriterion("transferApr is null");
            return (Criteria) this;
        }

        public Criteria andTransferaprIsNotNull() {
            addCriterion("transferApr is not null");
            return (Criteria) this;
        }

        public Criteria andTransferaprEqualTo(String value) {
            addCriterion("transferApr =", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprNotEqualTo(String value) {
            addCriterion("transferApr <>", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprGreaterThan(String value) {
            addCriterion("transferApr >", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprGreaterThanOrEqualTo(String value) {
            addCriterion("transferApr >=", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprLessThan(String value) {
            addCriterion("transferApr <", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprLessThanOrEqualTo(String value) {
            addCriterion("transferApr <=", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprLike(String value) {
            addCriterion("transferApr like", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprNotLike(String value) {
            addCriterion("transferApr not like", value, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprIn(List<String> values) {
            addCriterion("transferApr in", values, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprNotIn(List<String> values) {
            addCriterion("transferApr not in", values, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprBetween(String value1, String value2) {
            addCriterion("transferApr between", value1, value2, "transferapr");
            return (Criteria) this;
        }

        public Criteria andTransferaprNotBetween(String value1, String value2) {
            addCriterion("transferApr not between", value1, value2, "transferapr");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
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