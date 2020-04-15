package com.bdlbsc.common.applets;


import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppletssVersionRequest extends BaseRequest {
    private String user_id;
}
