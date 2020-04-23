package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
/**
 * 二维码校检成功，返回，客户端显示确认登录
 */
public class UserLoginQrCodeScanResponse extends BaseResponse {

    // 检查是否成功
    Boolean status;
}
