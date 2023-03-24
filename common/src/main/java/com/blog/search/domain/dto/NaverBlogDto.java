package com.blog.search.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NaverBlogDto {
    
    private String query;
    private int display;
    private int start;
    private String sort;

    NaverBlogDto(){}

    @Builder
    public NaverBlogDto(String query, int display, int start, String sort){
        this.query = query;
        this.display = display;
        this.start = start;
        this.sort = sort;
    }
   
}
