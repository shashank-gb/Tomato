/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
public class acceptReject {
 
    HttpSession hs;
    Connection con;
    Statement st;
    
    public enum Result{
        accept, reject, duplicate;
    }
    Result delResult, resResult;
    
    public acceptReject(HttpSession se){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
            
        }catch(Exception e){
            System.out.println(e);
        }
        hs = se;
    }
    
    public void rejectRes(int resId){
        
        String query = "UPDATE restaurant SET status = 'R' WHERE rid = "+resId+";";
        
        try{
               
            st = con.createStatement();
            st.executeUpdate(query);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public void acceptRes(int resId){
        
        String query = "UPDATE restaurant SET status = 'A' WHERE rid = "+resId+";";
        
        try{
            
            st = con.createStatement();
            st.executeUpdate(query);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public Result acceptDelPartner(int delPartnerId){
        String query = "UPDATE delrequest SET status = 'A' WHERE reqId = "+delPartnerId+";";
        
        try{
            
            st = con.createStatement();
            if(st.executeUpdate(query) > 0){
                delResult = Result.accept;
                System.out.println("Delivery Accepted");
            }
            return delResult;
            
        }catch(MySQLIntegrityConstraintViolationException e){
            System.out.println(e);
            rejectDelPartner(delPartnerId);
            delResult = Result.duplicate;
            System.out.println(delResult);
            return delResult;
            
        }catch(Exception e){
            System.out.println(e);
            return delResult;
        }
        
    }
    
    public Result rejectDelPartner(int delPartnerId){
        
        String query = "UPDATE delrequest SET status = 'R' WHERE reqId = "+delPartnerId+";";
        
        try{
            
            st = con.createStatement();
            if(st.executeUpdate(query) > 0){
                delResult = Result.reject;
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(delResult);
        return delResult;
    }
}
