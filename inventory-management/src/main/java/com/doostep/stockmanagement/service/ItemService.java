package com.doostep.stockmanagement.service;

import com.doostep.stockmanagement.model.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService extends CrudService<Item, Long> {

    Item findByName(String name);
}
