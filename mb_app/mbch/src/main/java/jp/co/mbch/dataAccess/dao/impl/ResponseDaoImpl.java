package jp.co.mbch.dataAccess.dao.impl;

import java.util.List;

import jp.co.mbch.dataAccess.client.ResponseMapper;
import jp.co.mbch.dataAccess.dao.ResponseDao;
import jp.co.mbch.dataAccess.entity.Response;
import jp.co.mbch.dataAccess.entity.ResponseExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDaoImpl implements ResponseDao{
    
    Response entity;
    
    @Autowired
    ResponseMapper mapper;
    
    ResponseExample example;

    @Override
    public int insert(Response inputEntity) {
        return mapper.insert(inputEntity);
    }

    @Override
    public int update(Response inputEntity) {
        // TODO 自動生成されたメソッド・スタブ
        return mapper.updateByPrimaryKey(inputEntity);
    }

    @Override
    public List<Response> findByThreadId(int threadId) {
        
        example = new ResponseExample();
        example.createCriteria().andThreadIdEqualTo(threadId).andDeleteFlagEqualTo(0);
        
        return mapper.selectByExample(example);
    }
    

}
