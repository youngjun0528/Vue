import Vue from "vue";

Vue.component("todo-footer", {
  template: "<div> <p>This is another global child component</p> </div>",
});

var cmp = {
  template: "<div> <p>This is another local child component</p></div>",
};

new Vue({
  el: "#cmp",
  data: {
    message: "This is a parent component",
  },
  components: {
    "todo-list": cmp,
  },
});

