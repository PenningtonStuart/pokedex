package com.practice.pokedex.repository;

import com.practice.pokedex.model.PokemonImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PokemonRepo extends JpaRepository<PokemonImpl, Integer> {
    List<PokemonImpl> findBypokemonIndexNumber(Integer indexNumber);
    List<PokemonImpl> findBypokemonName(String pokemonName);

    @Modifying
    @Query(value = "DELETE FROM pokemon_info pkInfo WHERE pkInfo.id = :id", nativeQuery = true)
    Integer deletePokemonById(@Param("id") Integer id);
}
