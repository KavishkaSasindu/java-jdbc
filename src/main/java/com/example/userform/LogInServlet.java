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

            String sql = "INSERT INTO user(email,password) VALUES (?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,email);
            stmt.setString(2,password);

            int rowsInsert = stmt.executeUpdate();

            if(rowsInsert>0){
                pw.println("User LoggedIn");
            }else{
                pw.println("Error Occur");
            }

        } catch(Exception e){
            e.printStackTrace();
            pw.println(e.getMessage());
        }


    }
}
