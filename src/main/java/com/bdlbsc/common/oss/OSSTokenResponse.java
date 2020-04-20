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


    private String expiration;
    private String access_key_id;
    private String access_key_secret;
    private String security;
    private String requestid;

}
