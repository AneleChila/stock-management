package com.doostep.stockmanagement.repository.interfaces;

import com.doostep.stockmanagement.model.Category;
import org.springframework.data.repository.Repository;

public interface CategoryRepository extends Repository<Category, Long> {

    Category findByName(String name);
}
