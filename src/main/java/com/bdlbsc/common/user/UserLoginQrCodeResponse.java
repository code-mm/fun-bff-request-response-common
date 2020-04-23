package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
/**
 * 不需要返回
 */
public class UserLoginQrCodeResponse extends BaseResponse {


    // 电脑 是否登录成功
    private Boolean status;

}
