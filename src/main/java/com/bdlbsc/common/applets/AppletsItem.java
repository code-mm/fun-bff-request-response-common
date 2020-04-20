package com.bdlbsc.common.applets;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppletsItem {

    // 名称
    private String name;
    // icon 地址
    private String icon_url;
    // 小程序id
    private String id;

}
