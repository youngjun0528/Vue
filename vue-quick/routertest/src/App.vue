<template>
  <div>
    <div class="header">
      <h1 class="headerText">(주)OpenSG</h1>
      <nav>
        <ul>
          <li>
            <router-link :to="{name: 'home'}">Home</router-link>
          </li>
          <li>
            <router-link :to="{name: 'about'}">About</router-link>
          </li>
          <li>
            <router-link :to="{name: 'contacts'}">Contacts</router-link>
          </li>
        </ul>
      </nav>
    </div>
    <div class="container">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
import TestHome from './components/TestHome.vue'
import TestAbout from './components/TestAbout.vue'
import TestContact from './components/TestContact.vue'
import ContactByNo from "@/components/ContactByNo.vue";
import NotFound from "@/components/NotFound.vue";
import VueRouter from "vue-router";

const router = new VueRouter({
  mode: 'history',
  routes: [
    {path: '/', component: TestHome},
    {path: '/home', name: 'home', component: TestHome},
    {path: '/about', name: 'about', component: TestAbout},
    {
      path: '/contacts', name: 'contacts', component: TestContact,
      children: [
        {
          path: ':no', name: 'contactbyno', component: ContactByNo,
          beforeEnter: (to, from, next) => {
            console.log("beforeEnter : " + from.path + "--->" + to.path);
            if (from.path.startsWith('/contacts'))
              next();
            else
              next('/home');
          },
          props: true
        }
      ]
    },
    {path: '*', component: NotFound}
  ]
})

router.beforeEach((to, from, next) => {
  console.log("beforeEach");
  next();
})

router.afterEach(() => {
  console.log("afterEach");
})
export default {
  name: 'App',
  router
}
</script>

<style>
.header {
  background-color: aqua;
  padding: 10px 0 0 0;
}

.headerText {
  padding: 0 20px 0 20px;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: purple;
}

li {
  float: left;
}

li a {
  display: block;
  color: yellow;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a :hover {
  background-color: aqua;
  color: black;
}
</style>
