<template>
  <div id="app">
    <Navbar />
    <div id="pokemon">
      <PokemonList />
    </div>
    <div id="Trainers">
      <TrainerList />
    </div>
  </div>
</template>

<script>
import Navbar from './components/AppNavbar.vue'
import PokemonList from './components/PokemonList.vue'
import TrainerList from './components/TrainerList.vue'

export default {
  components: {
    Navbar,
    PokemonList,
    TrainerList
  },
};
</script>

<style>
body {
  background-color: #f8f9fa;
}
</style>
