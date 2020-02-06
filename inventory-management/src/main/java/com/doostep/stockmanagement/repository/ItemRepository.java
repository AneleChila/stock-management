package com.doostep.stockmanagement.repository;

import com.doostep.stockmanagement.model.Item;
import com.doostep.stockmanagement.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByName(String name);
}
