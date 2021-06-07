package cn.edkso.wiki.service;

import cn.edkso.wiki.domain.Demo;
import cn.edkso.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
    
}
