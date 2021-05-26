package com.zyj.bean;

import java.util.List;

/**
 * @ClassName User
 * @Auther: YaJun
 * @Date: 2021 - 05 - 24 - 18:40
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class User {

    private Integer id;

    private String name;

    private String password;

    private List<Menu> menus;


    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", menus=" + menus +
                '}';
    }
}
