package com.taro.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "majors")
public class TarotCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String meaning;
    private String image_Url;
    private int more_card;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getImage_Url() { return image_Url; }
    public void setImage_Url(String image_Url) {this.image_Url = image_Url; }

    public int getMore_card() {
        return more_card;
    }

    public void setMore_card(int more_card) {
        this.more_card = more_card;
    }
}
