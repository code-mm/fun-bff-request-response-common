package com.bdlbsc.common.user;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserTokenRefreshRequest {

    private String refresh_token;

}
