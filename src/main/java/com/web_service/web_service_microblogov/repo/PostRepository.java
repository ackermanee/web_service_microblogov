package com.web_service.web_service_microblogov.repo;

import com.web_service.web_service_microblogov.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
