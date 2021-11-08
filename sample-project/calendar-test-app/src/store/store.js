/* store.js */

import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export const store = new Vuex.Store({
  state: {
    paymentList: [
      {
        id: 1,
        title: "하우고개주유소",
        store: 0,
        date: "2020-10-10",
        time: "07:03",
        type: "일시불",
        money: 59000,
        card: 1,
        owner: "본인",
        number: "00541412",
        status: "정상"
      },
      {
        id: 2,
        title: "하우고개주유소",
        store: 0,
        date: "2020-10-10",
        time: "07:03",
        type: "거래취소",
        money: 120000,
        card: 1,
        owner: "본인",
        number: "00541412",
        status: "정상"
      },
      {
        id: 3,
        title: "하우고개주유소",
        store: 0,
        date: "2020-11-9",
        time: "17:26",
        type: "일시불",
        money: 59000,
        card: 1,
        owner: "본인",
        number: "00541412",
        status: "정상"
      },
      {
        id: 4,
        title: "하우고개주유소",
        store: 0,
        date: "2020-11-9",
        time: "17:26",
        type: "거래취소",
        money: 120000,
        card: 1,
        owner: "본인",
        number: "00127385",
        status: "취소"
      },
      {
        id: 5,
        title: "시흥까치주유소",
        store: 1,
        date: "2020-11-16",
        time: "17:26",
        type: "일시불",
        money: 59000,
        card: 2,
        owner: "본인",
        number: "00251984",
        status: "정상"
      },
      {
        id: 6,
        title: "시흥까치주유소",
        store: 1,
        date: "2020-11-16",
        time: "17:26",
        type: "거래취소",
        money: 150000,
        card: 2,
        owner: "본인",
        number: "00282396",
        status: "취소"
      },
      {
        id: 7,
        title: "시흥까치주유소",
        store: 1,
        date: "2020-12-2",
        time: "17:26",
        type: "일시불",
        money: 59000,
        card: 2,
        owner: "본인",
        number: "00251984",
        status: "정상"
      },
      {
        id: 8,
        title: "시흥까치주유소",
        store: 1,
        date: "2020-12-2",
        time: "17:26",
        type: "거래취소",
        money: 150000,
        card: 2,
        owner: "본인",
        number: "00282396",
        status: "취소"
      }
    ],
    userInfo: [
      {
        commitYear: 2020,
        commitMonth: 12,
        commitDate: "2020-12-1",
        totalMoney: 118000
      },
      {
        commitYear: 2020,
        commitMonth: 11,
        commitDate: "2020-11-1",
        totalMoney: 59000
      },
      {
        commitYear: 2020,
        commitMonth: 10,
        commitDate: "2020-10-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 9,
        commitDate: "2020-9-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 8,
        commitDate: "2020-8-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 7,
        commitDate: "2020-7-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 6,
        commitDate: "2020-6-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 5,
        commitDate: "2020-5-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 4,
        commitDate: "2020-4-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 3,
        commitDate: "2020-3-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 2,
        commitDate: "2020-2-1",
        totalMoney: 0
      },
      {
        commitYear: 2020,
        commitMonth: 1,
        commitDate: "2020-1-1",
        totalMoney: 0
      }
    ],
    cardInfo: [
      { id: 0, name: "전체카드" },
      { id: 1, name: "KIA RED MEMBERS Editions2" },
      { id: 2, name: "신협-ZERO" }
    ],
    storeInfo: [
      {
        id: 0,
        name: "하우고개주유소",
        addr: "경기 시흥시",
        number: "141312",
        owner: "홍길동"
      },
      {
        id: 1,
        name: "시흥까치주유소",
        addr: "경기 시흥시",
        number: "151332",
        owner: "홍길동"
      }
    ]
  },
  getters: {
    getPaymentList: state => date => {
      return state.paymentList.filter(payment => payment.date == date);
    },
    getSelectStoreInfo: state => id => {
      return state.storeInfo.filter(store => store.id == id);
    },
    getSelectCardInfo: state => id => {
      return state.cardInfo.filter(card => card.id == id);
    },
    getUserInfo: state => {
      return state.userInfo;
    },
    getCardInfo: state => {
      return state.cardInfo;
    },
    getPayment: state => {
      return state.paymentList;
    },
    getPaymentTotal: state => date => {
      let payment = state.paymentList;
      let paymentTotal = 0;
      for (let i = 0; i < payment.length; i++) {
        if (payment[i].date == date && payment[i].type != "거래취소") {
          paymentTotal = paymentTotal + payment[i].money;
        }
      }

      return paymentTotal;
    }
  }
});
