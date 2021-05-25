package com.zyj.mapper;

import com.zyj.bean.Department;
import com.zyj.bean.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Auther: YaJun
 * @Date: 2021 - 05 - 20 - 17:32
 * @Description: com.zyj.mapper
 * @version: 1.0
 */
public interface UserMapper {

    public List<User> getAllUser();

    public boolean addUser(User user);

    public boolean deleteUserById(Integer id);

    public boolean updateUser(User user);

}
