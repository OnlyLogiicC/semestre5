<template>
    <div id="titre">
        <h1>Bienvenue {{msg}}</h1>
    </div>
    <div id='Navig'>
        <nav><h4>
            <navigation v-if="!$router.params.lenom ==''" :url="homeurl" desc=" Maison " /> 
            <navigation v-if="!$router.params.lenom ==''" :url="byeurl" desc=" AuRevoir " @click="effaceTout"/>
        </h4></nav>
    </div>
    <div id='Log' v-if="$route.params.lenom == null">
        <login @loginEVent="setUser"/>
    </div>
    <div id='contenu' v-else>
        <router-view/>
    </div>
</template>

<script>

import Login from '@/components/Login.vue'
import Navigation from '@/components/Navigation.vue';
export default {
  components: { 
      Login, 
      Navigation 
      } ,
  name: 'Bienvenue',
  data() {
      return {
          message : '',
          homeurl : '/',
          byeurl : '/',
          }
  },
  props: {
    msg: String
  },
  created(){
      if (this.$store.getters.getLeUser == '') {
          this.message = this.msg ;
      }
  },
  methods : {
      setUser() {
          this.message = this.$store.getters.getLeUser ,
          this.homeurl = " /maison " + this.$store.getters.getLeUser,
          this.byeurl = " /aurevoir " + this.$store.getters.getLeUser
      }
  },
}
</script>