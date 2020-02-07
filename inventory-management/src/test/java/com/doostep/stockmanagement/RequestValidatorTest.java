package com.doostep.stockmanagement;

import com.doostep.stockmanagement.model.Item;
import com.doostep.stockmanagement.model.ItemSize;
import com.doostep.stockmanagement.validations.ItemValidator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.beans.PropertyEditor;
import java.util.List;
import java.util.Map;
import static org.mockito.Mockito.*;

public class RequestValidatorTest {

    private Item item;

    @Mock
    private Errors errors;

    private ItemValidator itemValidator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        item = new Item();
        item.setPrice(12345);
        item.setSku("someSku");
        itemValidator = new ItemValidator();
    }

    @Test
    public void testItemValidateFail() {

        itemValidator.validate(item, errors);
        verify(errors, times(3)).rejectValue(anyString(), anyString(), anyString());
    }

    @Test
    public void testItemValidatePass() {
        item.setSize(new ItemSize());
        item.setDescription("someDescription");
        item.setName("anyName");
        itemValidator.validate(item, errors);
        verify(errors, never()).rejectValue(anyString(), anyString(), anyString());
    }

    @Test
    public void testItemValidateAllFail() {

        itemValidator.validate(new Item(), errors);
        verify(errors, times(5)).rejectValue(anyString(), anyString(), anyString());
    }
}
