import Vue from 'vue';
import Vuex from 'vuex';
import Constant from '../Constant';

Vue.use(Vuex);

const store = new Vuex.Store({
    state: {
        todolist: [
            {todo: "영 화 보 기 ", done: false},
            {todo: "주 말 산 책 ", done: true},
            {todo: "ES6 학 습 ", done: false},
            {todo: "잠 실 야 구 장 ", done: false}
        ]
    },
    mutations: {
        [Constant.ADD_TODO]: (state, payload) => {
            if (payload.todo !== "") {
                state.todolist.push({todo: payload.todo, done: false});
            }
        },
        [Constant.DONE_TOGGLE]: (state, payload) => {
            state.todolist[payload.index].done = !state.todolist[payload.index].done;
        },
        [Constant.DELETE_TODO]: (state, payload) => {
            state.todolist.splice(payload.index, 1);
        }
    }
})

export default store