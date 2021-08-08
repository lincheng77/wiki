package cn.edkso.wiki.service;

import cn.edkso.wiki.domain.Ebook;
import cn.edkso.wiki.domain.EbookExample;
import cn.edkso.wiki.mapper.EbookMapper;
import cn.edkso.wiki.req.EbookReq;
import cn.edkso.wiki.resp.EbookResp;
import cn.edkso.wiki.resp.PageResp;
import cn.edkso.wiki.utils.CopyUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);

    @Resource
    private EbookMapper ebookMapperr;

    public PageResp<EbookResp> list(EbookReq ebookReq) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        if (!ObjectUtils.isEmpty(ebookReq.getName())){
            criteria.andNameLike("%" + ebookReq.getName() + "%");
        }

        PageHelper.startPage(ebookReq.getPage(),ebookReq.getSize());
        List<Ebook> ebookList = ebookMapperr.selectByExample(ebookExample);
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        List<EbookResp> ebookRespList = CopyUtil.copyList(ebookList, EbookResp.class);

        PageResp<EbookResp> pageResp = new PageResp<>();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(ebookRespList);

        return pageResp;
    }
    
}
