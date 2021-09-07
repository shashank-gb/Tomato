/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prajwal
 */
public class fooddetails {
    HttpSession hs;
    Connection con;
    Statement st;
    ResultSet rs;
    
    public fooddetails(HttpSession se){
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        hs = se;
    }
    
    public ArrayList getfooddetails(){
        String query = "select * from food_details where r_id="+hs.getAttribute("rid")+";";
        ArrayList<getfoodsf> fooddetailsco=new ArrayList<>();
         try{
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()){
                getfoodsf getfoods = new getfoodsf();
                
                getfoods.setFood_id(rs.getInt("f_id"));
                getfoods.setF_name(rs.getString("f_name"));
                getfoods.setPreference(rs.getString("preference"));
                getfoods.setCost(rs.getDouble("cost"));
                getfoods.setDescription(rs.getString("description"));
                System.out.println(rs.getString("f_name"));
                fooddetailsco.add(getfoods);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        return fooddetailsco;
    }
}
