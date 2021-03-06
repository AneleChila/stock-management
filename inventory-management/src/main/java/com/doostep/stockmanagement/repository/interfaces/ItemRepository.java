package com.doostep.stockmanagement.repository.interfaces;

import com.doostep.stockmanagement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByName(String name);
}
