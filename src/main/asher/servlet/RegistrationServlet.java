package com.asher.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;



@WebServlet("/RegistrationFormFilling")
public class RegistrationServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)  throws IOException
    {
        res.setContentType("text/html");
        String name = req.getParameter("StudentName");
        String email= req.getParameter("StudentEmail");
        String age= req.getParameter("StudentAge");
        PrintWriter out = res.getWriter();
        if(name==null||name.isBlank()|| email==null||email.isBlank()|| age==null||age.isBlank())
        {
            res.setStatus(400);
            out.println("<h1>BAD REQUEST</h1>");
            out.println("<p>All Values are to be provided.</p>");
            return;
        }
        // -------------------------------------------------------------------
        int studentage;
        try
        {
            studentage= Integer.parseInt(age);
            if(studentage<0)
            {
                throw new NumberFormatException();
            }
        }
        catch(NumberFormatException e)
        {
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);

            out.println("<h1>400 - INVALID AGE</h1>");
            out.println("<p>Please enter a valid positive age.</p>");

            return;
        }
        // -------------------------------------------------------------------
        res.setStatus(200);
        out.println("<h1>The request is successfull 200</h1>");
        out.println("Name: " +name);
        out.println("Email: " +email);
        out.println("Age: " +age);

        
    }
}
