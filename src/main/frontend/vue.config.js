const path = require('path')

module.exports = {
    //빌드 타겟 디렉토리 설정
    outputDir: path.resolve(__dirname, "../resources/static"),

    devServer: {
        //개발환경에서 특정 URL에 대해 프론트앤드에서 처리할지 백앤드에서 처리할지 설정
        proxy: {
            '/api': {
                target: 'http://localhost:9000',
                ws: true,
                changeOrigin: true
            }
        }
    },

    transpileDependencies: [
      'vuetify'
    ]
}
