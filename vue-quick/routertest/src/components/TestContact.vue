<template>
  <div>
    <h1>Contect</h1>
    <h3>{{ (new Date()).toTimeString() }}</h3>
    <div class="wrapper">
      <div class="box" v-for="c in contacts" :key="c.no">
        <span @click="navigate(c.no)" style="cursor:pointer">
          [ {{ c.name }} ]
        </span>
      </div>
    </div>
    <router-view></router-view>
  </div>
</template>

<script>
import contactlist from "@/ContactList";

export default {
  name: "TestContect",
  data: function () {
    return {
      contacts: contactlist.contacts
    }
  },
  methods: {
    navigate(no) {
      if (confirm('상세 정보를 보시겠습니까?')) {
        this.$router.push({
              name: 'contactbyno',
              params: {
                no: no
              }
            },
            function () {
              console.log('/contacts/' + no + '로 이동 완료')
            })
      }
    }
  }
}
</script>

<style scoped>
.wrapper {
  background-color: #fff;
  clear: both;
  display: table;
}

.box {
  float: left;
  background-color: aqua;
  border-radius: 5px;
  padding: 10px;
  margin: 3px;
  text-align: center;
  font-size: 120%;
  width: 100px;
  font-weight: bold;
}

a:link, a:visited {
  text-align: center;
  text-decoration: none;
  display: inline-block;
}
</style>