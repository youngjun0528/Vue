module.exports = {
  // https://vuejs.org/v2/guide/installation.html#Runtime-Compiler-vs-Runtime-only
  runtimeCompiler: true,
  devServer: {
    proxy: "https://openapi.naver.com",
  },
};

