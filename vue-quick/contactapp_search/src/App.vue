<template>
  <div>
    <contact-search placeholder="두글자 이상 입력후 엔 터 !"></contact-search>
    <contact-list></contact-list>
  </div>
</template>

<script>
import ContactList from './components/ContactList.vue'
import ContactSearch from './components/ContactSearch.vue'

export default {
  name: 'App',
  components: {
    ContactList, ContactSearch
  }
}
</script>

<style>
</style>
