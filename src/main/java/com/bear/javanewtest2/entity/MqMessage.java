package com.bear.javanewtest2.entity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/25 上午9:34
 * Description:
 */

public class MqMessage {

    private String MessageID;
    private String TAG;
    private String BODY;
    private String nPublishTime;
    private String FirstConsumeTime;
    private String nConsumedTimes;
    private String NextConsumeTime;
    private List<String> receiptHandles;

    public void setMessageID(String MessageID) {
        this.MessageID = MessageID;
    }

    public String getMessageID() {
        return MessageID;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public String getTAG() {
        return TAG;
    }

    public void setBODY(String BODY) {
        this.BODY = BODY;
    }

    public String getBODY() {
        return BODY;
    }

    public void setNPublishTime(String nPublishTime) {
        this.nPublishTime = nPublishTime;
    }

    public String getNPublishTime() {
        return nPublishTime;
    }

    public void setFirstConsumeTime(String FirstConsumeTime) {
        this.FirstConsumeTime = FirstConsumeTime;
    }

    public String getFirstConsumeTime() {
        return FirstConsumeTime;
    }

    public void setNConsumedTimes(String nConsumedTimes) {
        this.nConsumedTimes = nConsumedTimes;
    }

    public String getNConsumedTimes() {
        return nConsumedTimes;
    }

    public void setNextConsumeTime(String NextConsumeTime) {
        this.NextConsumeTime = NextConsumeTime;
    }

    public String getNextConsumeTime() {
        return NextConsumeTime;
    }

    public void setReceiptHandles(List<String> receiptHandles) {
        this.receiptHandles = receiptHandles;
    }

    public List<String> getReceiptHandles() {
        return receiptHandles;
    }

}
