package com.megagao.production.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectMainExample() {
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

        public Criteria andMainIdIsNull() {
            addCriterion("main_id is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("main_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(String value) {
            addCriterion("main_id =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(String value) {
            addCriterion("main_id <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(String value) {
            addCriterion("main_id >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("main_id >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(String value) {
            addCriterion("main_id <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(String value) {
            addCriterion("main_id <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLike(String value) {
            addCriterion("main_id like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotLike(String value) {
            addCriterion("main_id not like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<String> values) {
            addCriterion("main_id in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<String> values) {
            addCriterion("main_id not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(String value1, String value2) {
            addCriterion("main_id between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(String value1, String value2) {
            addCriterion("main_id not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainNameIsNull() {
            addCriterion("main_name is null");
            return (Criteria) this;
        }

        public Criteria andMainNameIsNotNull() {
            addCriterion("main_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainNameEqualTo(String value) {
            addCriterion("main_name =", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameNotEqualTo(String value) {
            addCriterion("main_name <>", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameGreaterThan(String value) {
            addCriterion("main_name >", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_name >=", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameLessThan(String value) {
            addCriterion("main_name <", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameLessThanOrEqualTo(String value) {
            addCriterion("main_name <=", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameLike(String value) {
            addCriterion("main_name like", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameNotLike(String value) {
            addCriterion("main_name not like", value, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameIn(List<String> values) {
            addCriterion("main_name in", values, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameNotIn(List<String> values) {
            addCriterion("main_name not in", values, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameBetween(String value1, String value2) {
            addCriterion("main_name between", value1, value2, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainNameNotBetween(String value1, String value2) {
            addCriterion("main_name not between", value1, value2, "mainName");
            return (Criteria) this;
        }

        public Criteria andMainAmountIsNull() {
            addCriterion("main_amount is null");
            return (Criteria) this;
        }

        public Criteria andMainAmountIsNotNull() {
            addCriterion("main_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMainAmountEqualTo(Double value) {
            addCriterion("main_amount =", value, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountNotEqualTo(Double value) {
            addCriterion("main_amount <>", value, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountGreaterThan(Double value) {
            addCriterion("main_amount >", value, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("main_amount >=", value, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountLessThan(Double value) {
            addCriterion("main_amount <", value, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountLessThanOrEqualTo(Double value) {
            addCriterion("main_amount <=", value, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountIn(List<Double> values) {
            addCriterion("main_amount in", values, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountNotIn(List<Double> values) {
            addCriterion("main_amount not in", values, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountBetween(Double value1, Double value2) {
            addCriterion("main_amount between", value1, value2, "mainAmount");
            return (Criteria) this;
        }

        public Criteria andMainAmountNotBetween(Double value1, Double value2) {
            addCriterion("main_amount not between", value1, value2, "mainAmount");
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

        public Criteria andMainStartIsNull() {
            addCriterion("main_start is null");
            return (Criteria) this;
        }

        public Criteria andMainStartIsNotNull() {
            addCriterion("main_start is not null");
            return (Criteria) this;
        }

        public Criteria andMainStartEqualTo(Date value) {
            addCriterionForJDBCDate("main_start =", value, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("main_start <>", value, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartGreaterThan(Date value) {
            addCriterionForJDBCDate("main_start >", value, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("main_start >=", value, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartLessThan(Date value) {
            addCriterionForJDBCDate("main_start <", value, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("main_start <=", value, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartIn(List<Date> values) {
            addCriterionForJDBCDate("main_start in", values, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("main_start not in", values, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("main_start between", value1, value2, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("main_start not between", value1, value2, "mainStart");
            return (Criteria) this;
        }

        public Criteria andMainEndIsNull() {
            addCriterion("main_end is null");
            return (Criteria) this;
        }

        public Criteria andMainEndIsNotNull() {
            addCriterion("main_end is not null");
            return (Criteria) this;
        }

        public Criteria andMainEndEqualTo(Date value) {
            addCriterionForJDBCDate("main_end =", value, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("main_end <>", value, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndGreaterThan(Date value) {
            addCriterionForJDBCDate("main_end >", value, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("main_end >=", value, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndLessThan(Date value) {
            addCriterionForJDBCDate("main_end <", value, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("main_end <=", value, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndIn(List<Date> values) {
            addCriterionForJDBCDate("main_end in", values, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("main_end not in", values, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("main_end between", value1, value2, "mainEnd");
            return (Criteria) this;
        }

        public Criteria andMainEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("main_end not between", value1, value2, "mainEnd");
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