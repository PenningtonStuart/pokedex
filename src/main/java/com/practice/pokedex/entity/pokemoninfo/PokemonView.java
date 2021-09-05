package com.practice.pokedex.entity.pokemoninfo;

import java.sql.Date;

public class PokemonView implements Pokemon{

    private Integer pokemonId;
    private String pokemonName;
    private String pokemonType;
    private String pokemonNature;
    private Integer pokemonIndexNumber;
    private Date pokemonDateAdded;

    public Integer getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Integer pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public String getPokemonNature() {
        return pokemonNature;
    }

    public void setPokemonNature(String pokemonNature) {
        this.pokemonNature = pokemonNature;
    }

    public Integer getPokemonIndexNumber() {
        return pokemonIndexNumber;
    }

    public void setPokemonIndexNumber(Integer pokemonIndexNumber) {
        this.pokemonIndexNumber = pokemonIndexNumber;
    }

    public Date getPokemonDateAdded() {
        return pokemonDateAdded;
    }

    public void setPokemonDateAdded(Date pokemonDateAdded) {
        this.pokemonDateAdded = pokemonDateAdded;
    }
}
