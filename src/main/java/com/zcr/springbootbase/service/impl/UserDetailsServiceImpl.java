package com.zcr.springbootbase.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zcr.springbootbase.domain.LoginUser;
import com.zcr.springbootbase.domain.User;
import com.zcr.springbootbase.mapper.MenuMapper;
import com.zcr.springbootbase.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 用户信息服务接口实现类
 * @date 2023/6/30 15:32:42
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private UserMapper userMapper;


//    @Autowired
//    private MenuMapper menuMapper;

    //实现UserDetailsService接口，重写UserDetails方法，自定义用户的信息从数据中查询
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //（认证，即校验该用户是否存在）查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, username);
        User user = userMapper.selectOne(queryWrapper);
        //如果没有查询到用户
        if (Objects.isNull(user)) {
            throw new RuntimeException("用户名或者密码错误");
        }


        //TODO (授权，即查询用户具有哪些权限)查询对应的用户信息
        //定义一个权限集合
//        List<String> list = new ArrayList<String>(Arrays.asList("test","admin"));
//        List<String> list = menuMapper.selectPermsByUserId(user.getId());


        //把数据封装成UserDetails返回
        return new LoginUser(user);
    }
}
