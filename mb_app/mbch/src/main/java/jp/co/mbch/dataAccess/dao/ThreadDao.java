package jp.co.mbch.dataAccess.dao;

import java.util.List;

import jp.co.mbch.dataAccess.entity.Thread;


public interface ThreadDao {
    
    public int insert(Thread inputEntity);
    
    public int update(Thread inputEntity);
    
    public List<Thread> findByTopicId(int topicId);
    
}
