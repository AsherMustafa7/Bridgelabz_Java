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

import com.fasterxml.jackson.core.JsonProcessingException;


@WebServlet("/student-error")
public class StudentJsonErrorServlet_12 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        ObjectMapper mp = new ObjectMapper();
        BufferedReader br= req.getReader();
        PrintWriter out = res.getWriter();
        try
        {
            
            Student_9 s = mp.readValue(br,Student_9.class);
            res.setStatus(HttpServletResponse.SC_OK);
            mp.writeValue(out, s);
        }
        catch(JsonProcessingException e)
        {
            res.setStatus(400);
            out.println("WEll this is the out.println wala: {\"error\":\"Invalid JSON format\",\"message\":\"Please send valid JSON.\"}");
            out.write("WEll this is the out.write wala: {\"error\":\"Invalid JSON format\",\"message\":\"Please send valid JSON.\"}");

        }
    }
}
