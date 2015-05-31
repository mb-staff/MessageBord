package jp.co.mbch.dataAccess.dao.impl;

import java.util.List;

import jp.co.mbch.dataAccess.client.TopicTypeMapper;
import jp.co.mbch.dataAccess.dao.TopicTypeDao;
import jp.co.mbch.dataAccess.entity.TopicType;
import jp.co.mbch.dataAccess.entity.TopicTypeExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TopicTypeDaoImpl implements TopicTypeDao{
    
    TopicType entity;
    
    @Autowired
    TopicTypeMapper mapper;
    
    TopicTypeExample example;
    
    @Override
    public int insert(TopicType inputEntity) {
        return mapper.insert(inputEntity);
    }

    @Override
    public int update(TopicType inputEntity) {
        return mapper.updateByPrimaryKeySelective(inputEntity);
    }

    @Override
    public List<TopicType> findAll() {
        
        example = new TopicTypeExample();
        example.createCriteria().andDeleteFlagEqualTo(0);
        
        return mapper.selectByExample(example);
    }

}
