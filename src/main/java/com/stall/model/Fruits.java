package com.stall.model;

import org.springframework.stereotype.Component;

@Component
public class Fruits {
    private int count;
    private String fruitName, id;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void display(){
        System.out.println("List");
    }
}
