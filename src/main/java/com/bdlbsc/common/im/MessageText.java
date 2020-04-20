package com.bdlbsc.common.im;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MessageText  {

    // 事件id
    private String event_id;
    // 发送时间
    private long sender_date;
    // 接收时间
    private long receiver_date;
    // 内容
    private String content;
    // 发送者
    private String sender;
    // 接受者
    private String receiver;
    // 是否已经读取
    private boolean read;

}
