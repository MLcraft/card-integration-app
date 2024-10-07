package com.shizubro.cardorders.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MagicCard {
    String object;
    String id;

    @JsonProperty("oracle_id")
    String oracleId;
}
