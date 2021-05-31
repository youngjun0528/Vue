<template>
  <div>
    <div v-on:click="goBack">Back</div>
    <div>{{items.title}}</div>
    <div>{{items.price}}</div>
    <div>상세내용 : {{items.description}}</div>
    <div>{{pageMode}}</div>
    
    <v-sheet
      class="mx-auto"
      max-width="700"
      >
        <v-slide-group
          multiple
          show-arrows
        >
          <v-slide-item
            v-for="n in 25"
            :key="n"
            v-slot="{ active, toggle }"
          >
            <v-btn
              class="mx-2"
              :input-value="active"
              active-class="purple white--text"
              depressed
              rounded
              @click="toggle"
            >
              Options {{ n }}
            </v-btn>
          </v-slide-item>
        </v-slide-group>
      </v-sheet>
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
    items() {
      return this.$store.getters.item;
    },
  },
  created: function() {
    this.$store.dispatch("getStore", this.$route.params.id);
    
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
