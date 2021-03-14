package com.example.demo.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * @author 正
 */
@Data
public class User  implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private Integer age;
    //get、set、toString方法
}
