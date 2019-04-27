package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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

        public Criteria andAnnouncementIdIsNull() {
            addCriterion("announcement_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIsNotNull() {
            addCriterion("announcement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdEqualTo(String value) {
            addCriterion("announcement_id =", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotEqualTo(String value) {
            addCriterion("announcement_id <>", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThan(String value) {
            addCriterion("announcement_id >", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_id >=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThan(String value) {
            addCriterion("announcement_id <", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThanOrEqualTo(String value) {
            addCriterion("announcement_id <=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLike(String value) {
            addCriterion("announcement_id like", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotLike(String value) {
            addCriterion("announcement_id not like", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIn(List<String> values) {
            addCriterion("announcement_id in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotIn(List<String> values) {
            addCriterion("announcement_id not in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdBetween(String value1, String value2) {
            addCriterion("announcement_id between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotBetween(String value1, String value2) {
            addCriterion("announcement_id not between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextIsNull() {
            addCriterion("announcement_text is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextIsNotNull() {
            addCriterion("announcement_text is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextEqualTo(String value) {
            addCriterion("announcement_text =", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextNotEqualTo(String value) {
            addCriterion("announcement_text <>", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextGreaterThan(String value) {
            addCriterion("announcement_text >", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_text >=", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextLessThan(String value) {
            addCriterion("announcement_text <", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextLessThanOrEqualTo(String value) {
            addCriterion("announcement_text <=", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextLike(String value) {
            addCriterion("announcement_text like", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextNotLike(String value) {
            addCriterion("announcement_text not like", value, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextIn(List<String> values) {
            addCriterion("announcement_text in", values, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextNotIn(List<String> values) {
            addCriterion("announcement_text not in", values, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextBetween(String value1, String value2) {
            addCriterion("announcement_text between", value1, value2, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTextNotBetween(String value1, String value2) {
            addCriterion("announcement_text not between", value1, value2, "announcementText");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateIsNull() {
            addCriterion("announcement_date is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateIsNotNull() {
            addCriterion("announcement_date is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateEqualTo(Date value) {
            addCriterion("announcement_date =", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateNotEqualTo(Date value) {
            addCriterion("announcement_date <>", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateGreaterThan(Date value) {
            addCriterion("announcement_date >", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateGreaterThanOrEqualTo(Date value) {
            addCriterion("announcement_date >=", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateLessThan(Date value) {
            addCriterion("announcement_date <", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateLessThanOrEqualTo(Date value) {
            addCriterion("announcement_date <=", value, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateIn(List<Date> values) {
            addCriterion("announcement_date in", values, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateNotIn(List<Date> values) {
            addCriterion("announcement_date not in", values, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateBetween(Date value1, Date value2) {
            addCriterion("announcement_date between", value1, value2, "announcementDate");
            return (Criteria) this;
        }

        public Criteria andAnnouncementDateNotBetween(Date value1, Date value2) {
            addCriterion("announcement_date not between", value1, value2, "announcementDate");
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