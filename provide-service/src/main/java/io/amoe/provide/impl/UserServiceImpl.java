package io.amoe.provide.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.amoe.entity.User;
import io.amoe.faced.IUserService;
import io.amoe.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

/**
 * @author Amoe
 */
@Service
public class UserServiceImpl implements IUserService {

    private final IUserMapper userMapper;

    @Autowired
    public UserServiceImpl(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> listUser() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> queryUserByName(String name) {
        Optional.ofNullable(name).orElseThrow(() -> new RuntimeException("Condition must not be null"));
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("name", name);
        return userMapper.selectList(wrapper);
    }

    @Override
    public List<User> queryUserByPhone(String phone) {
        Optional.ofNullable(phone).orElseThrow(() -> new RuntimeException("Condition must not be null"));
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("phone", phone);
        return userMapper.selectList(wrapper);
    }
}
