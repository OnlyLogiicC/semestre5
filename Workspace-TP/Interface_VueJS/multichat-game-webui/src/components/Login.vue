<template>
    <div class="LoginForm">
        <form
            id="app"
            @submit="checkForm"
        >
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
            nom: null,
        };
    },
    methods: {
        checkForm: function (e) {
            if (this.nom) {
                this.$store.commit("setLeUser", this.nom);
                this.$emit("loginEvent");
                this.$router.push({name:"Maison", params: {lenom: this.nom } }) ;
            }
            if (!this.nom) {
                this.errors.push("Nom obligatoire.");
            }
            e.preventDefault();
        },
    },
};

</script>