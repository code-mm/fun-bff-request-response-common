package com.bdlbsc.common;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Result<T> {
    // 业务逻辑错误编码
    private Integer code;
    // success failure
    private String message;
    // 结果数据
    private T data;
    // 错误是信息
    private String error;
}
