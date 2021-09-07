package com.practice.pokedex.controller;

import com.practice.pokedex.model.PokemonImpl;
import com.practice.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemoninfo")
    public ResponseEntity<List<PokemonImpl>> getAllPokemon(){
        List<PokemonImpl> pokemonList = pokemonService.getAll();

        if(pokemonList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(pokemonList, HttpStatus.OK);
    }

    @GetMapping("/pokemonid/{id}")
    public ResponseEntity<PokemonImpl> getPokemonById(@PathVariable("id") Integer pokemonId) {
       PokemonImpl pokemonList = pokemonService.getById(pokemonId);

       if(pokemonList == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(pokemonList, HttpStatus.OK);
    }

    @PostMapping("/pokemon/create")
    public ResponseEntity<PokemonImpl> createPokemon(@RequestBody PokemonImpl pokemonImpl) {
        PokemonImpl pokemon = pokemonService.createPokemon(pokemonImpl);

        //TODO possibly add handling for an erroneous input
       if(pokemon == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(pokemon, HttpStatus.CREATED);
    }

    @PutMapping("/pokemon/update/{id}")
    public ResponseEntity<PokemonImpl> updatePokemon(@PathVariable("id") Integer id, @RequestBody PokemonImpl pokemonImpl) {
        return null;
    }

    @DeleteMapping("/pokemon/delete/{id}")
    public ResponseEntity<Integer> deletePokemonById(@PathVariable("id") Integer id) {
        //error handling before delete

        Integer deletePokemon = pokemonService.deletePokemonById(id);
        return new ResponseEntity<>(deletePokemon, HttpStatus.OK);
    }

    //I don't want to implement this for obvious resons.....
    @DeleteMapping("/pokemoninfo")
    public ResponseEntity<HttpStatus> deleteAllPokemon(){
        return null;
    }

    @GetMapping("pokemoninfo/indexNumber")
    public ResponseEntity<List<PokemonImpl>> findByPokemonNumber() {
        return null;
    }
}
