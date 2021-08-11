package cn.edkso.wiki.req;

import lombok.Data;

/**
 * @author: dingmd
 * @create: 2021-08-11 21:15
 * @description:
 **/

@Data
public class EbookSaveReq {
    private Long id;

    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}
