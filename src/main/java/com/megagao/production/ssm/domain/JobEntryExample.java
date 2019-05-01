package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobEntryExample() {
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

        public Criteria andEntryIdIsNull() {
            addCriterion("entry_id is null");
            return (Criteria) this;
        }

        public Criteria andEntryIdIsNotNull() {
            addCriterion("entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntryIdEqualTo(String value) {
            addCriterion("entry_id =", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotEqualTo(String value) {
            addCriterion("entry_id <>", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThan(String value) {
            addCriterion("entry_id >", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdGreaterThanOrEqualTo(String value) {
            addCriterion("entry_id >=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThan(String value) {
            addCriterion("entry_id <", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLessThanOrEqualTo(String value) {
            addCriterion("entry_id <=", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdLike(String value) {
            addCriterion("entry_id like", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotLike(String value) {
            addCriterion("entry_id not like", value, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdIn(List<String> values) {
            addCriterion("entry_id in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotIn(List<String> values) {
            addCriterion("entry_id not in", values, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdBetween(String value1, String value2) {
            addCriterion("entry_id between", value1, value2, "entryId");
            return (Criteria) this;
        }

        public Criteria andEntryIdNotBetween(String value1, String value2) {
            addCriterion("entry_id not between", value1, value2, "entryId");
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

        public Criteria andEntryPostIsNull() {
            addCriterion("entry_post is null");
            return (Criteria) this;
        }

        public Criteria andEntryPostIsNotNull() {
            addCriterion("entry_post is not null");
            return (Criteria) this;
        }

        public Criteria andEntryPostEqualTo(String value) {
            addCriterion("entry_post =", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostNotEqualTo(String value) {
            addCriterion("entry_post <>", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostGreaterThan(String value) {
            addCriterion("entry_post >", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostGreaterThanOrEqualTo(String value) {
            addCriterion("entry_post >=", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostLessThan(String value) {
            addCriterion("entry_post <", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostLessThanOrEqualTo(String value) {
            addCriterion("entry_post <=", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostLike(String value) {
            addCriterion("entry_post like", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostNotLike(String value) {
            addCriterion("entry_post not like", value, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostIn(List<String> values) {
            addCriterion("entry_post in", values, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostNotIn(List<String> values) {
            addCriterion("entry_post not in", values, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostBetween(String value1, String value2) {
            addCriterion("entry_post between", value1, value2, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntryPostNotBetween(String value1, String value2) {
            addCriterion("entry_post not between", value1, value2, "entryPost");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryIsNull() {
            addCriterion("entry_salary is null");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryIsNotNull() {
            addCriterion("entry_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryEqualTo(Double value) {
            addCriterion("entry_salary =", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryNotEqualTo(Double value) {
            addCriterion("entry_salary <>", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryGreaterThan(Double value) {
            addCriterion("entry_salary >", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("entry_salary >=", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryLessThan(Double value) {
            addCriterion("entry_salary <", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryLessThanOrEqualTo(Double value) {
            addCriterion("entry_salary <=", value, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryIn(List<Double> values) {
            addCriterion("entry_salary in", values, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryNotIn(List<Double> values) {
            addCriterion("entry_salary not in", values, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryBetween(Double value1, Double value2) {
            addCriterion("entry_salary between", value1, value2, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntrySalaryNotBetween(Double value1, Double value2) {
            addCriterion("entry_salary not between", value1, value2, "entrySalary");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterion("entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterion("entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterion("entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterion("entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterion("entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterion("entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterion("entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterion("entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterion("entry_date not between", value1, value2, "entryDate");
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