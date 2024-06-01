package com.example.demo3;

import java.util.List;

public class CatResponse {
    private int current_page;
    private List<Cat> data;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public List<Cat> getData() {
        return data;
    }

    public void setData(List<Cat> data) {
        this.data = data;
    }
}
