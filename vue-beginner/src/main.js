import Vue from "vue";
import VueRouter from "vue-router";
import App from "./App.vue";
import "./lifecycle.js";
import "./component.js";
import "./datadriven.js";
import "./vuerouter.js";
import "./httpaxios.js";
import "./vuetemplate.js";
import Application from "./Application.vue";

Vue.config.productionTip = false;

Vue.use(VueRouter);

new Vue({
  render: (h) => h(App),
}).$mount("#app");

new Vue({
  render: (h) => h(Application),
}).$mount("#application");
