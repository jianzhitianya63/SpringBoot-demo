package com.xhxx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlesExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginurlIsNull() {
            addCriterion("originUrl is null");
            return (Criteria) this;
        }

        public Criteria andOriginurlIsNotNull() {
            addCriterion("originUrl is not null");
            return (Criteria) this;
        }

        public Criteria andOriginurlEqualTo(String value) {
            addCriterion("originUrl =", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlNotEqualTo(String value) {
            addCriterion("originUrl <>", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlGreaterThan(String value) {
            addCriterion("originUrl >", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlGreaterThanOrEqualTo(String value) {
            addCriterion("originUrl >=", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlLessThan(String value) {
            addCriterion("originUrl <", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlLessThanOrEqualTo(String value) {
            addCriterion("originUrl <=", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlLike(String value) {
            addCriterion("originUrl like", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlNotLike(String value) {
            addCriterion("originUrl not like", value, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlIn(List<String> values) {
            addCriterion("originUrl in", values, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlNotIn(List<String> values) {
            addCriterion("originUrl not in", values, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlBetween(String value1, String value2) {
            addCriterion("originUrl between", value1, value2, "originurl");
            return (Criteria) this;
        }

        public Criteria andOriginurlNotBetween(String value1, String value2) {
            addCriterion("originUrl not between", value1, value2, "originurl");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andCategory1IsNull() {
            addCriterion("category1 is null");
            return (Criteria) this;
        }

        public Criteria andCategory1IsNotNull() {
            addCriterion("category1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1EqualTo(Integer value) {
            addCriterion("category1 =", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotEqualTo(Integer value) {
            addCriterion("category1 <>", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1GreaterThan(Integer value) {
            addCriterion("category1 >", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category1 >=", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1LessThan(Integer value) {
            addCriterion("category1 <", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1LessThanOrEqualTo(Integer value) {
            addCriterion("category1 <=", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1In(List<Integer> values) {
            addCriterion("category1 in", values, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotIn(List<Integer> values) {
            addCriterion("category1 not in", values, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1Between(Integer value1, Integer value2) {
            addCriterion("category1 between", value1, value2, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotBetween(Integer value1, Integer value2) {
            addCriterion("category1 not between", value1, value2, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory2IsNull() {
            addCriterion("category2 is null");
            return (Criteria) this;
        }

        public Criteria andCategory2IsNotNull() {
            addCriterion("category2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2EqualTo(Integer value) {
            addCriterion("category2 =", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotEqualTo(Integer value) {
            addCriterion("category2 <>", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2GreaterThan(Integer value) {
            addCriterion("category2 >", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category2 >=", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2LessThan(Integer value) {
            addCriterion("category2 <", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2LessThanOrEqualTo(Integer value) {
            addCriterion("category2 <=", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2In(List<Integer> values) {
            addCriterion("category2 in", values, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotIn(List<Integer> values) {
            addCriterion("category2 not in", values, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2Between(Integer value1, Integer value2) {
            addCriterion("category2 between", value1, value2, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotBetween(Integer value1, Integer value2) {
            addCriterion("category2 not between", value1, value2, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory3IsNull() {
            addCriterion("category3 is null");
            return (Criteria) this;
        }

        public Criteria andCategory3IsNotNull() {
            addCriterion("category3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory3EqualTo(Integer value) {
            addCriterion("category3 =", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3NotEqualTo(Integer value) {
            addCriterion("category3 <>", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3GreaterThan(Integer value) {
            addCriterion("category3 >", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3GreaterThanOrEqualTo(Integer value) {
            addCriterion("category3 >=", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3LessThan(Integer value) {
            addCriterion("category3 <", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3LessThanOrEqualTo(Integer value) {
            addCriterion("category3 <=", value, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3In(List<Integer> values) {
            addCriterion("category3 in", values, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3NotIn(List<Integer> values) {
            addCriterion("category3 not in", values, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3Between(Integer value1, Integer value2) {
            addCriterion("category3 between", value1, value2, "category3");
            return (Criteria) this;
        }

        public Criteria andCategory3NotBetween(Integer value1, Integer value2) {
            addCriterion("category3 not between", value1, value2, "category3");
            return (Criteria) this;
        }

        public Criteria andImage1IsNull() {
            addCriterion("image1 is null");
            return (Criteria) this;
        }

        public Criteria andImage1IsNotNull() {
            addCriterion("image1 is not null");
            return (Criteria) this;
        }

        public Criteria andImage1EqualTo(String value) {
            addCriterion("image1 =", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotEqualTo(String value) {
            addCriterion("image1 <>", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThan(String value) {
            addCriterion("image1 >", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1GreaterThanOrEqualTo(String value) {
            addCriterion("image1 >=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThan(String value) {
            addCriterion("image1 <", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1LessThanOrEqualTo(String value) {
            addCriterion("image1 <=", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Like(String value) {
            addCriterion("image1 like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotLike(String value) {
            addCriterion("image1 not like", value, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1In(List<String> values) {
            addCriterion("image1 in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotIn(List<String> values) {
            addCriterion("image1 not in", values, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1Between(String value1, String value2) {
            addCriterion("image1 between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage1NotBetween(String value1, String value2) {
            addCriterion("image1 not between", value1, value2, "image1");
            return (Criteria) this;
        }

        public Criteria andImage2IsNull() {
            addCriterion("image2 is null");
            return (Criteria) this;
        }

        public Criteria andImage2IsNotNull() {
            addCriterion("image2 is not null");
            return (Criteria) this;
        }

        public Criteria andImage2EqualTo(String value) {
            addCriterion("image2 =", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotEqualTo(String value) {
            addCriterion("image2 <>", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThan(String value) {
            addCriterion("image2 >", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2GreaterThanOrEqualTo(String value) {
            addCriterion("image2 >=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThan(String value) {
            addCriterion("image2 <", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2LessThanOrEqualTo(String value) {
            addCriterion("image2 <=", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Like(String value) {
            addCriterion("image2 like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotLike(String value) {
            addCriterion("image2 not like", value, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2In(List<String> values) {
            addCriterion("image2 in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotIn(List<String> values) {
            addCriterion("image2 not in", values, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2Between(String value1, String value2) {
            addCriterion("image2 between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage2NotBetween(String value1, String value2) {
            addCriterion("image2 not between", value1, value2, "image2");
            return (Criteria) this;
        }

        public Criteria andImage3IsNull() {
            addCriterion("image3 is null");
            return (Criteria) this;
        }

        public Criteria andImage3IsNotNull() {
            addCriterion("image3 is not null");
            return (Criteria) this;
        }

        public Criteria andImage3EqualTo(String value) {
            addCriterion("image3 =", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotEqualTo(String value) {
            addCriterion("image3 <>", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThan(String value) {
            addCriterion("image3 >", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3GreaterThanOrEqualTo(String value) {
            addCriterion("image3 >=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThan(String value) {
            addCriterion("image3 <", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3LessThanOrEqualTo(String value) {
            addCriterion("image3 <=", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Like(String value) {
            addCriterion("image3 like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotLike(String value) {
            addCriterion("image3 not like", value, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3In(List<String> values) {
            addCriterion("image3 in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotIn(List<String> values) {
            addCriterion("image3 not in", values, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3Between(String value1, String value2) {
            addCriterion("image3 between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andImage3NotBetween(String value1, String value2) {
            addCriterion("image3 not between", value1, value2, "image3");
            return (Criteria) this;
        }

        public Criteria andImagecountIsNull() {
            addCriterion("imageCount is null");
            return (Criteria) this;
        }

        public Criteria andImagecountIsNotNull() {
            addCriterion("imageCount is not null");
            return (Criteria) this;
        }

        public Criteria andImagecountEqualTo(Integer value) {
            addCriterion("imageCount =", value, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountNotEqualTo(Integer value) {
            addCriterion("imageCount <>", value, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountGreaterThan(Integer value) {
            addCriterion("imageCount >", value, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("imageCount >=", value, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountLessThan(Integer value) {
            addCriterion("imageCount <", value, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountLessThanOrEqualTo(Integer value) {
            addCriterion("imageCount <=", value, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountIn(List<Integer> values) {
            addCriterion("imageCount in", values, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountNotIn(List<Integer> values) {
            addCriterion("imageCount not in", values, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountBetween(Integer value1, Integer value2) {
            addCriterion("imageCount between", value1, value2, "imagecount");
            return (Criteria) this;
        }

        public Criteria andImagecountNotBetween(Integer value1, Integer value2) {
            addCriterion("imageCount not between", value1, value2, "imagecount");
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andReadnumIsNull() {
            addCriterion("readNum is null");
            return (Criteria) this;
        }

        public Criteria andReadnumIsNotNull() {
            addCriterion("readNum is not null");
            return (Criteria) this;
        }

        public Criteria andReadnumEqualTo(Integer value) {
            addCriterion("readNum =", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotEqualTo(Integer value) {
            addCriterion("readNum <>", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumGreaterThan(Integer value) {
            addCriterion("readNum >", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("readNum >=", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumLessThan(Integer value) {
            addCriterion("readNum <", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumLessThanOrEqualTo(Integer value) {
            addCriterion("readNum <=", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumIn(List<Integer> values) {
            addCriterion("readNum in", values, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotIn(List<Integer> values) {
            addCriterion("readNum not in", values, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumBetween(Integer value1, Integer value2) {
            addCriterion("readNum between", value1, value2, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("readNum not between", value1, value2, "readnum");
            return (Criteria) this;
        }

        public Criteria andPraisenumIsNull() {
            addCriterion("praiseNum is null");
            return (Criteria) this;
        }

        public Criteria andPraisenumIsNotNull() {
            addCriterion("praiseNum is not null");
            return (Criteria) this;
        }

        public Criteria andPraisenumEqualTo(Integer value) {
            addCriterion("praiseNum =", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotEqualTo(Integer value) {
            addCriterion("praiseNum <>", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumGreaterThan(Integer value) {
            addCriterion("praiseNum >", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("praiseNum >=", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumLessThan(Integer value) {
            addCriterion("praiseNum <", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumLessThanOrEqualTo(Integer value) {
            addCriterion("praiseNum <=", value, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumIn(List<Integer> values) {
            addCriterion("praiseNum in", values, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotIn(List<Integer> values) {
            addCriterion("praiseNum not in", values, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumBetween(Integer value1, Integer value2) {
            addCriterion("praiseNum between", value1, value2, "praisenum");
            return (Criteria) this;
        }

        public Criteria andPraisenumNotBetween(Integer value1, Integer value2) {
            addCriterion("praiseNum not between", value1, value2, "praisenum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNull() {
            addCriterion("commentNum is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("commentNum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Integer value) {
            addCriterion("commentNum =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Integer value) {
            addCriterion("commentNum <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Integer value) {
            addCriterion("commentNum >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentNum >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Integer value) {
            addCriterion("commentNum <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("commentNum <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Integer> values) {
            addCriterion("commentNum in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Integer> values) {
            addCriterion("commentNum not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("commentNum between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("commentNum not between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeIsNull() {
            addCriterion("lastOperateTime is null");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeIsNotNull() {
            addCriterion("lastOperateTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeEqualTo(Date value) {
            addCriterion("lastOperateTime =", value, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeNotEqualTo(Date value) {
            addCriterion("lastOperateTime <>", value, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeGreaterThan(Date value) {
            addCriterion("lastOperateTime >", value, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastOperateTime >=", value, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeLessThan(Date value) {
            addCriterion("lastOperateTime <", value, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastOperateTime <=", value, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeIn(List<Date> values) {
            addCriterion("lastOperateTime in", values, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeNotIn(List<Date> values) {
            addCriterion("lastOperateTime not in", values, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeBetween(Date value1, Date value2) {
            addCriterion("lastOperateTime between", value1, value2, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastOperateTime not between", value1, value2, "lastoperatetime");
            return (Criteria) this;
        }

        public Criteria andLastoperatorIsNull() {
            addCriterion("lastOperator is null");
            return (Criteria) this;
        }

        public Criteria andLastoperatorIsNotNull() {
            addCriterion("lastOperator is not null");
            return (Criteria) this;
        }

        public Criteria andLastoperatorEqualTo(String value) {
            addCriterion("lastOperator =", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorNotEqualTo(String value) {
            addCriterion("lastOperator <>", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorGreaterThan(String value) {
            addCriterion("lastOperator >", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorGreaterThanOrEqualTo(String value) {
            addCriterion("lastOperator >=", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorLessThan(String value) {
            addCriterion("lastOperator <", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorLessThanOrEqualTo(String value) {
            addCriterion("lastOperator <=", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorLike(String value) {
            addCriterion("lastOperator like", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorNotLike(String value) {
            addCriterion("lastOperator not like", value, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorIn(List<String> values) {
            addCriterion("lastOperator in", values, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorNotIn(List<String> values) {
            addCriterion("lastOperator not in", values, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorBetween(String value1, String value2) {
            addCriterion("lastOperator between", value1, value2, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andLastoperatorNotBetween(String value1, String value2) {
            addCriterion("lastOperator not between", value1, value2, "lastoperator");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(Integer value) {
            addCriterion("from =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(Integer value) {
            addCriterion("from <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(Integer value) {
            addCriterion("from >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("from >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(Integer value) {
            addCriterion("from <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(Integer value) {
            addCriterion("from <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<Integer> values) {
            addCriterion("from in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<Integer> values) {
            addCriterion("from not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(Integer value1, Integer value2) {
            addCriterion("from between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(Integer value1, Integer value2) {
            addCriterion("from not between", value1, value2, "from");
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