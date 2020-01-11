package com.example.database_assignment.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;
    private String category_type;

    @JoinColumn(name = "category_id_fk")
    @OneToMany(targetEntity = Animal.class,cascade = CascadeType.PERSIST)
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(List<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    public Category() {
    }

    public Category(String category_type) {
        this.category_type = category_type;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }
}
