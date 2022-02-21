package com.raven.springbootonetomany.repository;

import com.raven.springbootonetomany.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
