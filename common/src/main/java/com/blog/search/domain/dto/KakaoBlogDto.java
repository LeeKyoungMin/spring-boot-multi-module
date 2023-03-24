package com.blog.search.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KakaoBlogDto {
    
    private String query;
    private String sort;
    private int page;
    private int size;

    KakaoBlogDto(){}

    @Builder
    public KakaoBlogDto(String query, String sort, int page, int size){
        this.query = query;
        this.sort = sort;
        this.page = page;
        this.size = size;
    }
}
