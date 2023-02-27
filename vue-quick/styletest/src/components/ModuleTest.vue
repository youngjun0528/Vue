<template>
  <div>
    <button :class="$style.hand"> CSS Module 을 적용한 버튼</button>
  </div>
</template>

<script>
export default {
  name: "ModuleTest",
  created() {
    console.log(this.$style)
  }
}
</script>

<style module>
  .hand {
    cursor: pointer;
    background-color: purple;
    color: yellow;
  }
</style>