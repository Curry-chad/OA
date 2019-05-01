package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WishExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andWishIdIsNull() {
            addCriterion("wish_id is null");
            return (Criteria) this;
        }

        public Criteria andWishIdIsNotNull() {
            addCriterion("wish_id is not null");
            return (Criteria) this;
        }

        public Criteria andWishIdEqualTo(String value) {
            addCriterion("wish_id =", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotEqualTo(String value) {
            addCriterion("wish_id <>", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdGreaterThan(String value) {
            addCriterion("wish_id >", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdGreaterThanOrEqualTo(String value) {
            addCriterion("wish_id >=", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLessThan(String value) {
            addCriterion("wish_id <", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLessThanOrEqualTo(String value) {
            addCriterion("wish_id <=", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLike(String value) {
            addCriterion("wish_id like", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotLike(String value) {
            addCriterion("wish_id not like", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdIn(List<String> values) {
            addCriterion("wish_id in", values, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotIn(List<String> values) {
            addCriterion("wish_id not in", values, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdBetween(String value1, String value2) {
            addCriterion("wish_id between", value1, value2, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotBetween(String value1, String value2) {
            addCriterion("wish_id not between", value1, value2, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishTextIsNull() {
            addCriterion("wish_text is null");
            return (Criteria) this;
        }

        public Criteria andWishTextIsNotNull() {
            addCriterion("wish_text is not null");
            return (Criteria) this;
        }

        public Criteria andWishTextEqualTo(String value) {
            addCriterion("wish_text =", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextNotEqualTo(String value) {
            addCriterion("wish_text <>", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextGreaterThan(String value) {
            addCriterion("wish_text >", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextGreaterThanOrEqualTo(String value) {
            addCriterion("wish_text >=", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextLessThan(String value) {
            addCriterion("wish_text <", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextLessThanOrEqualTo(String value) {
            addCriterion("wish_text <=", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextLike(String value) {
            addCriterion("wish_text like", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextNotLike(String value) {
            addCriterion("wish_text not like", value, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextIn(List<String> values) {
            addCriterion("wish_text in", values, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextNotIn(List<String> values) {
            addCriterion("wish_text not in", values, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextBetween(String value1, String value2) {
            addCriterion("wish_text between", value1, value2, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishTextNotBetween(String value1, String value2) {
            addCriterion("wish_text not between", value1, value2, "wishText");
            return (Criteria) this;
        }

        public Criteria andWishDateIsNull() {
            addCriterion("wish_date is null");
            return (Criteria) this;
        }

        public Criteria andWishDateIsNotNull() {
            addCriterion("wish_date is not null");
            return (Criteria) this;
        }

        public Criteria andWishDateEqualTo(Date value) {
            addCriterionForJDBCDate("wish_date =", value, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("wish_date <>", value, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("wish_date >", value, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("wish_date >=", value, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateLessThan(Date value) {
            addCriterionForJDBCDate("wish_date <", value, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("wish_date <=", value, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateIn(List<Date> values) {
            addCriterionForJDBCDate("wish_date in", values, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("wish_date not in", values, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("wish_date between", value1, value2, "wishDate");
            return (Criteria) this;
        }

        public Criteria andWishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("wish_date not between", value1, value2, "wishDate");
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