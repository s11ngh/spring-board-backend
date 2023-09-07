package com.Coffee.Coffee.rep;

import com.Coffee.Coffee.models.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BlogRepo extends MongoRepository<Blog, Integer> {

}
