import Vue from "vue";
import Router from "vue-router";
import HelloWorld from "@/components/HelloWorld";
import Calendar from "@/components/Calendar";
import Vue2TouchEvents from "vue2-touch-events";

Vue.use(Vue2TouchEvents);
Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/ReadMe",
      name: "HelloWorld",
      component: HelloWorld
    },
    {
      path: "/",
      name: "Calendar",
      component: Calendar
    }
  ]
});
