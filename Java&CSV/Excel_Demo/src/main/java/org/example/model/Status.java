package org.example.model;

public enum Status {
    STOCKING ("Còn hàng"),
    SOLD_OUT("Tạm hết hàng"),
    PRE_ORDER("Đặt trước"),
    DISCONTINUE("Ngừng kinh doanh");

    private String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
