package com.example.database_assignment.model;

import javax.persistence.*;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staff_id;
    private String staff_name;
    private int age;
    private double staff_salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Staff() {
    }

    public Staff(String staff_name, int age, double staff_salary, Gender gender) {
        this.staff_name = staff_name;
        this.age = age;
        this.staff_salary = staff_salary;
        this.gender = gender;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getStaff_salary() {
        return staff_salary;
    }

    public void setStaff_salary(double staff_salary) {
        this.staff_salary = staff_salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
