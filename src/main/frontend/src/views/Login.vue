<script setup>
import axios from 'axios'
import {reactive} from "vue";


const data = reactive({
  loginState: false,
  id: '',
  password: '',
  error: false
})

const login = async () => {
  try {
    const result = await axios.post('/login', {
      auth: {
        username: data.id,
        password: data.password
      }
    });
    console.log("[result.status]: " + result.status);
    if (result.status === 200) {
      data.loginState = true
    }
  } catch (err) {
    data.loginState = false;
    throw new Error(err)
  }
}
</script>

<template>
  <div>
    <h1>LOGIN</h1>
    <h5>Please Login For My Dairy</h5>
    <!-- Form -->
    <form @submit.prevent="login">
        <input type="text" placeholder="id" v-model="data.id">
        <input type="password" placeholder="password" v-model="data.password">
      <button variant="success" type="submit">Login</button>
    </form>

    <p v-if="data.error" class="error">Bad login information</p>

    <div class="protected" v-if="data.loginState">
      로그인 성공!
    </div>
    <div class="unprotected" v-else>
      로그인 실패!
    </div>
  </div>
</template>

