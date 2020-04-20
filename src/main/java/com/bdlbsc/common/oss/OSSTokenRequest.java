package com.bdlbsc.common.oss;

import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class OSSTokenRequest extends BaseRequest {

    private String userid;

}
