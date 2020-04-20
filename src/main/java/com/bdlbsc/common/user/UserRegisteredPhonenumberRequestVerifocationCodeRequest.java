package com.bdlbsc.common.user;


import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserRegisteredPhonenumberRequestVerifocationCodeRequest  extends BaseRequest {

    private String phone_number;

}
