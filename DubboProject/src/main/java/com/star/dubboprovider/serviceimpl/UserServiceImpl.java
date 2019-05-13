package com.star.dubboprovider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.star.api.model.User;
import com.star.api.model.UserKey;
import com.star.api.user.UserService;
import com.star.dubboprovider.mapper.UserMapper;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public String queryUser(UserKey userKey) {
        User user = userMapper.selectByPrimaryKey(userKey);
        Assert.assertNotNull(user);
        return user.toString();
    }

    @Override
    public int insertUSer(User user) {
        Assert.assertNotNull(user);
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        Assert.assertNotNull(user);
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteUser(UserKey userKey) {
        Assert.assertNotNull(userKey);
        return userMapper.deleteByPrimaryKey(userKey);
    }
}
