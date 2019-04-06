package com.petrel.surfing.user.pojo;

import com.petrel.surfing.core.BasePojo;
import lombok.Data;


public class User extends BasePojo {
    private long id;
    private String name;
    private String sex;
    private Integer age;

}
