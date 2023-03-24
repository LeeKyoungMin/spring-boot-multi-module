package com.blog.search.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.search.domain.dto.BlogDto;
import com.blog.search.domain.dto.KakaoBlogDto;
import com.blog.search.domain.dto.KakaoResponse;
import com.blog.search.usecase.service.BlogService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/kakao")
@RequiredArgsConstructor
public class BlogController {
    private final BlogService blogService;

    @GetMapping("/blog")
    public Mono<String> getMenu(@RequestBody BlogDto blogDto) throws IOException{
        return blogService.getBlog(blogDto);
    }
}
