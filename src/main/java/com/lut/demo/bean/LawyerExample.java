package com.lut.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class LawyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawyerExample() {
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

        public Criteria andLawyeridIsNull() {
            addCriterion("lawyerid is null");
            return (Criteria) this;
        }

        public Criteria andLawyeridIsNotNull() {
            addCriterion("lawyerid is not null");
            return (Criteria) this;
        }

        public Criteria andLawyeridEqualTo(Integer value) {
            addCriterion("lawyerid =", value, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridNotEqualTo(Integer value) {
            addCriterion("lawyerid <>", value, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridGreaterThan(Integer value) {
            addCriterion("lawyerid >", value, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("lawyerid >=", value, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridLessThan(Integer value) {
            addCriterion("lawyerid <", value, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridLessThanOrEqualTo(Integer value) {
            addCriterion("lawyerid <=", value, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridIn(List<Integer> values) {
            addCriterion("lawyerid in", values, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridNotIn(List<Integer> values) {
            addCriterion("lawyerid not in", values, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridBetween(Integer value1, Integer value2) {
            addCriterion("lawyerid between", value1, value2, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyeridNotBetween(Integer value1, Integer value2) {
            addCriterion("lawyerid not between", value1, value2, "lawyerid");
            return (Criteria) this;
        }

        public Criteria andLawyernameIsNull() {
            addCriterion("lawyername is null");
            return (Criteria) this;
        }

        public Criteria andLawyernameIsNotNull() {
            addCriterion("lawyername is not null");
            return (Criteria) this;
        }

        public Criteria andLawyernameEqualTo(String value) {
            addCriterion("lawyername =", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameNotEqualTo(String value) {
            addCriterion("lawyername <>", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameGreaterThan(String value) {
            addCriterion("lawyername >", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameGreaterThanOrEqualTo(String value) {
            addCriterion("lawyername >=", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameLessThan(String value) {
            addCriterion("lawyername <", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameLessThanOrEqualTo(String value) {
            addCriterion("lawyername <=", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameLike(String value) {
            addCriterion("lawyername like", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameNotLike(String value) {
            addCriterion("lawyername not like", value, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameIn(List<String> values) {
            addCriterion("lawyername in", values, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameNotIn(List<String> values) {
            addCriterion("lawyername not in", values, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameBetween(String value1, String value2) {
            addCriterion("lawyername between", value1, value2, "lawyername");
            return (Criteria) this;
        }

        public Criteria andLawyernameNotBetween(String value1, String value2) {
            addCriterion("lawyername not between", value1, value2, "lawyername");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andOfficeidIsNull() {
            addCriterion("officeid is null");
            return (Criteria) this;
        }

        public Criteria andOfficeidIsNotNull() {
            addCriterion("officeid is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeidEqualTo(Integer value) {
            addCriterion("officeid =", value, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidNotEqualTo(Integer value) {
            addCriterion("officeid <>", value, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidGreaterThan(Integer value) {
            addCriterion("officeid >", value, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("officeid >=", value, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidLessThan(Integer value) {
            addCriterion("officeid <", value, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidLessThanOrEqualTo(Integer value) {
            addCriterion("officeid <=", value, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidIn(List<Integer> values) {
            addCriterion("officeid in", values, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidNotIn(List<Integer> values) {
            addCriterion("officeid not in", values, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidBetween(Integer value1, Integer value2) {
            addCriterion("officeid between", value1, value2, "officeid");
            return (Criteria) this;
        }

        public Criteria andOfficeidNotBetween(Integer value1, Integer value2) {
            addCriterion("officeid not between", value1, value2, "officeid");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCertificationidIsNull() {
            addCriterion("certificationid is null");
            return (Criteria) this;
        }

        public Criteria andCertificationidIsNotNull() {
            addCriterion("certificationid is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationidEqualTo(String value) {
            addCriterion("certificationid =", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotEqualTo(String value) {
            addCriterion("certificationid <>", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidGreaterThan(String value) {
            addCriterion("certificationid >", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidGreaterThanOrEqualTo(String value) {
            addCriterion("certificationid >=", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLessThan(String value) {
            addCriterion("certificationid <", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLessThanOrEqualTo(String value) {
            addCriterion("certificationid <=", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLike(String value) {
            addCriterion("certificationid like", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotLike(String value) {
            addCriterion("certificationid not like", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidIn(List<String> values) {
            addCriterion("certificationid in", values, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotIn(List<String> values) {
            addCriterion("certificationid not in", values, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidBetween(String value1, String value2) {
            addCriterion("certificationid between", value1, value2, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotBetween(String value1, String value2) {
            addCriterion("certificationid not between", value1, value2, "certificationid");
            return (Criteria) this;
        }

        public Criteria andPictureurlIsNull() {
            addCriterion("pictureurl is null");
            return (Criteria) this;
        }

        public Criteria andPictureurlIsNotNull() {
            addCriterion("pictureurl is not null");
            return (Criteria) this;
        }

        public Criteria andPictureurlEqualTo(String value) {
            addCriterion("pictureurl =", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotEqualTo(String value) {
            addCriterion("pictureurl <>", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlGreaterThan(String value) {
            addCriterion("pictureurl >", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlGreaterThanOrEqualTo(String value) {
            addCriterion("pictureurl >=", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlLessThan(String value) {
            addCriterion("pictureurl <", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlLessThanOrEqualTo(String value) {
            addCriterion("pictureurl <=", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlLike(String value) {
            addCriterion("pictureurl like", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotLike(String value) {
            addCriterion("pictureurl not like", value, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlIn(List<String> values) {
            addCriterion("pictureurl in", values, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotIn(List<String> values) {
            addCriterion("pictureurl not in", values, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlBetween(String value1, String value2) {
            addCriterion("pictureurl between", value1, value2, "pictureurl");
            return (Criteria) this;
        }

        public Criteria andPictureurlNotBetween(String value1, String value2) {
            addCriterion("pictureurl not between", value1, value2, "pictureurl");
            return (Criteria) this;
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