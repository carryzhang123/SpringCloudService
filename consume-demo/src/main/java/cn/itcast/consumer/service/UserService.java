package cn.itcast.consumer.service;

import cn.itcast.consumer.mapper.UserMapper;
import cn.itcast.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryEmailByUsername(String username){
        return userMapper.selectByPrimaryKey(username);
    }
}
