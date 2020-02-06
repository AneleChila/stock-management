package com.doostep.stockmanagement.service;

import com.doostep.stockmanagement.model.Category;

public interface CategoryService extends CrudService<Category, Long> {

    Category findByName();
}
