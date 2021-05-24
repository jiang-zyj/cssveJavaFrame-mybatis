package com.zyj.controller;

import com.zyj.bean.User;
import com.zyj.service.UserService;
import com.zyj.service.impl.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName ${NAME}
 * @Auther: YaJun
 * @Date: 2021 - 05 - 20 - 11:42
 * @Description: ${PACKAGE_NAME}
 * @version: 1.0
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("doPost");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        List<User> list = userService.queryAllUser();
//        request.setAttribute("user", list);
//        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}
