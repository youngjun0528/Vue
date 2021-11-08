<template>
  <transition name="modal" silde>
    <div class="modal modal-overlay" @click.self="$emit('close')">
      <div class="modal-window">
        <div>
          <div style="float: left;width: 100%;">
            <div class="headerLeft" align="left" style="">
              <span style="font-size: xx-larger;font-weight: bold;">{{
                contents.title
              }}</span>
            </div>
            <div class="headerRight" align="right" style="">
              <b-icon icon="x-circle-fill" @click="$emit('close')"></b-icon>
            </div>
          </div>
          <div style="float: left;width: 100%;">
            <div class="headerLeft" style="" align="left">
              <span style="font-size: x-larger;font-weight: bold;"
                >{{ contents.money | makeComma }}원</span
              >
            </div>
            <div class="headerRight" style="" align="right">
              <span
                style="font-size: x-small;font-weight: bold;"
                v-on:click="detailMoney = !detailMoney"
                >금액 상세 <b-icon icon="chevron-down"></b-icon
              ></span>
            </div>
          </div>
          <transition>
            <div v-show="detailMoney">
              <b-list-group
                class="overflow-auto"
                style="height:80%;width:100%;font-size: x-small;"
              >
                <b-list-group-item>
                  <div>
                    <div class="leftDiv" style="" align="left">
                      <span>금액</span>
                    </div>
                    <div class="rightDiv" style="" align="right">
                      <span>{{ contents.money | makeComma }}원</span>
                    </div>
                  </div>
                </b-list-group-item>
                <b-list-group-item>
                  <div>
                    <div class="leftDiv" style="" align="left">
                      <span>부가세</span>
                    </div>
                    <div class="rightDiv" style="" align="right">
                      <span>{{ contents.money | makeComma }}원</span>
                    </div>
                  </div>
                </b-list-group-item>
                <b-list-group-item>
                  <div>
                    <div class="leftDiv" style="" align="left">
                      <span>봉사료</span>
                    </div>
                    <div class="rightDiv" style="" align="right">
                      <span>{{ contents.money | makeComma }}원</span>
                    </div>
                  </div>
                </b-list-group-item>
              </b-list-group>
            </div>
          </transition>
        </div>
        <b-list-group class="overflow-auto" style="height:80%;width:100%;">
          <b-list-group-item>
            <div>
              <div class="leftDiv" style="" align="left">
                <span>거래일자</span>
              </div>
              <div class="rightDiv" style="" align="right">
                <span style="font-weight: bold;"
                  >{{ contents.date }}<b-icon icon="dot"></b-icon
                  >{{ contents.time }}</span
                >
              </div>
            </div>
          </b-list-group-item>
          <b-list-group-item>
            <div>
              <div class="leftDiv" style="" align="left">
                <span>결재구분</span>
              </div>
              <div class="rightDiv" style="" align="right">
                <span style="font-weight: bold;">{{ contents.type }}</span>
              </div>
            </div>
          </b-list-group-item>
          <b-list-group-item>
            <div>
              <div class="leftDiv" style="" align="left">
                <span>결재카드</span>
              </div>
              <div class="rightDiv" style="" align="right">
                <span style="font-weight: bold;">{{
                  this.$store.getters.getSelectCardInfo(contents.card)[0].name
                }}</span>
              </div>
            </div>
          </b-list-group-item>
          <b-list-group-item>
            <div>
              <div class="leftDiv" style="" align="left">
                <span>카드 소지자</span>
              </div>
              <div class="rightDiv" style="" align="right">
                <span style="font-weight: bold;">{{ contents.owner }}</span>
              </div>
            </div>
          </b-list-group-item>
          <b-list-group-item>
            <div>
              <div class="leftDiv" style="" align="left">
                <span>승인번호</span>
              </div>
              <div class="rightDiv" style="" align="right">
                <span style="font-weight: bold;">{{ contents.number }}</span>
              </div>
            </div>
          </b-list-group-item>
          <b-list-group-item>
            <div>
              <div class="leftDiv" style="" align="left">
                <span>승인상태</span>
              </div>
              <div class="rightDiv" style="" align="right">
                <span style="font-weight: bold;">{{ contents.status }}</span>
              </div>
            </div>
          </b-list-group-item>
        </b-list-group>
      </div>
    </div>
  </transition>
</template>

<script>
export default {
  name: "DetailModal",
  props: {
    contents: {
      type: Object,
      required: true
    }
  },
  data() {
    return {
      detailMoney: false
    };
  }
};
</script>

<style lang="stylus" scoped>
.headerRight{
text-align:end;
padding:0.75rem 1.25rem;
float:left;
width:25%;
height:5%;
margin-top: 20px;
}
.headerLeft{
text-align:start;
padding:0.75rem 1.25rem;
float:left;
width:75%;
height:5%;
margin-top: 20px;
}
.leftDiv{
width: 50%;
float: left;
}
.rightDiv{
width: 50%;
float: left;
}
.modal {
  &.modal-overlay {
    display: flex;
    align-items: center;
    justify-content: center;
    position: fixed;
    z-index: 30;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0, 0, 0, 0.5);
  }

  &-window {
    background: #fff;
    border-radius: 4px;
    overflow: hidden;
  }

  &-content {
    padding: 10px 20px;
  }

  &-footer {
    background: #ccc;
    padding: 10px;
    text-align: right;
  }
}

.modal-window{
  width: 100%;
  height: 100%;
  position: relative;
  top: 5%;
}

// 오버레이 트랜지션
.modal-enter-active, .modal-leave-active {
  // transition: opacity 0.4s;
  transition: all 0.25s ease;

  // 오버레이에 포함되어 있는 모달 윈도의 트랜지션
  .modal-window {
    transition: opacity 0.4s, transform 0.4s;
  }
}

// 딜레이가 적용된 모달 윈도가 제거된 후에 오버레이가 사라짐
.modal-leave-active {
  transition: opacity 0.6s ease 0.4s;
}

.modal-enter, .modal-leave-to {
  opacity: 0;

  .modal-window {
    opacity: 0;
    transform: translateY(100%);
  }
}

.v-enter-active,
.v-leave-active {
  transition: opacity 1s, transform 1s;
}
.v-enter {
  opacity: 0;
  transform: translateY(-10px);
}
.v-leave-to {
  opacity: 0;
  transform: translateY(-10px);
}
</style>
