<template>
  <div id="todolistapp">
    <div id="header" class="header">
      <h2> Todo List App</h2>
      <input-todo></input-todo>
    </div>
    <detail-list></detail-list>
  </div>
</template>

<script>
import InputTodo from './InputTodo.vue';
import DetailList from './DetailList.vue';

export default {
  name: 'todo-list',
  components: {InputTodo, DetailList}
}
</script>

<style scoped>
* {
  box-sizing: border-box;
}

.header {
  background-color: purple;
  padding: 30px 30px;
  color: yellow;
  text-align: center;
}

.header:after {
  content: '';
  display: table;
  clear: both;
}
</style>