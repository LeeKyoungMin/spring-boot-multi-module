package com.blog.search.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.search.domain.dto.NaverBlogDto;
import com.blog.search.domain.dto.NaverResponse;
import com.blog.search.usecase.service.NaverBlogService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/naver")
@RequiredArgsConstructor
public class NaverController {
    private final NaverBlogService naverBlogService;

    @GetMapping("/blog")
    public Mono<String> getMenu(@RequestBody NaverBlogDto naverBlogDto) throws IOException{
        return naverBlogService.getBlog(naverBlogDto);
    }
}

