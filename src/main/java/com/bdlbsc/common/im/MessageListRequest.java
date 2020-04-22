package com.bdlbsc.common.im;

import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MessageListRequest  extends BaseRequest {
    private String userid;
}
