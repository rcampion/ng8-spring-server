package com.rkc.zds.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rkc.zds.dto.ArticleDto;
import com.rkc.zds.dto.ContactDto;

public interface ArticleRepository extends JpaRepository<ArticleDto, Integer>, JpaSpecificationExecutor<ArticleDto> {

    ArticleDto save(ArticleDto article);

    Optional<ArticleDto> findById(String id);

    Optional<ArticleDto> findBySlug(String slug);
    
    List<ArticleDto> findByUserId(Integer userId);

}
