package com.practice.pokedex.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})//this is to prevent he Java runtime race condition for getbyID()
@Table(name = "pokemon_info")
public class PokemonImpl{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer pokemonId;

    @Column(name = "pokemon_name", nullable = false, unique = true)
    private String pokemonName;

    @Column(name = "pokemon_type", nullable = true)
    private String pokemonType;

    @Column(name = "pokemon_nature", nullable = true)
    private String pokemonNature;

    @Column(name = "index_number", nullable = false, unique = true)
    private Integer pokemonIndexNumber;

    @Column(name = "date_seen", nullable = true)
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "CST")
    private Date pokemonDateAdded;

    public PokemonImpl(Integer pokemonId, String pokemonName, String pokemonType, String pokemonNature, Integer pokemonIndexNumber, Date pokemonDateAdded) {
        super();
        this.pokemonId = pokemonId;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.pokemonNature = pokemonNature;
        this.pokemonIndexNumber = pokemonIndexNumber;
        this.pokemonDateAdded = pokemonDateAdded;
    }

    public PokemonImpl(){
        //defalut
    }

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

    @Override
    public String toString() {
        return "PokemonImpl{" +
                "pokemonId=" + pokemonId +
                ", pokemonName='" + pokemonName + '\'' +
                ", pokemonType='" + pokemonType + '\'' +
                ", pokemonNature='" + pokemonNature + '\'' +
                ", pokemonIndexNumber=" + pokemonIndexNumber +
                ", pokemonDateAdded=" + pokemonDateAdded +
                '}';
    }
}
