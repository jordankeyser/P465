package edu.iu.p565.customerservice.model;

import jakarta.validation.constraints.NotEmpty;

public class Customer {

    private int id;
    @NotEmpty(message = "name cannot be empty.")
    private String name;
    @NotEmpty(message = "name cannot be empty.")
    private String email;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
}