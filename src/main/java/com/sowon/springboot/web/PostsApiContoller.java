package com.sowon.springboot.web;
import com.sowon.springboot.service.posts.PostsService;
import com.sowon.springboot.web.dto.PostsResponseDto;
import com.sowon.springboot.web.dto.PostsSaveRequestDto;
import com.sowon.springboot.web.dto.PostsUpdataRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiContoller {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping
    public Long update(@PathVariable Long id, @RequestBody PostsUpdataRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}
