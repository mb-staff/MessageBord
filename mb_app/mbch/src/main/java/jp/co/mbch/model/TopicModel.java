package jp.co.mbch.model;

import java.util.Date;

/***
 * トピックモデル
 * @author yoshituneMac
 */
public class TopicModel {
    
    private Integer topicId;

    private Integer topicNo;

    private Integer topicTypeId;

    private String topicName;

    private String topicComment;

    private Integer displayIndex;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getTopicNo() {
        return topicNo;
    }

    public void setTopicNo(Integer topicNo) {
        this.topicNo = topicNo;
    }

    public Integer getTopicTypeId() {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId) {
        this.topicTypeId = topicTypeId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicComment() {
        return topicComment;
    }

    public void setTopicComment(String topicComment) {
        this.topicComment = topicComment;
    }

    public Integer getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }
}
