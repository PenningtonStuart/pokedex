package com.practice.pokedex.entity.pokemoninfo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pokemonInfo")
public class PokemonImpl implements Pokemon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer pokemonId;

    @Column(name = "pokemonName", nullable = false, unique = true)
    private String pokemonName;

    @Column(name = "pokemonType", nullable = true)
    private String pokemonType;

    @Column(name = "pokemonNature", nullable = true)
    private String pokemonNature;

    @Column(name = "indexNumber", nullable = false, unique = true)
    private Integer pokemonIndexNumber;

    @Column(name = "dateSeen", nullable = true)
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "CST")
    private Date pokemonDateAdded;

    public PokemonImpl(PokemonView pokemonView){
        BeanUtils.copyProperties(pokemonView, this, Pokemon.class);
    }

    public PokemonImpl() {
        super();
    }

    public PokemonImpl(Integer pokemonId, String pokemonName, String pokemonType, String pokemonNature, Integer pokemonIndexNumber, Date pokemonDateAdded) {
        this.pokemonId = pokemonId;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.pokemonNature = pokemonNature;
        this.pokemonIndexNumber = pokemonIndexNumber;
        this.pokemonDateAdded = pokemonDateAdded;
    }

    @Override
    public Integer getpokemonId() {
        return pokemonId;
    }

    @Override
    public void setpokemonId(Integer pokemonId) {
        this.pokemonId = pokemonId;
    }

    @Override
    public String getpokemonName() {
        return pokemonName;
    }

    @Override
    public void setpokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    @Override
    public String getpokemonType() {
        return pokemonType;
    }

    @Override
    public void setpokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    @Override
    public String getpokemonNature() {
        return pokemonNature;
    }

    @Override
    public void setpokemonNature(String pokemonNature) {
        this.pokemonNature = pokemonNature;
    }

    @Override
    public Integer getpokemonIndexNumber() {
        return pokemonIndexNumber;
    }

    @Override
    public void setpokemonIndexNumber(Integer pokemonIndexNumber) {
        this.pokemonIndexNumber = pokemonIndexNumber;
    }

    @Override
    public Date getpokemonDateAdded() {
        return pokemonDateAdded;
    }

    @Override
    public void setpokemonDateAdded(Date pokemonDateAdded) {
        this.pokemonDateAdded = pokemonDateAdded;
    }
}
