package com.practice.pokedex.controller;

import com.practice.pokedex.model.PokemonImpl;
import com.practice.pokedex.repository.PokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    PokemonRepo pokemonRepo;

    @GetMapping("/pokemoninfo")
    public ResponseEntity<List<PokemonImpl>> getAllPokemon(){
        List<PokemonImpl> pokemonList = pokemonRepo.findAll();

        if(pokemonList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(pokemonList, HttpStatus.OK);
    }

    @GetMapping("/pokemoninfo/{id}")
    public ResponseEntity<PokemonImpl> getPokemonById(@PathVariable("id") Integer pokemonId) {
       PokemonImpl pokemonList = pokemonRepo.getById(pokemonId);

//       if(pokemonList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
        System.out.println(pokemonList);
        return new ResponseEntity<>(pokemonList, HttpStatus.OK);
    }

    @PostMapping("/pokemoninfo")
    public ResponseEntity<PokemonImpl> createPokemon(@RequestBody PokemonImpl pokemonImpl) {
        return null;
    }

    @PutMapping("/pokemoninfo/{id}")
    public ResponseEntity<PokemonImpl> updatePokemon(@PathVariable("id") long id, @RequestBody PokemonImpl pokemonImpl) {
        return null;
    }

    @DeleteMapping("/pokemoninfo/{id}")
    public ResponseEntity<HttpStatus> deletePokemon(@PathVariable("id") long id) {
        return null;
    }

    @DeleteMapping("/pokemoninfo")
    public ResponseEntity<HttpStatus> deleteAllPokemon(){
        return null;
    }

    @GetMapping("pokemoninfo/indexNumber")
    public ResponseEntity<List<PokemonImpl>> findByPokemonNumber() {
        return null;
    }
}
