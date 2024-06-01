package com.example.demo3;

import java.util.List;

public class BreedsResponse {
    private int current_page;
    private List<Breed> data;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public List<Breed> getData() {
        return data;
    }

    public void setData(List<Breed> data) {
        this.data = data;
    }

}
