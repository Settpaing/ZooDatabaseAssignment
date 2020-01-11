package com.example.database_assignment.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "IHV")
public class In_House_Vet extends Vet{

    private double salary;

    public In_House_Vet() {
    }

    public In_House_Vet(String name, String qualification, double salary) {
        super(name, qualification);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
