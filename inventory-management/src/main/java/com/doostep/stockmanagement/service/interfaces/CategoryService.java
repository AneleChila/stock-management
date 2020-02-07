package com.doostep.stockmanagement.service.interfaces;

import com.doostep.stockmanagement.model.Category;

public interface CategoryService extends CrudService<Category, Long> {

    Category findByName();
}
