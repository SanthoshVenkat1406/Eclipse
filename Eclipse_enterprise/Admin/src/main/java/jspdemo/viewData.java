package jspdemo;
import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

 

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

 

@WebServlet("/viewData")

public class viewData extends HttpServlet {

    private static final long serialVersionUID = 1L;

 

    public viewData() {

        super();

    }

 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection con = null;

 

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

 

        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parts", "root", "Sandygavs@2001");

            System.out.println("Connection Established...");

        } catch (SQLException e) {

            e.printStackTrace();

        }

 

        try {

            PreparedStatement s = con.prepareStatement("select * from parts");

            ResultSet rs = s.executeQuery();

 

            PrintWriter out = response.getWriter();

 

            out.println("<html><body><h2>View of the Data</h2>");

            out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Colors</th></tr>");

 

            while (rs.next()) {

                int id = rs.getInt("P_id");

                String name = rs.getString("P_name");

                String color = rs.getString("Color");

 

                out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + color + "</td></tr>");

            }

 

            out.println("</table></body></html>");

 

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}