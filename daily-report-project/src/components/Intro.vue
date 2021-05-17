<template>
  <div class="intro">
      <div class="intro-inner">
          <h1>Daily<br>Report</h1>
          <router-link 
            class="button"
            :to="todayUrl"
          >
            START
          </router-link>
      </div>
  </div>
</template>

<script>
import moment from 'moment'

export default {
    name : 'Intro',
    methods : {},
    computed : {
        todayUrl(){
            let todayUrl = moment(new Date()).format('YYYY-MM-DD')
            // return '/day/' + todayUrl
            return `/day/${todayUrl}`;
        }
    },
    data() {
        return {}
    },
    props:{}
}
</script>

<style scope>

</style>