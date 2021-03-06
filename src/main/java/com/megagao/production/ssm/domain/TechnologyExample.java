package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TechnologyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnologyExample() {
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

        public Criteria andTechnologyIdIsNull() {
            addCriterion("technology_id is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdIsNotNull() {
            addCriterion("technology_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdEqualTo(String value) {
            addCriterion("technology_id =", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotEqualTo(String value) {
            addCriterion("technology_id <>", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdGreaterThan(String value) {
            addCriterion("technology_id >", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdGreaterThanOrEqualTo(String value) {
            addCriterion("technology_id >=", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdLessThan(String value) {
            addCriterion("technology_id <", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdLessThanOrEqualTo(String value) {
            addCriterion("technology_id <=", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdLike(String value) {
            addCriterion("technology_id like", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotLike(String value) {
            addCriterion("technology_id not like", value, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdIn(List<String> values) {
            addCriterion("technology_id in", values, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotIn(List<String> values) {
            addCriterion("technology_id not in", values, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdBetween(String value1, String value2) {
            addCriterion("technology_id between", value1, value2, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyIdNotBetween(String value1, String value2) {
            addCriterion("technology_id not between", value1, value2, "technologyId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIsNull() {
            addCriterion("technology_type is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIsNotNull() {
            addCriterion("technology_type is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeEqualTo(String value) {
            addCriterion("technology_type =", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeNotEqualTo(String value) {
            addCriterion("technology_type <>", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeGreaterThan(String value) {
            addCriterion("technology_type >", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("technology_type >=", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeLessThan(String value) {
            addCriterion("technology_type <", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeLessThanOrEqualTo(String value) {
            addCriterion("technology_type <=", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeLike(String value) {
            addCriterion("technology_type like", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeNotLike(String value) {
            addCriterion("technology_type not like", value, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeIn(List<String> values) {
            addCriterion("technology_type in", values, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeNotIn(List<String> values) {
            addCriterion("technology_type not in", values, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeBetween(String value1, String value2) {
            addCriterion("technology_type between", value1, value2, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyTypeNotBetween(String value1, String value2) {
            addCriterion("technology_type not between", value1, value2, "technologyType");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeIsNull() {
            addCriterion("technology_theme is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeIsNotNull() {
            addCriterion("technology_theme is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeEqualTo(String value) {
            addCriterion("technology_theme =", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeNotEqualTo(String value) {
            addCriterion("technology_theme <>", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeGreaterThan(String value) {
            addCriterion("technology_theme >", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeGreaterThanOrEqualTo(String value) {
            addCriterion("technology_theme >=", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeLessThan(String value) {
            addCriterion("technology_theme <", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeLessThanOrEqualTo(String value) {
            addCriterion("technology_theme <=", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeLike(String value) {
            addCriterion("technology_theme like", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeNotLike(String value) {
            addCriterion("technology_theme not like", value, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeIn(List<String> values) {
            addCriterion("technology_theme in", values, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeNotIn(List<String> values) {
            addCriterion("technology_theme not in", values, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeBetween(String value1, String value2) {
            addCriterion("technology_theme between", value1, value2, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyThemeNotBetween(String value1, String value2) {
            addCriterion("technology_theme not between", value1, value2, "technologyTheme");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateIsNull() {
            addCriterion("technology_date is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateIsNotNull() {
            addCriterion("technology_date is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateEqualTo(Date value) {
            addCriterion("technology_date =", value, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateNotEqualTo(Date value) {
            addCriterion("technology_date <>", value, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateGreaterThan(Date value) {
            addCriterion("technology_date >", value, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("technology_date >=", value, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateLessThan(Date value) {
            addCriterion("technology_date <", value, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateLessThanOrEqualTo(Date value) {
            addCriterion("technology_date <=", value, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateIn(List<Date> values) {
            addCriterion("technology_date in", values, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateNotIn(List<Date> values) {
            addCriterion("technology_date not in", values, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateBetween(Date value1, Date value2) {
            addCriterion("technology_date between", value1, value2, "technologyDate");
            return (Criteria) this;
        }

        public Criteria andTechnologyDateNotBetween(Date value1, Date value2) {
            addCriterion("technology_date not between", value1, value2, "technologyDate");
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

        public Criteria andTechnologyNoteIsNull() {
            addCriterion("technology_note is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteIsNotNull() {
            addCriterion("technology_note is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteEqualTo(String value) {
            addCriterion("technology_note =", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteNotEqualTo(String value) {
            addCriterion("technology_note <>", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteGreaterThan(String value) {
            addCriterion("technology_note >", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteGreaterThanOrEqualTo(String value) {
            addCriterion("technology_note >=", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteLessThan(String value) {
            addCriterion("technology_note <", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteLessThanOrEqualTo(String value) {
            addCriterion("technology_note <=", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteLike(String value) {
            addCriterion("technology_note like", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteNotLike(String value) {
            addCriterion("technology_note not like", value, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteIn(List<String> values) {
            addCriterion("technology_note in", values, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteNotIn(List<String> values) {
            addCriterion("technology_note not in", values, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteBetween(String value1, String value2) {
            addCriterion("technology_note between", value1, value2, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyNoteNotBetween(String value1, String value2) {
            addCriterion("technology_note not between", value1, value2, "technologyNote");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileIsNull() {
            addCriterion("technology_file is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileIsNotNull() {
            addCriterion("technology_file is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileEqualTo(String value) {
            addCriterion("technology_file =", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileNotEqualTo(String value) {
            addCriterion("technology_file <>", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileGreaterThan(String value) {
            addCriterion("technology_file >", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileGreaterThanOrEqualTo(String value) {
            addCriterion("technology_file >=", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileLessThan(String value) {
            addCriterion("technology_file <", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileLessThanOrEqualTo(String value) {
            addCriterion("technology_file <=", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileLike(String value) {
            addCriterion("technology_file like", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileNotLike(String value) {
            addCriterion("technology_file not like", value, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileIn(List<String> values) {
            addCriterion("technology_file in", values, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileNotIn(List<String> values) {
            addCriterion("technology_file not in", values, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileBetween(String value1, String value2) {
            addCriterion("technology_file between", value1, value2, "technologyFile");
            return (Criteria) this;
        }

        public Criteria andTechnologyFileNotBetween(String value1, String value2) {
            addCriterion("technology_file not between", value1, value2, "technologyFile");
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