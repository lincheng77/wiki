package cn.edkso.wiki.req;

import lombok.Data;

/**
 * @author: dingmd
 * @create: 2021-08-06 23:32
 * @description:
 **/

@Data
public class PageReq {

    private int page;

    private int size;
}
