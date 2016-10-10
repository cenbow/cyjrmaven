package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbUserAccountLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserAccountLogExample() {
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

        public Criteria andIdRelatedIsNull() {
            addCriterion("id_related is null");
            return (Criteria) this;
        }

        public Criteria andIdRelatedIsNotNull() {
            addCriterion("id_related is not null");
            return (Criteria) this;
        }

        public Criteria andIdRelatedEqualTo(Integer value) {
            addCriterion("id_related =", value, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedNotEqualTo(Integer value) {
            addCriterion("id_related <>", value, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedGreaterThan(Integer value) {
            addCriterion("id_related >", value, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_related >=", value, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedLessThan(Integer value) {
            addCriterion("id_related <", value, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedLessThanOrEqualTo(Integer value) {
            addCriterion("id_related <=", value, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedIn(List<Integer> values) {
            addCriterion("id_related in", values, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedNotIn(List<Integer> values) {
            addCriterion("id_related not in", values, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedBetween(Integer value1, Integer value2) {
            addCriterion("id_related between", value1, value2, "idRelated");
            return (Criteria) this;
        }

        public Criteria andIdRelatedNotBetween(Integer value1, Integer value2) {
            addCriterion("id_related not between", value1, value2, "idRelated");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateIsNull() {
            addCriterion("money_operate is null");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateIsNotNull() {
            addCriterion("money_operate is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateEqualTo(BigDecimal value) {
            addCriterion("money_operate =", value, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateNotEqualTo(BigDecimal value) {
            addCriterion("money_operate <>", value, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateGreaterThan(BigDecimal value) {
            addCriterion("money_operate >", value, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_operate >=", value, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateLessThan(BigDecimal value) {
            addCriterion("money_operate <", value, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_operate <=", value, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateIn(List<BigDecimal> values) {
            addCriterion("money_operate in", values, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateNotIn(List<BigDecimal> values) {
            addCriterion("money_operate not in", values, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_operate between", value1, value2, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyOperateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_operate not between", value1, value2, "moneyOperate");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalIsNull() {
            addCriterion("money_total is null");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalIsNotNull() {
            addCriterion("money_total is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalEqualTo(BigDecimal value) {
            addCriterion("money_total =", value, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalNotEqualTo(BigDecimal value) {
            addCriterion("money_total <>", value, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalGreaterThan(BigDecimal value) {
            addCriterion("money_total >", value, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_total >=", value, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalLessThan(BigDecimal value) {
            addCriterion("money_total <", value, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_total <=", value, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalIn(List<BigDecimal> values) {
            addCriterion("money_total in", values, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalNotIn(List<BigDecimal> values) {
            addCriterion("money_total not in", values, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_total between", value1, value2, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_total not between", value1, value2, "moneyTotal");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableIsNull() {
            addCriterion("money_usable is null");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableIsNotNull() {
            addCriterion("money_usable is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableEqualTo(BigDecimal value) {
            addCriterion("money_usable =", value, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableNotEqualTo(BigDecimal value) {
            addCriterion("money_usable <>", value, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableGreaterThan(BigDecimal value) {
            addCriterion("money_usable >", value, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_usable >=", value, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableLessThan(BigDecimal value) {
            addCriterion("money_usable <", value, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_usable <=", value, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableIn(List<BigDecimal> values) {
            addCriterion("money_usable in", values, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableNotIn(List<BigDecimal> values) {
            addCriterion("money_usable not in", values, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_usable between", value1, value2, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyUsableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_usable not between", value1, value2, "moneyUsable");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeIsNull() {
            addCriterion("money_tender_freeze is null");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeIsNotNull() {
            addCriterion("money_tender_freeze is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze =", value, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeNotEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze <>", value, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeGreaterThan(BigDecimal value) {
            addCriterion("money_tender_freeze >", value, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze >=", value, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeLessThan(BigDecimal value) {
            addCriterion("money_tender_freeze <", value, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_tender_freeze <=", value, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeIn(List<BigDecimal> values) {
            addCriterion("money_tender_freeze in", values, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeNotIn(List<BigDecimal> values) {
            addCriterion("money_tender_freeze not in", values, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_tender_freeze between", value1, value2, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyTenderFreezeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_tender_freeze not between", value1, value2, "moneyTenderFreeze");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionIsNull() {
            addCriterion("money_collection is null");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionIsNotNull() {
            addCriterion("money_collection is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionEqualTo(BigDecimal value) {
            addCriterion("money_collection =", value, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionNotEqualTo(BigDecimal value) {
            addCriterion("money_collection <>", value, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionGreaterThan(BigDecimal value) {
            addCriterion("money_collection >", value, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_collection >=", value, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionLessThan(BigDecimal value) {
            addCriterion("money_collection <", value, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_collection <=", value, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionIn(List<BigDecimal> values) {
            addCriterion("money_collection in", values, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionNotIn(List<BigDecimal> values) {
            addCriterion("money_collection not in", values, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_collection between", value1, value2, "moneyCollection");
            return (Criteria) this;
        }

        public Criteria andMoneyCollectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_collection not between", value1, value2, "moneyCollection");
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