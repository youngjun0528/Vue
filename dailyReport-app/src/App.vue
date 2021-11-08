<template>
  <div id="app">
    <Nav></Nav>
    <router-view/>
  </div>
</template>

<script>
import Nav from '@/components/Nav'
import axios from 'axios'
import { mapGetters, mapActions } from 'vuex'

export default {
  components: {
    Nav,
  },
  methods: {
    ...mapActions(['saveSettings']),
    init(){
      if (typeof this.saveSettings.starttime === 'undefined'){
        this.getSettings();
      } 
    },
    getSettings(){
      let url = `https://dailyreport-c9ef9.firebaseio.com/settings.json`
      axios.get(url).then((response) => {
          if(response.data != null){
            this.saveSettings(response.data)
          }else{
            let data = {
              starttime: '08:00',
              lang: 'ko'
            }
            this.saveSettings(data)
          }
      });
    }
  },
  computed: {
    ...mapGetters(['savedSettings'])
  },
  created(){
    this.init();
  }  
}
</script>

<style lang="scss" src="./assets/css/style.scss">
</style>
