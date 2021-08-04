package cn.edkso.wiki.controller;

import cn.edkso.wiki.req.EbookReq;
import cn.edkso.wiki.resp.CommonResp;
import cn.edkso.wiki.resp.EbookResp;
import cn.edkso.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;
    

    @GetMapping ("/list")
    public CommonResp list(EbookReq ebookReq) {

        List<EbookResp> ebookList = ebookService.list(ebookReq);
        CommonResp<List<EbookResp>> commonResp = new CommonResp<>();
        commonResp.setContent(ebookList);
        return commonResp;
    }
}
