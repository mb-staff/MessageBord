package jp.co.mbch.dataAccess.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TopicExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public TopicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicNoIsNull() {
            addCriterion("topic_no is null");
            return (Criteria) this;
        }

        public Criteria andTopicNoIsNotNull() {
            addCriterion("topic_no is not null");
            return (Criteria) this;
        }

        public Criteria andTopicNoEqualTo(Integer value) {
            addCriterion("topic_no =", value, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoNotEqualTo(Integer value) {
            addCriterion("topic_no <>", value, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoGreaterThan(Integer value) {
            addCriterion("topic_no >", value, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_no >=", value, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoLessThan(Integer value) {
            addCriterion("topic_no <", value, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoLessThanOrEqualTo(Integer value) {
            addCriterion("topic_no <=", value, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoIn(List<Integer> values) {
            addCriterion("topic_no in", values, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoNotIn(List<Integer> values) {
            addCriterion("topic_no not in", values, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoBetween(Integer value1, Integer value2) {
            addCriterion("topic_no between", value1, value2, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicNoNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_no not between", value1, value2, "topicNo");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdIsNull() {
            addCriterion("topic_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdIsNotNull() {
            addCriterion("topic_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdEqualTo(Integer value) {
            addCriterion("topic_type_id =", value, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdNotEqualTo(Integer value) {
            addCriterion("topic_type_id <>", value, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdGreaterThan(Integer value) {
            addCriterion("topic_type_id >", value, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_type_id >=", value, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdLessThan(Integer value) {
            addCriterion("topic_type_id <", value, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_type_id <=", value, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdIn(List<Integer> values) {
            addCriterion("topic_type_id in", values, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdNotIn(List<Integer> values) {
            addCriterion("topic_type_id not in", values, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_type_id between", value1, value2, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_type_id not between", value1, value2, "topicTypeId");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNull() {
            addCriterion("topic_name is null");
            return (Criteria) this;
        }

        public Criteria andTopicNameIsNotNull() {
            addCriterion("topic_name is not null");
            return (Criteria) this;
        }

        public Criteria andTopicNameEqualTo(String value) {
            addCriterion("topic_name =", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotEqualTo(String value) {
            addCriterion("topic_name <>", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThan(String value) {
            addCriterion("topic_name >", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameGreaterThanOrEqualTo(String value) {
            addCriterion("topic_name >=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThan(String value) {
            addCriterion("topic_name <", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLessThanOrEqualTo(String value) {
            addCriterion("topic_name <=", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameLike(String value) {
            addCriterion("topic_name like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotLike(String value) {
            addCriterion("topic_name not like", value, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameIn(List<String> values) {
            addCriterion("topic_name in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotIn(List<String> values) {
            addCriterion("topic_name not in", values, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameBetween(String value1, String value2) {
            addCriterion("topic_name between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicNameNotBetween(String value1, String value2) {
            addCriterion("topic_name not between", value1, value2, "topicName");
            return (Criteria) this;
        }

        public Criteria andTopicCommentIsNull() {
            addCriterion("topic_comment is null");
            return (Criteria) this;
        }

        public Criteria andTopicCommentIsNotNull() {
            addCriterion("topic_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTopicCommentEqualTo(String value) {
            addCriterion("topic_comment =", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotEqualTo(String value) {
            addCriterion("topic_comment <>", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentGreaterThan(String value) {
            addCriterion("topic_comment >", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentGreaterThanOrEqualTo(String value) {
            addCriterion("topic_comment >=", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentLessThan(String value) {
            addCriterion("topic_comment <", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentLessThanOrEqualTo(String value) {
            addCriterion("topic_comment <=", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentLike(String value) {
            addCriterion("topic_comment like", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotLike(String value) {
            addCriterion("topic_comment not like", value, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentIn(List<String> values) {
            addCriterion("topic_comment in", values, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotIn(List<String> values) {
            addCriterion("topic_comment not in", values, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentBetween(String value1, String value2) {
            addCriterion("topic_comment between", value1, value2, "topicComment");
            return (Criteria) this;
        }

        public Criteria andTopicCommentNotBetween(String value1, String value2) {
            addCriterion("topic_comment not between", value1, value2, "topicComment");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexIsNull() {
            addCriterion("display_index is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexIsNotNull() {
            addCriterion("display_index is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexEqualTo(Integer value) {
            addCriterion("display_index =", value, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexNotEqualTo(Integer value) {
            addCriterion("display_index <>", value, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexGreaterThan(Integer value) {
            addCriterion("display_index >", value, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_index >=", value, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexLessThan(Integer value) {
            addCriterion("display_index <", value, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexLessThanOrEqualTo(Integer value) {
            addCriterion("display_index <=", value, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexIn(List<Integer> values) {
            addCriterion("display_index in", values, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexNotIn(List<Integer> values) {
            addCriterion("display_index not in", values, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexBetween(Integer value1, Integer value2) {
            addCriterion("display_index between", value1, value2, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andDisplayIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("display_index not between", value1, value2, "displayIndex");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNull() {
            addCriterion("create_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNotNull() {
            addCriterion("create_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(Date value) {
            addCriterion("create_timestamp =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotEqualTo(Date value) {
            addCriterion("create_timestamp <>", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThan(Date value) {
            addCriterion("create_timestamp >", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("create_timestamp >=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThan(Date value) {
            addCriterion("create_timestamp <", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("create_timestamp <=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIn(List<Date> values) {
            addCriterion("create_timestamp in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotIn(List<Date> values) {
            addCriterion("create_timestamp not in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampBetween(Date value1, Date value2) {
            addCriterion("create_timestamp between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("create_timestamp not between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNull() {
            addCriterion("update_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNotNull() {
            addCriterion("update_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampEqualTo(Date value) {
            addCriterion("update_timestamp =", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotEqualTo(Date value) {
            addCriterion("update_timestamp <>", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThan(Date value) {
            addCriterion("update_timestamp >", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("update_timestamp >=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThan(Date value) {
            addCriterion("update_timestamp <", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("update_timestamp <=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIn(List<Date> values) {
            addCriterion("update_timestamp in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotIn(List<Date> values) {
            addCriterion("update_timestamp not in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampBetween(Date value1, Date value2) {
            addCriterion("update_timestamp between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("update_timestamp not between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table topic
     * @mbggenerated  Sun May 31 14:27:27 JST 2015
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table topic
     *
     * @mbggenerated do_not_delete_during_merge Sat May 30 18:32:40 JST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}