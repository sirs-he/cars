package com.hopu.controller;

import com.alibaba.fastjson.JSONObject;
import com.hopu.entity.Chewei;
import com.hopu.service.CheweiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CheweiController {

    @Autowired
    private CheweiService service;

    @RequestMapping("/cheweiList")
    @ResponseBody
    @CrossOrigin
    public String cheweiList(){
        List<Chewei> cheweiList = service.cheweiList();
        System.out.println(cheweiList);
        String str = JSONObject.toJSONString(cheweiList);
        return str;
    }

    @RequestMapping("/addChewei")
    @ResponseBody
    @CrossOrigin
    public String addChewei(Chewei chewei){
        int line = service.addChewei(chewei);
        System.out.println(line);
        System.out.println("hot-fix分支，临时修改的代码");
        System.out.println("master 提交冲突代码");
        System.out.println("hot-fix 提交冲突代码");

        System.out.println("测试远程push");

        System.out.println("测试远程push1");
        
        System.out.println("模拟同事修改代码后推送到远程库");
        return line+"";
    }
}
