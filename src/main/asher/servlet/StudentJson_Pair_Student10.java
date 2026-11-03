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



@WebServlet("/StudentJacksonConversion")
public class StudentJson_Pair_Student10 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        req.setCharacterEncoding("UTF-8");

        ObjectMapper mp= new ObjectMapper();
        try(BufferedReader br= req.getReader())
        {
            // Deserialize JSON into a Student object
            Student_9 stdobj= mp.readValue(br,Student_9.class);
            System.out.println("Email of the Student : "+ stdobj.getEmail());
            System.out.println("Name of the Student : "+ stdobj.getName());
            System.out.println("Age of the Student : "+ stdobj.getAge());
        
            res.setContentType("text/plain;charset=UTF-8");
            res.setStatus(HttpServletResponse.SC_OK);
            PrintWriter out = res.getWriter();
            out.println("Student object was successfully deserialized");
            out.println("Email of the Student : "+ stdobj.getEmail());
            out.println("Name of the Student : "+ stdobj.getName());
            out.println("Age of the Student : "+ stdobj.getAge());
        }catch(Exception e)
        {
            PrintWriter outerr= res.getWriter();
            res.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            outerr.println("Exception From Asher Mustafa : "+ e.getMessage());
            System.out.println("This is a message from the Studentjson_Oain_Student_10 class that an exception ahs occured : "+ e.getMessage());
        }
       

    }
}
