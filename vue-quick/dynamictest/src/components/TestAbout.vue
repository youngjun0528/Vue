<template>
  <div>
    <h1>About</h1>
    <h3>{{ (new Date()).toTimeString() }}</h3>
    <h4>조직도</h4>
    <TestTree :subs="orgcharts"></TestTree>
  </div>
</template>

<script>
import TestTree from './TestTree.vue'

export default {
  name: "TestAbout",
  components: {TestTree},
  data: function () {
    return {
      orgcharts: [
        {
          name: "( 주 ) OpenSG",
          type: "company",
          subs: [
            {
              name: "SI 사업부", type: "division",
              subs: [
                {name: "SI 1 팀 ", type: "team"},
                {name: "SI 2 팀 ", type: "team"}
              ]
            },
            {
              name: "BI 사업부", type: "division",
              subs: [
                {name: "BI 1 팀 ", type: "team"},
                {name: "BI 2 팀 ", type: "team"},
                {name: "BI 3 팀 ", type: "team"},
              ]
            },
            {
              name: "솔루션 사업부", type: "division",
              subs: [
                {name: "ESM 팀 ", type: "team"},
                {name: "MTS 팀 ", type: "team"},
                {name: "ASF 팀 ", type: "team"},
              ]
            },
            {name: "총무팀", type: "division"},
            {name: "임사팀", type: "division"}
          ]
        }
      ]
    }
  }
}
</script>

<style>
li.company{
  color: blue;
}
li.division {
  color: steelblue;
}
li.team{
  color: tomato;
}
</style>