package com.example.demo.config;

import java.beans.PropertyEditorSupport;

public class FirstNamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text){
        setValue(text.trim().toUpperCase());
    }
}
