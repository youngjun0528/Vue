<template>
  <div>
    <div style='width:100%; display: inline-block;'>
      <div>
        제품 목록
      </div>
      <div>
        {{getCurrentTime}}
      </div>
      <div>
        <p v-on:click="changeList(1)" v-bind:class="{red: attachOne}"
          style="float: left;">국내</p>
        <p style='float: left;'>|</p>
        <p v-on:click="changeList(2)" v-bind:class="{red: attachTwo}"
          style="float: left;">해외</p>
      </div>
    </div>
    <div>
      <div style='width: 100%' v-for="(item, index) in sortedItems" v-bind:key="item.id">
        <div style="border: 1px solid gold; float: left; width: 10%; height: 100px;">{{index}}</div>
        <div style="border: 1px solid gold; float: left; width: 22%; height: 100px;">
          <img v-bind:src="item.image | formatUrl" width=100 height=100/>
        </div>
        <div align="left" style="border: 1px solid gold; float: left; width: 22%; height: 100px;">
          <!-- <h1 v-text="product.title"></h1> -->
          <router-link
            tag="h4"
            :to="{ name: 'detail', params: { id: item.id, target: attachTarget }}"
            >
          <p style='display:block;
    overflow: hidden; 
    text-overflow: ellipsis;
    white-space: nowrap; 
    width: 100%'>{{ item.title }}</p>
          </router-link>
        </div>
        <div style="border: 1px solid gold; float: left; width: 22%; height: 100px;">
          {{ item.price}}
        </div>
        <div align="right"  style="border: 1px solid gold; float: left; width: 22%; height: 100px;">
          <p style='display:block;
    overflow: hidden; 
    text-overflow: ellipsis;
    white-space: nowrap; 
    width: 100%'> {{ item.description}} </p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Chart",
  data() {
    return {
      attachTarget: 1,
      attachOne: true,
      attachTwo: false,
    }
  },
  methods: {
    changeList(target){
      this.$store.dispatch("initStore", target);
      if(target == 1){
        this.attachTarget = 1;
        this.attachOne = true;
        this.attachTwo = false;
      }else{
        this.attachTarget = 2;
        this.attachOne = false;
        this.attachTwo = true;
      }
    }
  },
  computed: {
    getCurrentTime() {
      let today = new Date();   
      let year = today.getFullYear().toString(); // 년도
      let month = (today.getMonth() + 1).toString();  // 월
      let date = today.getDate().toString();  // 날짜
      // let day = today.getDay();  // 요일
      let hour = today.getHours().toString();
      let min = today.getMinutes().toString();

      return year + '년 ' + month + '월 ' + date + '일 ' + (hour[1] ? hour : '0'+hour[0]) + ':' + (min[1] ? min : '0'+min[0]);
    },
    items() {
      return this.$store.getters.itemList;
    },
    sortedItems() {
      if (this.items.length > 0) {``
        let itemArray = this.items.slice(0);
        var compareTest = function compare(a, b) {
          // if (a.price.toLowerCase() < b.price.toLowerCase()) {
          //   return -1;
          // }
          // if (a.price.toLowerCase() > b.price.toLowerCase()) {
          //   return 1;
          // }
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
      return "/images/" + url;
    },
  },
  created: function() {
    if(this.items.length == 0){
      this.$store.dispatch("initStore", this.attachTarget);
    }else{
      this.changeList(this.$store.getters.status);
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
