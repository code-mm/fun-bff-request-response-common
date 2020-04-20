package com.bdlbsc.common.oss;

import com.bdlbsc.common.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OSSTokenResponse extends BaseResponse {


    private String Expiration;
    private String Access_Key_id;
    private String Access_Key_Secret;
    private String Security;
    private String RequestId;

}
