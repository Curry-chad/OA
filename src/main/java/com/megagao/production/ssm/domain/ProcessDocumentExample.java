package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessDocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessDocumentExample() {
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
     * @date 2019-04-17
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

        public Criteria andDocumentIdIsNull() {
            addCriterion("document_id is null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIsNotNull() {
            addCriterion("document_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentIdEqualTo(String value) {
            addCriterion("document_id =", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotEqualTo(String value) {
            addCriterion("document_id <>", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThan(String value) {
            addCriterion("document_id >", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdGreaterThanOrEqualTo(String value) {
            addCriterion("document_id >=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThan(String value) {
            addCriterion("document_id <", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLessThanOrEqualTo(String value) {
            addCriterion("document_id <=", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdLike(String value) {
            addCriterion("document_id like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotLike(String value) {
            addCriterion("document_id not like", value, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdIn(List<String> values) {
            addCriterion("document_id in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotIn(List<String> values) {
            addCriterion("document_id not in", values, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdBetween(String value1, String value2) {
            addCriterion("document_id between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentIdNotBetween(String value1, String value2) {
            addCriterion("document_id not between", value1, value2, "documentId");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNull() {
            addCriterion("document_type is null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIsNotNull() {
            addCriterion("document_type is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeEqualTo(String value) {
            addCriterion("document_type =", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotEqualTo(String value) {
            addCriterion("document_type <>", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThan(String value) {
            addCriterion("document_type >", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("document_type >=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThan(String value) {
            addCriterion("document_type <", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLessThanOrEqualTo(String value) {
            addCriterion("document_type <=", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeLike(String value) {
            addCriterion("document_type like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotLike(String value) {
            addCriterion("document_type not like", value, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeIn(List<String> values) {
            addCriterion("document_type in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotIn(List<String> values) {
            addCriterion("document_type not in", values, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeBetween(String value1, String value2) {
            addCriterion("document_type between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentTypeNotBetween(String value1, String value2) {
            addCriterion("document_type not between", value1, value2, "documentType");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeIsNull() {
            addCriterion("document_theme is null");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeIsNotNull() {
            addCriterion("document_theme is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeEqualTo(String value) {
            addCriterion("document_theme =", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeNotEqualTo(String value) {
            addCriterion("document_theme <>", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeGreaterThan(String value) {
            addCriterion("document_theme >", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeGreaterThanOrEqualTo(String value) {
            addCriterion("document_theme >=", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeLessThan(String value) {
            addCriterion("document_theme <", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeLessThanOrEqualTo(String value) {
            addCriterion("document_theme <=", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeLike(String value) {
            addCriterion("document_theme like", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeNotLike(String value) {
            addCriterion("document_theme not like", value, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeIn(List<String> values) {
            addCriterion("document_theme in", values, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeNotIn(List<String> values) {
            addCriterion("document_theme not in", values, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeBetween(String value1, String value2) {
            addCriterion("document_theme between", value1, value2, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentThemeNotBetween(String value1, String value2) {
            addCriterion("document_theme not between", value1, value2, "documentTheme");
            return (Criteria) this;
        }

        public Criteria andDocumentDateIsNull() {
            addCriterion("document_date is null");
            return (Criteria) this;
        }

        public Criteria andDocumentDateIsNotNull() {
            addCriterion("document_date is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentDateEqualTo(Date value) {
            addCriterion("document_date =", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateNotEqualTo(Date value) {
            addCriterion("document_date <>", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateGreaterThan(Date value) {
            addCriterion("document_date >", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("document_date >=", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateLessThan(Date value) {
            addCriterion("document_date <", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateLessThanOrEqualTo(Date value) {
            addCriterion("document_date <=", value, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateIn(List<Date> values) {
            addCriterion("document_date in", values, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateNotIn(List<Date> values) {
            addCriterion("document_date not in", values, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateBetween(Date value1, Date value2) {
            addCriterion("document_date between", value1, value2, "documentDate");
            return (Criteria) this;
        }

        public Criteria andDocumentDateNotBetween(Date value1, Date value2) {
            addCriterion("document_date not between", value1, value2, "documentDate");
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

        public Criteria andDocumentNoteIsNull() {
            addCriterion("document_note is null");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteIsNotNull() {
            addCriterion("document_note is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteEqualTo(String value) {
            addCriterion("document_note =", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteNotEqualTo(String value) {
            addCriterion("document_note <>", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteGreaterThan(String value) {
            addCriterion("document_note >", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteGreaterThanOrEqualTo(String value) {
            addCriterion("document_note >=", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteLessThan(String value) {
            addCriterion("document_note <", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteLessThanOrEqualTo(String value) {
            addCriterion("document_note <=", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteLike(String value) {
            addCriterion("document_note like", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteNotLike(String value) {
            addCriterion("document_note not like", value, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteIn(List<String> values) {
            addCriterion("document_note in", values, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteNotIn(List<String> values) {
            addCriterion("document_note not in", values, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteBetween(String value1, String value2) {
            addCriterion("document_note between", value1, value2, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentNoteNotBetween(String value1, String value2) {
            addCriterion("document_note not between", value1, value2, "documentNote");
            return (Criteria) this;
        }

        public Criteria andDocumentFileIsNull() {
            addCriterion("document_file is null");
            return (Criteria) this;
        }

        public Criteria andDocumentFileIsNotNull() {
            addCriterion("document_file is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentFileEqualTo(String value) {
            addCriterion("document_file =", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileNotEqualTo(String value) {
            addCriterion("document_file <>", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileGreaterThan(String value) {
            addCriterion("document_file >", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileGreaterThanOrEqualTo(String value) {
            addCriterion("document_file >=", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileLessThan(String value) {
            addCriterion("document_file <", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileLessThanOrEqualTo(String value) {
            addCriterion("document_file <=", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileLike(String value) {
            addCriterion("document_file like", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileNotLike(String value) {
            addCriterion("document_file not like", value, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileIn(List<String> values) {
            addCriterion("document_file in", values, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileNotIn(List<String> values) {
            addCriterion("document_file not in", values, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileBetween(String value1, String value2) {
            addCriterion("document_file between", value1, value2, "documentFile");
            return (Criteria) this;
        }

        public Criteria andDocumentFileNotBetween(String value1, String value2) {
            addCriterion("document_file not between", value1, value2, "documentFile");
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
     * @date 2019-04-17
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