package com.example.database_assignment.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplier_id;
    private String supplier_name;
    private int contact_no;
    private String address;

    @JoinColumn(name = "supplier_id_fk")
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Food_Item> foodItemList = new ArrayList<>();

    public List<Food_Item> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(List<Food_Item> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public Supplier() {
    }

    public Supplier(String supplier_name, int contact_no, String address) {
        this.supplier_name = supplier_name;
        this.contact_no = contact_no;
        this.address = address;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
