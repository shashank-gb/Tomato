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
public class locationDetails {
    
    HttpSession hs;
    Connection con;
    Statement st;
    ResultSet rs;
    
    public locationDetails(HttpSession se){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        hs = se;
    }
    
    public ArrayList getCityNames(){
        
        String query = "SELECT * FROM location;";
        ArrayList<locIdLocCity> cityList = new ArrayList<>();
        try{
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()){
                locIdLocCity locDetails = new locIdLocCity();
                
                locDetails.setId(rs.getInt("l_id"));
                locDetails.setCity(rs.getString("city"));
                
                cityList.add(locDetails);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    return cityList;
    }
    
}
