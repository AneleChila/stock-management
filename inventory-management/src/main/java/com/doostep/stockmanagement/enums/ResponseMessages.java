package com.doostep.stockmanagement.enums;

public enum ResponseMessages {

    InvalidForm("Invalid form");

    private String invalidForm;

    ResponseMessages(String invalidForm) {
        this.invalidForm = invalidForm;
    }

    public String getInvalidForm() {
        return invalidForm;
    }
}
