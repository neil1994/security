package com.ele_cloud.fp5i.security.resource.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andPkResourceIsNull() {
            addCriterion("pk_resource is null");
            return (Criteria) this;
        }

        public Criteria andPkResourceIsNotNull() {
            addCriterion("pk_resource is not null");
            return (Criteria) this;
        }

        public Criteria andPkResourceEqualTo(String value) {
            addCriterion("pk_resource =", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceNotEqualTo(String value) {
            addCriterion("pk_resource <>", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceGreaterThan(String value) {
            addCriterion("pk_resource >", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceGreaterThanOrEqualTo(String value) {
            addCriterion("pk_resource >=", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceLessThan(String value) {
            addCriterion("pk_resource <", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceLessThanOrEqualTo(String value) {
            addCriterion("pk_resource <=", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceLike(String value) {
            addCriterion("pk_resource like", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceNotLike(String value) {
            addCriterion("pk_resource not like", value, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceIn(List<String> values) {
            addCriterion("pk_resource in", values, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceNotIn(List<String> values) {
            addCriterion("pk_resource not in", values, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceBetween(String value1, String value2) {
            addCriterion("pk_resource between", value1, value2, "pkResource");
            return (Criteria) this;
        }

        public Criteria andPkResourceNotBetween(String value1, String value2) {
            addCriterion("pk_resource not between", value1, value2, "pkResource");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("resource_name is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resource_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resource_name =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resource_name <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resource_name >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_name >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resource_name <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resource_name <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resource_name like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resource_name not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("resource_name in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("resource_name not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resource_name between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resource_name not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNull() {
            addCriterion("resource_code is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("resource_code is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(String value) {
            addCriterion("resource_code =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(String value) {
            addCriterion("resource_code <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(String value) {
            addCriterion("resource_code >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_code >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(String value) {
            addCriterion("resource_code <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(String value) {
            addCriterion("resource_code <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLike(String value) {
            addCriterion("resource_code like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotLike(String value) {
            addCriterion("resource_code not like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<String> values) {
            addCriterion("resource_code in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<String> values) {
            addCriterion("resource_code not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(String value1, String value2) {
            addCriterion("resource_code between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(String value1, String value2) {
            addCriterion("resource_code not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("resource_type like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("resource_type not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIsNull() {
            addCriterion("resource_status is null");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIsNotNull() {
            addCriterion("resource_status is not null");
            return (Criteria) this;
        }

        public Criteria andResourceStatusEqualTo(String value) {
            addCriterion("resource_status =", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusNotEqualTo(String value) {
            addCriterion("resource_status <>", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusGreaterThan(String value) {
            addCriterion("resource_status >", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("resource_status >=", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusLessThan(String value) {
            addCriterion("resource_status <", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusLessThanOrEqualTo(String value) {
            addCriterion("resource_status <=", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusLike(String value) {
            addCriterion("resource_status like", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusNotLike(String value) {
            addCriterion("resource_status not like", value, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusIn(List<String> values) {
            addCriterion("resource_status in", values, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusNotIn(List<String> values) {
            addCriterion("resource_status not in", values, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusBetween(String value1, String value2) {
            addCriterion("resource_status between", value1, value2, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceStatusNotBetween(String value1, String value2) {
            addCriterion("resource_status not between", value1, value2, "resourceStatus");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNull() {
            addCriterion("resource_url is null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNotNull() {
            addCriterion("resource_url is not null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlEqualTo(String value) {
            addCriterion("resource_url =", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotEqualTo(String value) {
            addCriterion("resource_url <>", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThan(String value) {
            addCriterion("resource_url >", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("resource_url >=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThan(String value) {
            addCriterion("resource_url <", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThanOrEqualTo(String value) {
            addCriterion("resource_url <=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLike(String value) {
            addCriterion("resource_url like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotLike(String value) {
            addCriterion("resource_url not like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIn(List<String> values) {
            addCriterion("resource_url in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotIn(List<String> values) {
            addCriterion("resource_url not in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlBetween(String value1, String value2) {
            addCriterion("resource_url between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotBetween(String value1, String value2) {
            addCriterion("resource_url not between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdIsNull() {
            addCriterion("resource_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdIsNotNull() {
            addCriterion("resource_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdEqualTo(String value) {
            addCriterion("resource_parent_id =", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdNotEqualTo(String value) {
            addCriterion("resource_parent_id <>", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdGreaterThan(String value) {
            addCriterion("resource_parent_id >", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_parent_id >=", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdLessThan(String value) {
            addCriterion("resource_parent_id <", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdLessThanOrEqualTo(String value) {
            addCriterion("resource_parent_id <=", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdLike(String value) {
            addCriterion("resource_parent_id like", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdNotLike(String value) {
            addCriterion("resource_parent_id not like", value, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdIn(List<String> values) {
            addCriterion("resource_parent_id in", values, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdNotIn(List<String> values) {
            addCriterion("resource_parent_id not in", values, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdBetween(String value1, String value2) {
            addCriterion("resource_parent_id between", value1, value2, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceParentIdNotBetween(String value1, String value2) {
            addCriterion("resource_parent_id not between", value1, value2, "resourceParentId");
            return (Criteria) this;
        }

        public Criteria andResourceOrderIsNull() {
            addCriterion("resource_order is null");
            return (Criteria) this;
        }

        public Criteria andResourceOrderIsNotNull() {
            addCriterion("resource_order is not null");
            return (Criteria) this;
        }

        public Criteria andResourceOrderEqualTo(String value) {
            addCriterion("resource_order =", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotEqualTo(String value) {
            addCriterion("resource_order <>", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderGreaterThan(String value) {
            addCriterion("resource_order >", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderGreaterThanOrEqualTo(String value) {
            addCriterion("resource_order >=", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderLessThan(String value) {
            addCriterion("resource_order <", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderLessThanOrEqualTo(String value) {
            addCriterion("resource_order <=", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderLike(String value) {
            addCriterion("resource_order like", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotLike(String value) {
            addCriterion("resource_order not like", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderIn(List<String> values) {
            addCriterion("resource_order in", values, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotIn(List<String> values) {
            addCriterion("resource_order not in", values, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderBetween(String value1, String value2) {
            addCriterion("resource_order between", value1, value2, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotBetween(String value1, String value2) {
            addCriterion("resource_order not between", value1, value2, "resourceOrder");
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

        public Criteria andSystemIdIsNull() {
            addCriterion("system_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("system_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(String value) {
            addCriterion("system_id =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(String value) {
            addCriterion("system_id <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(String value) {
            addCriterion("system_id >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("system_id >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(String value) {
            addCriterion("system_id <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(String value) {
            addCriterion("system_id <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLike(String value) {
            addCriterion("system_id like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotLike(String value) {
            addCriterion("system_id not like", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<String> values) {
            addCriterion("system_id in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<String> values) {
            addCriterion("system_id not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(String value1, String value2) {
            addCriterion("system_id between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(String value1, String value2) {
            addCriterion("system_id not between", value1, value2, "systemId");
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