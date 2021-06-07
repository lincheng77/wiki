package cn.edkso.wiki.controller;


import cn.edkso.wiki.domain.Demo;
import cn.edkso.wiki.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    

    @Resource
    private DemoService demoService;
    

    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }

}
