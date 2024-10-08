import {createRouter, createWebHistory} from "vue-router";

const routes = [
    {
        path: '/',
        alias: '/hello-world',
        name: 'hello-world',
        component: () => import("./components/HelloWorld.vue")
    },
    {
        path: '/',
        alias: '/employees',
        name: 'employees',
        component: () => import("./components/EmployeeList.vue")
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
