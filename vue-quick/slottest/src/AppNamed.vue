<template>
  <div id="app">
    <layout>
      <h1 slot="header ">헤 더 영 역</h1>
      <div slot="sidebar">
        <ul class="menu">
          <li v-for="sidebar in sidebars" :key="sidebar.menu">
            <a v-bind:href="sidebar.link">{{ sidebar.menu }}</a>
          </li>
        </ul>
      </div>
      <div slot="content">
        <h2>컨텐트 영역 </h2>
        <P> 김수한무 거북이와 두루미 ... ( 생략 ) </P>
        <P> 김수한무 거북이와 두루미 ... ( 생략 ) </p>
        <p> 김수한무 거북이와 두루미 ... ( 생략 ) </p>
        <p> 김수한무 거북이와 두루미 ... ( 생략 ) </p>
      </div>
      <p slot="footer">Footer text</p>
    </layout>
  </div>
</template>

<script>
import Layout from './components/NamedSlot.vue';

export default {
  name: "AppNamed",
  components: {Layout},
  data() {
    return {
      sidebars: [
        {menu: "Home", link: "#"},
        {menu: "About", link: "#"},
        {menu: "Contact", link: "#"},
        {menu: "Vue.js", link: "#"},
      ]
    }
  }
}
</script>

<style scoped>
ul.menu {
  position: relative;
  padding: 5px 5px 5px 5px;
  list-style: none;
  font-style: italic;
}

ul.menu a {
  text-decoration: none;
}
</style>