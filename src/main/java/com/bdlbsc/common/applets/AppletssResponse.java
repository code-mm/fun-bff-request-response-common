package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppletssResponse extends BaseResponse {
    private List<AppletsType> appletss;
    //版本
    private Integer version;
}
