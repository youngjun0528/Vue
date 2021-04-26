<template>
  <div>
  </div>
</template>

<script>
export default {
  name: "Detail",
  props: {
    msg: String,
  },
  created: function() {
    this.$store.dispatch("getStore", this.$route.params.id);
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
</style>
