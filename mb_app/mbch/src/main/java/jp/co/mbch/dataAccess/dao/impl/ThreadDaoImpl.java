package jp.co.mbch.dataAccess.dao.impl;

import java.util.List;

import jp.co.mbch.dataAccess.client.ThreadMapper;
import jp.co.mbch.dataAccess.dao.ThreadDao;
import jp.co.mbch.dataAccess.entity.ThreadExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ThreadDaoImpl implements ThreadDao{
    
    Thread entity;
    
    @Autowired
    ThreadMapper mapper;
    
    ThreadExample example;

    @Override
    public int insert(jp.co.mbch.dataAccess.entity.Thread inputEntity) {
        return mapper.insert(inputEntity);
    }

    @Override
    public int update(jp.co.mbch.dataAccess.entity.Thread inputEntity) {
        return mapper.updateByPrimaryKeySelective(inputEntity);
    }

    @Override
    public List<jp.co.mbch.dataAccess.entity.Thread> findByTopicId(int topicId) {
        
        example = new ThreadExample();
        example.createCriteria().andTopicIdEqualTo(topicId).andDeleteFlagEqualTo(0);
        
        return mapper.selectByExample(example);
    }
    

}
