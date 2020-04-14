package com.bdlbsc.common.api;

public interface USERAPI {

    // 用户名登录
    String LOGIN_USERNAME = "user/login/username";
    // 手机号登录请求验证码
    String LOGIN_PHONENUMBER_REQUEST_VERIFICATIONCODE = "user/login/phonenumber-request-verificationcode";
    // 手机号登录
    String LOGIN_PHONENUMBER = "user/login/phonenumber";
    // 手机号注册请求验证码
    String REGISTERED_PHONENUMBER_REQUEST_VERIFICATIONCODE = "user/registered/phonenumber-request-verificationcode";
    // 手机号注册
    String REGISTERED_PHONENUMBER = "user/registered/phonenumber";
    // 用户名注册
    String REGISTERED_USERNAME = "user/registered/username";
    // 检查token是否过期
    String TOKEN_CHECK = "user/token/check";
    // 刷新token
    String TOKEN_REFRESH = "user/token/refresh";
}
