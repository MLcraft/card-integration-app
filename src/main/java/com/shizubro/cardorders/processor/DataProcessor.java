package com.shizubro.cardorders.processor;

import com.shizubro.cardorders.model.BulkData;
import com.shizubro.cardorders.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataProcessor {
    private CardService cardService;

    @Autowired
    public DataProcessor(CardService cardService) {
        this.cardService = cardService;
    }

    /*
    BulkData(object=list,
    data=[
    BulkObject(id=27bf3214-1271-490b-bdfe-c0be6c23d02e,
    type=oracle_cards,
    downloadUri=https://data.scryfall.io/oracle-cards/oracle-cards-20241001210332.json),
    BulkObject(id=6bbcf976-6369-4401-88fc-3a9e4984c305,
    type=unique_artwork,
    downloadUri=https://data.scryfall.io/unique-artwork/unique-artwork-20241001210825.json),
    BulkObject(id=e2ef41e3-5778-4bc2-af3f-78eca4dd9c23,
    type=default_cards,
    downloadUri=https://data.scryfall.io/default-cards/default-cards-20241001211625.json),
    BulkObject(id=922288cb-4bef-45e1-bb30-0c2bd3d3534f,
    type=all_cards,
    downloadUri=https://data.scryfall.io/all-cards/all-cards-20241001213547.json),
    BulkObject(id=06f54c0b-ab9c-452d-b35a-8297db5eb940,
    type=rulings,
    downloadUri=https://data.scryfall.io/rulings/rulings-20241001210038.json)])
     */
    public void process() {
        BulkData bulkData = cardService.getBulkData();
        //bulkData.getData().stream().filter()
        //get list oracle_card download url
        //download data
        //save to db
    }
}
