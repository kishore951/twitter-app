package com.example.twitterapp.Dao;

import com.example.twitterapp.Model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {

    @Query(value = "SELECT `id`, `dob`, `email`, `name`, `pass`, `phn`, `place` FROM `users` WHERE `email`=:email AND `pass`=:pass",nativeQuery = true)
    List<UserModel>signIn(String email,String pass);
}
