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

    public String getimage_Url() { return image_Url; }
    public void setimage_Url(String url) {this.image_Url = url; }
}
