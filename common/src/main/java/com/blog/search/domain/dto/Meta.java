package com.blog.search.domain.dto;

import lombok.Getter;

@Getter
public class Meta {
    private int totalCount;
    private int pageableCount;
    private boolean isEnd;
}
