<script setup>
import axios from "axios";

const doLogin = async () => {
  alert("Go Login!");
  const result = axios.get("/login");
  console.log("[login result]: " + result);
}

</script>

<template>
  <div>
    Login Page
    <div>
      <!-- form -->
      <form @submit="doLogin" @keydown.enter.prevent="doLogin">
        <input name="username" type="text" placeholder="ID" autocomplete="username">
        <input name="password" type="password" placeholder="PASSWORD" autocomplete="current-password">

        <!-- Submit -->
        <button>Login</button>
      </form>
    </div>

  </div>
</template>



<style scoped>

</style>