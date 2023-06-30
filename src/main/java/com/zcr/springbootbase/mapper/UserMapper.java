package com.zcr.springbootbase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zcr.springbootbase.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 用户mapper接口
 * @date 2023/6/30 15:25:03
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
