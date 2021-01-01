<template>
  <div>
    <div v-if="openMonth == true">
      <!-- 컴포넌트 MyModal -->
      <MonthModal @close="closeDatePicker" v-if="openMonth">
        <template>
          <!-- default 슬롯 콘텐츠 -->
          <b-list-group-item
            v-on:click="moveCalendar(info.commitYear, info.commitMonth)"
            v-for="(info, index) in this.$store.getters.getUserInfo"
            :key="index"
          >
            <span> {{ info.commitYear }}년 {{ info.commitMonth }} 월</span
            ><b-icon
              v-show="showCheckBox(info.commitYear, info.commitMonth)"
              icon="check"
            ></b-icon>
          </b-list-group-item>
          <!-- /default -->
        </template>
        <!-- /footer -->
      </MonthModal>
    </div>
    <div v-if="openCard == true">
      <CardModal @close="closeCardPicker" v-if="openCard">
        <template>
          <!-- default 슬롯 콘텐츠 -->
          <b-list-group-item
            v-for="(card, index) in this.$store.getters.getCardInfo"
            :key="index"
          >
            <span> {{ card.name }}</span
            ><b-icon v-show="showCardCheckBox(card.id)" icon="check"></b-icon>
          </b-list-group-item>
          <!-- /default -->
        </template>
        <!-- /footer -->
      </CardModal>
    </div>
    <div v-if="openDetail == true">
      <!-- 컴포넌트 MyModal -->
      <DetailModal
        :contents="curitem"
        @close="closeDetailPicker"
        v-if="openDetail"
      >
      </DetailModal>
    </div>
    <div style="position: absolute;top: 0;right: 0;font-size:xx-small;">
      Test :
      <a href="#" v-on:click="onClickPrev(currentMonth)">Pre Mon ◀</a> /
      <a href="#" v-on:click="onClickNext(currentMonth)">Next Mon ▶</a> /
      <a href="#" v-on:click="expandCalendar()">Swipe up ↑</a> /
      <a href="#" v-on:click="collapseCalendar()">Swipe down ↓</a>
    </div>
    <h4>날짜별 이용내역</h4>
    <div class="calendar" style="text-align: left;">
      <h4>
        <div>
          <div
            style="text-align:start;padding-left:5%;float:left;width:50%;height:5%;margin-top:5%;margin-top: 5%;margin-bottom: 5%;"
          >
            <span
              >{{ currentMonth }}월
              <b-icon
                icon="chevron-down"
                v-on:click="openDatePicker(currentMonth)"
              ></b-icon
            ></span>
          </div>
          <div
            style="text-align:end;padding-right:5%;float:right;width:50%;height:5%;margin-top:5%;margin-top: 5%;margin-bottom: 5%;"
          >
            <span
              >전체 카드
              <b-icon icon="list-ul" v-on:click="openCardPicker()"></b-icon
            ></span>
          </div>
        </div>
      </h4>
      <div>
        <table
          id="calTable"
          ref="calTable"
          class="table"
          v-touch:swipe.left="swipeLeftHandler"
          v-touch:swipe.right="swipeRightHandler"
        >
          <thead>
            <tr>
              <td v-for="(weekName, index) in weekNames" v-bind:key="index">
                <div class="hbox">
                  {{ weekName }}
                </div>
              </td>
            </tr>
          </thead>
          <tbody>
            <transition-group
              tag="tr"
              name="slide"
              v-for="(row, index) in currentCalendarMatrix"
              v-bind:key="index"
              v-bind:data-index="'tr' + index"
            >
              <td v-for="(day, index2) in row" v-bind:key="row[index2]">
                <div class="box">
                  <div v-if="isNumber(day)">
                    <div
                      v-if="isRound(currentYear, currentMonth, day)"
                      class="rounded-circle"
                      v-on:click="
                        onClickDate($event, currentYear, currentMonth, day)
                      "
                    >
                      {{ day }}
                    </div>
                    <div
                      v-else
                      class="content"
                      v-on:click="
                        onClickDate($event, currentYear, currentMonth, day)
                      "
                    >
                      {{ day }}
                    </div>
                  </div>
                  <div v-else>
                    {{ emptyStr }}
                  </div>
                </div>
                <div
                  v-show="checkPayInfo(currentYear, currentMonth, day)"
                  style="text-align: center;height: 10px;line-height: 0.9;"
                >
                  <span style="font-size: xx-small;">{{
                    $store.getters.getPaymentTotal(
                      currentYear + "-" + currentMonth + "-" + day
                    ) | makeComma
                  }}</span>
                </div>
                <div
                  v-show="checkUserInfo(currentYear, currentMonth, day)"
                  style="text-align: center;height: 10px;line-height: 0.9;"
                >
                  <span style="font-size: xx-small;color: red;"
                    >결제일<br />{{ currentTotalMoney | makeComma }}</span
                  >
                </div>
              </td>
            </transition-group>
          </tbody>
        </table>
      </div>
    </div>
    <div
      class="bottomDetailDiv"
      v-touch:swipe.top="swipeTopHandler"
      v-touch:swipe.bottom="swipeBottomHandler"
    >
      <template v-if="listCheck === 'empty'">
        <div style="padding-left:5%;float:left">
          {{ checkYear }}년 {{ checkMonth }}월 {{ checkDay }}일
        </div>
      </template>
      <template v-if="listCheck === 'list'">
        <div
          v-if="isToday(checkYear, checkMonth, checkDay)"
          style="width:100%;text-align:start;padding-left:5%;float:left;"
        >
          오늘<b-icon icon="dot"></b-icon>{{ checkMonth }}월 {{ checkDay }}일
        </div>
        <div
          v-else
          style="width:100%;text-align:start;padding-left:5%;float:left;"
        >
          {{ checkMonth }}월 {{ checkDay }}일
        </div>
        <div v-if="paymentListSize">
          <div>
            이용내용이 없습니다.
          </div>
        </div>
        <div v-else></div>
        <b-list-group style="width:100%;">
          <b-list-group-item
            v-on:click="openDetailPicker(payment)"
            v-for="(payment, index) in this.$store.getters.getPaymentList(
              checkYear + '-' + checkMonth + '-' + checkDay
            )"
            :key="index"
          >
            <div v-if="payment.type == '거래취소'">
              <div>
                <div
                  style="float: left;width: 50%;text-align: left;color: gray;"
                >
                  <span>{{ payment.title }}</span>
                </div>
                <div
                  style="float: right;width: 50%;text-align: right;color: gray;"
                >
                  <span>{{ payment.money | makeComma }}원</span>
                </div>
              </div>
              <div style="float: left;color: gray;">
                <span>{{ payment.date }}</span
                ><b-icon icon="dot"></b-icon>
              </div>
              <div style="float: left;color: gray;">
                <span>{{ payment.time }}</span
                ><b-icon icon="dot"></b-icon>
              </div>
              <div style="float: left;color: red;">
                <span>{{ payment.type }}</span>
              </div>
            </div>
            <div v-else>
              <div>
                <div style="float: left;width: 50%;text-align: left;">
                  <span>{{ payment.title }}</span>
                </div>
                <div style="float: right;width: 50%;text-align: right;">
                  <span>{{ payment.money | makeComma }}원</span>
                </div>
              </div>
              <div style="float: left;">
                <span>{{ payment.date }}</span
                ><b-icon icon="dot"></b-icon>
              </div>
              <div style="float: left;">
                <span>{{ payment.time }}</span
                ><b-icon icon="dot"></b-icon>
              </div>
              <div style="float: left">
                <span>{{ payment.type }}</span>
              </div>
            </div>
          </b-list-group-item>
        </b-list-group>
        <div v-if="checkUserInfo(checkYear, checkMonth, checkDay)">
          <b-button
            variant="light"
            style="margin: 5%;width:90%;border-radius: 5%;"
            >{{ checkMonth }}월 명세서 보기</b-button
          >
          <span style="color: gray;font-size: small;">
            <br />일부금액은 실제 결제금액과 다를 수 있습니다. <br />정확한
            결제금약은 이용대금명세서를 확인해 주세요.
          </span>
        </div>
      </template>
    </div>
  </div>
</template>

<script>
import MonthModal from "./MonthModal.vue";
import CardModal from "./CardModal.vue";
import DetailModal from "./DetailModal.vue";
export default {
  name: "my-calendar",
  data() {
    return {
      weekNames: ["일", "월", "화", "수", "목", "금", "토"],
      rootYear: 1904,
      rootDayOfWeekIndex: 5, // 2000년 1월 1일은 토요일
      currentYear: new Date().getFullYear(),
      currentMonth: new Date().getMonth() + 1,
      currentDay: new Date().getDate(),
      checkYear: new Date().getFullYear(),
      checkMonth: new Date().getMonth() + 1,
      checkDay: new Date().getDate(),
      currentMonthStartWeekIndex: null,
      currentCalendarMatrix: [],
      endOfDay: null,
      memoDatas: [],
      isInit: false,
      listCheck: "list",
      openMonth: false,
      openCard: false,
      openDetail: false,
      show: true,
      currentTotalMoney: 0,
      currentCardID: 0,
      totlaPayment: 0,
      curitem: "test",
      emptyStr: ""
    };
  },
  components: { MonthModal, CardModal, DetailModal },
  mounted() {
    this.init();
  },
  computed: {
    paymentList() {
      return this.$store.getters.getPaymentList(
        this.checkYear + "-" + this.checkMonth + "-" + this.checkDay
      );
    },
    paymentListSize() {
      return (
        this.$store.getters.getPaymentList(
          this.checkYear + "-" + this.checkMonth + "-" + this.checkDay
        ).length == 0
      );
    },
    paymentListSizeUp() {
      return (
        this.$store.getters.getPaymentList(
          this.checkYear + "-" + this.checkMonth + "-" + this.checkDay
        ).length > 0
      );
    },
    totlaPaymentMoney() {
      return this.$store.getters.getPaymentTotal(
        this.checkYear + "-" + this.checkMonth + "-" + this.checkDay
      );
    },
    userInfo() {
      return this.$store.getters.getUserInfo;
    },
    payment() {
      return this.$store.getters.getPayment;
    }
  },
  methods: {
    init: function() {
      this.currentCheckDate = true;
      this.currentMonthStartWeekIndex = this.getStartWeek(
        this.currentYear,
        this.currentMonth
      );
      this.endOfDay = this.getEndOfDay(this.currentYear, this.currentMonth);
      this.initCalendar();
    },
    checkUserInfo: function(year, month, day) {
      let checkDate = year + "-" + month + "-" + day;
      let checkTF = false;
      for (let i = 0; i < this.userInfo.length; i++) {
        if (this.userInfo[i].commitDate == checkDate) {
          this.currentTotalMoney = this.userInfo[i].totalMoney;
          checkTF = true;
        }
      }
      return checkTF;
    },
    checkPayInfo: function(year, month, day) {
      let checkDate = year + "-" + month + "-" + day;
      let checkTF = false;
      for (let i = 0; i < this.payment.length; i++) {
        if (this.payment[i].date == checkDate) {
          // this.totlaPayment = this.payment[i].money;
          checkTF = true;
        }
      }
      return checkTF;
    },

    moveCalendar: function(moveYear, moveMonth) {
      this.currentYear = moveYear;
      this.currentMonth = moveMonth;
      this.init();
      this.closeDatePicker();

      this.checkYear = this.currentYear;
      this.checkMonth = this.currentMonth;
      if (this.isMonth(this.currentYear, this.currentMonth)) {
        this.checkDay = this.currentDay;
      } else {
        this.checkDay = 1;
      }
    },
    initCalendar: function() {
      this.currentCalendarMatrix = [];
      let day = 1;
      let empty = 1;
      for (let i = 0; i < 6; i++) {
        let calendarRow = [];
        for (let j = 0; j < 7; j++) {
          if (i == 0 && j < this.currentMonthStartWeekIndex) {
            calendarRow.push("NULL" + empty);
            empty++;
          } else if (day <= this.endOfDay) {
            calendarRow.push(day);
            day++;
          }
        }
        this.currentCalendarMatrix.push(calendarRow);
      }
    },
    getEndOfDay: function(year, month) {
      switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          return 31;
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          return 30;
          break;
        case 2:
          if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 29;
          } else {
            return 28;
          }
          break;
        default:
          return 0;
          break;
      }
    },
    getStartWeek: function(targetYear, targetMonth) {
      let year = this.rootYear;
      let month = 1;
      let sumOfDay = this.rootDayOfWeekIndex;
      while (true) {
        if (targetYear > year) {
          for (let i = 0; i < 12; i++) {
            sumOfDay += this.getEndOfDay(year, month + i);
          }
          year++;
        } else if (targetYear == year) {
          if (targetMonth > month) {
            sumOfDay += this.getEndOfDay(year, month);
            month++;
          } else if (targetMonth == month) {
            return sumOfDay % 7;
          }
        }
      }
    },
    onClickPrev: function(month) {
      month--;
      if (month <= 0) {
        this.currentMonth = 12;
        this.currentYear -= 1;
      } else {
        this.currentMonth -= 1;
      }
      let trNodeList = this.$refs.calTable.children[1].children;
      for (let i = 0; i < trNodeList.length; i++) {
        let tdNode = trNodeList[i].childNodes;
        for (let j = 0; j < tdNode.length; j++) {
          let contentNode = tdNode[j].firstChild.firstChild;
          contentNode.classList.remove("rounded-circle");
          contentNode.setAttribute("class", "content");
        }
      }
      this.init();
      this.checkYear = this.currentYear;
      this.checkMonth = this.currentMonth;
      if (this.isMonth(this.currentYear, this.currentMonth)) {
        this.checkDay = this.currentDay;
      } else {
        this.checkDay = 1;
      }
    },
    onClickNext: function(month) {
      month++;
      if (month > 12) {
        this.currentMonth = 1;
        this.currentYear += 1;
      } else {
        this.currentMonth += 1;
      }
      let trNodeList = this.$refs.calTable.children[1].children;
      for (let i = 0; i < trNodeList.length; i++) {
        let tdNode = trNodeList[i].childNodes;
        for (let j = 0; j < tdNode.length; j++) {
          let contentNode = tdNode[j].firstChild.firstChild;
          contentNode.classList.remove("rounded-circle");
          contentNode.setAttribute("class", "content");
        }
      }
      this.init();
      this.checkYear = this.currentYear;
      this.checkMonth = this.currentMonth;
      if (this.isMonth(this.currentYear, this.currentMonth)) {
        this.checkDay = this.currentDay;
      } else {
        this.checkDay = 1;
      }
    },
    // Current Date Check
    isToday: function(currentYear, currentMonth, checkDay) {
      let date = new Date();
      return (
        currentYear == date.getFullYear() &&
        currentMonth == date.getMonth() + 1 &&
        checkDay == date.getDate()
      );
    },
    // Current Month Check
    isMonth: function(currentYear, currentMonth) {
      let date = new Date();
      return (
        currentYear == date.getFullYear() && currentMonth == date.getMonth() + 1
      );
    },
    isNumber: function(day) {
      return !isNaN(day);
    },
    // CSS Round Active
    // isInit : calendar init rendering -> after click date, isInit false
    // current month -> current date
    // Click Date -> checkYear, checkMonth, checkDay
    // Move Month -> init day 1
    isRound: function(year, month, day) {
      let date = new Date();
      if (day != "") {
        if (this.isInit) {
          if (
            year == this.checkYear &&
            month == this.checkMonth &&
            day == this.checkDay
          ) {
            return true;
          }
        } else {
          if (month == date.getMonth() + 1) {
            if (
              year == this.checkYear &&
              month == this.checkMonth &&
              day == this.checkDay
            ) {
              return true;
            } else if (
              year == date.getFullYear() &&
              month == date.getMonth() + 1 &&
              day == date.getDate()
            ) {
              return true;
            }
          } else {
            if (
              year == this.checkYear &&
              month == this.checkMonth &&
              day == this.checkDay
            ) {
              return true;
            } else if (day == 1) {
              return true;
            }
          }
        }
      }
      return false;
    },

    showCheckBox: function(year, month) {
      return year == this.checkYear && month == this.checkMonth;
    },

    showCardCheckBox: function(id) {
      return id == this.currentCardID;
    },

    // Click Date
    // Table All Child Node Round CSS Delete
    // Click Date Node Round CSS Add
    onClickDate: function(event, year, month, day) {
      if (this.isNumber(day) != "") {
        let trNode =
          event.target.parentNode.parentNode.parentNode.parentNode.parentNode
            .childNodes;
        for (let i = 0; i < trNode.length; i++) {
          let tdNode = trNode[i].childNodes;
          for (let j = 0; j < tdNode.length; j++) {
            let contentList = tdNode[j].childNodes;
            for (let k = 0; k < contentList.length; k++) {
              let contentNode = contentList[k].firstChild;
              if (
                contentNode != null &&
                contentNode.firstChild != undefined &&
                contentNode.firstChild.tagName == "DIV"
              ) {
                if (
                  contentNode.firstChild.getAttribute("class") ==
                  "rounded-circle"
                ) {
                  contentNode.firstChild.classList.remove("rounded-circle");
                  contentNode.firstChild.setAttribute("class", "content");
                }
              }
            }
          }
        }
        event.target.parentNode.firstChild.setAttribute(
          "class",
          "rounded-circle"
        );
        this.listCheck = "list";
        this.checkYear = year;
        this.checkMonth = month;
        this.checkDay = day;
      }
    },

    // Month Popup
    openDatePicker: function() {
      this.openMonth = true;
    },
    closeDatePicker: function() {
      this.openMonth = false;
    },

    // Card Popup
    openCardPicker: function() {
      this.openCard = true;
    },
    closeCardPicker: function() {
      this.openCard = false;
    },

    // Detail Popup
    openDetailPicker: function(item) {
      this.curitem = item;
      this.openDetail = true;
    },
    closeDetailPicker: function() {
      this.openDetail = false;
    },

    //
    expandCalendar: function() {
      let trNodeList = this.$refs.calTable.children[1].children;
      let check = true;
      let checkRow = [];
      for (let i = 0; i < trNodeList.length; i++) {
        let tdNode = trNodeList[i].childNodes;
        for (let j = 0; j < tdNode.length; j++) {
          let contentList = tdNode[j].childNodes;
          for (let k = 0; k < contentList.length; k++) {
            let contentNode = contentList[k].firstChild;
            if (
              contentNode != null &&
              contentNode.firstChild != undefined &&
              contentNode.firstChild.tagName == "DIV"
            ) {
              if (
                contentNode.firstChild.getAttribute("class") == "rounded-circle"
              )
                check = false;
            }
          }
        }
        if (check) checkRow.push(i);
        check = true;
      }
      for (let k = checkRow.length - 1; k > -1; k--) {
        this.currentCalendarMatrix.splice(checkRow[k], 1);
      }
    },

    collapseCalendar: function() {
      this.isInit = true;
      this.init();
    },

    swipeLeftHandler(direction) {
      // console.log(direction)  // May be left / right / top / bottom
      let date = new Date();
      if (this.currentMonth <= date.getMonth() + 1) {
        this.onClickNext(this.currentMonth);
      }
    },
    swipeRightHandler(direction) {
      // console.log(direction)  // May be left / right / top / bottom
      this.onClickPrev(this.currentMonth);
    },
    swipeTopHandler(direction) {
      // console.log(direction)  // May be left / right / top / bottom
      this.expandCalendar();
    },
    swipeBottomHandler(direction) {
      // console.log(direction)  // May be left / right / top / bottom
      this.collapseCalendar();
    }
  }
};
</script>

<style type="text/css">
.box {
  position: relative;
  width: 30px;
  display: inline-block;
}
.hbox {
  position: relative;
  width: 30px;
  height: 30px;
  text-align: center;
  display: inline-block;
}
.box:before {
  content: "";
  display: block;
  padding-top: 100%;
}
.table th,
.table td {
  text-align: center;
  border-top: none;
}
.rounded-circle {
  background-color: #000000;
  color: #ffffff;
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 30px;
  text-align: center;
  line-height: 200%;
}
.content {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  text-align: center;
  line-height: 200%;
}
.modal-content {
  display: grid;
  box-shadow: none;
  border-radius: none;
  border: none;
  border-bottom: 1px solid rgba(0, 0, 0, 0.2);
  margin-left: 20px;
  margin-right: 20px;
  width: 100%;
  padding-top: 20px;
  padding-bottom: 20px;
}
.tr-display-none {
  visibility: hidden;
}
/* .slide-enter-active,
    .slide-leave-active {
      transition: opacity 1s, transform 1s; 
    }
    .slide-enter {
      opacity: 0;
      transform: translateY(-10px);
    }
    .slide-leave-to {
      opacity: 0;
      transform: translate   Y(-10px);
    } */
/* .slide-enter-active {
      -moz-transition-duration: 0.5s;
      -webkit-transition-duration: 0.5s;
      -o-transition-duration: 0.5s;
      transition-duration: 0.5s;
      -moz-transition-timing-function: ease-in;
      -webkit-transition-timing-function: ease-in;
      -o-transition-timing-function: ease-in;
      transition-timing-function: ease-in;
    }

    .slide-leave-active {
      -moz-transition-duration: 0.5s;
      -webkit-transition-duration: 0.5s;
      -o-transition-duration: 0.5s;
      transition-duration: 0.5s;
      -moz-transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
      -webkit-transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
      -o-transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
      transition-timing-function: cubic-bezier(0, 1, 0.5, 1);
    }

    .slide-enter-to, .slide-leave {
      max-height: 100px;
      overflow: hidden;
    }

    .slide-enter, .slide-leave-to {
      overflow: hidden;
      max-height: 0;
    } */
.bottomDetailDiv {
  height: 100%;
  min-height:300px;
  border-top: gray;
  border-top-style: double;
  border-top-width: thin;
  padding-top: 5%;
}
</style>
