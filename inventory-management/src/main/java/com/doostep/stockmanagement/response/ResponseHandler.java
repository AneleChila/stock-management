package com.doostep.stockmanagement.response;

import com.doostep.stockmanagement.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ResponseHandler {

    private ItemResponse itemResponse;

    public ItemResponse getItemResponse(Item item) {
        this.itemResponse = new ItemResponse();
        this.itemResponse.setItem(item);

        return itemResponse;
    }
}
