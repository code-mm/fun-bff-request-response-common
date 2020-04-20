package com.bdlbsc.common.user;


import com.bdlbsc.common.base.BaseRequest;
import lombok.*;


// 检查token
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserTokenCheckRequest  extends BaseRequest {

    private String access_token;

}
