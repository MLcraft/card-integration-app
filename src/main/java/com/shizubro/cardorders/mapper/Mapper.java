package com.shizubro.cardorders.mapper;

import com.shizubro.cardorders.dto.BulkObjectDto;
import com.shizubro.cardorders.model.BulkObject;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Mapper {
    public BulkObjectDto bulkObjectToDto(BulkObject bulkObject) {
        String dataType = bulkObject.getType();
        UUID dataId = UUID.fromString(bulkObject.getDataId());
        String downloadUri = bulkObject.getDownloadUri();
        BulkObjectDto dto = new BulkObjectDto();
        dto.setDataId(dataId);
        dto.setType(dataType);
        dto.setDownloadUri(downloadUri);
        return dto;
    }

    public BulkObject bulkObjectToEntity(BulkObjectDto bulkObjectDto) {
        System.out.println(bulkObjectDto.toString());
        BulkObject bulkObject = new BulkObject();
        bulkObject.setDataId(bulkObjectDto.getDataId().toString());
        bulkObject.setDownloadUri(bulkObjectDto.getDownloadUri());
        bulkObject.setType(bulkObjectDto.getType());
        return bulkObject;
    }
}
