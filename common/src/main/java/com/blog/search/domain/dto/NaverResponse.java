package com.blog.search.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NaverResponse {
    private LocalDateTime lastBuildDate;
    private int total;
    private int start;
    private int display;
    private List<Item> items;
}


