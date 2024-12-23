package com.prami.pokemonapi.service;

import com.prami.pokemonapi.dto.PokemonDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PokemonService {
    private final RestTemplate restTemplate;

    public PokemonService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public PokemonDto getPokemonByNameOrId(String identifier) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + identifier;

        try {
            return restTemplate.getForObject(url, PokemonDto.class);
        } catch (HttpClientErrorException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pokémon no encontrado");
        }
    }

    public List<String> getFirst50Abilities() {
        String url = "https://pokeapi.co/api/v2/ability?limit=50";
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        List<Map<String, String>> results = (List<Map<String, String>>) response.get("results");
        return results.stream()
                .map(result -> result.get("name"))
                .sorted()
                .collect(Collectors.toList());
    }

}
