const path = require("path");


module.exports = {
  outputDir: path.resolve(__dirname, "C:\\ProgramUsers\\Apache24\\htdocs"),

  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    // 프록시 설정
    proxy: {
      "/v1": {
        target: 'http://localhost:8080',
      },
    },
  }
}
