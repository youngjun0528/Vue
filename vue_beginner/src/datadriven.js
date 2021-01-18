import Vue from "vue";

Vue.component("child-component", {
  props: ["data"],
  template: "<p>{{data}}</p>",
  created() {
    this.$emit("show-log", "Change Child Component");
  },
});

Vue.component("sibling-component", {
  props: ["data"],
  template: "<p>{{data}}</p>",
});

new Vue({
  el: "#dataDriven",
  data: {
    message: "Hello Vue! passed from Parent Component",
    anotherMessage: "Hello Vue! passed from Parent Component",
  },
  methods: {
    printText: function(data) {
      this.message = data;
    },
  },
});

