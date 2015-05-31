package jp.co.mbch.utils;

import jp.co.mbch.dataAccess.entity.Response;
import jp.co.mbch.dataAccess.entity.Topic;
import jp.co.mbch.model.ResponseModel;
import jp.co.mbch.model.ThreadModel;
import jp.co.mbch.model.TopicModel;

import org.springframework.beans.BeanUtils;

public class ConvertModelUtils {
    
    /***
     *TopicEntity変換処理
     * @param TopicModel
     * @return Topic
     */
    public static Topic toTopic(TopicModel model){
        
        Topic entity = new Topic();
        
        if(model != null){
            BeanUtils.copyProperties(model, entity);
        }
        
        return entity;
    }
    
    /***
     * ThreadEntity変換処理
     * @param ThreadModel
     * @return Thread
     */
    public static Thread toThread(ThreadModel model){
        
        Thread entity = new Thread();
        
        if(model != null){
            BeanUtils.copyProperties(model, entity);
        }
        
        return entity;
    }
    
    /***
     * ResponseEntity変換処理
     * @param ResponseModel
     * @return Response
     */
    public  static Response toResponse(ResponseModel model){
        
        Response entity = new Response();
        
        if(model != null){
            BeanUtils.copyProperties(model, entity);
        }
        
        return entity;
    }

}
