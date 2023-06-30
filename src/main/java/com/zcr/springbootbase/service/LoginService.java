package com.zcr.springbootbase.service;

import com.zcr.springbootbase.domain.ResponseResult;
import com.zcr.springbootbase.domain.User;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 用户登录实现接口
 * @date 2023/6/30 16:26:23
 */

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
