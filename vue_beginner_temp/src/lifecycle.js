import Vue from "vue";

new Vue({
  el: "#lifecycle",
  data: {
    message: "Hello World!",
  },
  beforeCreate: function() {
    console.log("beforeCreate");
  },
  created: function() {
    console.log("created");
  },
  mounted: function() {
    console.log("mounted");
    this.message = "Hello Vue!!";
  },
  updated: function() {
    console.log("updated");
  },
});

