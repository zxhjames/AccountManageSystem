package com.zxh.accountmanage.exception;

public class ICustomizeResp extends RuntimeException {
    private String message;
    private Integer code;
    public ICustomizeResp(CustomizeCode errorCode){
        this.message = errorCode.getMessage();
    }

    public ICustomizeResp(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
