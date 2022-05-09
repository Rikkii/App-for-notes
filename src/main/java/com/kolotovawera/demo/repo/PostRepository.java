package com.kolotovawera.demo.repo;

import com.kolotovawera.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
