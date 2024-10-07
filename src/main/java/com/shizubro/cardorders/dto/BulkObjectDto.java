package com.shizubro.cardorders.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shizubro.cardorders.model.BulkObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

/**
 * DTO for {@link BulkObject}
 */
@Data
public class BulkObjectDto {

    @JsonProperty("id")
    private UUID dataId;

    private String type;

    @JsonProperty("download_uri")
    private String downloadUri;
}
