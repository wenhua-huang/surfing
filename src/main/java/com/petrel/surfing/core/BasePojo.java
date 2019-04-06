package com.petrel.surfing.core;

import lombok.Data;

import java.util.Date;

@Data
public class BasePojo {



    protected Long version;

    private Date creationTime;

    private Date lastUpdateTime;

    private String createdBy;

    private String updatedBy;

}
