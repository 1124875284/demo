package com.example.cloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 黄志强
 * @data 2018/11/15 14:17
 */
@Data
public class MyUser  implements Serializable {
    private Long id;

    private String userName;

    private String userDesc;
}
