package com.bdlbsc.common.user;




import com.bdlbsc.common.base.BaseResponse;
import lombok.*;


// 检查token
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserTokenCheckResponse  extends BaseResponse {
    private Boolean expired;
}
