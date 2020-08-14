package com.bjsxt.servlet;

import com.bjsxt.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user1=new User();
        User user2=new User();
        User user3=new User();
        User user4=new User();
        user1.setId(1);
        user1.setName("hah");
        user1.setAge(12);
        user2.setId(1);
        user2.setName("hah");
        user2.setAge(12);
        user3.setId(1);
        user3.setName("hah");
        user3.setAge(12);
        resp.getWriter().write("hello,"+user1.toString()+","+user2.toString()+","+user3.toString());
        user4.setId(1);
        user4.setName("hah");
        user4.setAge(12);
        resp.getWriter().write("hello,"+user1.toString()+","+user2.toString());
    }
}
