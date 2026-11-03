package com.asher.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello2")
public class HelloServlet2 extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet initialized!");
    }

    @Override
    protected void doGet(
        
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {

        System.out.println("GET request received!");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<h1>Hello from my first Servlet 2 How have you been!</h1>");
        out.println("<p>Servlet Lifecycle Demonstration</p>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroyed!");
    }
}