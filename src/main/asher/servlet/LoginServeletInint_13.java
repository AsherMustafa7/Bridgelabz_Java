package com.asher.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/login-config",
    initParams = {
        @WebInitParam(name = "adminName", value = "Asher"),
        @WebInitParam(name = "applicationName", value = "Student Portal")
    }
)
public class LoginServeletInint_13 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
    {

        String adminName = getServletConfig().getInitParameter("adminName");

        String applicationName = getServletConfig().getInitParameter("applicationName");

        res.setContentType("text/plain;charset=UTF-8");

        PrintWriter out = res.getWriter();

        out.println("Application: " + applicationName);
        out.println("Administrator: " + adminName);
    }
}