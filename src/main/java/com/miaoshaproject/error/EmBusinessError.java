package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError{
    // common error message 00001
    PARAMETER_VALIDATION_ERROR(10001,"Parameter Not Valid"),
    UNKNOWN_ERROR(10002,"Unknown Error"),
    // 20000 prefix mean user error msg
    USER_NOT_EXIST(20001,"User Not Exist"),

    ;

    private EmBusinessError(int errCode, String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
    private int errCode;
    private String errMsg;


    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
