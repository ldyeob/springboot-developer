package me.leedongyeob.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.leedongyeob.blog.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long>{
}



