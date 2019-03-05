<!--<template>
  <div>
    <h1>员工奖惩</h1>
  </div>
</template>-->
<!-- -->
<template>
  <div id="home">
    <app-header v-on:titleChanged="updateTitle($event)" v-bind:title="title"></app-header>
    <app-users v-bind:users="users"></app-users>
    <app-users v-bind:users="users"></app-users>
    <app-footer v-bind:title="title"></app-footer>
  </div>
</template>

<script>
  import Header from './Header'
  import Footer from './Footer'
  import Users from './Users'
  export default {
    name: 'home',
    components:{
      "app-header":Header,
      "app-footer":Footer,
      "app-users":Users
    },
    data(){
      return{
        users:[
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false},
          {name:"MiaoJie",position:"Web开发",show:false}
        ],
        title:"传递的是一个值，(string number boolean)"
      }
    },
    methods:{
      updateTitle(title){
        this.title = title;
      }
    }
  }
</script>

<style scoped>

</style>
