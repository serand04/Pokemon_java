package com.prami.pokemonapi.service;

import com.prami.pokemonapi.model.Trainer;
import com.prami.pokemonapi.repository.TrainerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public Trainer createTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public Trainer updateTrainer(Long id, Trainer trainerDetails) {
        Trainer trainer = trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entrenador no encontrado"));
        trainer.setName(trainerDetails.getName());
        trainer.setCity(trainerDetails.getCity());
        trainer.setScore(trainerDetails.getScore());
        trainer.setFavoritePokemons(trainerDetails.getFavoritePokemons());
        return trainerRepository.save(trainer);
    }

    public Trainer getTrainer(Long id) {
        return trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entrenador no encontrado"));
    }

    public void deleteTrainer(Long id) {
        trainerRepository.deleteById(id);
    }

}
