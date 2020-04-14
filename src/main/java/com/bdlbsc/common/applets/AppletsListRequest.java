package com.bdlbsc.common.applets;

import com.bdlbsc.common.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
public class AppletsListRequest extends BaseRequest {

    private List<AppletsType> appletss;

}
