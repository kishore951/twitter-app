package com.example.twitterapp.Dao;

import com.example.twitterapp.Model.PostModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostDao extends CrudRepository<PostModel,Integer> {


    @Query(value = "SELECT p.`post`, p.`posted_date`,u.name FROM `posts` p JOIN users u ON u.id=p.user_id",nativeQuery = true)
    List<String> ViewAllPosts();


    @Query(value = "SELECT `id`, `post`, `posted_date`, `user_id` FROM `posts` WHERE `user_id` =:user_id",nativeQuery = true)
    List<PostModel> ViewSingle(Integer user_id);
}
