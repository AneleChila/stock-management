package com.doostep.stockmanagement.controller;

import com.doostep.stockmanagement.exception.DoorStepRestExceptionHandler;
import com.doostep.stockmanagement.model.Item;
import com.doostep.stockmanagement.response.ItemResponse;
import com.doostep.stockmanagement.response.ResponseHandler;
import com.doostep.stockmanagement.service.interfaces.ItemService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item/")
public class ItemController {

    private ItemService itemService;

    private DoorStepRestExceptionHandler exceptionHandler;

    private ResponseHandler responseHandler;

    public ItemController(ItemService itemService, DoorStepRestExceptionHandler exceptionHandler, ResponseHandler responseHandler) {
        this.itemService = itemService;
        this.exceptionHandler = exceptionHandler;
        this.responseHandler = responseHandler;
    }

    @PostMapping
    public ItemResponse postItem(@RequestBody Item item, BindingResult bindingResult) {

        return bindingResult.hasErrors() ? exceptionHandler.getItemResponseException() : responseHandler.getItemResponse(itemService.save(item));
    }
}