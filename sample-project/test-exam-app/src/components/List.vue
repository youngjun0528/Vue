<template>
  <div>
    <div style='width:100%; display: inline-block;'>
      <div>
        List
      </div>
      <div>
        {{getCurrentTime}}
      </div>
      <div>
        <p v-on:click="changeList('ko')" v-bind:class="{textColor: koColorRed}" style="float: left;">국내</p>
        <p style='float: left;'>|</p>
        <p v-on:click="changeList('en')" v-bind:class="{textColor: enColorRed}" style="float: left;">해외</p>
      </div>
    </div>
    <div>
      <div style='width: 100%' v-for="(item, index) in sortedItems" v-bind:key="item.id">
        <router-link tag="p" :to="{ name: 'Detail', params: { id: item.id, langMode: mode }}" >
          <div class='tableStyle' style="width: 10%;text-align:left;">{{index}}</div>
          <div class='tableStyle' style="width: 22%;">
            <img v-bind:src="item.image | formatUrl" width=100 height=100/>
          </div>
          <div align="left" class='tableStyle' style="width: 22%;text-align:right;">
            <!-- <h1 v-text="product.title"></h1> -->
            <p class='textStyle'>{{ item.title }}</p>
          </div>
          <div class='tableStyle' style="width: 22%;text-align:center;">
            {{ item.price | comma }}
          </div>
          <div align="right" class='tableStyle' style="width: 22%;">
            <p class='textStyle'> {{ item.description}} </p>
          </div>
        </router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "List",
  data() {
    return {
      koColorRed: true,
      enColorRed: false,
    }
  },
  methods: {
    changeList(mode){
      this.$store.dispatch("initStore", mode);
      if(mode == 'ko'){
        this.koColorRed = true;
        this.enColorRed = false;
      }else{
        this.koColorRed = false;
        this.enColorRed = true;
      }
    }
  },
  computed: {
    getCurrentTime() {
      let today = new Date();   
      let year = today.getFullYear().toString(); // 년도
      let month = (today.getMonth() + 1).toString();  // 월
      let date = today.getDate().toString();  // 날짜
      let hour = today.getHours().toString();
      let min = today.getMinutes().toString();

      return year + '년 ' + month + '월 ' + date + '일 ' + (hour[1] ? hour : '0'+hour[0]) + ':' + (min[1] ? min : '0'+min[0]);
    },
    items() {
      return this.$store.getters.List;
    },
    mode() {
      return this.$store.getters.Mode;
    },
    sortedItems() {
      if (this.items.length > 0) {
        let itemArray = this.items.slice(0);
        var compareTest = function compare(a, b) {
          if (a.price < b.price) {
            return -1;
          }
          if (a.price > b.price) {
            return 1;
          }
          return 0;
        };
        return itemArray.sort(compareTest);
      }
      return this.items;
    },
  },
  filters: {
    formatUrl(url) {
      return "./" + url;
    },
    comma(val){
      return String(val).replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    }
  },
  created: function() {
    this.$store.dispatch("initStore", this.mode);
    this.changeList(this.mode);
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.textColor {
  color: red;
}
.tableStyle {
  border: 0.1px solid gray; 
  float: left; 
  height: 100px;
}
.textStyle{
  display:block;
  overflow: hidden; 
  text-overflow: ellipsis;
  white-space: nowrap; 
  width: 100%
}
</style>
