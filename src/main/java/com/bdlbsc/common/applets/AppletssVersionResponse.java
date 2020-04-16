package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseResponse;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppletssVersionResponse extends BaseResponse {
    //版本
    private Integer version;
}
