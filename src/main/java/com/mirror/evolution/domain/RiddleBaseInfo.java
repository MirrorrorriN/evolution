package com.mirror.evolution.domain;

import java.io.Serializable;
import java.util.Date;

public class RiddleBaseInfo implements Serializable {
    private Long id;

    private String riddleQuestion;

    private String riddleHint;

    private String riddleAnswer;

    private String riddleExplanation;

    private Integer solvedCount;

    private Integer triedCount;

    private Integer queryCount;

    private Integer answerCount;

    private Integer riddleType;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiddleQuestion() {
        return riddleQuestion;
    }

    public void setRiddleQuestion(String riddleQuestion) {
        this.riddleQuestion = riddleQuestion;
    }

    public String getRiddleHint() {
        return riddleHint;
    }

    public void setRiddleHint(String riddleHint) {
        this.riddleHint = riddleHint;
    }

    public String getRiddleAnswer() {
        return riddleAnswer;
    }

    public void setRiddleAnswer(String riddleAnswer) {
        this.riddleAnswer = riddleAnswer;
    }

    public String getRiddleExplanation() {
        return riddleExplanation;
    }

    public void setRiddleExplanation(String riddleExplanation) {
        this.riddleExplanation = riddleExplanation;
    }

    public Integer getSolvedCount() {
        return solvedCount;
    }

    public void setSolvedCount(Integer solvedCount) {
        this.solvedCount = solvedCount;
    }

    public Integer getTriedCount() {
        return triedCount;
    }

    public void setTriedCount(Integer triedCount) {
        this.triedCount = triedCount;
    }

    public Integer getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
    }

    public Integer getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Integer getRiddleType() {
        return riddleType;
    }

    public void setRiddleType(Integer riddleType) {
        this.riddleType = riddleType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", riddleQuestion=").append(riddleQuestion);
        sb.append(", riddleHint=").append(riddleHint);
        sb.append(", riddleAnswer=").append(riddleAnswer);
        sb.append(", riddleExplanation=").append(riddleExplanation);
        sb.append(", solvedCount=").append(solvedCount);
        sb.append(", triedCount=").append(triedCount);
        sb.append(", queryCount=").append(queryCount);
        sb.append(", answerCount=").append(answerCount);
        sb.append(", riddleType=").append(riddleType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}