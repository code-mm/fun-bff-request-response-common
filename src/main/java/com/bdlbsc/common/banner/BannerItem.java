package com.bdlbsc.common.banner;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BannerItem {

    public String image_url;
    public String action_url;

}
