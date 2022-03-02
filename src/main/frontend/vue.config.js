//const { defineConfig } = require('@vue/cli-service')
const path = require('path');

module.exports = {
  outputDir: path.resolve(__dirname, "../resources/static"),
  devServer: {
    proxy: {
      '/login': {
        target: 'http://localhost:9000',
        changeOrigin: true
      }
    }
  }
}

