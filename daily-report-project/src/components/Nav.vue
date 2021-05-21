<template>
  <div class="nav">
      <ul class="nav-list">
          <li>
              <!-- <router-link to="/day/2018-01-01">
                  <i class="xi-home"></i>
                  <span>오늘</span>
              </router-link> -->
              <button @click="today">
                  <i class="xi-home"></i>
                  <span>오늘</span>
              </button>
          </li>
          <li>
              <router-link to="/calendar">
                  <i class="xi-calendar"></i>
                  <span>달력</span>
              </router-link>
          </li>
          <li>
              <router-link to="/setting">
                  <i class="xi-cog"></i>
                  <span>설정</span>
              </router-link>
          </li>
          <li>
              <router-link to="/About">
                  <i class="xi-emoticon-smiley"></i>
                  <span>소개</span>
              </router-link>
          </li>
      </ul>
  </div>
</template>

<script>
import moment from 'moment'

export default {
    name : 'Nav',
    methods : {
        today() {
            //let todayUrl = '/day/' + moment(new Date()).format('YYYY-MM-DD');
            let todayUrl = '/day/' + moment('2018-01-12').format('YYYY-MM-DD');
            if(this.$router.currentRoute.path == todayUrl){
                this.$router.go(this.$router.currentRoute);
            }else{
                this.$router.push(todayUrl);
            }
        }
    },
    computed : {},
    data() {
        return {}
    },
    props:{}
}
</script>

<style scope>

</style>