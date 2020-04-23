package com.bdlbsc.common.im;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)

// 成员
public class MemberItem {

    // 成员id
    private String userid;

    // 姓名
    private String name;

    // 头像
    private String avatar;

}
