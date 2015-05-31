package jp.co.mbch.model;

import java.util.Date;

/***
 * レスポンスモデル
 * @author yoshituneMac
 */
public class ResponseModel {

    private Integer responseId;

    private Integer responseNo;
    
    private Integer threadId;
    
    private String handleName;

    private String mailAddress;

    private String responseUserId;

    private String responseComment;

    public Integer getResponseId() {
        return responseId;
    }

    public void setResponseId(Integer responseId) {
        this.responseId = responseId;
    }
    
    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getResponseNo() {
        return responseNo;
    }

    public void setResponseNo(Integer responseNo) {
        this.responseNo = responseNo;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getResponseUserId() {
        return responseUserId;
    }

    public void setResponseUserId(String responseUserId) {
        this.responseUserId = responseUserId;
    }

    public String getResponseComment() {
        return responseComment;
    }

    public void setResponseComment(String responseComment) {
        this.responseComment = responseComment;
    }
}
