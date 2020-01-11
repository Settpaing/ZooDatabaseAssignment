package com.example.database_assignment.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Food_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer food_item_id;
    private String food_name;
    private int quantity;

    @ManyToMany(targetEntity = Animal.class)
    private List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Food_Item() {
    }

    public Food_Item(String food_name, int quantity) {
        this.food_name = food_name;
        this.quantity = quantity;
    }

    public Integer getFood_item_id() {
        return food_item_id;
    }

    public void setFood_item_id(Integer food_item_id) {
        this.food_item_id = food_item_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
