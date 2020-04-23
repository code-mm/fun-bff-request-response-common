package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
/**
 * 扫描 二维码登录 请求
 */
public class UserLoginQrCodeScanRequest extends BaseRequest {
    // 实例id
    private String instance_id;
}
