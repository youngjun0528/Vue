<template>
  <div class="inputBox shadow">
    <!-- placeholder : input box hint -->
    <!-- v-on:keyup.enter : keyboard enter event -->
    <!-- v-on:keyup.enter : keyboard enter event -->
    <input
      type="text"
      v-model="newTodoItem"
      placeholder="Type what you have to do"
      v-on:keyup.enter="addTodo"
    />
    <span class="addContainer" v-on:click="addTodo">
      <i class="addBtn fas fa-plus" aria-hidden="true"></i>
    </span>
    <Modal v-if="showModal" v-on:close="showModal = false">
      <h3 slot="header">
        Warning
      </h3>
      <span slot="footer" v-on:click="showModal = false">
        Please Input Todo.
        <i class="closeModalBtn fas fa-times" aria-hidden="true"></i>
      </span>
    </Modal>
  </div>
</template>

<script>
import Modal from "./common/Modal.vue";

export default {
  name: "TodoInput",
  data() {
    return {
      newTodoItem: "",
      showModal: false,
    };
  },
  components: {
    Modal,
  },
  methods: {
    addTodo() {
      if (this.newTodoItem != "") {
        // this.newTodoItem 값이 존재하면 this.newTodoItem.trim() 반환
        // this.newTodoItem 값이 존재하지 않으면 this.newTodoItem 반환
        var value = this.newTodoItem && this.newTodoItem.trim();
        this.$emit("addTodo", value);
        this.clearInput();
      } else {
        this.showModal = !this.showModal;
      }
    },
    clearInput() {
      this.newTodoItem = "";
    },
  },
};
</script>

<style scoped>
/* scoped 아래 스카일 정의는 해당 컴포넌트에만 적용한다. */
input:focus {
  outline: none; /* Box line Style */
}
.inputBox {
  background: white;
  height: 50px;
  line-height: 50px; /* text 하단에서 부터 높이 */
  border-radius: 5px; /* Box 둥근 테두리 Style */
}
.inputBox input {
  border-style: none;
  font-size: 0.9rem;
}
.addContainer {
  float: right;
  background: linear-gradient(to right, #6478fb, #8763fb);
  display: block;
  width: 3rem;
  border-radius: 0 5px 5px 0;
}
.addBtn {
  color: white;
  vertical-align: middle;
}
</style>

