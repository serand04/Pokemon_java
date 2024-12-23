package com.prami.pokemonapi.controller;

import com.prami.pokemonapi.dto.PokemonDto;
import com.prami.pokemonapi.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<PokemonDto> getPokemon(@PathVariable String identifier) {
        return ResponseEntity.ok(pokemonService.getPokemonByNameOrId(identifier));
    }

    @GetMapping("/abilities")
    public ResponseEntity<List<String>> getAbilities() {
        return ResponseEntity.ok(pokemonService.getFirst50Abilities());
    }
}
