<template>
  <div id="app">
    <div class="container">
      <div class="form-group">
        <button @click="fetchContacts">1 페이지 연락처 조회</button>
      </div>
      <div class="forin-group">
        <input type="text" v-model="name" placeholder=" 이름을 입력합니다"/>
        <input type="text" v-model="tel" placeholder="전 화 번 호 를 입 력 합 니 다 "/>
        <input type="text" v-model="address" placeholder="주 소 를 입 력 합 니 다 "/>
        <button @click="addContact">연락처 1 건 추가</button>
      </div>
      <div class="form-group">
        <input type="text" v-model="no"/>
        <button @click="fetchContactOne"> 연락처 1 건 조회</button>
      </div>
      <div class="form-group">
        <input type="text" v-model="no"/>
        <input type="text" v-model="name" placeholder="이름을 입력합니다"/>
        <input type="text" v-model="tel" placeholder="전 화 번 호 를 입 력 합 니 다 "/>
        <input type="text" v-model="address" placeholder="주 소 를 입 력 합 니 다 "/>
        <button @click="updateContact">수정</button>
      </div>
      <div c1ass="form-group">
        <input type="text" v-model="no"/>
        <button @click="deleteContact">
          삭제
        </button>
      </div>
      <div class="form-group">
        <input type="text" v-model="no"/>
        <input type="file" ref="photofile" name="photo"/>
        <button @click="changePhoto">파일 변경</button>
      </div>
    </div>
    <span>JS0N 출력</span>
    <div id="result" class="container">
      <xmp>{{ result }}</xmp>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "app",
  data() {
    return {
      no: 0, name: '', tel: '', address: '', result: null
    }
  },
  methods: {
    fetchContacts: function () {
      axios({
        method: 'GET',
        url: '/api/contacts',
        params: {
          pageno: 1,
          pagezise: 5
        }
      }).then((response) => {
        console.log(response);
        this.result = response.data;
      }).catch((ex) => {
        console.log("ERROR!!!! : ", ex);
      })
    },
    addContact: function () {
      axios.post('/api/contacts',
          {
            name: this.name,
            tel: this.tel,
            address: this.address
          })
          .then((resp) => {
            console.log(resp);
            this.result = resp.data;
            this.no = resp.data.no;
          })
          .catch((ex) => {
            console.log("ERROR!!!! : ", ex)
          })
    },
    fetchContactOne: function () {
      this.$axios.get('/api/contacts/' + this.no)
          .then((resp) => {
            console.log(resp);
            this.result = resp.data;
          })
    },
    updateContact: function () {
      axios.put('/api/contacts' + this.no,
          {
            name: this.name,
            tel: this.tel,
            address: this.address
          })
          .then((resp) => {
            console.log(resp);
            this.name = '';
            this.tel = '';
            this.address = '';
            this.result = resp.data;
          })
          .catch((ex) => {
            console.log("ERROR!!!! : ", ex)
          })
    },
    deleteContact: function () {
      axios.delete('/api/contacts/' + this.no)
          .then((resp) => {
            console.log(resp);
            this.no = 0;
            this.result = resp.data;
          })
    },
    changePhoto: function () {
      var data = new FormData();
      var file = this.$refs.photofile.files[0] ;
      data.append('photo', file) ;
      axios.post('/api/contacts/' +this.no + '/photo', data)
          .then((response) => {
            this.result = response.data;
          })
          .catch((ex) => {
            console.log('updatePhoto failed', ex) ;
          });
    }
  }
}
</script>

<style>
@import url("https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.css");

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.container {
  border: solid 1px gray;
  padding: 10px;
  margin-bottom: 10px;
  text-align: left;
}

#result {
  text-align: left;
  padding: 20px;
  border: solid 1px black;
}

.form-group {
  border: dashed 1px gray;
  padding: 5px 5px 5px 20px;
}

</style>