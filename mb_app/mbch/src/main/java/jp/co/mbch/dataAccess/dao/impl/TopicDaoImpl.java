package jp.co.mbch.dataAccess.dao.impl;

import java.util.List;

import jp.co.mbch.dataAccess.client.TopicMapper;
import jp.co.mbch.dataAccess.dao.TopicDao;
import jp.co.mbch.dataAccess.entity.Topic;
import jp.co.mbch.dataAccess.entity.TopicExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TopicDaoImpl implements TopicDao{
    
    Topic entity;
    
    @Autowired
    TopicMapper mapper;
    
    TopicExample example;
    
    @Override
    public int insert(Topic inputEntity) {
        return mapper.insert(inputEntity);
    }

    @Override
    public int update(Topic inputEntity) {
        return mapper.updateByPrimaryKeySelective(inputEntity);
    }

    @Override
    public List<Topic> findAll() {
        
        example = new TopicExample();
        example.createCriteria().andDeleteFlagEqualTo(0);
        
        return mapper.selectByExample(example);
    }

    @Override
    public List<Topic> findByTopicTypeId(int typeId) {
        example = new TopicExample();
        example.createCriteria().andTopicTypeIdEqualTo(typeId).andDeleteFlagEqualTo(0);
        
        return mapper.selectByExample(example);
    }
}

