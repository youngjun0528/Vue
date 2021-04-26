import axios from "axios";

const state = {
  movieList: [],
  movie: [],
};

const mutations = {
  SET_STORE(state, movieList) {
    state.movieList = movieList;
  },
  SET_STORE_ONE(state, movie) {
    state.movie = movie;
  },
};

const actions = {
  initStore: ({ commit }) => {
    let searchStr = "바다";

    const config = {
      headers: {
        "X-Naver-Client-Id": "5HoKbUvONS7kwGYTyf4l",
        "X-Naver-Client-Secret": "fpR2TOe9Nt",
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
      },
    };

    axios
      .get(
        "/v1/search/movie.json?query=" + encodeURI(searchStr) + "&display=10",
        config
      )
      .then((response) => {
        console.log(response);
        commit("SET_STORE", response.data.items);
      });
  },
  getStore: ({ commit }, ID) => {
    let searchStr = ID;

    const config = {
      headers: {
        "X-Naver-Client-Id": "5HoKbUvONS7kwGYTyf4l",
        "X-Naver-Client-Secret": "fpR2TOe9Nt",
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
      },
    };

    axios
      .get(
        "/v1/search/movie.json?query=" + encodeURI(searchStr) + "&display=1",
        config
      )
      .then((response) => {
        console.log(response);
        commit("SET_STORE", response.data.items);
      });
  },
};

const getters = {
  movieList: (state) => state.movieList,
};

export default {
  state,
  getters,
  actions,
  mutations,
};
