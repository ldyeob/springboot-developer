package me.leedongyeob.blog.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import me.leedongyeob.blog.domain.Article;
import me.leedongyeob.blog.dto.AddArticleRequest;
import me.leedongyeob.blog.repository.BlogRepository;

@RequiredArgsConstructor
@Service
public class BlogService {
    
    private final BlogRepository bolgRepository;

    public Article save(AddArticleRequest request) {
        return bolgRepository.save(request.toEntity());
    }
}
