<template>
  <div id="app" name="fade" mode="out-in">
    <router-view />
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>

<style>
#app {
}

.fade-enter-active,
.fade-leace-active {
  transition: opacity 0.5s ease-out;
}

.fade-enter,
.face-leave-to {
  opacity: 0;
}
</style>
