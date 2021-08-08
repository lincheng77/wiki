package cn.edkso.wiki.resp;

import lombok.Data;

import java.util.List;

/**
 * @author: dingmd
 * @create: 2021-08-06 23:34
 * @description:
 **/
@Data
public class PageResp<T> {
    private long total;

    private List<T> list;
}
