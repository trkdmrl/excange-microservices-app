package com.trkdmrl.exchangeapp.commonservice.core;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MessageStatus {

    INFO(1,"INFO"),
    SUCCESS(2,"SUCCESS"),
    ERROR(3,"ERROR"),
    WARNING(4,"WARN");


    private int code;
    private String name;

    MessageStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
}
