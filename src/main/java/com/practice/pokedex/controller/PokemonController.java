package com.practice.pokedex.controller;

import com.practice.pokedex.entity.pokemoninfo.PokemonView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/pokemon")
@RestController

public class PokemonController {

    @GetMapping(value = "/all")
    public ResponseEntity<List<PokemonView>> getAllPokemon() {
        //return all Pokemon
        return null;
    }

    @GetMapping(value = "/{indexNumber}")
    public ResponseEntity<List<PokemonView>> getAllByIndexNumber() {
        //return all by index number
        return null;
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<List<PokemonView>> getAllByName() {
        //return all by index number
        return null;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<PokemonView> createPokemonEntry(@RequestBody PokemonView pokemon) {
        Integer entryId = pokemon.getpokemonId();
        if(entryId != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        //add in manager.save function PokemonView pkView = pokemonManager.savePokemon(pokemon)
        return new ResponseEntity<>(entryId, HttpStatus.CONFLICT);
    }
}
