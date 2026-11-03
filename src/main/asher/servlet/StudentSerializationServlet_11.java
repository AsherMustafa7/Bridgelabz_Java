package com.asher.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletException;

@WebServlet("/student-serialize")
public class StudentSerializationServlet_11 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("application/json");
        Student_9 s= new Student_9();
        s.setName("Asher Mustafa");
        s.setEmail("ashermustafa7@gmail.com");
        s.setAge(23);
        
        ObjectMapper mp= new ObjectMapper();
        PrintWriter out = res.getWriter();
        mp.writeValue(out,s);
    }
}
