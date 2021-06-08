package com.example.bcnfemtechp4grupo4.models;

import javax.persistence.*;
import javax.sound.midi.Sequence;
import java.io.Serializable;

public class Game {
}
@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String title;
    private String platform;
    private String year;
    private String price;
    private String etiqueta;
    private String discount;
    private String pricediscount;
    private String category;
    private String publisher;
    private String pegi;
    private String pegicontentdescriptors;


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

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                ", etiqueta='" + etiqueta + '\'' +
                ", discount='" + discount + '\'' +
                ", pricediscount='" + pricediscount+ '\'' +
                ", category='" + category + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pegi='" + pegi+ '\'' +
                ", pegicontentdescriptors='" + pegicontentdescriptors+ '\'' +
                '}';
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year= year;
    }
}