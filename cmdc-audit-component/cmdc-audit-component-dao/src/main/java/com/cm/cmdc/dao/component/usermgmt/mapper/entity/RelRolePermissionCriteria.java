package com.cm.cmdc.dao.component.usermgmt.mapper.entity;

import java.util.ArrayList;
import java.util.List;

public class RelRolePermissionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelRolePermissionCriteria() {
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

        public Criteria andPermissionUuidIsNull() {
            addCriterion("permission_uuid is null");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidIsNotNull() {
            addCriterion("permission_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidEqualTo(String value) {
            addCriterion("permission_uuid =", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotEqualTo(String value) {
            addCriterion("permission_uuid <>", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidGreaterThan(String value) {
            addCriterion("permission_uuid >", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidGreaterThanOrEqualTo(String value) {
            addCriterion("permission_uuid >=", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidLessThan(String value) {
            addCriterion("permission_uuid <", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidLessThanOrEqualTo(String value) {
            addCriterion("permission_uuid <=", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidLike(String value) {
            addCriterion("permission_uuid like", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotLike(String value) {
            addCriterion("permission_uuid not like", value, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidIn(List<String> values) {
            addCriterion("permission_uuid in", values, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotIn(List<String> values) {
            addCriterion("permission_uuid not in", values, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidBetween(String value1, String value2) {
            addCriterion("permission_uuid between", value1, value2, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andPermissionUuidNotBetween(String value1, String value2) {
            addCriterion("permission_uuid not between", value1, value2, "permissionUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIsNull() {
            addCriterion("role_uuid is null");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIsNotNull() {
            addCriterion("role_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUuidEqualTo(String value) {
            addCriterion("role_uuid =", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotEqualTo(String value) {
            addCriterion("role_uuid <>", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidGreaterThan(String value) {
            addCriterion("role_uuid >", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("role_uuid >=", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLessThan(String value) {
            addCriterion("role_uuid <", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLessThanOrEqualTo(String value) {
            addCriterion("role_uuid <=", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidLike(String value) {
            addCriterion("role_uuid like", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotLike(String value) {
            addCriterion("role_uuid not like", value, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidIn(List<String> values) {
            addCriterion("role_uuid in", values, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotIn(List<String> values) {
            addCriterion("role_uuid not in", values, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidBetween(String value1, String value2) {
            addCriterion("role_uuid between", value1, value2, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andRoleUuidNotBetween(String value1, String value2) {
            addCriterion("role_uuid not between", value1, value2, "roleUuid");
            return (Criteria) this;
        }

        public Criteria andGrantCodeIsNull() {
            addCriterion("grant_code is null");
            return (Criteria) this;
        }

        public Criteria andGrantCodeIsNotNull() {
            addCriterion("grant_code is not null");
            return (Criteria) this;
        }

        public Criteria andGrantCodeEqualTo(Integer value) {
            addCriterion("grant_code =", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotEqualTo(Integer value) {
            addCriterion("grant_code <>", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeGreaterThan(Integer value) {
            addCriterion("grant_code >", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grant_code >=", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeLessThan(Integer value) {
            addCriterion("grant_code <", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeLessThanOrEqualTo(Integer value) {
            addCriterion("grant_code <=", value, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeIn(List<Integer> values) {
            addCriterion("grant_code in", values, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotIn(List<Integer> values) {
            addCriterion("grant_code not in", values, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeBetween(Integer value1, Integer value2) {
            addCriterion("grant_code between", value1, value2, "grantCode");
            return (Criteria) this;
        }

        public Criteria andGrantCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("grant_code not between", value1, value2, "grantCode");
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