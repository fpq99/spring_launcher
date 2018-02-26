package com.launcher.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//DB Layer 접근자(Dao)
public interface PostsRepository extends JpaRepository<Posts, Long>{
}
