package cn.edkso.wiki.service;

import cn.edkso.wiki.domain.Ebook;
import cn.edkso.wiki.domain.EbookExample;
import cn.edkso.wiki.mapper.EbookMapper;
import cn.edkso.wiki.req.EbookReq;
import cn.edkso.wiki.resp.EbookResp;
import cn.edkso.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapperr;

    public List<EbookResp> list(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        criteria.andNameLike("%" + ebookReq.getName() + "%");
        List<Ebook> ebookList = ebookMapperr.selectByExample(ebookExample);

        List<EbookResp> ebookRespList = CopyUtil.copyList(ebookList, EbookResp.class);

        return ebookRespList;
    }
    
}
