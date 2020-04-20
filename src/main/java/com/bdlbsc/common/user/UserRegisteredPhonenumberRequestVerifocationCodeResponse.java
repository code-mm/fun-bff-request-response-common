package com.bdlbsc.common.user;




import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserRegisteredPhonenumberRequestVerifocationCodeResponse  extends BaseResponse {
    private String verifocation_code;
}
