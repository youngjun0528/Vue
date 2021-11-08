<template>
  <transition name="modal" silde>
    <div class="modal modal-overlay" @click.self="$emit('close')">
      <div class="modal-window">
        <div stylr="display: inline;">
          <div align="left" class="headerLeft" style="">
            <h5>카드 선택</h5>
          </div>
          <div></div>
          <div align="right" class="headerRight" style="">
            <b-icon icon="x-circle-fill" @click="$emit('close')"></b-icon>
          </div>
        </div>
        <b-list-group
          align="left"
          class="overflow-auto"
          style="height:40%;width:100%;"
        >
          <slot />
        </b-list-group>
      </div>
    </div>
  </transition>
</template>

<style lang="stylus" scoped>
.headerRight{
position: relative;
text-align:end;
padding:0.75rem 1.25rem;
float:left;
width:50%;
height:5%;
margin-top:10px;
margin-top: 20px;
margin-bottom: 20px;
}
.headerLeft{
position: relative;
text-align:start;
padding:0.75rem 1.25rem;
float:left;
width:50%;
height:5%;
margin-top:10px;
margin-top: 20px;
margin-bottom: 20px;
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
  top: 50%;
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
</style>
