package cn.xfq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {

    @Value("${name}")
    private String name;

    @Value("${person.age}")
    private String addr;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "你好 springboot";
    }

    @RequestMapping("/quick1")
    @ResponseBody
    public String quick1(){
        return "name:"+name+",addr:"+addr;
    }
}
