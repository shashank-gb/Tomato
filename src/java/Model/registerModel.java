/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */


public class registerModel {
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    HttpSession se;
    
    public enum Status{
        existed, success, failure
    };

    public registerModel(HttpSession hs) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "root");
            
            se = hs;
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        }
    }
    
    public Status Register(String name,String email, String pw) {
        
        Status status = null;
        
        try {
            
            InputStream default_profile = new FileInputStream("D:/projects/Java/Tomato/web/images/profile.webp");
            
            st = con.createStatement();
            rs = st.executeQuery("select * from user_register where email='" + email + "' or username = '"+name+"';");
            
            if (rs.next()) {
                
                status = Status.existed;
                
            } else {
                
                ps = (PreparedStatement) con.prepareStatement("insert into user_register(uid, username, email, password, user_image) values(0,?,?,?,?);");
                
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, pw);
                ps.setBlob(4, default_profile);
                
                int a = ps.executeUpdate();
                if (a > 0) {
                    status = Status.success;
                } else {
                    status = Status.failure;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(status);
        return status;
    }
    
    public Status Login(String email, String pw){
        Status status = null;
        String uname = null;
        int uId;
        Blob profile = null;
        
        try{
            Statement st = null;
            ResultSet rs = null;
            
            st = con.createStatement();
            
            rs = st.executeQuery("SELECT uid,username, password, user_image FROM user_register WHERE email = '"+email+"' and password = '"+pw+"';");
            
            if(rs.next()){
                
                uname = rs.getString("username");
                uId = rs.getInt("uid");
                profile = rs.getBlob("user_image");
                byte profileArr[] = profile.getBytes(1, (int)profile.length());
                FileOutputStream fout = new FileOutputStream("D:/projects/Java/Tomato/web/images/profile.webp");
                fout.write(profileArr);
                
                System.out.println(uname);
                se.setAttribute("userId", uId);
                se.setAttribute("uname", uname);
                status  = status.success;
                
            }else{
                
                status = status.failure;
                
            }
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        System.out.println(status);
        return status;
    }
}
