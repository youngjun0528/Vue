<template>
  <div>
    <div class="header">
      <h1 class="headerText">(주) 0penSG</h1>
      <nav>
        <ul>
          <li>
            <a href="#" @click="changeMenu('home')">Home</a>
          </li>
          <li>
            <a href="#" @click="changeMenu('about')">About</a>
          </li>
          <li>
            <a href="#" @click="changeMenu('contact')">Contact</a>
          </li>
        </ul>
      </nav>
    </div>
    <div class="container">
      <keep-alive include="TestAbout,TestHome">
        <component v-bind:is="currentView"></component>
      </keep-alive>
    </div>
  </div>
</template>

<script>
import Home from './components/TestHome.vue';
import About from './components/TestAbout.vue';
import Contact from './components/TestContact.vue';

export default {
  name: 'App',
  components: {
    Home, About, Contact
  },
  data() {
    return {
      currentView: 'home'
    }
  },
  methods: {
    changeMenu(view) {
      this.currentView = view;
    }
  }
}
</script>

<style scoped>
.header {
  background-color: aqua;
  padding: 10px 0px 0px Opx;
}

.headerText {
  padding: O 20px 0px 20px;
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
