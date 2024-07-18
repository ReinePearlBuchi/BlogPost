package data.repository;

import data.model.Comments;
import data.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRespository {
    private List<Post> posts = new ArrayList<>();

    @Override
    public Post findById(int id) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
