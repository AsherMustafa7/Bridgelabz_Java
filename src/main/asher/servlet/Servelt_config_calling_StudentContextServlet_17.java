package com.asher.servlet;



import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student-context")
public class Servelt_config_calling_StudentContextServlet_17 extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) throws IOException {

        ServletContext context = getServletContext();

        String applicationName =
            (String) context.getAttribute("applicationName");

        String college =
            (String) context.getAttribute("college");

        res.setContentType("text/plain;charset=UTF-8");

        res.getWriter().println("Application: " + applicationName);
        res.getWriter().println("College: " + college);
    }
}