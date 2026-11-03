package com.asher.servlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletException;



@WebServlet(
    urlPatterns = "/student-config",
    initParams = {
        @WebInitParam(name = "department", value = "Computer Science"),
        @WebInitParam(name = "semester", value = "6")
    }
)
public class Servelt_Config_only_15 extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) throws IOException {

        String department = getServletConfig()
                .getInitParameter("department");

        String semester = getServletConfig()
                .getInitParameter("semester");

        res.setContentType("text/plain;charset=UTF-8");

        res.getWriter().println("Department: " + department);
        res.getWriter().println("Semester: " + semester);
    }
}