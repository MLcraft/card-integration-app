package com.shizubro.cardorders.service.impl;

import com.shizubro.cardorders.dto.BulkDataDto;
import com.shizubro.cardorders.dto.MagicCardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
public class ExternalApiClientService {

    final private RestClient restClient;

    @Autowired
    public ExternalApiClientService(RestClient restClient) {
        this.restClient = restClient;
    }

    public BulkDataDto getBulkData() {
        BulkDataDto bulkDataDto = restClient
                .get()
                .uri("https://api.scryfall.com/bulk-data")
                .retrieve()
                .body(BulkDataDto.class);
        return bulkDataDto;
    }

    public MagicCardDto[] getBulkObjectData(String downloadUrl) {
//        BulkDataDto bulkDataDto = restClient
//                .get()
//                .uri("https://api.scryfall.com/bulk-data")
//                .retrieve()
//                .body(BulkDataDto.class);
//        return bulkDataDto;
        // fetch JSON download file from download URL and process for sending to queue
        return new MagicCardDto[0];
    }

}
