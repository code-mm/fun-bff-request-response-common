package com.bdlbsc.common.applets;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppletsType {

    private String type;
    private List<AppletsItem> item;


}
