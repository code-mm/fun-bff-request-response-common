package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class
UserLoginPhonenumberRequestVerificationCodeRequest extends BaseRequest {
    private String phone_number;
}
