package jp.co.mbch.model;

import java.util.Date;

/***
 * スレッドモデル
 * @author yoshituneMac
 */
public class ThreadModel {

    private Integer threadId;

    private Integer threadNo;

    private Integer topicId;

    private String threadName;

    private Integer displayIndex;

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Integer getThreadNo() {
        return threadNo;
    }

    public void setThreadNo(Integer threadNo) {
        this.threadNo = threadNo;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Integer getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }

}
