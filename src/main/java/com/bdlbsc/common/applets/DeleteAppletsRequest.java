package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteAppletsRequest extends BaseRequest {

    // 小程序ID
    private String applets_id;




}
