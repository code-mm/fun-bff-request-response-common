package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
/**
 * 确认登录
 */
public class UserLoginQrCodeRequest extends BaseRequest {

    // 登录 为 true
    // 不登录 为 false ，让二维码失效
    Boolean login;
}
