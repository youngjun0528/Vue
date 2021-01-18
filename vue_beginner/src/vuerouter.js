import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

var Body = { template: "<div>This is Body</div>" };
var Header = {
  template:
    "<div>This is Header <router-view name='login'></router-view></div>",
};
var Footer = { template: "<div>This is Footer</div>" };

var Login = { template: "<div>This is Login</div>" };

var router = new VueRouter({
  routes: [
    {
      path: "/",
      components: {
        body: Body,
        header: Header,
        footer: Footer,
      },
      children: [
        {
          path: "login",
          components: {
            login: Login,
          },
        },
      ],
    },
  ],
});

new Vue({
  router,
}).$mount("#vueRouter");

