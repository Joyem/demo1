package com.example.demo.UserDao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public interface UserDao {
    @Select("select subject from user where username = #{username} and password = #{password}")
    public String login(@Param("username") String username, @Param("password") String password);
}
