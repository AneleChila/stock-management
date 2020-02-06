package com.doostep.stockmanagement.repository;

import com.doostep.stockmanagement.model.Category;
import com.doostep.stockmanagement.service.CrudService;
import org.springframework.data.repository.Repository;

public interface CategoryRepository extends Repository<Category, Long> {

    Category findByName(String name);
}
