package com.asher.servlet;



import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/setup")
public class Servelet_Context_ApplicationSetupServlet_16 extends HttpServlet {

    @Override
    public void init() {

        ServletContext context = getServletContext();

        context.setAttribute(
            "applicationName",
            "Student Management System"
        );

        context.setAttribute(
            "college",
            "SRMIST"
        );

        System.out.println("Application context configured!");
    }

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) throws IOException {

        res.setContentType("text/plain;charset=UTF-8");

        res.getWriter().println("Application setup completed.");
    }
}