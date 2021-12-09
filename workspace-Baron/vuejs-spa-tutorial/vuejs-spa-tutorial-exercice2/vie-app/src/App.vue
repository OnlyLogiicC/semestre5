<template>
  <div class="container-fluid" id="app">
    <menuBar />
    <Common />
  </div>
</template>

<script>
import menuBar from "@/components/MenuBar.vue";
import Common from "@/components/Common.vue";

export default {
  name: "App",
  components: { menuBar, Common },
};
</script>

<style>
</style>
