package cn.edkso.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //@Value(${配置名[:][默认配置值]})
    @Value("${myenv.name:亿迪}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!" + name;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }






}
