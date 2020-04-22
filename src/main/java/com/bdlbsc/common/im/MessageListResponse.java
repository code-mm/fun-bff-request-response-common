package com.bdlbsc.common.im;


import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class MessageListResponse extends BaseResponse {

    List<MessageListItem> messages;
}
