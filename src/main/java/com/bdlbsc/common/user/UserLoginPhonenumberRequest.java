package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
public class UserLoginPhonenumberRequest extends BaseRequest {
    private String phone_number;
    private String verification_code;
}
