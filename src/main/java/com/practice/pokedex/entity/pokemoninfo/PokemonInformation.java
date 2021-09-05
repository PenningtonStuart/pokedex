package com.practice.pokedex.entity.pokemoninfo;


import javax.persistence.*;

@Entity
@Table(name = "pokemonInfo")
public class PokemonInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String Name;
    private String type;
    private String nature;
    @Column(unique = true)
    private Long indexNumber;

    //TODO getter setters
}
