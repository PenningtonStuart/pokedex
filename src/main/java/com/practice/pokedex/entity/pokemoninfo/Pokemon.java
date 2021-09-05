package com.practice.pokedex.entity.pokemoninfo;

import javax.persistence.criteria.CriteriaBuilder;
import java.net.Inet4Address;
import java.sql.Date;

public interface Pokemon {
    Integer getpokemonId();
    void setpokemonId(Integer pokemonId);

    String getpokemonName();
    void setpokemonName(String pokemonName);

    String getpokemonType();
    void setpokemonType(String pokemonType);

    String getpokemonNature();
    void setpokemonNature(String pokemonNature);

    Integer getpokemonIndexNumber();
    void setpokemonIndexNumber(Integer pokemonIndexNumber);

    Date getpokemonDateAdded();
    void setpokemonDateAdded(Date pokemonDateAdded);
}
