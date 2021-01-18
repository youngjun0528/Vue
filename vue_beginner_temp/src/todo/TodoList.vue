<template>
  <section>
    <transition-group name="list" tag="ul">
      <li
        class="shadow"
        v-bind:key="todoItem"
        v-for="(todoItem, index) in propsdata"
      >
        <i class="checkBtn fas fa-check" aria-hidden="true"></i>
        {{ todoItem }}
        <!-- i 태그는 본래 이탤릭체를 표시하는데 사용하나, 보통 이탤릭 효과는 CSS style 를 통해 구현함. -->
        <!-- 따라서 잘 쓰이지 않는 i 태그는 보통 icon의 약자로 임의 해석하여 코드 가독성을 높임-->
        <span
          class="removeBtn"
          type="button"
          v-on:click="removeTodo(todoItem, index)"
        >
          <i class="far fa-trash-alt" aria-hidden="true"></i>
        </span>
      </li>
    </transition-group>
  </section>
</template>

<script>
export default {
  name: "TodoList",
  props: ["propsdata"],
  methods: {
    removeTodo(todoItem, index) {
      this.$emit("removeTodo", todoItem, index);
    },
  },
};
</script>

<style scoped>
.list-enter-active,
.list-leave-active {
  transition: all 1s;
}
.list-enter,
.list-leave-to {
  opacity: 0;
  transform: translateY(30px);
}
ul {
  list-style-type: none; /** 목룍 아이템 스타일 */
  padding-left: 0px;
  margin-top: left;
  text-align: left;
}
li {
  display: flex; /** 비율 기준의 레이아웃 */
  min-height: 50px;
  height: 50px;
  line-height: 50px;
  margin: 0.5rem 0;
  padding: 0 0.9rem;
  background: white;
  border-radius: 5px;
}
.checkBtn {
  line-height: 45px;
  columns: #62acde;
  margin-right: 5px;
}
.removeBtn {
  margin-left: auto;
  color: #de4343;
}
</style>

