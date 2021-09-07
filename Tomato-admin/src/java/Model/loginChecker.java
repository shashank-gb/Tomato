/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
public class loginChecker {

    Connection con = null;
    HttpSession hs = null;

    public enum Status {
        success,failure;
    }

    public loginChecker(HttpSession se) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");

        } catch (Exception ex) {

            System.out.println(ex);
        }

        hs = se;
    }

    public Status checkLoginCredentials(String email, String password) {

        String query = "SELECT * FROM admin WHERE email = '"+email+"' and password = '"+password+"';";
        Status status = null;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {

                status = Status.success;
                
                hs.setAttribute("adminId", rs.getInt("aid"));
                hs.setAttribute("adminName", rs.getString("a_name"));
                
            }else{
                
                status = Status.failure;
                
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return status;
    }

}
