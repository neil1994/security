package com.ele_cloud.fp5i.security.resource.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemExample() {
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

        public Criteria andPkSystemIsNull() {
            addCriterion("pk_system is null");
            return (Criteria) this;
        }

        public Criteria andPkSystemIsNotNull() {
            addCriterion("pk_system is not null");
            return (Criteria) this;
        }

        public Criteria andPkSystemEqualTo(String value) {
            addCriterion("pk_system =", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotEqualTo(String value) {
            addCriterion("pk_system <>", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemGreaterThan(String value) {
            addCriterion("pk_system >", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemGreaterThanOrEqualTo(String value) {
            addCriterion("pk_system >=", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemLessThan(String value) {
            addCriterion("pk_system <", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemLessThanOrEqualTo(String value) {
            addCriterion("pk_system <=", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemLike(String value) {
            addCriterion("pk_system like", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotLike(String value) {
            addCriterion("pk_system not like", value, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemIn(List<String> values) {
            addCriterion("pk_system in", values, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotIn(List<String> values) {
            addCriterion("pk_system not in", values, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemBetween(String value1, String value2) {
            addCriterion("pk_system between", value1, value2, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andPkSystemNotBetween(String value1, String value2) {
            addCriterion("pk_system not between", value1, value2, "pkSystem");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNull() {
            addCriterion("system_name is null");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNotNull() {
            addCriterion("system_name is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNameEqualTo(String value) {
            addCriterion("system_name =", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotEqualTo(String value) {
            addCriterion("system_name <>", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThan(String value) {
            addCriterion("system_name >", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("system_name >=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThan(String value) {
            addCriterion("system_name <", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThanOrEqualTo(String value) {
            addCriterion("system_name <=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLike(String value) {
            addCriterion("system_name like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotLike(String value) {
            addCriterion("system_name not like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameIn(List<String> values) {
            addCriterion("system_name in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotIn(List<String> values) {
            addCriterion("system_name not in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameBetween(String value1, String value2) {
            addCriterion("system_name between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotBetween(String value1, String value2) {
            addCriterion("system_name not between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNull() {
            addCriterion("system_code is null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNotNull() {
            addCriterion("system_code is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeEqualTo(String value) {
            addCriterion("system_code =", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotEqualTo(String value) {
            addCriterion("system_code <>", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThan(String value) {
            addCriterion("system_code >", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("system_code >=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThan(String value) {
            addCriterion("system_code <", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThanOrEqualTo(String value) {
            addCriterion("system_code <=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLike(String value) {
            addCriterion("system_code like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotLike(String value) {
            addCriterion("system_code not like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIn(List<String> values) {
            addCriterion("system_code in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotIn(List<String> values) {
            addCriterion("system_code not in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeBetween(String value1, String value2) {
            addCriterion("system_code between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotBetween(String value1, String value2) {
            addCriterion("system_code not between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemStatusIsNull() {
            addCriterion("system_status is null");
            return (Criteria) this;
        }

        public Criteria andSystemStatusIsNotNull() {
            addCriterion("system_status is not null");
            return (Criteria) this;
        }

        public Criteria andSystemStatusEqualTo(String value) {
            addCriterion("system_status =", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusNotEqualTo(String value) {
            addCriterion("system_status <>", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusGreaterThan(String value) {
            addCriterion("system_status >", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusGreaterThanOrEqualTo(String value) {
            addCriterion("system_status >=", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusLessThan(String value) {
            addCriterion("system_status <", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusLessThanOrEqualTo(String value) {
            addCriterion("system_status <=", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusLike(String value) {
            addCriterion("system_status like", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusNotLike(String value) {
            addCriterion("system_status not like", value, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusIn(List<String> values) {
            addCriterion("system_status in", values, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusNotIn(List<String> values) {
            addCriterion("system_status not in", values, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusBetween(String value1, String value2) {
            addCriterion("system_status between", value1, value2, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andSystemStatusNotBetween(String value1, String value2) {
            addCriterion("system_status not between", value1, value2, "systemStatus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatetorIsNull() {
            addCriterion("createtor is null");
            return (Criteria) this;
        }

        public Criteria andCreatetorIsNotNull() {
            addCriterion("createtor is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetorEqualTo(String value) {
            addCriterion("createtor =", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotEqualTo(String value) {
            addCriterion("createtor <>", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorGreaterThan(String value) {
            addCriterion("createtor >", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorGreaterThanOrEqualTo(String value) {
            addCriterion("createtor >=", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorLessThan(String value) {
            addCriterion("createtor <", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorLessThanOrEqualTo(String value) {
            addCriterion("createtor <=", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorLike(String value) {
            addCriterion("createtor like", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotLike(String value) {
            addCriterion("createtor not like", value, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorIn(List<String> values) {
            addCriterion("createtor in", values, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotIn(List<String> values) {
            addCriterion("createtor not in", values, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorBetween(String value1, String value2) {
            addCriterion("createtor between", value1, value2, "createtor");
            return (Criteria) this;
        }

        public Criteria andCreatetorNotBetween(String value1, String value2) {
            addCriterion("createtor not between", value1, value2, "createtor");
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