module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    // 프록시 설정
    proxy: {
        	"/v1": {
            	target: 'http://localhost:3001'
            },
        },
  }
}
