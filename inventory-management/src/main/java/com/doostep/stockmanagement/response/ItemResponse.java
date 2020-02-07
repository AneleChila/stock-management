package com.doostep.stockmanagement.response;

import com.doostep.stockmanagement.model.Item;
import lombok.Data;

@Data
public class ItemResponse {

    Item item;
    String errorResponse;
}
