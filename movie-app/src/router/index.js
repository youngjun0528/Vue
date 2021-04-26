import Vue from "vue";
import VueRouter from "vue-router";
import Chart from "@/components/Chart";
import Detail from "@/components/Detail";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "chart",
    component: Chart,
  },
  {
    path: "/detail/:id",
    name: "detail",
    component: Detail,
    props: true,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
