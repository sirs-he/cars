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
        return line+"";
    }
}
