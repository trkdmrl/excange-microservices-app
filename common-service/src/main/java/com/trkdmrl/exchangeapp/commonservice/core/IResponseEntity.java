package com.trkdmrl.exchangeapp.commonservice.core;

public interface IResponseEntity<T>{
    ResponseEntity<T> ok(T data);
    ResponseEntity<T> list(T data);
    ResponseEntity<T> error(T data);
    ResponseEntity<T> warning(T data);
}
