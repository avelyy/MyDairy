import { createApp } from 'vue'
import App from './App.vue'
import router from "./router";
import BootstrapVue from 'bootstrap-vue-3'
//import IconsPlugin from "bootstrap-vue-3";

import Argon from "./plugins/argon-kit";
import './registerServiceWorker'

// Import Bootstrap an BootstrapVue CSS files (order is important)
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

const app = createApp(App)
app.use(BootstrapVue)
//app.use(IconsPlugin)
app.use(router)
app.use(Argon);
app.mount('#app')

