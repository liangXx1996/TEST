package com.baosight.common;

public enum ResultEnum {

    LOGIN_ERROR("403","登陆错误，请登陆!"),
    UNKNOWN_USER_ERROR("400","该用户不存在"),
    PASSWORD_ERROR("400","密码错误"),;
    /**状态码*/
    private String code;
    /**错误信息*/
    private String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
