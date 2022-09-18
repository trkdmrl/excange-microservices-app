package com.trkdmrl.exchangeapp.commonservice.core;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class Message {

    private List<MessageDetail> messageDetails;

    public static Message defaultSuccessMessage() {
        Message message = new Message();
        message.setMessageDetails(Collections.singletonList(new MessageDetail(com.trkdmrl.exchangeapp.commonservice.core.MessageCode.SUCCESS, MessageStatus.SUCCESS)));
        return message;
    }

    public static Message defaultErrorMessage() {
        Message message = new Message();
        message.setMessageDetails(Collections.singletonList(new MessageDetail(com.trkdmrl.exchangeapp.commonservice.core.MessageCode.ERROR, MessageStatus.ERROR)));
        return message;
    }

    public static Message defaultWarningMessage() {
        Message message = new Message();
        message.setMessageDetails(Collections.singletonList(new MessageDetail(com.trkdmrl.exchangeapp.commonservice.core.MessageCode.WARNING, MessageStatus.WARNING)));
        return message;
    }
}
