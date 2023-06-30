package com.zcr.springbootbase.mapper;

import java.util.List;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description
 * @date 2023/6/30 15:38:39
 */
public interface MenuMapper {
    List<String> selectPermsByUserId(Long id);
}
