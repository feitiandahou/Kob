<template>
  <NavBar />
  <router-view></router-view>
</template>


<script>
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"

export default {
    components: {
        NavBar
    },
    setup(){
    //   $.ajax({
    //     url: "http://localhost:3000/user/account/token/",
    //     type: "post",
    //     data:{
    //       username: 'yxc',
    //       password: 'pyxc',
    //     },
    //     success(resp){
    //       console.log(resp);
    //     },
    //     error(resp){
    //       console.log(resp);
    //     }
    //   });

    //   $.ajax({
    //   url: "http://localhost:3000/user/account/info/",
    //   type: "get",
    //   headers: {
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI0ZWI1OTg1ZDE3MjU0M2NmOTk4MjUxMzNjNjg4MjcyZiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY2MzMwNDUzMSwiZXhwIjoxNjY0NTE0MTMxfQ.0iKbBkafkceXGNHc8pKVspnjJJfO6bjgzTLPPhsqhcs",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });

    // $.ajax({
    //   url: "http://localhost:3000/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: "hmy",
    //     password: "phmy",
    //     confirmedPassword: "phmy",
    //   },
    //   success(resp){
    //     console.log(resp);
    //   },
    //   error(resp){
    //     console.log(resp);
    //   }
    // })


    }
  }
</script>

<style>
 body{
   background-image: url("@/assets/images/background.png");
   background-size: cover ;
 }
</style>
