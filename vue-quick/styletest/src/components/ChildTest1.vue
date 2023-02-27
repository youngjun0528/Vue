<template>
  <div>
    <div class="main">{{ msg }}</div>
    <div class="test">{{ msg }}</div>
  </div>
</template>

<script>
export default {
  name: "ChildTest1",
  data() {
    return {
      msg: 'ChildTest1',
    }
  }
}
</script>

<style scoped>
.main {
  border: solid 1px black;
  background-color: yellow;
}
.test {
  font-style: italic;
  padding: 10px;
  text-decoration: underline;
  border: solid 1px black;
}
</style>