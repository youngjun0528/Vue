<template>
  <div class="main">{{ msg }}</div>
</template>

<script>
export default {
  name: "ChildTest2",
  data() {
    return {
      msg: 'ChildTest2'
    }
  }
}
</script>

<style scoped>
.main {
  border: solid 1px black;
  background-color: aqua;
}
</style>