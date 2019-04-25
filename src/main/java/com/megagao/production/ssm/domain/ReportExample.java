package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("report_id like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("report_id not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportThemeIsNull() {
            addCriterion("report_theme is null");
            return (Criteria) this;
        }

        public Criteria andReportThemeIsNotNull() {
            addCriterion("report_theme is not null");
            return (Criteria) this;
        }

        public Criteria andReportThemeEqualTo(String value) {
            addCriterion("report_theme =", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeNotEqualTo(String value) {
            addCriterion("report_theme <>", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeGreaterThan(String value) {
            addCriterion("report_theme >", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeGreaterThanOrEqualTo(String value) {
            addCriterion("report_theme >=", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeLessThan(String value) {
            addCriterion("report_theme <", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeLessThanOrEqualTo(String value) {
            addCriterion("report_theme <=", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeLike(String value) {
            addCriterion("report_theme like", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeNotLike(String value) {
            addCriterion("report_theme not like", value, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeIn(List<String> values) {
            addCriterion("report_theme in", values, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeNotIn(List<String> values) {
            addCriterion("report_theme not in", values, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeBetween(String value1, String value2) {
            addCriterion("report_theme between", value1, value2, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportThemeNotBetween(String value1, String value2) {
            addCriterion("report_theme not between", value1, value2, "reportTheme");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
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

        public Criteria andReportNoteIsNull() {
            addCriterion("report_note is null");
            return (Criteria) this;
        }

        public Criteria andReportNoteIsNotNull() {
            addCriterion("report_note is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoteEqualTo(String value) {
            addCriterion("report_note =", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotEqualTo(String value) {
            addCriterion("report_note <>", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteGreaterThan(String value) {
            addCriterion("report_note >", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteGreaterThanOrEqualTo(String value) {
            addCriterion("report_note >=", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteLessThan(String value) {
            addCriterion("report_note <", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteLessThanOrEqualTo(String value) {
            addCriterion("report_note <=", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteLike(String value) {
            addCriterion("report_note like", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotLike(String value) {
            addCriterion("report_note not like", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteIn(List<String> values) {
            addCriterion("report_note in", values, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotIn(List<String> values) {
            addCriterion("report_note not in", values, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteBetween(String value1, String value2) {
            addCriterion("report_note between", value1, value2, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotBetween(String value1, String value2) {
            addCriterion("report_note not between", value1, value2, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportFileIsNull() {
            addCriterion("report_file is null");
            return (Criteria) this;
        }

        public Criteria andReportFileIsNotNull() {
            addCriterion("report_file is not null");
            return (Criteria) this;
        }

        public Criteria andReportFileEqualTo(String value) {
            addCriterion("report_file =", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileNotEqualTo(String value) {
            addCriterion("report_file <>", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileGreaterThan(String value) {
            addCriterion("report_file >", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileGreaterThanOrEqualTo(String value) {
            addCriterion("report_file >=", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileLessThan(String value) {
            addCriterion("report_file <", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileLessThanOrEqualTo(String value) {
            addCriterion("report_file <=", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileLike(String value) {
            addCriterion("report_file like", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileNotLike(String value) {
            addCriterion("report_file not like", value, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileIn(List<String> values) {
            addCriterion("report_file in", values, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileNotIn(List<String> values) {
            addCriterion("report_file not in", values, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileBetween(String value1, String value2) {
            addCriterion("report_file between", value1, value2, "reportFile");
            return (Criteria) this;
        }

        public Criteria andReportFileNotBetween(String value1, String value2) {
            addCriterion("report_file not between", value1, value2, "reportFile");
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