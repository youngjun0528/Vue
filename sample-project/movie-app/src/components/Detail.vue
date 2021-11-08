<template>
  <div>
    <div v-on:click="goBack">Back</div>
    <div>{{products.title}}</div>
    <div>{{products.price}}</div>
    <div>상세내용 : {{products.description}}</div>
    <div>{{pageMode}}</div>
  </div>
</template>

<script>
export default {
  name: "Detail",
  props: ['attachTarget'],
  data(){
    return{
      pageMode:this.attachTarget
    }
  },
  methods:{
    goBack(){
        this.$router.go(-1);
    },
  },
  computed: {
    products() {
      return this.$store.getters.movie;
    },
  },
  created: function() {
    this.$store.dispatch("getStore", this.$route.params.id);
    
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
</style>