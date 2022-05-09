package com.kolotovawera.demo.repo;

import com.kolotovawera.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {

}
