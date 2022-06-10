import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const routes = [
  {
    // 기본 페이지 지정 : redirect
    path: '/',
    redirect: '/login',
  },
  {
    path: '/login',
    name: 'Login',
    // 코드 스플리팅: 상단에서 미리 import 하는 것이 아닌, 페이지 이동 할 때마다, vue page를 로드한다.
    // 미리 모든 페이지를 로드할 것인지, 아니면 페이지 이동시 마다 로드할 것인지 판단하는 것이 필요하다.
    // 기존 방식은 아래와 같다.
    // import LoginPage from '../views/LoginPage.vue';
    // component: LoginPage
    component: () => import('../views/LoginPage.vue'),
  },
  {
    path: '/signup',
    name: 'Signup',
    component: () => import('../views/SignupPage.vue'),
  },
  {
    // 위에 지정된 path를 제외한 나머지 path 지정
    path: '*',
    component: () => import('../views/NotFoundPage.vue'),
  },
];

const router = new VueRouter({
  // 기본적으로는 url에 # 을 붙인다. ( Server 에서 URL을 자동 설정 )
  // 해당 기능을 Enable 할 때에는 Server 설정이 필요하다.
  mode: 'history',
  routes,
});

export default router;
