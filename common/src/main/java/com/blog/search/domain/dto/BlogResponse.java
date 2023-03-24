package com.blog.search.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogResponse {
    //kakao
    private List<Documents> documents;
    private Meta meta;

    //naver
    private LocalDateTime lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<Item> items;

    BlogResponse(){}

    @Builder
    public BlogResponse(List<Documents> documents, Meta meta, LocalDateTime lastBuildDate, int total, int start, int display, List<Item> items){
        this.documents = documents;
        this.meta = meta;
        this.lastBuildDate = lastBuildDate;
        this.total = total;
        this.start = start;
        this.display = display;
        this.items = items;
    }
}


