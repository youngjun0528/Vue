<template>
  <ul>
    <li v-for="s in subs" v-bind:class="s.type" :key="s.name">
      {{ s.name }}
      <TestTree :subs="s.subs"></TestTree>
    </li>
  </ul>
</template>

<script>
export default {
  name: "TestTree",
  props: ['subs']
}
</script>

<style scoped>

</style>