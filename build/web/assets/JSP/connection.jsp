<%-- 
    Document   : connection
    Created on : 21 Oct, 2020, 1:42:52 AM
    Author     : SHASHANKgb
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    try{
        
        String dbname = "tomato";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        
        Connection con = null;
        PreparedStatement ps= null;
        ResultSet rs = null;
        Statement st = null;

        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url+dbname, username , password);
  
        st = con.createStatement();
%>
