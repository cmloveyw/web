<template>
  <header v-on:click="changeTitle">
  	<h1>{{title1}}{{title}}</h1>
  </header>
</template>

<script>

export default {
  props:{
    title:{
      type:String
    }
  },
  data(){
    return{
      title1:"Vue Demo"
    }
  },
  methods: {
    changeTitle: function () {
      //this.title = "changed"
      //注册事件
      this.$emit("titleChanged", "子向父组件传值");
    }
  },
  // beforeCreate: function () {
  //   alert("组件实例化之前执行的函数");
  // },
  // created: function () {
  //   alert("组件实例化完毕，但页面还未显示");
  // },
  // beforeMount: function () {
  //   alert("组件挂在前，页面仍未展示，但虚拟Dom已经配置");
  // },
  // mounted: function () {
  //   alert("组件挂在后，此方法执行后，页面显示");
  // },
  // beforeUpdate: function () {
  //   alert("组件更新前，页面仍未展示，但虚拟Dom已经配置");
  // },
  // updated: function () {
  //   alert("组件更新前，此方法执行后，页面显示");
  // },
  // beforeDestory: function () {
  //   alert("组件销毁前");
  // },
  // destoryed: function () {
  //   alert("组件销毁");
  // }
}
</script>

<style scoped>
header{
	background: hotpink;
	padding: 10px;
}

h1{
	color: #eee;
	text-align: center;
}
</style>
