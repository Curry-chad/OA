package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.List;

public class ProjectCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectCostExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2019-05-01
     */
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

        public Criteria andCostIdIsNull() {
            addCriterion("cost_id is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(String value) {
            addCriterion("cost_id =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(String value) {
            addCriterion("cost_id <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(String value) {
            addCriterion("cost_id >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(String value) {
            addCriterion("cost_id >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(String value) {
            addCriterion("cost_id <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(String value) {
            addCriterion("cost_id <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLike(String value) {
            addCriterion("cost_id like", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotLike(String value) {
            addCriterion("cost_id not like", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<String> values) {
            addCriterion("cost_id in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<String> values) {
            addCriterion("cost_id not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(String value1, String value2) {
            addCriterion("cost_id between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(String value1, String value2) {
            addCriterion("cost_id not between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNull() {
            addCriterion("main_id is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("main_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(String value) {
            addCriterion("main_id =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(String value) {
            addCriterion("main_id <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(String value) {
            addCriterion("main_id >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("main_id >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(String value) {
            addCriterion("main_id <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(String value) {
            addCriterion("main_id <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLike(String value) {
            addCriterion("main_id like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotLike(String value) {
            addCriterion("main_id not like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<String> values) {
            addCriterion("main_id in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<String> values) {
            addCriterion("main_id not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(String value1, String value2) {
            addCriterion("main_id between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(String value1, String value2) {
            addCriterion("main_id not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andCostExpectIsNull() {
            addCriterion("cost_expect is null");
            return (Criteria) this;
        }

        public Criteria andCostExpectIsNotNull() {
            addCriterion("cost_expect is not null");
            return (Criteria) this;
        }

        public Criteria andCostExpectEqualTo(Double value) {
            addCriterion("cost_expect =", value, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectNotEqualTo(Double value) {
            addCriterion("cost_expect <>", value, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectGreaterThan(Double value) {
            addCriterion("cost_expect >", value, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_expect >=", value, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectLessThan(Double value) {
            addCriterion("cost_expect <", value, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectLessThanOrEqualTo(Double value) {
            addCriterion("cost_expect <=", value, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectIn(List<Double> values) {
            addCriterion("cost_expect in", values, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectNotIn(List<Double> values) {
            addCriterion("cost_expect not in", values, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectBetween(Double value1, Double value2) {
            addCriterion("cost_expect between", value1, value2, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostExpectNotBetween(Double value1, Double value2) {
            addCriterion("cost_expect not between", value1, value2, "costExpect");
            return (Criteria) this;
        }

        public Criteria andCostFactIsNull() {
            addCriterion("cost_fact is null");
            return (Criteria) this;
        }

        public Criteria andCostFactIsNotNull() {
            addCriterion("cost_fact is not null");
            return (Criteria) this;
        }

        public Criteria andCostFactEqualTo(Double value) {
            addCriterion("cost_fact =", value, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactNotEqualTo(Double value) {
            addCriterion("cost_fact <>", value, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactGreaterThan(Double value) {
            addCriterion("cost_fact >", value, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_fact >=", value, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactLessThan(Double value) {
            addCriterion("cost_fact <", value, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactLessThanOrEqualTo(Double value) {
            addCriterion("cost_fact <=", value, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactIn(List<Double> values) {
            addCriterion("cost_fact in", values, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactNotIn(List<Double> values) {
            addCriterion("cost_fact not in", values, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactBetween(Double value1, Double value2) {
            addCriterion("cost_fact between", value1, value2, "costFact");
            return (Criteria) this;
        }

        public Criteria andCostFactNotBetween(Double value1, Double value2) {
            addCriterion("cost_fact not between", value1, value2, "costFact");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2019-05-01
     */
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