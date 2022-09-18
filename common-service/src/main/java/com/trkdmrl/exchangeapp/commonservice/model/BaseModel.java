package com.trkdmrl.exchangeapp.commonservice.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseModel implements Serializable {

    private Long id;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Boolean active;

    private Long lastModifiedId;

    private Long createdId;
}