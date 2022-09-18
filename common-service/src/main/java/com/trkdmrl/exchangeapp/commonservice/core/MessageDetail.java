package com.trkdmrl.exchangeapp.commonservice.core;

public class MessageDetail {

    private final com.trkdmrl.exchangeapp.commonservice.core.MessageCode code;
    private final MessageStatus status;

    public MessageDetail(com.trkdmrl.exchangeapp.commonservice.core.MessageCode code, MessageStatus status) {
        this.code = code;
        this.status = status;
    }

    public com.trkdmrl.exchangeapp.commonservice.core.MessageCode getCode() {
        return code;
    }

    public MessageStatus getStatus() {
        return status;
    }
}
