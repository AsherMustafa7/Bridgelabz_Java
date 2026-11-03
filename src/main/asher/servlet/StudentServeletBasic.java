package com.asher.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentBasic")
public class StudentServeletBasic extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        PrintWriter out = res.getWriter();

        out.println("Student Name : "+ name+ " Age : "+age);
        
    }
}