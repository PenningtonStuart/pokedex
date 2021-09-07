package com.practice.pokedex.repository;

import com.practice.pokedex.model.PokemonImpl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PokemonRepo extends JpaRepository<PokemonImpl, Integer> {
    List<PokemonImpl> findBypokemonIndexNumber(Integer indexNumber);
    List<PokemonImpl> findBypokemonName(String pokemonName);

}
