package data.repository;

import data.model.Post;

i

class PostRepositoryImplTest {
    @Test
    public void testThatRepositoryCanSavePost{
        PostRepositoryImpl repository = new PostRepositoryImpl();
        Post post = new Post();
        post.setTitle("Post Title");
        post.setContent("Post Content");
    }

}