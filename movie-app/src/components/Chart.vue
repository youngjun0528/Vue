<template>
  <div>
    <router-link
              :to="{ name: 'detail', params: { id: 'ID001' } }"
            >
              TEST
            </router-link>
  </div>
</template>

<script>
export default {
  name: "Chart",
  props: {
    msg: String,
  },
  created: function() {
    this.$store.dispatch("initStore");
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
</style>
