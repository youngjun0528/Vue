<template>
  <transition-group name="list" tag="ul">
    <li v-for="a in todolist" :key="a.id" :class="checked(a.done)"
        @click="doneToggle({ id: a.id})">
      <span>{{ a.todo }}</span>
      <span v-if="a.done"> (완 료 )</span>
      <span class="close" v-on:click.stop="deleteTodo({ id: a.id})">&#x00D7;</span>
    </li>
  </transition-group>
</template>

<script>
import Constant from "@/Constant";
import {mapState} from "vuex";

export default {
  computed: mapState(['todolist']),
  // {
  //   todolist(){
  //     return this.$store.state.todolist;
  //   }
  // },
  methods: {
    checked: function (done) {
      if (done) return {checked: true};
      else return {checked: false};
    },
    doneToggle: function (id) {
      this.$store.dispatch(Constant.DONE_TOGGLE, {id: id});
    },
    deleteTodo: function (id) {
      this.$store.dispatch(Constant.DELETE_TODO, {id: id});
    }
    // ...mapMutations([
    //   Constant.DELETE_TODO,
    //   Constant.DONE_TOGGLE
    // ])
  }
}
</script>

<style scoped>
* {
  box-sizing: border-box;
}

ul {
  margin: 0;
  padding: 0;
}

ul li {
  cursor: pointer;
  position: relative;
  padding: 8px 8px 8px 40px;
  background: #eee;
  font-size: 14px;
  transition: 0.2s;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

ul li:hover {
  background: #ddd;
}

ul li.checked {
  background: #BBB;
  color: #fff;
  text-decoration: line-through;
}

ul li.checked::before {
  content: '';
  border-style: solid;
  border-width: 0 1px 1px 0;
  position: absolute;
  border-color: #fff;
  top: 10px;
  left: 16px;
  transform: rotate(45deg);
  height: 8px;
  width: 8px;
}

.close {
  position: absolute;
  right: 0;
  top: 0;
  padding: 8px 12px 8px 12px
}

.close:hover {
  background-color: #f44336;
  color: white;
}

.list-enter-active, .list-leave-active {
  transition: all 0.5s;
}

.list-enter, .list-leave-to {
  opacity: 0;
  transform: translateY(50px);

}
</style>