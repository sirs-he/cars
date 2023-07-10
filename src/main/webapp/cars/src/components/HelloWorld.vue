<template>
  <div align="center">
    <table border="1">
      <tr>
        <td colspan="5">
          <router-link to="toAddChewei">添加车位</router-link>
        </td>
      </tr>
      <tr>
        <th>编号</th>
        <th>车位图片</th>
        <th>车位类型</th>
        <th>车位状态</th>
        <th>操作</th>
      </tr>
      <tr v-for="(chewei, index) in cheweiList" :key="index">
        <td>{{ chewei.id }}</td>
        <td><img :src="chewei.photo" width="50" height="50"/></td>
        <td>{{ chewei.type }}</td>
        <td>{{ chewei.status }}</td>
        <td> <a href="toAddChewei">编辑车位</a> <a href="toAddChewei">删除车位</a></td>
      </tr>
    </table>

  </div>
</template>
<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  data () {
    return {
      cheweiList:''
    }
  },
  created(){
    console.log("ssssss")
    // 一加载就查询所有车位信息显示
    axios.get("http://localhost:80/cheweiList")
      .then(res=>{
        console.log(res.data)
        this.cheweiList = res.data
      })
  }
}
</script>
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
table{
  border-collapse: collapse;
}
th,td{
  width: 140px;
  border: 1px solid ;
  text-align: center;
}
</style>
