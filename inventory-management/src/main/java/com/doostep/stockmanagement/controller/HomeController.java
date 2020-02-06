package com.doostep.stockmanagement.controller;

import com.doostep.stockmanagement.model.Item;
import com.doostep.stockmanagement.service.ItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home/")
public class HomeController {

    private ItemService itemService;

    public HomeController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("")
    public String home() {
        return "Welcome To Door Step";
    }

    @PostMapping("item")
    public Item testDB(@RequestBody Item item) {
       return itemService.save(item);
    }

}
