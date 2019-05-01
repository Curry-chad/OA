package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoundExample() {
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
     * @date 2019-04-30
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

        public Criteria andFoundIdIsNull() {
            addCriterion("found_id is null");
            return (Criteria) this;
        }

        public Criteria andFoundIdIsNotNull() {
            addCriterion("found_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoundIdEqualTo(String value) {
            addCriterion("found_id =", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotEqualTo(String value) {
            addCriterion("found_id <>", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdGreaterThan(String value) {
            addCriterion("found_id >", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdGreaterThanOrEqualTo(String value) {
            addCriterion("found_id >=", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdLessThan(String value) {
            addCriterion("found_id <", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdLessThanOrEqualTo(String value) {
            addCriterion("found_id <=", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdLike(String value) {
            addCriterion("found_id like", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotLike(String value) {
            addCriterion("found_id not like", value, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdIn(List<String> values) {
            addCriterion("found_id in", values, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotIn(List<String> values) {
            addCriterion("found_id not in", values, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdBetween(String value1, String value2) {
            addCriterion("found_id between", value1, value2, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundIdNotBetween(String value1, String value2) {
            addCriterion("found_id not between", value1, value2, "foundId");
            return (Criteria) this;
        }

        public Criteria andFoundTextIsNull() {
            addCriterion("found_text is null");
            return (Criteria) this;
        }

        public Criteria andFoundTextIsNotNull() {
            addCriterion("found_text is not null");
            return (Criteria) this;
        }

        public Criteria andFoundTextEqualTo(String value) {
            addCriterion("found_text =", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextNotEqualTo(String value) {
            addCriterion("found_text <>", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextGreaterThan(String value) {
            addCriterion("found_text >", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextGreaterThanOrEqualTo(String value) {
            addCriterion("found_text >=", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextLessThan(String value) {
            addCriterion("found_text <", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextLessThanOrEqualTo(String value) {
            addCriterion("found_text <=", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextLike(String value) {
            addCriterion("found_text like", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextNotLike(String value) {
            addCriterion("found_text not like", value, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextIn(List<String> values) {
            addCriterion("found_text in", values, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextNotIn(List<String> values) {
            addCriterion("found_text not in", values, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextBetween(String value1, String value2) {
            addCriterion("found_text between", value1, value2, "foundText");
            return (Criteria) this;
        }

        public Criteria andFoundTextNotBetween(String value1, String value2) {
            addCriterion("found_text not between", value1, value2, "foundText");
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

        public Criteria andFoundDateIsNull() {
            addCriterion("found_date is null");
            return (Criteria) this;
        }

        public Criteria andFoundDateIsNotNull() {
            addCriterion("found_date is not null");
            return (Criteria) this;
        }

        public Criteria andFoundDateEqualTo(Date value) {
            addCriterion("found_date =", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotEqualTo(Date value) {
            addCriterion("found_date <>", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateGreaterThan(Date value) {
            addCriterion("found_date >", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateGreaterThanOrEqualTo(Date value) {
            addCriterion("found_date >=", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateLessThan(Date value) {
            addCriterion("found_date <", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateLessThanOrEqualTo(Date value) {
            addCriterion("found_date <=", value, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateIn(List<Date> values) {
            addCriterion("found_date in", values, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotIn(List<Date> values) {
            addCriterion("found_date not in", values, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateBetween(Date value1, Date value2) {
            addCriterion("found_date between", value1, value2, "foundDate");
            return (Criteria) this;
        }

        public Criteria andFoundDateNotBetween(Date value1, Date value2) {
            addCriterion("found_date not between", value1, value2, "foundDate");
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
     * @date 2019-04-30
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