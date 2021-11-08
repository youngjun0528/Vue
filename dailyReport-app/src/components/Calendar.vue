<template>
  <div class='calendar'>
      <full-calendar 
        v-bind:config='config' 
        @day-click="dayClick"
        ></full-calendar>
  </div>
</template>

<script>
import {FullCalendar} from 'vue-full-calendar'
import 'fullcalendar/dist/fullcalendar.css'

import {mapGetters} from 'vuex'

export default {
    name : 'Calendar',
    components:{
        FullCalendar
    },
    methods : {
        dayClick(date){
            let url = `/day/${date.format('YYYY-MM-DD')}`
            this.$router.push(url)
        },
        applySettings(){
            this.config['locale'] = this.savedSettings.lang
        }
    },
    computed : {
        ...mapGetters(['savedSettings'])
    },
    data() {
        return {
            config:{
                defaultView: 'month',
                header:{
                    left: 'prev',
                    center : 'title',
                    right: 'next'
                },
                height:500
            }
        }
    },
    created(){
        this.applySettings();
    },
    props:{}
}
</script>

<style scope>

</style>