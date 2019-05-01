package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.List;

public class JobHourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobHourExample() {
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

        public Criteria andHourIdIsNull() {
            addCriterion("hour_id is null");
            return (Criteria) this;
        }

        public Criteria andHourIdIsNotNull() {
            addCriterion("hour_id is not null");
            return (Criteria) this;
        }

        public Criteria andHourIdEqualTo(String value) {
            addCriterion("hour_id =", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotEqualTo(String value) {
            addCriterion("hour_id <>", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdGreaterThan(String value) {
            addCriterion("hour_id >", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdGreaterThanOrEqualTo(String value) {
            addCriterion("hour_id >=", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdLessThan(String value) {
            addCriterion("hour_id <", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdLessThanOrEqualTo(String value) {
            addCriterion("hour_id <=", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdLike(String value) {
            addCriterion("hour_id like", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotLike(String value) {
            addCriterion("hour_id not like", value, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdIn(List<String> values) {
            addCriterion("hour_id in", values, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotIn(List<String> values) {
            addCriterion("hour_id not in", values, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdBetween(String value1, String value2) {
            addCriterion("hour_id between", value1, value2, "hourId");
            return (Criteria) this;
        }

        public Criteria andHourIdNotBetween(String value1, String value2) {
            addCriterion("hour_id not between", value1, value2, "hourId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andHourTimeIsNull() {
            addCriterion("hour_time is null");
            return (Criteria) this;
        }

        public Criteria andHourTimeIsNotNull() {
            addCriterion("hour_time is not null");
            return (Criteria) this;
        }

        public Criteria andHourTimeEqualTo(Integer value) {
            addCriterion("hour_time =", value, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeNotEqualTo(Integer value) {
            addCriterion("hour_time <>", value, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeGreaterThan(Integer value) {
            addCriterion("hour_time >", value, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hour_time >=", value, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeLessThan(Integer value) {
            addCriterion("hour_time <", value, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeLessThanOrEqualTo(Integer value) {
            addCriterion("hour_time <=", value, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeIn(List<Integer> values) {
            addCriterion("hour_time in", values, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeNotIn(List<Integer> values) {
            addCriterion("hour_time not in", values, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeBetween(Integer value1, Integer value2) {
            addCriterion("hour_time between", value1, value2, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("hour_time not between", value1, value2, "hourTime");
            return (Criteria) this;
        }

        public Criteria andHourRestIsNull() {
            addCriterion("hour_rest is null");
            return (Criteria) this;
        }

        public Criteria andHourRestIsNotNull() {
            addCriterion("hour_rest is not null");
            return (Criteria) this;
        }

        public Criteria andHourRestEqualTo(Integer value) {
            addCriterion("hour_rest =", value, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestNotEqualTo(Integer value) {
            addCriterion("hour_rest <>", value, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestGreaterThan(Integer value) {
            addCriterion("hour_rest >", value, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestGreaterThanOrEqualTo(Integer value) {
            addCriterion("hour_rest >=", value, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestLessThan(Integer value) {
            addCriterion("hour_rest <", value, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestLessThanOrEqualTo(Integer value) {
            addCriterion("hour_rest <=", value, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestIn(List<Integer> values) {
            addCriterion("hour_rest in", values, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestNotIn(List<Integer> values) {
            addCriterion("hour_rest not in", values, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestBetween(Integer value1, Integer value2) {
            addCriterion("hour_rest between", value1, value2, "hourRest");
            return (Criteria) this;
        }

        public Criteria andHourRestNotBetween(Integer value1, Integer value2) {
            addCriterion("hour_rest not between", value1, value2, "hourRest");
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