package cn.edkso.wiki.controller;

import cn.edkso.wiki.req.EbookQueryReq;
import cn.edkso.wiki.req.EbookSaveReq;
import cn.edkso.wiki.resp.CommonResp;
import cn.edkso.wiki.resp.EbookQueryResp;
import cn.edkso.wiki.resp.PageResp;
import cn.edkso.wiki.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;
    

    @GetMapping ("/list")
    public CommonResp<PageResp<EbookQueryResp>> list(EbookQueryReq req) {

        PageResp<EbookQueryResp> ebookPage = ebookService.list(req);
        CommonResp<PageResp<EbookQueryResp>> commonResp = new CommonResp<>();
        commonResp.setContent(ebookPage);
        return commonResp;
    }

    @PostMapping("/save")
    public CommonResp save(@RequestBody EbookSaveReq req) {  // 如果前端以json方式提交数据这里要加@RequestBody注解
        ebookService.save(req);
        return new CommonResp<>();
    }
}
