package com.doostep.stockmanagement.service;

import com.doostep.stockmanagement.model.Item;
import com.doostep.stockmanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item save(Item item) {

       return itemRepository.save(item);
    }

    @Override
    public Item findByName(String name) {
        return null;
    }

    @Override
    public Set<Item> findAll() {
        return null;
    }

    @Override
    public Item findById(Long id) {
        return null;
    }

    @Override
    public void delete(Item object) {
    }

    @Override
    public void deleteById(Long id){}
}
