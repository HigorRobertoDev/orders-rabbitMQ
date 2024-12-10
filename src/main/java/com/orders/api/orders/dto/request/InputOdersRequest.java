package com.orders.api.orders.dto.request;

import lombok.Data;

public class InputOdersRequest {

    private Integer id;
    private String name;
    private Integer size;

    public InputOdersRequest(Integer id, String name, Integer size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
