package com.asher.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/context-parameters")
public class ContextParameterServlet_14 extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res
    ) throws IOException {

        ServletContext context = getServletContext();

        String applicationName =
                context.getInitParameter("applicationName");

        String college =
                context.getInitParameter("college");

        res.setContentType("text/plain;charset=UTF-8");

        res.getWriter().println("Application: " + applicationName);
        res.getWriter().println("College: " + college);


        ObjectMapper mp = new ObjectMapper();
        BufferedReader br = req.getReader();
       
        Student_9 s1= (Student_9)mp.readValue(br, Student_9.class);
        // Store a Java object
        context.setAttribute("student", s1);

        // Retrieve that Java object
        Student_9 s = (Student_9) context.getAttribute("student");
        PrintWriter out = res.getWriter();
        out.println("Name: student : "+s.getName());
        out.println("Name: Email : "+s.getEmail());
        out.println("Name: Age : "+s.getAge());
    }
}