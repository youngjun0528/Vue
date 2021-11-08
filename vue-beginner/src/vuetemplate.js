import Vue from "vue";

new Vue({
  el: "#vuetemplate",
  data: {
    flag: true,
    systems: ["a", "b", "c"],
    uid: 10,
    message: "Hello Vue.js",
    checkMsg: "",
  },
  methods: {
    popupAlert: function(event, data) {
      console.log(event);
      return alert("event " + data + " test");
    },
  },
  watch: {
    message: function(data) {
      this.checkMsg = "check : " + data;
    },
  },
  computed: {
    reversedMsg: function() {
      return this.message
        .split("")
        .reverse()
        .join("");
    },
  },
});

