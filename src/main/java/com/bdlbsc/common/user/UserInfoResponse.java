package com.bdlbsc.common.user;

import com.bdlbsc.common.base.BaseRequest;
import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class UserInfoResponse extends BaseResponse {


    private String name;
    private String sex;
    private String age;
    private String avatar;
    private String user_id;

}
