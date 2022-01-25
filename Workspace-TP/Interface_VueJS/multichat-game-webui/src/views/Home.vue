<template>
  <div class="home">
  <img alt="Vue logo" src="../assets/logo.png">
    <Bienvenue msg="sur MyMultiChat-Game !!!"/>
  </div>
</template>

<script>
// @ is an alias to /src
//import HelloWorld from '@/components/HelloWorld.vue'
import Bienvenue from '@/components/Bienvenue.vue'

export default {
  name: 'Home',
  components: {
    Bienvenue
  }
}
</script>
