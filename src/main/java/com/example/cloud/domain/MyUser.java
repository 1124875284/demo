package com.example.cloud.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

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
