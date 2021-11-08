import axios from "axios";

const state = {
  movieList: [],
  movie: [],
  pageMode: 1,
};

const mutations = {
  SET_STORE(state, movieList) {
    state.movieList = movieList;
  },
  SET_STATUS(state, pageMode) {
    state.pageMode = pageMode;
  },
  SET_STORE_ONE(state, movie) {
    state.movie = movie;
  },
};

const actions = {
  initStore: ({ commit }, Target) => {
    let searchStr = "go";
    if (Target == 2) {
      searchStr = "end";
    }

    const config = {
      headers: {
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
      },
    };

    axios
      .get("/v1/product/" + encodeURI(searchStr), config)
      .then((response) => {
        commit("SET_STORE", response.data.products);
      });
    commit("SET_STATUS", Target);
  },
  getStore: ({ commit }, ID) => {
    let searchStr = ID;

    const config = {
      headers: {
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
      },
    };

    axios
      .get("/v1/product/detail/" + encodeURI(searchStr), config)
      .then((response) => {
        commit("SET_STORE_ONE", response.data.products);
      });
  },
};

const getters = {
  movieList: (state) => state.movieList,
  movie: (state) => state.movie,
  status: (state) => state.pageMode,
};

export default {
  state,
  getters,
  actions,
  mutations,
};
