package com.shizubro.cardorders.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;
@Data
public class BulkDataDto {

    @JsonProperty("id")
    private UUID dataId;

    private String type;

    @JsonProperty("download_uri")
    private String downloadUri;
}
