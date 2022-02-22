//vue-router 및 해당 라우터에서 사용할 컴포넌트 import (The HTML5 mode)
import { createWebHistory, createRouter } from "vue-router";

//routes,router 생성
const routes = [
    {
        path: "/",
        name: "Login",
        component: () => import("@/views/Login")
    },
    {
        path: "/my-dairy",
        name: "Home",
        component: () => import("@/views/Home")
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

//router export
export default router;
