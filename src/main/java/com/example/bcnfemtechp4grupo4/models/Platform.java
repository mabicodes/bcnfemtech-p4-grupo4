package com.example.bcnfemtechp4grupo4.models;

import javax.persistence.*;

@Entity
@Table(name= "platform")
public class Platform {

    @Id
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
