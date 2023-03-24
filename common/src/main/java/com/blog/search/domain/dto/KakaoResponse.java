package com.blog.search.domain.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KakaoResponse {
    private List<Documents> documents;
    private Meta meta;

    public BlogResponse toBlogResponse(){
        BlogResponse blogResponse = BlogResponse.builder()
                                                .documents(documents)
                                                .meta(meta)
                                                .build();
        return blogResponse;
    }

    public String toStringResponse(){
        BlogResponse blogResponse = BlogResponse.builder()
                                                .documents(documents)
                                                .meta(meta)
                                                .build();
        return blogResponse.toString();
    }
}


