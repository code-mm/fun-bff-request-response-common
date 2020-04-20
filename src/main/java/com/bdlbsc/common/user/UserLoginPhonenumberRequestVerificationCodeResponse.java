package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserLoginPhonenumberRequestVerificationCodeResponse extends BaseResponse {

    private String verification_code;
}
