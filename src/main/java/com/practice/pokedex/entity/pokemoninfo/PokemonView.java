package com.practice.pokedex.entity.pokemoninfo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.BeanUtils;

import java.sql.Date;

public class PokemonView implements Pokemon{

    private Integer pokemonId;
    private String pokemonName;
    private String pokemonType;
    private String pokemonNature;
    private Integer pokemonIndexNumber;
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "CST")
    private Date pokemonDateAdded;

    public PokemonView(PokemonImpl pokemonImpl) {
        BeanUtils.copyProperties(pokemonImpl, this, Pokemon.class);
    }

    public PokemonView() {
        //default
    }
    public PokemonView(Integer pokemonId, String pokemonName, String pokemonType, String pokemonNature, Integer pokemonIndexNumber, Date pokemonDateAdded) {
        this.pokemonId = pokemonId;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.pokemonNature = pokemonNature;
        this.pokemonIndexNumber = pokemonIndexNumber;
        this.pokemonDateAdded = pokemonDateAdded;
    }

    @Override
    public Integer getpokemonId() {
        return null;
    }

    @Override
    public void setpokemonId(Integer pokemonId) {

    }

    @Override
    public String getpokemonName() {
        return null;
    }

    @Override
    public void setpokemonName(String pokemonName) {

    }

    @Override
    public String getpokemonType() {
        return null;
    }

    @Override
    public void setpokemonType(String pokemonType) {

    }

    @Override
    public String getpokemonNature() {
        return null;
    }

    @Override
    public void setpokemonNature(String pokemonNature) {

    }

    @Override
    public Integer getpokemonIndexNumber() {
        return null;
    }

    @Override
    public void setpokemonIndexNumber(Integer pokemonIndexNumber) {

    }

    @Override
    public Date getpokemonDateAdded() {
        return null;
    }

    @Override
    public void setpokemonDateAdded(Date pokemonDateAdded) {

    }
}
