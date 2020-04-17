package com.bdlbsc.common.applets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppletsItem {

    // 名称
    private String name;
    // icon 地址
    private String icon_url;
    // 小程序id
    private String id;

}
