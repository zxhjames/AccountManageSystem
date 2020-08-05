package com.zxh.accountmanage.exception;

import org.apache.poi.ss.formula.functions.T;

public enum CustomizeCode implements ICustomizeRespImpl{
        SERVER_ERROR(500,"服务器异常"),;
        private String message;
        private Integer code;
        @Override
        public String getMessage() {
            return message;
        }
        @Override
        public Integer getCode() {
            return code;
        }
        @Override
        public T getData() {
            return null;
        }
        CustomizeCode(Integer code,String message){
            this.message = message;
            this.code =  code;
        }
}
