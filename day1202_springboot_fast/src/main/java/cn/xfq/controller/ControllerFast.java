package cn.xfq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerFast {

    @RequestMapping("/fast")
    public String fast(){
        return "fast";
    }
}
