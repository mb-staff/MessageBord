package jp.co.mbch.logic;

import jp.co.mbch.model.ResponseModel;

/***
 * レスポンス処理インタフェース
 * <pre>
 * 
 * </pre>
 * @author yoshituneMac
 *
 */
public interface ResponseLogic {
    
    /**
     * レス登録処理
     * @param model
     * @return
     */
    public int add(ResponseModel model);
    
}
