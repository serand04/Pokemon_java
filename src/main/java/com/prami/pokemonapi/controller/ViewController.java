package com.prami.pokemonapi.controller;

import com.prami.pokemonapi.service.PokemonService;
import com.prami.pokemonapi.service.TrainerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {
    private final PokemonService pokemonService;
    private final TrainerService trainerService;

    public ViewController(PokemonService pokemonService, TrainerService trainerService) {
        this.pokemonService = pokemonService;
        this.trainerService = trainerService;
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("pokemons", pokemonService.getFirst50Abilities());
        model.addAttribute("trainers", trainerService.getAllTrainers());
        return "home";
    }
}
