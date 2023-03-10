import Vue from "vue";
import App from "./App.vue";
import axios from "axios";
require("./assets/css/app.css");
import router from "./router";
import store from "./store/index";

Vue.config.productionTip = false;

Vue.prototype.$http = axios;

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount("#app");
