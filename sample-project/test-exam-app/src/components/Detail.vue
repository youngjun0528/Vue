<template>
  <div style='width:100%;'>
    <div v-on:click="goBack">Back</div>

    <div class='tableStyle' style="text-align:center;width: 90%;">
        <img v-bind:src="items.image | formatUrl" width=100 height=100/>
    </div>
    <div>
      <div class='tableStyle' style="text-align:right;">제목</div>
      <div class='tableStyle' style="text-align:left;">{{items.title}}</div>
    </div>
    <div>
      <div class='tableStyle' style="text-align:right;">가격</div>
      <div class='tableStyle' style="text-align:left;">{{items.price}}</div>
    </div>
    <div>
      <div class='tableStyle' style="text-align:right;width: 90%;">{{items.description}}</div>
    </div>
    <div>
      <div class='tableStyle' style="width: 90%;">
        <v-sheet class="mx-auto" max-width="400">
          <v-slide-group multiple show-arrows >
            <v-slide-item v-for="image in items.imageList" :key="image">
              <img v-bind:src="image | formatUrl" width=100 height=100/>
            </v-slide-item>
          </v-slide-group>
        </v-sheet>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Detail",
  props: ['langMode'],
  data(){
    return{
      mode:this.langMode
    }
  },
  methods:{
    goBack(){
        this.$router.go(-1);
    },
  },
  computed: {
    items() {
      return this.$store.getters.Item;
    },
  },
  created: function() {
    this.$store.dispatch("getStore", [this.mode, this.$route.params.id]);
    
  },
  filters: {
    formatUrl(url) {
      return "../" + url;
    },
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.tableStyle {
  border: 0.1px solid gray; 
  float: left; 
  height: 100px;
  width: 45%;
}
</style>
