package com.prami.pokemonapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private Integer score;

    @ElementCollection
    private List<String> favoritePokemons;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<String> getFavoritePokemons() {
        return favoritePokemons;
    }

    public void setFavoritePokemons(List<String> favoritePokemons) {
        this.favoritePokemons = favoritePokemons;
    }
}
