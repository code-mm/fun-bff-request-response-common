package com.bdlbsc.common;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.HashMap;
import java.util.Map;

public class ResultErrors {

    private static Map<String,Integer> errors = new HashMap<>();

    private ResultErrors()
    {
        errors.clear();
        errors.put("用户名为空",4000);
        errors.put("密码为空",4001);
        errors.put("手机号为空",4002);
        errors.put("app_id号为空",4002);
        errors.put("app_secret号为空",4002);
        errors.put("验证码号为空",4002);
        errors.put("access_token为空",4002);
        errors.put("refresh_token为空",4002);

        errors.put("用户名不存在",5000);
        errors.put("密码错误",5000);
    }

    private static final ResultErrors instance = new ResultErrors();

    public static ResultErrors getInstance() {
        return instance;
    }

    public Integer getCode(String message)
    {
        return    errors.get(message);
    }
}
