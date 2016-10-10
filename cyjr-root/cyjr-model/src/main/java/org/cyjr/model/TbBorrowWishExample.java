package org.cyjr.model;

import java.util.ArrayList;
import java.util.List;

public class TbBorrowWishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBorrowWishExample() {
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

        public Criteria andWishMoneyIsNull() {
            addCriterion("wish_money is null");
            return (Criteria) this;
        }

        public Criteria andWishMoneyIsNotNull() {
            addCriterion("wish_money is not null");
            return (Criteria) this;
        }

        public Criteria andWishMoneyEqualTo(String value) {
            addCriterion("wish_money =", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyNotEqualTo(String value) {
            addCriterion("wish_money <>", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyGreaterThan(String value) {
            addCriterion("wish_money >", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("wish_money >=", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyLessThan(String value) {
            addCriterion("wish_money <", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyLessThanOrEqualTo(String value) {
            addCriterion("wish_money <=", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyLike(String value) {
            addCriterion("wish_money like", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyNotLike(String value) {
            addCriterion("wish_money not like", value, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyIn(List<String> values) {
            addCriterion("wish_money in", values, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyNotIn(List<String> values) {
            addCriterion("wish_money not in", values, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyBetween(String value1, String value2) {
            addCriterion("wish_money between", value1, value2, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishMoneyNotBetween(String value1, String value2) {
            addCriterion("wish_money not between", value1, value2, "wishMoney");
            return (Criteria) this;
        }

        public Criteria andWishAprIsNull() {
            addCriterion("wish_apr is null");
            return (Criteria) this;
        }

        public Criteria andWishAprIsNotNull() {
            addCriterion("wish_apr is not null");
            return (Criteria) this;
        }

        public Criteria andWishAprEqualTo(String value) {
            addCriterion("wish_apr =", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprNotEqualTo(String value) {
            addCriterion("wish_apr <>", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprGreaterThan(String value) {
            addCriterion("wish_apr >", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprGreaterThanOrEqualTo(String value) {
            addCriterion("wish_apr >=", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprLessThan(String value) {
            addCriterion("wish_apr <", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprLessThanOrEqualTo(String value) {
            addCriterion("wish_apr <=", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprLike(String value) {
            addCriterion("wish_apr like", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprNotLike(String value) {
            addCriterion("wish_apr not like", value, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprIn(List<String> values) {
            addCriterion("wish_apr in", values, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprNotIn(List<String> values) {
            addCriterion("wish_apr not in", values, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprBetween(String value1, String value2) {
            addCriterion("wish_apr between", value1, value2, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishAprNotBetween(String value1, String value2) {
            addCriterion("wish_apr not between", value1, value2, "wishApr");
            return (Criteria) this;
        }

        public Criteria andWishTimeIsNull() {
            addCriterion("wish_Time is null");
            return (Criteria) this;
        }

        public Criteria andWishTimeIsNotNull() {
            addCriterion("wish_Time is not null");
            return (Criteria) this;
        }

        public Criteria andWishTimeEqualTo(String value) {
            addCriterion("wish_Time =", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeNotEqualTo(String value) {
            addCriterion("wish_Time <>", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeGreaterThan(String value) {
            addCriterion("wish_Time >", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("wish_Time >=", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeLessThan(String value) {
            addCriterion("wish_Time <", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeLessThanOrEqualTo(String value) {
            addCriterion("wish_Time <=", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeLike(String value) {
            addCriterion("wish_Time like", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeNotLike(String value) {
            addCriterion("wish_Time not like", value, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeIn(List<String> values) {
            addCriterion("wish_Time in", values, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeNotIn(List<String> values) {
            addCriterion("wish_Time not in", values, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeBetween(String value1, String value2) {
            addCriterion("wish_Time between", value1, value2, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishTimeNotBetween(String value1, String value2) {
            addCriterion("wish_Time not between", value1, value2, "wishTime");
            return (Criteria) this;
        }

        public Criteria andWishUseIsNull() {
            addCriterion("wish_use is null");
            return (Criteria) this;
        }

        public Criteria andWishUseIsNotNull() {
            addCriterion("wish_use is not null");
            return (Criteria) this;
        }

        public Criteria andWishUseEqualTo(String value) {
            addCriterion("wish_use =", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseNotEqualTo(String value) {
            addCriterion("wish_use <>", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseGreaterThan(String value) {
            addCriterion("wish_use >", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseGreaterThanOrEqualTo(String value) {
            addCriterion("wish_use >=", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseLessThan(String value) {
            addCriterion("wish_use <", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseLessThanOrEqualTo(String value) {
            addCriterion("wish_use <=", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseLike(String value) {
            addCriterion("wish_use like", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseNotLike(String value) {
            addCriterion("wish_use not like", value, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseIn(List<String> values) {
            addCriterion("wish_use in", values, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseNotIn(List<String> values) {
            addCriterion("wish_use not in", values, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseBetween(String value1, String value2) {
            addCriterion("wish_use between", value1, value2, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishUseNotBetween(String value1, String value2) {
            addCriterion("wish_use not between", value1, value2, "wishUse");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleIsNull() {
            addCriterion("wish_repay_style is null");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleIsNotNull() {
            addCriterion("wish_repay_style is not null");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleEqualTo(String value) {
            addCriterion("wish_repay_style =", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleNotEqualTo(String value) {
            addCriterion("wish_repay_style <>", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleGreaterThan(String value) {
            addCriterion("wish_repay_style >", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleGreaterThanOrEqualTo(String value) {
            addCriterion("wish_repay_style >=", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleLessThan(String value) {
            addCriterion("wish_repay_style <", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleLessThanOrEqualTo(String value) {
            addCriterion("wish_repay_style <=", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleLike(String value) {
            addCriterion("wish_repay_style like", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleNotLike(String value) {
            addCriterion("wish_repay_style not like", value, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleIn(List<String> values) {
            addCriterion("wish_repay_style in", values, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleNotIn(List<String> values) {
            addCriterion("wish_repay_style not in", values, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleBetween(String value1, String value2) {
            addCriterion("wish_repay_style between", value1, value2, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andWishRepayStyleNotBetween(String value1, String value2) {
            addCriterion("wish_repay_style not between", value1, value2, "wishRepayStyle");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhone2IsNull() {
            addCriterion("user_phone2 is null");
            return (Criteria) this;
        }

        public Criteria andUserPhone2IsNotNull() {
            addCriterion("user_phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhone2EqualTo(String value) {
            addCriterion("user_phone2 =", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2NotEqualTo(String value) {
            addCriterion("user_phone2 <>", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2GreaterThan(String value) {
            addCriterion("user_phone2 >", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("user_phone2 >=", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2LessThan(String value) {
            addCriterion("user_phone2 <", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2LessThanOrEqualTo(String value) {
            addCriterion("user_phone2 <=", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2Like(String value) {
            addCriterion("user_phone2 like", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2NotLike(String value) {
            addCriterion("user_phone2 not like", value, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2In(List<String> values) {
            addCriterion("user_phone2 in", values, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2NotIn(List<String> values) {
            addCriterion("user_phone2 not in", values, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2Between(String value1, String value2) {
            addCriterion("user_phone2 between", value1, value2, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserPhone2NotBetween(String value1, String value2) {
            addCriterion("user_phone2 not between", value1, value2, "userPhone2");
            return (Criteria) this;
        }

        public Criteria andUserSecurityIsNull() {
            addCriterion("user_Security is null");
            return (Criteria) this;
        }

        public Criteria andUserSecurityIsNotNull() {
            addCriterion("user_Security is not null");
            return (Criteria) this;
        }

        public Criteria andUserSecurityEqualTo(String value) {
            addCriterion("user_Security =", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityNotEqualTo(String value) {
            addCriterion("user_Security <>", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityGreaterThan(String value) {
            addCriterion("user_Security >", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("user_Security >=", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityLessThan(String value) {
            addCriterion("user_Security <", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityLessThanOrEqualTo(String value) {
            addCriterion("user_Security <=", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityLike(String value) {
            addCriterion("user_Security like", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityNotLike(String value) {
            addCriterion("user_Security not like", value, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityIn(List<String> values) {
            addCriterion("user_Security in", values, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityNotIn(List<String> values) {
            addCriterion("user_Security not in", values, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityBetween(String value1, String value2) {
            addCriterion("user_Security between", value1, value2, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurityNotBetween(String value1, String value2) {
            addCriterion("user_Security not between", value1, value2, "userSecurity");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2IsNull() {
            addCriterion("user_Security2 is null");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2IsNotNull() {
            addCriterion("user_Security2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2EqualTo(String value) {
            addCriterion("user_Security2 =", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2NotEqualTo(String value) {
            addCriterion("user_Security2 <>", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2GreaterThan(String value) {
            addCriterion("user_Security2 >", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2GreaterThanOrEqualTo(String value) {
            addCriterion("user_Security2 >=", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2LessThan(String value) {
            addCriterion("user_Security2 <", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2LessThanOrEqualTo(String value) {
            addCriterion("user_Security2 <=", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2Like(String value) {
            addCriterion("user_Security2 like", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2NotLike(String value) {
            addCriterion("user_Security2 not like", value, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2In(List<String> values) {
            addCriterion("user_Security2 in", values, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2NotIn(List<String> values) {
            addCriterion("user_Security2 not in", values, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2Between(String value1, String value2) {
            addCriterion("user_Security2 between", value1, value2, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserSecurity2NotBetween(String value1, String value2) {
            addCriterion("user_Security2 not between", value1, value2, "userSecurity2");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressIsNull() {
            addCriterion("user_home_address is null");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressIsNotNull() {
            addCriterion("user_home_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressEqualTo(String value) {
            addCriterion("user_home_address =", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotEqualTo(String value) {
            addCriterion("user_home_address <>", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressGreaterThan(String value) {
            addCriterion("user_home_address >", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_home_address >=", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressLessThan(String value) {
            addCriterion("user_home_address <", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("user_home_address <=", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressLike(String value) {
            addCriterion("user_home_address like", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotLike(String value) {
            addCriterion("user_home_address not like", value, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressIn(List<String> values) {
            addCriterion("user_home_address in", values, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotIn(List<String> values) {
            addCriterion("user_home_address not in", values, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressBetween(String value1, String value2) {
            addCriterion("user_home_address between", value1, value2, "userHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUserHomeAddressNotBetween(String value1, String value2) {
            addCriterion("user_home_address not between", value1, value2, "userHomeAddress");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
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