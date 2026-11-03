
package com.asher.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student-json")
public class StudentJsonServlet_8 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws IOException {

        // Tell the Servlet container that we expect JSON.
        req.setCharacterEncoding("UTF-8");

        // Read the incoming request body.
        StringBuilder jsonBody = new StringBuilder();

        try (BufferedReader reader = req.getReader()) {

            String line;

            while ((line = reader.readLine()) != null) {
                jsonBody.append(line);
            }
        }

        // Display the received JSON in Tomcat's console.
        System.out.println("Received JSON:");
        System.out.println(jsonBody);

        // Send a JSON response.
        res.setContentType("application/json;charset=UTF-8");
        res.setStatus(HttpServletResponse.SC_OK);

        PrintWriter out = res.getWriter();

        out.println(
    "{"
    + "\"status\": \"success\","
    + "\"message\": \"Student JSON received successfully\""
    + "}"
);
    }
}
