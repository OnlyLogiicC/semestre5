<template>
    <router-link :to="url">{{ desc }}</router-link>
</template>


<script>
export default {
  name: 'Navigation',
  props: {
    url: String,
    desc: String
  },
}
</script>