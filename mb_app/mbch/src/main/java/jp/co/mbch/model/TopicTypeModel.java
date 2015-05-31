package jp.co.mbch.model;

/***
 *トピック種別モデル
 *
 * @author yositune64
 *
 */
public class TopicTypeModel {

    private Integer topicTypeId;

    private String topicTypeName;

    public Integer getTopicTypeId() {
        return topicTypeId;
    }

    public void setTopicTypeId(Integer topicTypeId) {
        this.topicTypeId = topicTypeId;
    }

    public String getTopicTypeName() {
        return topicTypeName;
    }

    public void setTopicTypeName(String topicTypeName) {
        this.topicTypeName = topicTypeName;
    }

}
