package org.example.model;

public enum Category {
    SHIRT ("Áo"),
    PANTS ("Quần"),
    ACCESSORY ("Phụ kiện");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
