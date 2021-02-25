package com.sowon.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdataRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdataRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
