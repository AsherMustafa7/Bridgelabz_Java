package com.asher.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.annotation.WebServlet; // interface
import jakarta.servlet.http.HttpServlet; // abstract class
import jakarta.servlet.http.HttpServletRequest; // interface
import jakarta.servlet.http.HttpServletResponse;



 
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        


        String username= req.getParameter("username");
        String password= req.getParameter("password");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Login Form Submitted</h1>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password received successfully.</p>");


        
        
    }
}
