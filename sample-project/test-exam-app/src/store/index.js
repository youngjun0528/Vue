import Vue from "vue";
import Vuex from "vuex";
import axios from "axios";
import sub from "./sub";

// axios 사용시 Base URL 지정
axios.defaults.baseURL = process.env.NODE_ENV === 'development' ? '/' : 'http://127.0.0.1:3001';

Vue.use(Vuex);

const state = {
  List: [],
  Item: [],
  Mode: 'ko',
};

const mutations = {
  SET_STORE_LIST(state, list) {
    state.List = list;
  },
  SET_STORE_ITEM(state, item) {
    state.Item = item;
  },
  SET_STATUS(state, mode) {
    state.Mode = mode;
  },
};

const actions = {
  initStore: ({ commit }, lang) => {
    let mode = lang;

    const config = {
      headers: {
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
      },
    };

    axios
      .get("/v1/item/" + encodeURI(mode), config)
      .then((response) => {
        commit("SET_STORE_LIST", response.data.products);
      });
    commit("SET_STATUS", mode);
  },

  getStore: ({ commit }, [lang, id]) => {
    let mode = lang;
    let searchId = id;

    const config = {
      headers: {
        "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
      },
    };

    axios
      .get("/v1/item/detail/" + encodeURI(mode) + "/" + encodeURI(searchId), config)
      .then((response) => {
        commit("SET_STORE_ITEM", response.data.products);
      });
    commit("SET_STATUS", mode);
  },
};

const getters = {
  List: (state) => state.List,
  Item: (state) => state.Item,
  Mode: (state) => state.Mode,
};

export default new Vuex.Store({
  state,
  getters,
  mutations,
  actions,
  modules: { sub },
});
