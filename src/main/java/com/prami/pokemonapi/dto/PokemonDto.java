package com.prami.pokemonapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class PokemonDto {
    private String name;
    private int height;
    private int weight;
    private List<Ability> abilities;

    @Data
    public static class Ability {
        private AbilityDetail ability;

        @Data
        public static class AbilityDetail {
            private String name;
        }
    }
}
