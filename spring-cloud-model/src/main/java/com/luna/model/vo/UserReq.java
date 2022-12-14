package com.luna.model.vo;

import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author chenzhangyue
 * 2022/12/13
 */
@Data
public class UserReq {

    private String name;

    @Min(0)
    private Integer age;
}
