package cn.xfq.controller;

import cn.xfq.domain.User;
import cn.xfq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/query")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
