package com.example.twitterapp.Controller;

import com.example.twitterapp.Dao.UserDao;
import com.example.twitterapp.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TwitterController {


    @Autowired
    private UserDao dao;

    @CrossOrigin(value = "*")
    @PostMapping(path = "/addUser",consumes = "application/json",produces = "application/json")
    public String addUser(@RequestBody UserModel user){
        dao.save(user);
        return "{status:'success}";
    }
    @CrossOrigin(value = "*")
    @PostMapping(path = "/signIn",consumes = "application/json",produces = "application/json")
    public List<UserModel> signIn(@RequestBody UserModel in){
        return (List<UserModel>) dao.signIn(in.getEmail(),in.getPass());
    }
}
