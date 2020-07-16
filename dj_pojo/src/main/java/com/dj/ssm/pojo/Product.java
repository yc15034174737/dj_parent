package com.dj.ssm.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Product {

    private Integer id;

    private String proName;

    private Integer userId;

    private Integer isDel;

    /**
     * 展示用户名
     */
    private String userName;
}
