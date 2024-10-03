package com.shizubro.cardorders.model;

import lombok.Data;

import java.util.List;

@Data
public class BulkData {
    String object;
    List<BulkObject> data;

}
