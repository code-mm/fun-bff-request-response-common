package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseRequest;
import com.bdlbsc.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddAppletsResponse extends BaseResponse {

    // 是否添加成功 ，成功true , 失败false
    boolean status;



}
