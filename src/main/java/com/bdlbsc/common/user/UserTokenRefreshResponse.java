package com.bdlbsc.common.user;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserTokenRefreshResponse {

    private String access_token;

}
