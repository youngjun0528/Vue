import Vue from "vue";
import Vuex from "vuex";
import movieList from "./movieList";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {},
  mutations: {},
  actions: {},
  modules: { movieList },
});
