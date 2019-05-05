package com.mirror.evolution.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RiddleBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiddleBaseInfoExample() {
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

        public Criteria andRiddleQuestionIsNull() {
            addCriterion("riddle_question is null");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionIsNotNull() {
            addCriterion("riddle_question is not null");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionEqualTo(String value) {
            addCriterion("riddle_question =", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionNotEqualTo(String value) {
            addCriterion("riddle_question <>", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionGreaterThan(String value) {
            addCriterion("riddle_question >", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("riddle_question >=", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionLessThan(String value) {
            addCriterion("riddle_question <", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionLessThanOrEqualTo(String value) {
            addCriterion("riddle_question <=", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionLike(String value) {
            addCriterion("riddle_question like", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionNotLike(String value) {
            addCriterion("riddle_question not like", value, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionIn(List<String> values) {
            addCriterion("riddle_question in", values, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionNotIn(List<String> values) {
            addCriterion("riddle_question not in", values, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionBetween(String value1, String value2) {
            addCriterion("riddle_question between", value1, value2, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleQuestionNotBetween(String value1, String value2) {
            addCriterion("riddle_question not between", value1, value2, "riddleQuestion");
            return (Criteria) this;
        }

        public Criteria andRiddleHintIsNull() {
            addCriterion("riddle_hint is null");
            return (Criteria) this;
        }

        public Criteria andRiddleHintIsNotNull() {
            addCriterion("riddle_hint is not null");
            return (Criteria) this;
        }

        public Criteria andRiddleHintEqualTo(String value) {
            addCriterion("riddle_hint =", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintNotEqualTo(String value) {
            addCriterion("riddle_hint <>", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintGreaterThan(String value) {
            addCriterion("riddle_hint >", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintGreaterThanOrEqualTo(String value) {
            addCriterion("riddle_hint >=", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintLessThan(String value) {
            addCriterion("riddle_hint <", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintLessThanOrEqualTo(String value) {
            addCriterion("riddle_hint <=", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintLike(String value) {
            addCriterion("riddle_hint like", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintNotLike(String value) {
            addCriterion("riddle_hint not like", value, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintIn(List<String> values) {
            addCriterion("riddle_hint in", values, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintNotIn(List<String> values) {
            addCriterion("riddle_hint not in", values, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintBetween(String value1, String value2) {
            addCriterion("riddle_hint between", value1, value2, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleHintNotBetween(String value1, String value2) {
            addCriterion("riddle_hint not between", value1, value2, "riddleHint");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerIsNull() {
            addCriterion("riddle_answer is null");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerIsNotNull() {
            addCriterion("riddle_answer is not null");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerEqualTo(String value) {
            addCriterion("riddle_answer =", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerNotEqualTo(String value) {
            addCriterion("riddle_answer <>", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerGreaterThan(String value) {
            addCriterion("riddle_answer >", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("riddle_answer >=", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerLessThan(String value) {
            addCriterion("riddle_answer <", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerLessThanOrEqualTo(String value) {
            addCriterion("riddle_answer <=", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerLike(String value) {
            addCriterion("riddle_answer like", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerNotLike(String value) {
            addCriterion("riddle_answer not like", value, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerIn(List<String> values) {
            addCriterion("riddle_answer in", values, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerNotIn(List<String> values) {
            addCriterion("riddle_answer not in", values, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerBetween(String value1, String value2) {
            addCriterion("riddle_answer between", value1, value2, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleAnswerNotBetween(String value1, String value2) {
            addCriterion("riddle_answer not between", value1, value2, "riddleAnswer");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationIsNull() {
            addCriterion("riddle_explanation is null");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationIsNotNull() {
            addCriterion("riddle_explanation is not null");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationEqualTo(String value) {
            addCriterion("riddle_explanation =", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationNotEqualTo(String value) {
            addCriterion("riddle_explanation <>", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationGreaterThan(String value) {
            addCriterion("riddle_explanation >", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationGreaterThanOrEqualTo(String value) {
            addCriterion("riddle_explanation >=", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationLessThan(String value) {
            addCriterion("riddle_explanation <", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationLessThanOrEqualTo(String value) {
            addCriterion("riddle_explanation <=", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationLike(String value) {
            addCriterion("riddle_explanation like", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationNotLike(String value) {
            addCriterion("riddle_explanation not like", value, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationIn(List<String> values) {
            addCriterion("riddle_explanation in", values, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationNotIn(List<String> values) {
            addCriterion("riddle_explanation not in", values, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationBetween(String value1, String value2) {
            addCriterion("riddle_explanation between", value1, value2, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andRiddleExplanationNotBetween(String value1, String value2) {
            addCriterion("riddle_explanation not between", value1, value2, "riddleExplanation");
            return (Criteria) this;
        }

        public Criteria andSolvedCountIsNull() {
            addCriterion("solved_count is null");
            return (Criteria) this;
        }

        public Criteria andSolvedCountIsNotNull() {
            addCriterion("solved_count is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedCountEqualTo(Integer value) {
            addCriterion("solved_count =", value, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountNotEqualTo(Integer value) {
            addCriterion("solved_count <>", value, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountGreaterThan(Integer value) {
            addCriterion("solved_count >", value, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("solved_count >=", value, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountLessThan(Integer value) {
            addCriterion("solved_count <", value, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountLessThanOrEqualTo(Integer value) {
            addCriterion("solved_count <=", value, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountIn(List<Integer> values) {
            addCriterion("solved_count in", values, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountNotIn(List<Integer> values) {
            addCriterion("solved_count not in", values, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountBetween(Integer value1, Integer value2) {
            addCriterion("solved_count between", value1, value2, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andSolvedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("solved_count not between", value1, value2, "solvedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountIsNull() {
            addCriterion("tried_count is null");
            return (Criteria) this;
        }

        public Criteria andTriedCountIsNotNull() {
            addCriterion("tried_count is not null");
            return (Criteria) this;
        }

        public Criteria andTriedCountEqualTo(Integer value) {
            addCriterion("tried_count =", value, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountNotEqualTo(Integer value) {
            addCriterion("tried_count <>", value, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountGreaterThan(Integer value) {
            addCriterion("tried_count >", value, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("tried_count >=", value, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountLessThan(Integer value) {
            addCriterion("tried_count <", value, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountLessThanOrEqualTo(Integer value) {
            addCriterion("tried_count <=", value, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountIn(List<Integer> values) {
            addCriterion("tried_count in", values, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountNotIn(List<Integer> values) {
            addCriterion("tried_count not in", values, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountBetween(Integer value1, Integer value2) {
            addCriterion("tried_count between", value1, value2, "triedCount");
            return (Criteria) this;
        }

        public Criteria andTriedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("tried_count not between", value1, value2, "triedCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNull() {
            addCriterion("query_count is null");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNotNull() {
            addCriterion("query_count is not null");
            return (Criteria) this;
        }

        public Criteria andQueryCountEqualTo(Integer value) {
            addCriterion("query_count =", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotEqualTo(Integer value) {
            addCriterion("query_count <>", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThan(Integer value) {
            addCriterion("query_count >", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_count >=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThan(Integer value) {
            addCriterion("query_count <", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThanOrEqualTo(Integer value) {
            addCriterion("query_count <=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountIn(List<Integer> values) {
            addCriterion("query_count in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotIn(List<Integer> values) {
            addCriterion("query_count not in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountBetween(Integer value1, Integer value2) {
            addCriterion("query_count between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("query_count not between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountIsNull() {
            addCriterion("answer_count is null");
            return (Criteria) this;
        }

        public Criteria andAnswerCountIsNotNull() {
            addCriterion("answer_count is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerCountEqualTo(Integer value) {
            addCriterion("answer_count =", value, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountNotEqualTo(Integer value) {
            addCriterion("answer_count <>", value, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountGreaterThan(Integer value) {
            addCriterion("answer_count >", value, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_count >=", value, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountLessThan(Integer value) {
            addCriterion("answer_count <", value, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountLessThanOrEqualTo(Integer value) {
            addCriterion("answer_count <=", value, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountIn(List<Integer> values) {
            addCriterion("answer_count in", values, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountNotIn(List<Integer> values) {
            addCriterion("answer_count not in", values, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountBetween(Integer value1, Integer value2) {
            addCriterion("answer_count between", value1, value2, "answerCount");
            return (Criteria) this;
        }

        public Criteria andAnswerCountNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_count not between", value1, value2, "answerCount");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeIsNull() {
            addCriterion("riddle_type is null");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeIsNotNull() {
            addCriterion("riddle_type is not null");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeEqualTo(Integer value) {
            addCriterion("riddle_type =", value, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeNotEqualTo(Integer value) {
            addCriterion("riddle_type <>", value, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeGreaterThan(Integer value) {
            addCriterion("riddle_type >", value, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("riddle_type >=", value, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeLessThan(Integer value) {
            addCriterion("riddle_type <", value, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("riddle_type <=", value, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeIn(List<Integer> values) {
            addCriterion("riddle_type in", values, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeNotIn(List<Integer> values) {
            addCriterion("riddle_type not in", values, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeBetween(Integer value1, Integer value2) {
            addCriterion("riddle_type between", value1, value2, "riddleType");
            return (Criteria) this;
        }

        public Criteria andRiddleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("riddle_type not between", value1, value2, "riddleType");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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