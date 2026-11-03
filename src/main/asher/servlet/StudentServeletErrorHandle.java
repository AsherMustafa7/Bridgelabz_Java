package com.asher.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentErrorHandle")
public class StudentServeletErrorHandle extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        String name= req.getParameter("name");
        String age = req.getParameter("age");
        PrintWriter out = res.getWriter();
        if(name== null || name.isBlank() || age == null || age.isBlank())
        {
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            out.println("<h1>400 - Bad Request</h1>");
            out.println("<p>Name and Age both are required</p>");
            return;
        }
        res.setStatus(HttpServletResponse.SC_OK);

        out.println("<h1>Student Details</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Age: " + age + "</p>");
    }
}
