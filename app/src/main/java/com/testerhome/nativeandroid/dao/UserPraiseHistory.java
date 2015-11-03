package com.testerhome.nativeandroid.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER_PRAISE_HISTORY".
 */
public class UserPraiseHistory {

    private String topicId;
    private Integer userId;

    public UserPraiseHistory() {
    }

    public UserPraiseHistory(String topicId) {
        this.topicId = topicId;
    }

    public UserPraiseHistory(String topicId, Integer userId) {
        this.topicId = topicId;
        this.userId = userId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}