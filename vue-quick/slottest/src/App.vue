<template>
  <div id="app">
    <speech-box :headerText="A.header" :footerText="A.footer">
      <div>
        <p>
          {{ A.message }}
        </p>
      </div>
    </speech-box>
    <speech-box class="sanders" :headerText="B.header" :footerText="B.footer ">
      <div>
        <p class="sanders-content">
          {{ B.message }}
        </p>
      </div>
    </speech-box>
  </div>
</template>

<script>
import SpeechBox from './components/SpeechBox.vue'

export default {
  name: 'App',
  components: {
    SpeechBox
  },
  data: function () {
    return {
      A: {
        header: "오 바 마 대통령 고별 연 설 문 ",
        footer: "2017.01.10 - 시 카 고 ",
        message: '저 의 동료 국민 여 러 분 ................... (지 면 관 계 상 생 략 )'
      },
      B: {
        header: "버 니 샌 더 스 경선 패배 연 설 문 ",
        footer: "2016.07.25- 필라델피아 웰 스 파 고 ",
        message: ' 감사합니다. 여러분 정말 감사합니다.............(지면 관계상 생략)'
      }
    };
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.sanders {
  background-color: antiquewhite;
}

.sanders-content {
  text-decoration: underline;
}
</style>
