<template>
  <div id="users">
  	<ul>
  		<li v-on:click="user.show = !user.show"
  			v-for="user in users">
  			<h2>{{user.name}}</h2>
  			<h3 v-show="user.show">
  				{{user.position}}
  			</h3>
  		</li>
  	</ul>

    <button v-on:click="deleteUser">删除</button>
  </div>
</template>

<!--
传值：string number boolean
引用：array object  改变一个地方和引用相关都会发生变化
-->
<script>
export default {
  name:'users',
  //props:["users"], 1
  props:{
    users:{
      type:Array,
      required:true
    },
  },//标准写法
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
    ]*/
    }
  },
  methods:{
    deleteUser:function () {
      this.users.pop();
    }
  }
}
</script>

<style scoped>
#users{
	width: 100%;
	max-width: 1200px;
	margin: 40px auto;
	padding: 0 20px;
	box-sizing: border-box;
}

ul{
	display: flex;
	flex-wrap: wrap;
	list-style-type: none;
	padding: 0;
}

li{
	flex-grow: 1;
	flex-basis: 300px;
	text-align: center;
	padding: 30px;
	border: 1px solid #222;
	margin: 10px;
}
</style>
