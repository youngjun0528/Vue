// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from "vue";
import App from "./App";
import router from "./router";
import Vue2TouchEvents from "vue2-touch-events";
import { store } from "./store/store";
import { BootstrapVue, IconsPlugin } from "bootstrap-vue";

import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

// Install BootstrapVue
Vue.use(BootstrapVue);
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin);

Vue.filter("makeComma", val => {
  return String(val).replace(/\B(?=(\d{3})+(?!\d))/g, ",");
});

Vue.use(Vue2TouchEvents, {
  disableClick: true,
  touchClass: "",
  tapTolerance: 10,
  touchHoldTolerance: 400,
  swipeTolerance: 100,
  longTapTimeInterval: 400
});
// Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: "#app",
  store,
  router,
  Vue2TouchEvents,
  components: { App },
  template: "<App/>"
});
