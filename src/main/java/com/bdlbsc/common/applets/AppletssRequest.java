package com.bdlbsc.common.applets;




import com.bdlbsc.common.base.BaseRequest;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AppletssRequest extends BaseRequest {

    private String user_id;


}
