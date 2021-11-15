package com.demo.controller;

import com.demo.dao.ProductDao;
import com.demo.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDao db = new ProductDao();
        List<Product> products = db.getAllProduct();
        if(products != null){
            request.setAttribute("products", products);
            request.getRequestDispatcher("product.jsp").forward(request, response);
        }else{
            request.setAttribute("message", "List product is null");
            request.getRequestDispatcher("product.jsp").forward(request, response);
        }

    }
}
