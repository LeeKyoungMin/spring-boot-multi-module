package com.blog.search.domain.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class Documents {
    private String title;
    private String contents;
    private String url;
    private String blogName;
    private String thumbnail;
    private LocalDateTime dateTime;
}
