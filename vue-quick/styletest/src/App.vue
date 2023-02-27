<template>
  <div id="app">
    <h2>{{msg}}</h2>
    <child-test1></child-test1>
    <child-test2></child-test2>
    <module-test></module-test>
  </div>
</template>

<script>
import ChildTest1 from "@/components/ChildTest1.vue";
import ChildTest2 from "@/components/ChildTest2.vue";
import ModuleTest from "@/components/ModuleTest.vue";

export default {
  name: 'App',
  components: {
    ModuleTest,
    ChildTest2,
    ChildTest1,
  },
  data(){
    return {
      msg: 'CSS Test'
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
