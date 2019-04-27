package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeIdIsNull() {
            addCriterion("notice_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIsNotNull() {
            addCriterion("notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeIdEqualTo(String value) {
            addCriterion("notice_id =", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotEqualTo(String value) {
            addCriterion("notice_id <>", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThan(String value) {
            addCriterion("notice_id >", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdGreaterThanOrEqualTo(String value) {
            addCriterion("notice_id >=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThan(String value) {
            addCriterion("notice_id <", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLessThanOrEqualTo(String value) {
            addCriterion("notice_id <=", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdLike(String value) {
            addCriterion("notice_id like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotLike(String value) {
            addCriterion("notice_id not like", value, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdIn(List<String> values) {
            addCriterion("notice_id in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotIn(List<String> values) {
            addCriterion("notice_id not in", values, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdBetween(String value1, String value2) {
            addCriterion("notice_id between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeIdNotBetween(String value1, String value2) {
            addCriterion("notice_id not between", value1, value2, "noticeId");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNull() {
            addCriterion("notice_type is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIsNotNull() {
            addCriterion("notice_type is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeEqualTo(String value) {
            addCriterion("notice_type =", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotEqualTo(String value) {
            addCriterion("notice_type <>", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThan(String value) {
            addCriterion("notice_type >", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("notice_type >=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThan(String value) {
            addCriterion("notice_type <", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLessThanOrEqualTo(String value) {
            addCriterion("notice_type <=", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeLike(String value) {
            addCriterion("notice_type like", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotLike(String value) {
            addCriterion("notice_type not like", value, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeIn(List<String> values) {
            addCriterion("notice_type in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotIn(List<String> values) {
            addCriterion("notice_type not in", values, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeBetween(String value1, String value2) {
            addCriterion("notice_type between", value1, value2, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeTypeNotBetween(String value1, String value2) {
            addCriterion("notice_type not between", value1, value2, "noticeType");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeIsNull() {
            addCriterion("notice_theme is null");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeIsNotNull() {
            addCriterion("notice_theme is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeEqualTo(String value) {
            addCriterion("notice_theme =", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeNotEqualTo(String value) {
            addCriterion("notice_theme <>", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeGreaterThan(String value) {
            addCriterion("notice_theme >", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeGreaterThanOrEqualTo(String value) {
            addCriterion("notice_theme >=", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeLessThan(String value) {
            addCriterion("notice_theme <", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeLessThanOrEqualTo(String value) {
            addCriterion("notice_theme <=", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeLike(String value) {
            addCriterion("notice_theme like", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeNotLike(String value) {
            addCriterion("notice_theme not like", value, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeIn(List<String> values) {
            addCriterion("notice_theme in", values, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeNotIn(List<String> values) {
            addCriterion("notice_theme not in", values, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeBetween(String value1, String value2) {
            addCriterion("notice_theme between", value1, value2, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeThemeNotBetween(String value1, String value2) {
            addCriterion("notice_theme not between", value1, value2, "noticeTheme");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNull() {
            addCriterion("notice_date is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIsNotNull() {
            addCriterion("notice_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDateEqualTo(Date value) {
            addCriterion("notice_date =", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotEqualTo(Date value) {
            addCriterion("notice_date <>", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThan(Date value) {
            addCriterion("notice_date >", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_date >=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThan(Date value) {
            addCriterion("notice_date <", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateLessThanOrEqualTo(Date value) {
            addCriterion("notice_date <=", value, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateIn(List<Date> values) {
            addCriterion("notice_date in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotIn(List<Date> values) {
            addCriterion("notice_date not in", values, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateBetween(Date value1, Date value2) {
            addCriterion("notice_date between", value1, value2, "noticeDate");
            return (Criteria) this;
        }

        public Criteria andNoticeDateNotBetween(Date value1, Date value2) {
            addCriterion("notice_date not between", value1, value2, "noticeDate");
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

        public Criteria andNoticeNoteIsNull() {
            addCriterion("notice_note is null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteIsNotNull() {
            addCriterion("notice_note is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteEqualTo(String value) {
            addCriterion("notice_note =", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteNotEqualTo(String value) {
            addCriterion("notice_note <>", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteGreaterThan(String value) {
            addCriterion("notice_note >", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("notice_note >=", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteLessThan(String value) {
            addCriterion("notice_note <", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteLessThanOrEqualTo(String value) {
            addCriterion("notice_note <=", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteLike(String value) {
            addCriterion("notice_note like", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteNotLike(String value) {
            addCriterion("notice_note not like", value, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteIn(List<String> values) {
            addCriterion("notice_note in", values, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteNotIn(List<String> values) {
            addCriterion("notice_note not in", values, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteBetween(String value1, String value2) {
            addCriterion("notice_note between", value1, value2, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeNoteNotBetween(String value1, String value2) {
            addCriterion("notice_note not between", value1, value2, "noticeNote");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIsNull() {
            addCriterion("notice_file is null");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIsNotNull() {
            addCriterion("notice_file is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeFileEqualTo(String value) {
            addCriterion("notice_file =", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotEqualTo(String value) {
            addCriterion("notice_file <>", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileGreaterThan(String value) {
            addCriterion("notice_file >", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileGreaterThanOrEqualTo(String value) {
            addCriterion("notice_file >=", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLessThan(String value) {
            addCriterion("notice_file <", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLessThanOrEqualTo(String value) {
            addCriterion("notice_file <=", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileLike(String value) {
            addCriterion("notice_file like", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotLike(String value) {
            addCriterion("notice_file not like", value, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileIn(List<String> values) {
            addCriterion("notice_file in", values, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotIn(List<String> values) {
            addCriterion("notice_file not in", values, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileBetween(String value1, String value2) {
            addCriterion("notice_file between", value1, value2, "noticeFile");
            return (Criteria) this;
        }

        public Criteria andNoticeFileNotBetween(String value1, String value2) {
            addCriterion("notice_file not between", value1, value2, "noticeFile");
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