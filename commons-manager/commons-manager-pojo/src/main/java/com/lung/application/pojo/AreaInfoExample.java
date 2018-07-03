package com.lung.application.pojo;

import java.util.ArrayList;
import java.util.List;

public class AreaInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaInfoExample() {
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

        public Criteria andArea_idIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andArea_idIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andArea_idEqualTo(Long value) {
            addCriterion("area_id =", value, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idGreaterThan(Long value) {
            addCriterion("area_id >", value, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idLessThan(Long value) {
            addCriterion("area_id <", value, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idIn(List<Long> values) {
            addCriterion("area_id in", values, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_idNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "area_id");
            return (Criteria) this;
        }

        public Criteria andArea_codeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andArea_codeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andArea_codeEqualTo(Long value) {
            addCriterion("area_code =", value, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeNotEqualTo(Long value) {
            addCriterion("area_code <>", value, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeGreaterThan(Long value) {
            addCriterion("area_code >", value, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeGreaterThanOrEqualTo(Long value) {
            addCriterion("area_code >=", value, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeLessThan(Long value) {
            addCriterion("area_code <", value, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeLessThanOrEqualTo(Long value) {
            addCriterion("area_code <=", value, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeIn(List<Long> values) {
            addCriterion("area_code in", values, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeNotIn(List<Long> values) {
            addCriterion("area_code not in", values, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeBetween(Long value1, Long value2) {
            addCriterion("area_code between", value1, value2, "area_code");
            return (Criteria) this;
        }

        public Criteria andArea_codeNotBetween(Long value1, Long value2) {
            addCriterion("area_code not between", value1, value2, "area_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeIsNull() {
            addCriterion("parent_code is null");
            return (Criteria) this;
        }

        public Criteria andParent_codeIsNotNull() {
            addCriterion("parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andParent_codeEqualTo(Long value) {
            addCriterion("parent_code =", value, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeNotEqualTo(Long value) {
            addCriterion("parent_code <>", value, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeGreaterThan(Long value) {
            addCriterion("parent_code >", value, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_code >=", value, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeLessThan(Long value) {
            addCriterion("parent_code <", value, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeLessThanOrEqualTo(Long value) {
            addCriterion("parent_code <=", value, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeIn(List<Long> values) {
            addCriterion("parent_code in", values, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeNotIn(List<Long> values) {
            addCriterion("parent_code not in", values, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeBetween(Long value1, Long value2) {
            addCriterion("parent_code between", value1, value2, "parent_code");
            return (Criteria) this;
        }

        public Criteria andParent_codeNotBetween(Long value1, Long value2) {
            addCriterion("parent_code not between", value1, value2, "parent_code");
            return (Criteria) this;
        }

        public Criteria andFull_nameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFull_nameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFull_nameEqualTo(String value) {
            addCriterion("full_name =", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameGreaterThan(String value) {
            addCriterion("full_name >", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameLessThan(String value) {
            addCriterion("full_name <", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameLike(String value) {
            addCriterion("full_name like", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotLike(String value) {
            addCriterion("full_name not like", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameIn(List<String> values) {
            addCriterion("full_name in", values, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "full_name");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFrist_spellIsNull() {
            addCriterion("frist_spell is null");
            return (Criteria) this;
        }

        public Criteria andFrist_spellIsNotNull() {
            addCriterion("frist_spell is not null");
            return (Criteria) this;
        }

        public Criteria andFrist_spellEqualTo(String value) {
            addCriterion("frist_spell =", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellNotEqualTo(String value) {
            addCriterion("frist_spell <>", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellGreaterThan(String value) {
            addCriterion("frist_spell >", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellGreaterThanOrEqualTo(String value) {
            addCriterion("frist_spell >=", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellLessThan(String value) {
            addCriterion("frist_spell <", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellLessThanOrEqualTo(String value) {
            addCriterion("frist_spell <=", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellLike(String value) {
            addCriterion("frist_spell like", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellNotLike(String value) {
            addCriterion("frist_spell not like", value, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellIn(List<String> values) {
            addCriterion("frist_spell in", values, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellNotIn(List<String> values) {
            addCriterion("frist_spell not in", values, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellBetween(String value1, String value2) {
            addCriterion("frist_spell between", value1, value2, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andFrist_spellNotBetween(String value1, String value2) {
            addCriterion("frist_spell not between", value1, value2, "frist_spell");
            return (Criteria) this;
        }

        public Criteria andArea_levelIsNull() {
            addCriterion("area_level is null");
            return (Criteria) this;
        }

        public Criteria andArea_levelIsNotNull() {
            addCriterion("area_level is not null");
            return (Criteria) this;
        }

        public Criteria andArea_levelEqualTo(Integer value) {
            addCriterion("area_level =", value, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelNotEqualTo(Integer value) {
            addCriterion("area_level <>", value, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelGreaterThan(Integer value) {
            addCriterion("area_level >", value, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_level >=", value, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelLessThan(Integer value) {
            addCriterion("area_level <", value, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelLessThanOrEqualTo(Integer value) {
            addCriterion("area_level <=", value, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelIn(List<Integer> values) {
            addCriterion("area_level in", values, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelNotIn(List<Integer> values) {
            addCriterion("area_level not in", values, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelBetween(Integer value1, Integer value2) {
            addCriterion("area_level between", value1, value2, "area_level");
            return (Criteria) this;
        }

        public Criteria andArea_levelNotBetween(Integer value1, Integer value2) {
            addCriterion("area_level not between", value1, value2, "area_level");
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