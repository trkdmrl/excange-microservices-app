package com.trkdmrl.exchangeapp.commonservice.core;

import lombok.Data;

@Data
public class ResponseEntity<T> implements IResponseEntity<T> {

    private T data;
    private Message message;
    private Boolean success;

    public ResponseEntity() {}

    public ResponseEntity(T data) {
        this.data = data;
        this.message = Message.defaultSuccessMessage();
        this.success = Boolean.TRUE;
    }

    public ResponseEntity(T data, Message message, Boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    @Override
    public ResponseEntity<T> ok(T data) {
        this.data = data;
        this.message = Message.defaultSuccessMessage();
        this.success = Boolean.TRUE;

        return this;
    }

    @Override
    public ResponseEntity<T> list(T data) {
        this.data = data;
        this.success = Boolean.TRUE;
        return this;
    }

    @Override
    public ResponseEntity<T> error(T data) {
        this.data = data;
        this.success = Boolean.FALSE;
        this.message = Message.defaultErrorMessage();
        return this;
    }

    @Override
    public ResponseEntity<T> warning(T data) {
        this.data = data;
        this.success = Boolean.TRUE;
        this.message = Message.defaultWarningMessage();
        return this;
    }

}
