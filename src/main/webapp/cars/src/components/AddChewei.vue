<template>
    <div align="center">
      <table border="1">
        <tr>
          <td colspan="2">
            <b>添加车位</b>
          </td>
        </tr>
        <tr>
            <td>编号</td>
            <td><input type="text" v-model="chewei.id" /></td>
        </tr>
        <tr>
            <td>车位图片</td>
            <td><input type="file" v-model="chewei.photo"/></td>
        </tr>
        <tr>
            <td>车位类型</td>
            <td>
                <select v-model="chewei.type">
                    <option value="0">摩托车位</option>
                    <option value="1">私家车位</option>
                    <option value="2">客车位</option>
                    <option value="3">货车位</option>
                </select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><button @click="addChewei">添加</button></td>
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
        chewei:{
            id:'',
            photo:'',
            type:''
        }

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
    },
    methods:{
        addChewei(){
            alert("添加车位")
        }
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
  }
  </style>
  