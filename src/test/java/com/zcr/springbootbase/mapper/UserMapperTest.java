package com.zcr.springbootbase.mapper;

import com.zcr.springbootbase.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 测试UserMapper
 * @date 2023/6/30 15:27:23
 */

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }
}
