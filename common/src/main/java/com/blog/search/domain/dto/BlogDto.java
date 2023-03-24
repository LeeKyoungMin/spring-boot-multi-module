package com.blog.search.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogDto {
    private String query;
    private String sort;
    private int page;
    private int size;
    private int display;
    private int start;

    BlogDto(){}

    public KakaoBlogDto toKakaoBlogDto(){
        KakaoBlogDto kakaoBlogDto = KakaoBlogDto.builder()
                                                .query(query)
                                                .sort(sort)
                                                .page(page)
                                                .size(size)
                                                .build();
        return kakaoBlogDto;
    }

    public NaverBlogDto toNaverBlogDto(){
        NaverBlogDto naverBlogDto = NaverBlogDto.builder()
                                                .query(query)
                                                .display(display)
                                                .start(start)
                                                .sort(sort)
                                                .build();
        return naverBlogDto;
    }
}
