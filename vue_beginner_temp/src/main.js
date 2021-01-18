import Vue from "vue";
import VueRouter from "vue-router";
import App from "./App.vue";
import "./lifecycle.js";
import "./component.js";
import "./datadriven.js";
import "./vuerouter.js";
import "./httpaxios.js";

Vue.config.productionTip = false;

Vue.use(VueRouter);

new Vue({
  render: (h) => h(App),
}).$mount("#app");

