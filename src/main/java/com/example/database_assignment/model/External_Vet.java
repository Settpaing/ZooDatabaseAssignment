package com.example.database_assignment.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "EV")
public class External_Vet extends Vet {

    private String country;
    private double visiting_fees;

    public External_Vet() {
    }

    public External_Vet(String name, String qualification, String country, double visiting_fees) {
        super(name, qualification);
        this.country = country;
        this.visiting_fees = visiting_fees;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getVisiting_fees() {
        return visiting_fees;
    }

    public void setVisiting_fees(double visiting_fees) {
        this.visiting_fees = visiting_fees;
    }
}
