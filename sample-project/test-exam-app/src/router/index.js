import Vue from "vue";
import VueRouter from "vue-router";
import List from "@/components/List";
import Detail from "@/components/Detail";

Vue.use(VueRouter);

// Router Path 지정
const routes = [
  {
    path: "/",
    name: "List",
    component: List,
  },
  {
    path: "/detail/:id",
    name: "Detail",
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
