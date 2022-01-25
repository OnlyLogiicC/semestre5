<template>
  <div class="LoginForm">
      <form
        id="app"
        @submit="checkForm"
      >
      <h5>
      <p v-if="errors.length">
      <b>Corriger vos erreurs ... : </b>
      <ul style="list-style-type: none;">
        <li v-for="error in errors" :key="error">{{ error }}</li>
      </ul>
      </p></h5>
      <p>
      <label for="nom">Nom : </label>
      <input
        id="nom"
        name="nom"
        type="text"
        v-model="nom">
      </p>
      <p>
      <input
        type="submit"
        value="Go !!">
      </p>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      errors: [],
      nom: null,
    };
  },
  methods: {
    checkForm: function (e) {
      if (this.nom) {
        this.$store.commit("setLeUser", this.nom);
      }
      if (!this.nom) {
        this.errors.push("Nom obligatoire.");
      }
      e.preventDefault();
    },
  },
};
</script>