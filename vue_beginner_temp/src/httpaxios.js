import Vue from "vue";
import axios from "axios";

new Vue({
  el: "#httpaxios",
  data: {
    result: "",
  },
  mounted: function() {
    this.getData();
  },
  methods: {
    getData: async function() {
      const config = {
        // method: "POST",
        // body: JSON.stringify(data),
        headers: {
          "X-Naver-Client-Id": "5HoKbUvONS7kwGYTyf4l",
          "X-Naver-Client-Secret": "fpR2TOe9Nt",
          "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
        },
      };
      let searchStr = "바다";
      const data = await axios.get(
        "/v1/search/movie.json?query=" + encodeURI(searchStr) + "&display=10",
        config
      );
      this.result = data;
    },
  },
});

