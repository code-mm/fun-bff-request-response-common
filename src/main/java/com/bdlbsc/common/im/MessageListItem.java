package com.bdlbsc.common.im;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MessageListItem {
    private String roomId;

}
