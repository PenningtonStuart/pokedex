package com.practice.pokedex.entity.pokemoninfo;


import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pokemonInfo")
public class PokemonImpl implements Pokemon{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pokemonId;

    @Column(name = "NAME", nullable = false, unique = true)
    private String pokemonName;

    @Column(name = "TYPE", nullable = false)
    private String pokemonType;

    @Column(name = "NATURE", nullable = false)
    private String pokemonNature;

    @Column(name = "TYPE", nullable = false, unique = true)
    private Integer pokemonIndexNumber;

    @Column(name = "DATE", nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd", timezone = "CST")
    private Date pokemonDateAdded;

//    public PokemonImpl(PokemonView pokemonView){
//        beanUtils.copyProperties(pokemonView, this, Pokemon.class);
//    }

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
