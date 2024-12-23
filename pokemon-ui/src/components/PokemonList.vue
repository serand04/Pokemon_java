<template>
  <div class="container mt-4">
    <h2>Lista de Pokémon</h2>
    <ul class="list-group">
      <li class="list-group-item" v-for="pokemon in pokemons" :key="pokemon.name">
        {{ pokemon.name }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "PokemonList",
  data () {
    return {
      pokemons: [],
    };
  },
  mounted() {
    fetch("http://localhost:8080/api/pokemon?limit=50")
        .then((response) => response.json())
        .then((data) => {
          this.pokemons = data.results;
        });
  },
};
</script>
<style>
</style>