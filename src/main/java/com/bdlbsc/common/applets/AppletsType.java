package com.bdlbsc.common.applets;


import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppletsType {

    // 类别 eg : 组织架构
    private String category;
    // 类别下的项目 eg : 运营架构，政府架构
    private List<AppletsItem> item;


}
