package com.practice.pokedex.service;

import com.practice.pokedex.model.PokemonImpl;
import com.practice.pokedex.repository.PokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    PokemonRepo pokemonRepo;

    public List<PokemonImpl> getAll() {
        return pokemonRepo.findAll();
    }

    public PokemonImpl getById(Integer pokemonId) {
        return pokemonRepo.getById(pokemonId);
    }

    public PokemonImpl createPokemon(PokemonImpl pokemonImpl) {
        return pokemonRepo.save(pokemonImpl);
    }

    public Integer deletePokemonById(Integer id) {
        return pokemonRepo.deletePokemonById(id);
    }
}
