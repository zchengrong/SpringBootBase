package com.zcr.springbootbase.config;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 安全配置类测试
 * @date 2023/6/30 16:06:31
 */
@SpringBootTest
public class ServuityConfigTest {


    @Test
    public void TestBCryptPasswordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        String encode = bCryptPasswordEncoder.encode("1234");

//        System.out.println(encode);
//        String encode2 = bCryptPasswordEncoder.encode("1234");
//        System.out.println("encode {}" + encode + "encode2 {}" + encode2);

        boolean matches = bCryptPasswordEncoder.matches("1234", "$2a$10$MqWYMFEbGgHbauwA6J24eegqxUR7AU03Nb/P13sNMN6y23mk5LLKu");
        System.out.println(matches);
    }

}
