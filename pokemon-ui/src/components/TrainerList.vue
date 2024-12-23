<template>
  <div class="container mt-4">
    <h2>Lista de Entrenadores</h2>
    <table class="table">
      <thead>
        <tr>
          <th>#</th>
          <th>Nombre</th>
          <th>Ciudad</th>
          <th>Puntaje</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="trainer in trainers" :key="trainer.id">
          <td>{{ trainer.id }}</td>
          <td>{{ trainer.name }}</td>
          <td>{{ trainer.city }}</td>
          <td>{{ trainer.score }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: "TrainerList",
  data () {
    return {
      trainers: [],
    };
  },
  mounted() {
    fetch("http://localhost:8080/api/trainers")
        .then((response) => response.json())
        .then((data) => {
          this.trainers = data;
        });
  },
};
</script>

<style>
</style>