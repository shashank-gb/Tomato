/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prajwal
 */
public class acceptOrder {

    private Connection con;
    HttpSession se;
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null, rs1 = null;

    public acceptOrder(HttpSession session) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");

            se = session;

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void addToAcceptOrder(String oId) {
        try {
            String query = "INSERT INTO orders_accepted VALUES (0,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, oId);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public boolean checkForDone(int oId){
        boolean status = true;
        try{
            String query = "SELECT * FROM orders_accepted WHERE o_id = "+oId+";";
            st = con.createStatement();
            rs = st.executeQuery(query);
            if(rs.next()){
                status = false;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return status;
    }

    public String checkResStatus(int rId){
        String status = "pending";
        try{
            
            String query = "SELECT * from restaurant WHERE rid = "+rId+" AND status = 'A';";
            String query1 = "SELECT * from restaurant WHERE rid = "+rId+" AND status = 'R';";
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            if(rs.next()){
                System.out.println("hey");
                status = "accept";
            }
            rs1 = st.executeQuery(query1);
            if(rs1.next()){
                System.out.println("hey1");
                status = "reject";
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return status;
    }
    
}
