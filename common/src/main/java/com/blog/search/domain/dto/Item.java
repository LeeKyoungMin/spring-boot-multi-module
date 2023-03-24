package com.blog.search.domain.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String title;
    private String link;
    private String description;
    private String bloggername;
    private String bloggerlink;
    private LocalDateTime postdate;
}
