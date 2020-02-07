package com.doostep.stockmanagement.validations;

import com.doostep.stockmanagement.model.Item;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ItemValidator implements Validator{

    private static final String REQUIRED = "required";

    @Override
    public void validate(Object obj, Errors errors) {
        Item item = (Item) obj;
        String name = item.getName();
        // name validation
        if (!StringUtils.hasLength(name)) {
            errors.rejectValue("name", REQUIRED, REQUIRED);
        }

        // description validation
        if (item.getDescription() == null) {
            errors.rejectValue("description", REQUIRED, REQUIRED);
        }

        // size validation
        if (item.getSize() == null) {
            errors.rejectValue("size", REQUIRED, REQUIRED);
        }

        // sku validation
        if (item.getSku() == null) {
            errors.rejectValue("sku", REQUIRED, REQUIRED);
        }

        // price validation
        if (item.getPrice() == 0) {
            errors.rejectValue("price", REQUIRED, REQUIRED);
        }

    }

    /**
     * This Validator validates *just* Pet instances
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return Item.class.isAssignableFrom(clazz);
    }

}
