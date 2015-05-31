package jp.co.mbch.dataAccess.dao;

import java.util.List;

import jp.co.mbch.dataAccess.entity.Topic;

public interface TopicDao {
    
    public int insert(Topic inputEntity);
    
    public int update(Topic inputEntity);
    
    public List<Topic> findAll();
    
    public List<Topic> findByTopicTypeId(int typeId);

}
