package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanExample() {
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
     * @date 2019-04-27
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

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(String value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(String value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(String value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(String value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(String value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLike(String value) {
            addCriterion("plan_id like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotLike(String value) {
            addCriterion("plan_id not like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<String> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<String> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(String value1, String value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(String value1, String value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNull() {
            addCriterion("plan_type is null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNotNull() {
            addCriterion("plan_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeEqualTo(String value) {
            addCriterion("plan_type =", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotEqualTo(String value) {
            addCriterion("plan_type <>", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThan(String value) {
            addCriterion("plan_type >", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_type >=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThan(String value) {
            addCriterion("plan_type <", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThanOrEqualTo(String value) {
            addCriterion("plan_type <=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLike(String value) {
            addCriterion("plan_type like", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotLike(String value) {
            addCriterion("plan_type not like", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIn(List<String> values) {
            addCriterion("plan_type in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotIn(List<String> values) {
            addCriterion("plan_type not in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeBetween(String value1, String value2) {
            addCriterion("plan_type between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotBetween(String value1, String value2) {
            addCriterion("plan_type not between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanThemeIsNull() {
            addCriterion("plan_theme is null");
            return (Criteria) this;
        }

        public Criteria andPlanThemeIsNotNull() {
            addCriterion("plan_theme is not null");
            return (Criteria) this;
        }

        public Criteria andPlanThemeEqualTo(String value) {
            addCriterion("plan_theme =", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotEqualTo(String value) {
            addCriterion("plan_theme <>", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeGreaterThan(String value) {
            addCriterion("plan_theme >", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_theme >=", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeLessThan(String value) {
            addCriterion("plan_theme <", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeLessThanOrEqualTo(String value) {
            addCriterion("plan_theme <=", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeLike(String value) {
            addCriterion("plan_theme like", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotLike(String value) {
            addCriterion("plan_theme not like", value, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeIn(List<String> values) {
            addCriterion("plan_theme in", values, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotIn(List<String> values) {
            addCriterion("plan_theme not in", values, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeBetween(String value1, String value2) {
            addCriterion("plan_theme between", value1, value2, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanThemeNotBetween(String value1, String value2) {
            addCriterion("plan_theme not between", value1, value2, "planTheme");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterion("plan_date =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterion("plan_date <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterion("plan_date >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_date >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterion("plan_date <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_date <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterion("plan_date in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterion("plan_date not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterion("plan_date between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_date not between", value1, value2, "planDate");
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

        public Criteria andPlanNoteIsNull() {
            addCriterion("plan_note is null");
            return (Criteria) this;
        }

        public Criteria andPlanNoteIsNotNull() {
            addCriterion("plan_note is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNoteEqualTo(String value) {
            addCriterion("plan_note =", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteNotEqualTo(String value) {
            addCriterion("plan_note <>", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteGreaterThan(String value) {
            addCriterion("plan_note >", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteGreaterThanOrEqualTo(String value) {
            addCriterion("plan_note >=", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteLessThan(String value) {
            addCriterion("plan_note <", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteLessThanOrEqualTo(String value) {
            addCriterion("plan_note <=", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteLike(String value) {
            addCriterion("plan_note like", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteNotLike(String value) {
            addCriterion("plan_note not like", value, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteIn(List<String> values) {
            addCriterion("plan_note in", values, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteNotIn(List<String> values) {
            addCriterion("plan_note not in", values, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteBetween(String value1, String value2) {
            addCriterion("plan_note between", value1, value2, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanNoteNotBetween(String value1, String value2) {
            addCriterion("plan_note not between", value1, value2, "planNote");
            return (Criteria) this;
        }

        public Criteria andPlanFileIsNull() {
            addCriterion("plan_file is null");
            return (Criteria) this;
        }

        public Criteria andPlanFileIsNotNull() {
            addCriterion("plan_file is not null");
            return (Criteria) this;
        }

        public Criteria andPlanFileEqualTo(String value) {
            addCriterion("plan_file =", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileNotEqualTo(String value) {
            addCriterion("plan_file <>", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileGreaterThan(String value) {
            addCriterion("plan_file >", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileGreaterThanOrEqualTo(String value) {
            addCriterion("plan_file >=", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileLessThan(String value) {
            addCriterion("plan_file <", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileLessThanOrEqualTo(String value) {
            addCriterion("plan_file <=", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileLike(String value) {
            addCriterion("plan_file like", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileNotLike(String value) {
            addCriterion("plan_file not like", value, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileIn(List<String> values) {
            addCriterion("plan_file in", values, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileNotIn(List<String> values) {
            addCriterion("plan_file not in", values, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileBetween(String value1, String value2) {
            addCriterion("plan_file between", value1, value2, "planFile");
            return (Criteria) this;
        }

        public Criteria andPlanFileNotBetween(String value1, String value2) {
            addCriterion("plan_file not between", value1, value2, "planFile");
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
     * @date 2019-04-27
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