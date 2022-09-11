package com.pk.bakend.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pk.bakend.mapper.UserMapper;
import com.pk.bakend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/user/all/")
    public List<User> getAll(){
        return userMapper.selectList(null);
    }

    @GetMapping("/user/{userId}/")
    public List<User> getUser(@PathVariable int userId){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("id",2).le("id",3);
        return userMapper.selectList(queryWrapper);
    }

    @GetMapping("/add/{userID}/{username}/{password}/")
    public String addUser(@PathVariable int userID
    ,@PathVariable String username
    ,@PathVariable String password){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(password);
        User user = new User(userID,username,encodePassword);
        userMapper.insert(user);
        return "Add User Successfully!";
    }

    @GetMapping("/delete/{userId}")
    public String deleteUser(@PathVariable int userId){
        int i = userMapper.deleteById(userId);
        if(i > 0){
            return "Delete User Successfully!";
        }else{
            return "Delete failed";
        }
    }
}
