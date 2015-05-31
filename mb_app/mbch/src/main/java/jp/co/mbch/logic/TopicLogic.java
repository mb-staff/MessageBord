package jp.co.mbch.logic;

import jp.co.mbch.model.TopicModel;

public interface TopicLogic {
    
    /***
     * トピック登録処理
     * @param model
     */
    public int add(TopicModel model);
    
}
