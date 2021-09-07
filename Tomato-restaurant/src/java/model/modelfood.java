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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prajwal
 */
public class modelfood {
    private Connection con;
    HttpSession se;
    Statement st = null;
    ResultSet rs = null;
    
    public modelfood(HttpSession session){
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
           
            se = session;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
        public Map<String, String> getfooddetails(int fId, int rId){
            String query = "SELECT * FROM food_details WHERE f_id = "+fId+" and r_id = "+rId+";";
            
            Map<String, String> foodDetail = new LinkedHashMap<>();
            try{
                
                st = con.createStatement();
                rs= st.executeQuery(query);
                String pref = null;
                while(rs.next()){
                    
                    pref = rs.getString("preference");
                    if("V".equals(pref))pref="Veg";else pref="Non-veg";
                    
                    foodDetail.put("f-id",rs.getString("f_id") );
                    foodDetail.put("f-name",rs.getString("f_name"));
                    foodDetail.put("preference", pref);
                    foodDetail.put("cost", rs.getString("cost"));
                    foodDetail.put("description", rs.getString("description"));
                }
                
            }
            catch(Exception e){
                System.out.println(e);
            }
            return foodDetail;
        }
        
    
}

