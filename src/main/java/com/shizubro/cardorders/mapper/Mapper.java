package com.shizubro.cardorders.mapper;

import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.model.BulkObject;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Mapper {
    public BulkObjectDto bulkObjectToDto(BulkObject bulkObject) {
        String dataType = bulkObject.getType();
        UUID dataId = bulkObject.getDataId();
        String downloadUri = bulkObject.getDownloadUri();
        return new BulkObjectDto(dataId, dataType, downloadUri);
    }

    public BulkObject bulkObjectToEntity(BulkObjectDto bulkObjectDto) {
        System.out.println(bulkObjectDto.toString());
        BulkObject bulkObject = new BulkObject();
        bulkObject.setDataId(bulkObjectDto.getDataId());
        bulkObject.setDownloadUri(bulkObjectDto.getDownloadUri());
        bulkObject.setType(bulkObjectDto.getType());
        return bulkObject;
    }
}
