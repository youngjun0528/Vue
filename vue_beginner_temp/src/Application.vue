<template>
  <div id="application">
    <TodoHeader></TodoHeader>
    <TodoInput v-on:addTodo="addTodo"></TodoInput>
    <TodoList
      v-on:removeTodo="removeTodo"
      v-bind:propsdata="todoItems"
    ></TodoList>
    <TodoFooter v-on:removeAll="clearAll"></TodoFooter>
  </div>
</template>

<script>
import TodoHeader from "./components/todo/TodoHeader.vue";
import TodoFooter from "./components/todo/TodoFooter.vue";
import TodoInput from "./components/todo/TodoInput.vue";
import TodoList from "./components/todo/TodoList.vue";

export default {
  name: "Application",
  components: {
    TodoHeader,
    TodoFooter,
    TodoInput,
    TodoList,
  },
  data() {
    return {
      todoItems: [],
    };
  },
  created() {
    if (localStorage.length > 0) {
      for (var i = 0; i < localStorage.length; i++) {
        this.todoItems.push(localStorage.key(i));
      }
    }
  },
  /*
  키-밸류 스토리지의 형태
  로컬 스토리지와 세션 스토리지의 차이점은 데이터의 영구성입니다.
  로컬 스토리지의 데이터는 사용자가 지우지 않는 이상 계속 브라우저에 남아 있습니다.
  하지만 세션 스토리지의 데이터는 윈도우나 브라우저 탭을 닫을 경우 제거됩니다.
  지속적으로 필요한 데이터(자동 로그인 등)는 로컬 스토리지에 저장하고,
  잠깐 동안 필요한 정보(일회성 로그인 정보라든가)는 세션 스토리지에 저장하면 되겠습니다.
  */
  methods: {
    addTodo(todoItem) {
      localStorage.setItem(todoItem, todoItem);
      this.todoItems.push(todoItem);
    },
    clearAll() {
      localStorage.clear();
      this.todoItems = [];
    },
    removeTodo(todoItem, index) {
      localStorage.removeItem(todoItem);
      this.todoItems.splice(index, 1);
    },
  },
};
</script>

<style>
body {
  text-align: center;
  background-color: #f6f6f8;
}
input {
  border-style: groove;
  width: 200px;
}
button {
  border-style: groove;
}
.shadow {
  box-shadow: 5px 10px 10px rgba(0, 0, 0, 0.03);
}
</style>

