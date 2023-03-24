package com.blog.search.usecase.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.blog.search.domain.dto.NaverBlogDto;
import com.blog.search.domain.dto.NaverResponse;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class NaverBlogService {

    @Value("${naver.api.url}")
    private String naverApiUrl;

    @Value("${naver.api.uri}")
    private String naverApiUri;

    @Value("${naver.api.key}")
    private String naverApiKey;

    @Value("${naver.api.id}")
    private String naverApiId;

    public Mono<String> getBlog(NaverBlogDto naverBlogDto) throws IOException {

        return WebClient.create(naverApiUrl)
                        .method(HttpMethod.GET)
                        .uri("?query=" + naverBlogDto.getQuery())
                        .header("X-Naver-Client-Id", naverApiId)
                        .header("X-Naver-Client-Secret", naverApiKey)
                        .retrieve()
                        .bodyToMono(String.class);
    }
    
}
