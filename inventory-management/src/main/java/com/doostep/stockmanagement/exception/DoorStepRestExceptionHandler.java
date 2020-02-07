package com.doostep.stockmanagement.exception;

import com.doostep.stockmanagement.enums.ResponseMessages;
import com.doostep.stockmanagement.response.ItemResponse;
import org.springframework.stereotype.Component;

@Component
public class DoorStepRestExceptionHandler {

    private ItemResponse itemResponse;

    public ItemResponse getItemResponseException() {
        this.itemResponse = new ItemResponse();
        this.itemResponse.setErrorResponse(ResponseMessages.InvalidForm.name());

        return this.itemResponse;
    }
}
