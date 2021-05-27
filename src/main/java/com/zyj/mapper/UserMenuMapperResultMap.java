package com.zyj.mapper;

import com.zyj.bean.User;

import java.util.List;

/**
 * @ClassName UserMenuMapperResultMap
 * @Auther: YaJun
 * @Date: 2021 - 05 - 26 - 11:06
 * @Description: com.zyj.mapper
 * @version: 1.0
 */
public interface UserMenuMapperResultMap {

    /**
     * 查询所有用户的权限信息
     * @return
     */
    public List<User> getAllUserAndMenu();

}
