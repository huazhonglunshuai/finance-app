package com.wwj.finance.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsFinanceDateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsFinanceDateExample() {
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
     * @date 2018-07-02
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

        public Criteria andUniquekeyIsNull() {
            addCriterion("uniquekey is null");
            return (Criteria) this;
        }

        public Criteria andUniquekeyIsNotNull() {
            addCriterion("uniquekey is not null");
            return (Criteria) this;
        }

        public Criteria andUniquekeyEqualTo(String value) {
            addCriterion("uniquekey =", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotEqualTo(String value) {
            addCriterion("uniquekey <>", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyGreaterThan(String value) {
            addCriterion("uniquekey >", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyGreaterThanOrEqualTo(String value) {
            addCriterion("uniquekey >=", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyLessThan(String value) {
            addCriterion("uniquekey <", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyLessThanOrEqualTo(String value) {
            addCriterion("uniquekey <=", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyLike(String value) {
            addCriterion("uniquekey like", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotLike(String value) {
            addCriterion("uniquekey not like", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyIn(List<String> values) {
            addCriterion("uniquekey in", values, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotIn(List<String> values) {
            addCriterion("uniquekey not in", values, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyBetween(String value1, String value2) {
            addCriterion("uniquekey between", value1, value2, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotBetween(String value1, String value2) {
            addCriterion("uniquekey not between", value1, value2, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andContextIsNull() {
            addCriterion("context is null");
            return (Criteria) this;
        }

        public Criteria andContextIsNotNull() {
            addCriterion("context is not null");
            return (Criteria) this;
        }

        public Criteria andContextEqualTo(String value) {
            addCriterion("context =", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotEqualTo(String value) {
            addCriterion("context <>", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThan(String value) {
            addCriterion("context >", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextGreaterThanOrEqualTo(String value) {
            addCriterion("context >=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThan(String value) {
            addCriterion("context <", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLessThanOrEqualTo(String value) {
            addCriterion("context <=", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextLike(String value) {
            addCriterion("context like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotLike(String value) {
            addCriterion("context not like", value, "context");
            return (Criteria) this;
        }

        public Criteria andContextIn(List<String> values) {
            addCriterion("context in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotIn(List<String> values) {
            addCriterion("context not in", values, "context");
            return (Criteria) this;
        }

        public Criteria andContextBetween(String value1, String value2) {
            addCriterion("context between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andContextNotBetween(String value1, String value2) {
            addCriterion("context not between", value1, value2, "context");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSIsNull() {
            addCriterion("thumbnail_pic_s is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSIsNotNull() {
            addCriterion("thumbnail_pic_s is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSEqualTo(String value) {
            addCriterion("thumbnail_pic_s =", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSNotEqualTo(String value) {
            addCriterion("thumbnail_pic_s <>", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSGreaterThan(String value) {
            addCriterion("thumbnail_pic_s >", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic_s >=", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSLessThan(String value) {
            addCriterion("thumbnail_pic_s <", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic_s <=", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSLike(String value) {
            addCriterion("thumbnail_pic_s like", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSNotLike(String value) {
            addCriterion("thumbnail_pic_s not like", value, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSIn(List<String> values) {
            addCriterion("thumbnail_pic_s in", values, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSNotIn(List<String> values) {
            addCriterion("thumbnail_pic_s not in", values, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSBetween(String value1, String value2) {
            addCriterion("thumbnail_pic_s between", value1, value2, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicSNotBetween(String value1, String value2) {
            addCriterion("thumbnail_pic_s not between", value1, value2, "thumbnailPicS");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02IsNull() {
            addCriterion("thumbnail_pic_s02 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02IsNotNull() {
            addCriterion("thumbnail_pic_s02 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02EqualTo(String value) {
            addCriterion("thumbnail_pic_s02 =", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02NotEqualTo(String value) {
            addCriterion("thumbnail_pic_s02 <>", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02GreaterThan(String value) {
            addCriterion("thumbnail_pic_s02 >", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02GreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic_s02 >=", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02LessThan(String value) {
            addCriterion("thumbnail_pic_s02 <", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02LessThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic_s02 <=", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02Like(String value) {
            addCriterion("thumbnail_pic_s02 like", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02NotLike(String value) {
            addCriterion("thumbnail_pic_s02 not like", value, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02In(List<String> values) {
            addCriterion("thumbnail_pic_s02 in", values, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02NotIn(List<String> values) {
            addCriterion("thumbnail_pic_s02 not in", values, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02Between(String value1, String value2) {
            addCriterion("thumbnail_pic_s02 between", value1, value2, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS02NotBetween(String value1, String value2) {
            addCriterion("thumbnail_pic_s02 not between", value1, value2, "thumbnailPicS02");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03IsNull() {
            addCriterion("thumbnail_pic_s03 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03IsNotNull() {
            addCriterion("thumbnail_pic_s03 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03EqualTo(String value) {
            addCriterion("thumbnail_pic_s03 =", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03NotEqualTo(String value) {
            addCriterion("thumbnail_pic_s03 <>", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03GreaterThan(String value) {
            addCriterion("thumbnail_pic_s03 >", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03GreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic_s03 >=", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03LessThan(String value) {
            addCriterion("thumbnail_pic_s03 <", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03LessThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic_s03 <=", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03Like(String value) {
            addCriterion("thumbnail_pic_s03 like", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03NotLike(String value) {
            addCriterion("thumbnail_pic_s03 not like", value, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03In(List<String> values) {
            addCriterion("thumbnail_pic_s03 in", values, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03NotIn(List<String> values) {
            addCriterion("thumbnail_pic_s03 not in", values, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03Between(String value1, String value2) {
            addCriterion("thumbnail_pic_s03 between", value1, value2, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicS03NotBetween(String value1, String value2) {
            addCriterion("thumbnail_pic_s03 not between", value1, value2, "thumbnailPicS03");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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
     * @date 2018-07-02
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