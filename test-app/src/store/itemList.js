import axios from "axios";

const state = {
  itemList: [],
  item: [],
  pageMode: 1,
};

const mutations = {
  SET_STORE(state, itemList) {
    state.itemList = itemList;
  },
  SET_STATUS(state, pageMode) {
    state.pageMode = pageMode;
  },
  SET_STORE_ONE(state, item) {
    state.item = item;
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
      .get("http://127.0.0.1:3001/v1/item/" + encodeURI(searchStr), config)
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
      .get("http://127.0.0.1:3001/v1/item/detail/" + encodeURI(searchStr), config)
      .then((response) => {
        commit("SET_STORE_ONE", response.data.products);
      });
  },
};

const getters = {
  itemList: (state) => state.itemList,
  item: (state) => state.item,
  status: (state) => state.pageMode,
};

export default {
  state,
  getters,
  actions,
  mutations,
};
