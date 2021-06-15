package com.example.bcnfemtechp4grupo4.models;

import javax.persistence.*;
import javax.sound.midi.Sequence;
import java.io.Serializable;

@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private Long year;
    private String category;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getYear() { return year;}

    public void setYear(Long year) { this.year = year; }

    public String getCategory() { return category;}

    public void setCategory(String category) { this.category=category;}

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}