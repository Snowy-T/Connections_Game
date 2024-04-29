package com.mycompany.connections;

public class Word {

    String value;
    String category;

    public Word(String value, String category) {
        this.value = value;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
