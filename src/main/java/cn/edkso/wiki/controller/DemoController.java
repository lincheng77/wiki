package cn.edkso.wiki.controller;


import cn.edkso.wiki.domain.Demo;
import cn.edkso.wiki.resp.CommonResp;
import cn.edkso.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
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
    public CommonResp list() {
        List<Demo> demoList = demoService.list();
        CommonResp<List<Demo>> commonResp = new CommonResp<>();
        commonResp.setContent(demoList);
        return commonResp;
    }
}
