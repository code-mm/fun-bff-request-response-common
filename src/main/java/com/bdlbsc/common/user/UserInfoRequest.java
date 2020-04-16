package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class UserInfoRequest extends BaseRequest {

    private String access_token;

}
