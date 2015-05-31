package jp.co.mbch.dataAccess.dao;

import java.util.List;

import jp.co.mbch.dataAccess.entity.Response;

public interface ResponseDao {
    
    public int insert(Response inputEntity);
    
    public int update(Response inputEntity);
    
    public List<Response> findByThreadId(int threadId);
    
}
