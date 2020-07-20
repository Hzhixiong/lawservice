package com.lut.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class PwsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PwsExample() {
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

        public Criteria andPwsidIsNull() {
            addCriterion("pwsid is null");
            return (Criteria) this;
        }

        public Criteria andPwsidIsNotNull() {
            addCriterion("pwsid is not null");
            return (Criteria) this;
        }

        public Criteria andPwsidEqualTo(Integer value) {
            addCriterion("pwsid =", value, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidNotEqualTo(Integer value) {
            addCriterion("pwsid <>", value, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidGreaterThan(Integer value) {
            addCriterion("pwsid >", value, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pwsid >=", value, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidLessThan(Integer value) {
            addCriterion("pwsid <", value, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidLessThanOrEqualTo(Integer value) {
            addCriterion("pwsid <=", value, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidIn(List<Integer> values) {
            addCriterion("pwsid in", values, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidNotIn(List<Integer> values) {
            addCriterion("pwsid not in", values, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidBetween(Integer value1, Integer value2) {
            addCriterion("pwsid between", value1, value2, "pwsid");
            return (Criteria) this;
        }

        public Criteria andPwsidNotBetween(Integer value1, Integer value2) {
            addCriterion("pwsid not between", value1, value2, "pwsid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPwIsNull() {
            addCriterion("pw is null");
            return (Criteria) this;
        }

        public Criteria andPwIsNotNull() {
            addCriterion("pw is not null");
            return (Criteria) this;
        }

        public Criteria andPwEqualTo(String value) {
            addCriterion("pw =", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwNotEqualTo(String value) {
            addCriterion("pw <>", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwGreaterThan(String value) {
            addCriterion("pw >", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwGreaterThanOrEqualTo(String value) {
            addCriterion("pw >=", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwLessThan(String value) {
            addCriterion("pw <", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwLessThanOrEqualTo(String value) {
            addCriterion("pw <=", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwLike(String value) {
            addCriterion("pw like", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwNotLike(String value) {
            addCriterion("pw not like", value, "pw");
            return (Criteria) this;
        }

        public Criteria andPwIn(List<String> values) {
            addCriterion("pw in", values, "pw");
            return (Criteria) this;
        }

        public Criteria andPwNotIn(List<String> values) {
            addCriterion("pw not in", values, "pw");
            return (Criteria) this;
        }

        public Criteria andPwBetween(String value1, String value2) {
            addCriterion("pw between", value1, value2, "pw");
            return (Criteria) this;
        }

        public Criteria andPwNotBetween(String value1, String value2) {
            addCriterion("pw not between", value1, value2, "pw");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNull() {
            addCriterion("authority is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIsNotNull() {
            addCriterion("authority is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityEqualTo(Integer value) {
            addCriterion("authority =", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotEqualTo(Integer value) {
            addCriterion("authority <>", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThan(Integer value) {
            addCriterion("authority >", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority >=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThan(Integer value) {
            addCriterion("authority <", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("authority <=", value, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityIn(List<Integer> values) {
            addCriterion("authority in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotIn(List<Integer> values) {
            addCriterion("authority not in", values, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("authority between", value1, value2, "authority");
            return (Criteria) this;
        }

        public Criteria andAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("authority not between", value1, value2, "authority");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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