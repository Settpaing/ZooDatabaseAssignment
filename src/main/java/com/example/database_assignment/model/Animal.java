package com.example.database_assignment.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animal_id;
    private String type;
    private int total_no;

    @ManyToMany(targetEntity = Food_Item.class,mappedBy = "animalList",cascade = CascadeType.PERSIST)
    private List<Food_Item> itemList = new ArrayList<>();

    public Animal() {
    }

    public Animal(String type, int total_no) {
        this.type = type;
        this.total_no = total_no;
    }

    public List<Food_Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Food_Item> itemList) {
        this.itemList = itemList;
    }

    public Integer getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(Integer animal_id) {
        this.animal_id = animal_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal_no() {
        return total_no;
    }

    public void setTotal_no(int total_no) {
        this.total_no = total_no;
    }
}
