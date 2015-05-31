package jp.co.mbch.logic.impl;

import java.util.Date;

import jp.co.mbch.dataAccess.dao.ResponseDao;
import jp.co.mbch.dataAccess.entity.Response;
import jp.co.mbch.logic.ResponseLogic;
import jp.co.mbch.model.ResponseModel;
import jp.co.mbch.utils.ConvertModelUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseLogicImpl implements ResponseLogic {
    
    @Autowired
    ResponseDao rd;
    
    Response re;
    
    @Override
    public int add(ResponseModel model) {
        
        re = ConvertModelUtils.toResponse(model);
        re.setCreateTimestamp(new Date());
        re.setUpdateTimestamp(new Date());
        re.setDeleteFlag(0);
        
        return rd.insert(re);
    }

}
