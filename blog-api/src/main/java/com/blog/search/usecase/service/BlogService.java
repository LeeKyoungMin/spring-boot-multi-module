package com.blog.search.usecase.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.blog.search.domain.dto.BlogDto;
import com.blog.search.domain.dto.BlogResponse;
import com.blog.search.domain.dto.KakaoBlogDto;
import com.blog.search.domain.dto.KakaoResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class BlogService {

    @Value("${kakao.api.url}")
    private String kakaoApiUrl;

    @Value("${kakao.api.uri}")
    private String kakaoApiUri;

    @Value("${kakao.api.key}")
    private String kakaoApiKey;

    @Value("${naver.api.url}")
    private String naverApiUrl;

    @Value("${naver.api.uri}")
    private String naverApiUri;

    @Value("${naver.api.key}")
    private String naverApiKey;

    @Value("${naver.api.id}")
    private String naverApiId;

    private final KakaoBlogService kakaoBlogService;
    private final NaverBlogService naverBlogService;

    public Mono<String> getBlog(BlogDto blogDto) throws IOException {
        return kakaoBlogService.getBlog(blogDto.toKakaoBlogDto())
                .onErrorResume(e -> {
                    try {
                        return naverBlogService.getBlog(blogDto.toNaverBlogDto());
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        log.error(e1.getMessage());
                    }
                    return null;
                })
                .map(t -> t.toString());
    }
}
