package com.demo.controller;

import com.demo.dao.UserDao;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao s = new UserDao();
        boolean test = s.findUser(username,password);
        HttpSession session = request.getSession();
        if (test == true){
            response.sendRedirect("home");
            session.setAttribute("username",username);
            session.setAttribute("message",null);
        }else
        {
            response.sendRedirect("login");
            session.setAttribute("message","Username or password is not correct !");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
