package com.shizubro.cardorders.dto;

import lombok.Data;

import java.util.List;

@Data
public class BulkDataDto {
    String object;
    List<BulkObjectDto> data;

}
