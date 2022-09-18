package com.trkdmrl.exchangeapp.commonservice.core;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MessageCode {

    SUCCESS("G_2000", "Operation Success"),
    ERROR("G_1000", "Operation Failed"),
    WARNING("G_3000", "Operation Alert"),
    NOT_FOUND("G_4000", "Data Not Found"),
    PRODUCT_NOT_FOUND("G_4001", "Product Not Found"),
    PRODUCT_PENDING("G_4002", "Product Pending"),
    ALREADY_EXIST("G_5000", "Data Already Exist"),
    SERVICE_ERROR("G_6000", "Service Error"),
    USER_DOES_NOT_EXIST("G_4001", "User does not exist"),
    DATA_IN_USE_ERROR("G_7000", "Data In Use Error"),
    TEMPLATE_FILE_NOT_FOUND("G_8000", "Template file not found"),
    FTP_CONNECTION_ERROR("G_8001", "FTP Connection error"),
    SOAP_CONNECTION_ERROR("G_8002", "SOAP Connection error"),
    FILE_OPERATION_ERROR("G_8003", "File operation error");

    private final String value;
    private final String desc;

    MessageCode(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return this.value;
    }

    @JsonIgnore
    public String getDesc() {
        return this.desc;
    }
}
