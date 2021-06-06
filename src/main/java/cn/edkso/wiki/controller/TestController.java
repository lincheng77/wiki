package cn.edkso.wiki.controller;


import cn.edkso.wiki.domain.Test;
import cn.edkso.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {



    //@Value(${配置名[:][默认配置值]})
    @Value("${myenv.name:亿迪}")
    private String name;

    @Resource
    private TestService testService;


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + name;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }



}
