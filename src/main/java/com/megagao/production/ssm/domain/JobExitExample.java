package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExitExample() {
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

        public Criteria andExitIdIsNull() {
            addCriterion("exit_id is null");
            return (Criteria) this;
        }

        public Criteria andExitIdIsNotNull() {
            addCriterion("exit_id is not null");
            return (Criteria) this;
        }

        public Criteria andExitIdEqualTo(String value) {
            addCriterion("exit_id =", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdNotEqualTo(String value) {
            addCriterion("exit_id <>", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdGreaterThan(String value) {
            addCriterion("exit_id >", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdGreaterThanOrEqualTo(String value) {
            addCriterion("exit_id >=", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdLessThan(String value) {
            addCriterion("exit_id <", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdLessThanOrEqualTo(String value) {
            addCriterion("exit_id <=", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdLike(String value) {
            addCriterion("exit_id like", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdNotLike(String value) {
            addCriterion("exit_id not like", value, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdIn(List<String> values) {
            addCriterion("exit_id in", values, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdNotIn(List<String> values) {
            addCriterion("exit_id not in", values, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdBetween(String value1, String value2) {
            addCriterion("exit_id between", value1, value2, "exitId");
            return (Criteria) this;
        }

        public Criteria andExitIdNotBetween(String value1, String value2) {
            addCriterion("exit_id not between", value1, value2, "exitId");
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

        public Criteria andExitPostIsNull() {
            addCriterion("exit_post is null");
            return (Criteria) this;
        }

        public Criteria andExitPostIsNotNull() {
            addCriterion("exit_post is not null");
            return (Criteria) this;
        }

        public Criteria andExitPostEqualTo(String value) {
            addCriterion("exit_post =", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostNotEqualTo(String value) {
            addCriterion("exit_post <>", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostGreaterThan(String value) {
            addCriterion("exit_post >", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostGreaterThanOrEqualTo(String value) {
            addCriterion("exit_post >=", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostLessThan(String value) {
            addCriterion("exit_post <", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostLessThanOrEqualTo(String value) {
            addCriterion("exit_post <=", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostLike(String value) {
            addCriterion("exit_post like", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostNotLike(String value) {
            addCriterion("exit_post not like", value, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostIn(List<String> values) {
            addCriterion("exit_post in", values, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostNotIn(List<String> values) {
            addCriterion("exit_post not in", values, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostBetween(String value1, String value2) {
            addCriterion("exit_post between", value1, value2, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitPostNotBetween(String value1, String value2) {
            addCriterion("exit_post not between", value1, value2, "exitPost");
            return (Criteria) this;
        }

        public Criteria andExitSalaryIsNull() {
            addCriterion("exit_salary is null");
            return (Criteria) this;
        }

        public Criteria andExitSalaryIsNotNull() {
            addCriterion("exit_salary is not null");
            return (Criteria) this;
        }

        public Criteria andExitSalaryEqualTo(Double value) {
            addCriterion("exit_salary =", value, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryNotEqualTo(Double value) {
            addCriterion("exit_salary <>", value, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryGreaterThan(Double value) {
            addCriterion("exit_salary >", value, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("exit_salary >=", value, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryLessThan(Double value) {
            addCriterion("exit_salary <", value, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryLessThanOrEqualTo(Double value) {
            addCriterion("exit_salary <=", value, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryIn(List<Double> values) {
            addCriterion("exit_salary in", values, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryNotIn(List<Double> values) {
            addCriterion("exit_salary not in", values, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryBetween(Double value1, Double value2) {
            addCriterion("exit_salary between", value1, value2, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitSalaryNotBetween(Double value1, Double value2) {
            addCriterion("exit_salary not between", value1, value2, "exitSalary");
            return (Criteria) this;
        }

        public Criteria andExitDateIsNull() {
            addCriterion("exit_date is null");
            return (Criteria) this;
        }

        public Criteria andExitDateIsNotNull() {
            addCriterion("exit_date is not null");
            return (Criteria) this;
        }

        public Criteria andExitDateEqualTo(Date value) {
            addCriterion("exit_date =", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotEqualTo(Date value) {
            addCriterion("exit_date <>", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateGreaterThan(Date value) {
            addCriterion("exit_date >", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exit_date >=", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateLessThan(Date value) {
            addCriterion("exit_date <", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateLessThanOrEqualTo(Date value) {
            addCriterion("exit_date <=", value, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateIn(List<Date> values) {
            addCriterion("exit_date in", values, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotIn(List<Date> values) {
            addCriterion("exit_date not in", values, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateBetween(Date value1, Date value2) {
            addCriterion("exit_date between", value1, value2, "exitDate");
            return (Criteria) this;
        }

        public Criteria andExitDateNotBetween(Date value1, Date value2) {
            addCriterion("exit_date not between", value1, value2, "exitDate");
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