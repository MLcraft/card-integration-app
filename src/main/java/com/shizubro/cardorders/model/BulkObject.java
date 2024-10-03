package com.shizubro.cardorders.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BulkObject {

    private String id;
    private String type;
    @JsonProperty("download_uri")
    private String downloadUri;
}
