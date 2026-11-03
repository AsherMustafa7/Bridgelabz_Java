package com.asher.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello3")
public class HelloServlet3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<h1>This is a GET request!</h1>");
        out.println("<p>We are retrieving information.</p>");
    }
    // we wont be able to test the post request cause we need a form
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<h1>This is a POST request!</h1>");
        out.println("<p>We have submitted information.</p>");
    }
}
