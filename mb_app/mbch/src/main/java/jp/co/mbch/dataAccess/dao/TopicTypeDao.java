package jp.co.mbch.dataAccess.dao;

import java.util.List;

import jp.co.mbch.dataAccess.entity.TopicType;

public interface TopicTypeDao {
    
    public int insert(TopicType inputEntity);
    
    public int update(TopicType inputEntity);
    
    public List<TopicType> findAll()
;
}
