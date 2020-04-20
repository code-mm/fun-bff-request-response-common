package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseRequest;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class DeleteAppletsRequest extends BaseRequest {

    // 小程序ID
    private String applets_id;




}
