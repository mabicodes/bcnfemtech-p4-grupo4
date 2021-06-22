package com.example.bcnfemtechp4grupo4.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.sound.midi.Sequence;
import java.io.Serializable;

@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @NotNull
    private String title;

    @NotNull
    private Long year;

    @NotNull
    private double price;

    @NotNull
    private String category;

    private String photo;



    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

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


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhotoImagePath() {
        if (photo == null || id == null) return null;
        return "/game-photo/" + id + "/" + photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

