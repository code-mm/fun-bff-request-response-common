package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseRequest;
import com.bdlbsc.common.base.BaseResponse;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class DeleteAppletsResponse extends BaseResponse {

    // 是否删除成功 ，成功true , 失败false
    boolean status;


}
