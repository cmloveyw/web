<!--<template>
  <div>
    <h1>员工奖惩</h1>
  </div>
</template>-->
<!-- -->
<template>
  <div id="app">
    <ul>
      <li><roter-link href="/">Home</roter-link></li>
      <li><roter-link href="/hello">Hello</roter-link></li>
    </ul>
    <router-view></router-view>
    <!--<app-header v-on:titleChanged="updateTitle($event)" v-bind:title="title"></app-header>
    <app-users v-bind:users="users"></app-users>
    <app-users v-bind:users="users"></app-users>
    <app-footer v-bind:title="title"></app-footer>-->
  </div>
</template>

<script>
  /*import Header from './components/Header'
  import Footer from './components/Footer'
  import Users from './components/Users'*/
  export default {
    name: 'app',
    /*components:{
      "app-header":Header,
      "app-footer":Footer,
      "app-users":Users
    },*/
    data(){
      return{
        /*users:[
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false}
        ],
        title:"传递的是一个值，(string number boolean)"*/
      }
    },
    methods:{
      /*updateTitle(title){
        this.title = title;
      }*/
    }
  }
</script>

<style scoped>

</style>
