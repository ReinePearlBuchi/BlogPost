package data.repository;

import data.model.Post;

import java.util.List;

public interface PostRespository {
    Post findById(int id);
    List<Post> findAll();
    long count();
    void deleteAll();
    Post save(Post post);
    void deleteById(int id);

}
