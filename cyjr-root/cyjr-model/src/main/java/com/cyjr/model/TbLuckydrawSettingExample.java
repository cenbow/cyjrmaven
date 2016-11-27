package org.cyjr.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbLuckydrawSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLuckydrawSettingExample() {
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

        public Criteria andLuckyGradeIsNull() {
            addCriterion("lucky_grade is null");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeIsNotNull() {
            addCriterion("lucky_grade is not null");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeEqualTo(Integer value) {
            addCriterion("lucky_grade =", value, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeNotEqualTo(Integer value) {
            addCriterion("lucky_grade <>", value, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeGreaterThan(Integer value) {
            addCriterion("lucky_grade >", value, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lucky_grade >=", value, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeLessThan(Integer value) {
            addCriterion("lucky_grade <", value, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeLessThanOrEqualTo(Integer value) {
            addCriterion("lucky_grade <=", value, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeIn(List<Integer> values) {
            addCriterion("lucky_grade in", values, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeNotIn(List<Integer> values) {
            addCriterion("lucky_grade not in", values, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeBetween(Integer value1, Integer value2) {
            addCriterion("lucky_grade between", value1, value2, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andLuckyGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("lucky_grade not between", value1, value2, "luckyGrade");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNull() {
            addCriterion("probability is null");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNotNull() {
            addCriterion("probability is not null");
            return (Criteria) this;
        }

        public Criteria andProbabilityEqualTo(BigDecimal value) {
            addCriterion("probability =", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotEqualTo(BigDecimal value) {
            addCriterion("probability <>", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThan(BigDecimal value) {
            addCriterion("probability >", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("probability >=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThan(BigDecimal value) {
            addCriterion("probability <", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("probability <=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityIn(List<BigDecimal> values) {
            addCriterion("probability in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotIn(List<BigDecimal> values) {
            addCriterion("probability not in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("probability between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("probability not between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andUsedNumberIsNull() {
            addCriterion("used_number is null");
            return (Criteria) this;
        }

        public Criteria andUsedNumberIsNotNull() {
            addCriterion("used_number is not null");
            return (Criteria) this;
        }

        public Criteria andUsedNumberEqualTo(Integer value) {
            addCriterion("used_number =", value, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberNotEqualTo(Integer value) {
            addCriterion("used_number <>", value, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberGreaterThan(Integer value) {
            addCriterion("used_number >", value, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_number >=", value, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberLessThan(Integer value) {
            addCriterion("used_number <", value, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("used_number <=", value, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberIn(List<Integer> values) {
            addCriterion("used_number in", values, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberNotIn(List<Integer> values) {
            addCriterion("used_number not in", values, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberBetween(Integer value1, Integer value2) {
            addCriterion("used_number between", value1, value2, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andUsedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("used_number not between", value1, value2, "usedNumber");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoIsNull() {
            addCriterion("is_hongbao is null");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoIsNotNull() {
            addCriterion("is_hongbao is not null");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoEqualTo(Integer value) {
            addCriterion("is_hongbao =", value, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoNotEqualTo(Integer value) {
            addCriterion("is_hongbao <>", value, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoGreaterThan(Integer value) {
            addCriterion("is_hongbao >", value, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hongbao >=", value, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoLessThan(Integer value) {
            addCriterion("is_hongbao <", value, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoLessThanOrEqualTo(Integer value) {
            addCriterion("is_hongbao <=", value, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoIn(List<Integer> values) {
            addCriterion("is_hongbao in", values, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoNotIn(List<Integer> values) {
            addCriterion("is_hongbao not in", values, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoBetween(Integer value1, Integer value2) {
            addCriterion("is_hongbao between", value1, value2, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andIsHongbaoNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hongbao not between", value1, value2, "isHongbao");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyIsNull() {
            addCriterion("hongbao_money is null");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyIsNotNull() {
            addCriterion("hongbao_money is not null");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyEqualTo(BigDecimal value) {
            addCriterion("hongbao_money =", value, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyNotEqualTo(BigDecimal value) {
            addCriterion("hongbao_money <>", value, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyGreaterThan(BigDecimal value) {
            addCriterion("hongbao_money >", value, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hongbao_money >=", value, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyLessThan(BigDecimal value) {
            addCriterion("hongbao_money <", value, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hongbao_money <=", value, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyIn(List<BigDecimal> values) {
            addCriterion("hongbao_money in", values, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyNotIn(List<BigDecimal> values) {
            addCriterion("hongbao_money not in", values, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hongbao_money between", value1, value2, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andHongbaoMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hongbao_money not between", value1, value2, "hongbaoMoney");
            return (Criteria) this;
        }

        public Criteria andIsInterestIsNull() {
            addCriterion("is_interest is null");
            return (Criteria) this;
        }

        public Criteria andIsInterestIsNotNull() {
            addCriterion("is_interest is not null");
            return (Criteria) this;
        }

        public Criteria andIsInterestEqualTo(Integer value) {
            addCriterion("is_interest =", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotEqualTo(Integer value) {
            addCriterion("is_interest <>", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestGreaterThan(Integer value) {
            addCriterion("is_interest >", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_interest >=", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLessThan(Integer value) {
            addCriterion("is_interest <", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestLessThanOrEqualTo(Integer value) {
            addCriterion("is_interest <=", value, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestIn(List<Integer> values) {
            addCriterion("is_interest in", values, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotIn(List<Integer> values) {
            addCriterion("is_interest not in", values, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestBetween(Integer value1, Integer value2) {
            addCriterion("is_interest between", value1, value2, "isInterest");
            return (Criteria) this;
        }

        public Criteria andIsInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("is_interest not between", value1, value2, "isInterest");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyIsNull() {
            addCriterion("interest_money is null");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyIsNotNull() {
            addCriterion("interest_money is not null");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyEqualTo(BigDecimal value) {
            addCriterion("interest_money =", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyNotEqualTo(BigDecimal value) {
            addCriterion("interest_money <>", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyGreaterThan(BigDecimal value) {
            addCriterion("interest_money >", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_money >=", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyLessThan(BigDecimal value) {
            addCriterion("interest_money <", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_money <=", value, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyIn(List<BigDecimal> values) {
            addCriterion("interest_money in", values, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyNotIn(List<BigDecimal> values) {
            addCriterion("interest_money not in", values, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_money between", value1, value2, "interestMoney");
            return (Criteria) this;
        }

        public Criteria andInterestMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_money not between", value1, value2, "interestMoney");
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