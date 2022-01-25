<template>
<div id='titre'>
  <h2> Bienvenue sur {{ msg }}</h2> 
</div>
<div id='Log' v-if="$route.params.lenom == null">
    <login @loginEvent="setUser"/>
</div>  
<div id='contenu' v-else>
     <router-view />    
</div>
</template>

<script>
import Login from '@/components/Login.vue'

export default {
    name : 'Bienvenue',
    components : {
        Login
    },
    data(){
        return {
            message : ''
        }
    },
    props: {
        msg: String
    },
    created(){
        if (this.$store.getters.getLeUser == ''){
            this.message = this.msg;
        }
    },
}
</script>
