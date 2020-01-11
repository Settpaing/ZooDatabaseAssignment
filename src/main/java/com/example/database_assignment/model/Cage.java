package com.example.database_assignment.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
public class Cage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cage_id;
    private String cage_no;
    private String location;

    @JoinColumn(name = "Animal_id_fk")
    @OneToOne(cascade = CascadeType.PERSIST)
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Cage() {
    }

    public Cage(String cage_no, String location) {
        this.cage_no = cage_no;
        this.location = location;
    }

    public Integer getCage_id() {
        return cage_id;
    }

    public void setCage_id(Integer cage_id) {
        this.cage_id = cage_id;
    }

    public String getCage_no() {
        return cage_no;
    }

    public void setCage_no(String cage_no) {
        this.cage_no = cage_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
