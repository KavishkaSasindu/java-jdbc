package com.example.userform;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;

@WebServlet("/login")
public class LogInServlet extends HttpServlet {

    Connection conn = null;

    private static final String URL = "jdbc:mysql://localhost/details";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql";

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {

        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        pw.println(email+password);


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            pw.println(conn);
        } catch(Exception e){
            pw.println(e.getMessage());
        }


    }
}
