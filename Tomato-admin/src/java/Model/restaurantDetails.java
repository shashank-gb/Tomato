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
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
public class restaurantDetails {

    Connection con;
    HttpSession se;
    Statement st;
    ResultSet rs;

    public restaurantDetails(HttpSession hs) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");

        } catch (Exception e) {
            System.out.println(e);
        }
        hs = se;
    }

    public Map<String,String> getResDetails(int resId) {

        String query = "SELECT r.*,l.city FROM restaurant r join location l on l.l_id = r.l_id where rid = "+resId+";";
        
        Map<String, String> resDetail = new LinkedHashMap<>();
        try {

            st = con.createStatement();    
            rs = st.executeQuery(query);
            
            String pref = null;
            
            while(rs.next()){
                
                pref = rs.getString("preference");
                if("V".equals(pref)){
                    pref = "Veg";
                }else{
                    pref = "Non-Veg";
                }
                
                resDetail.put("res-id", resId+"");
                resDetail.put("res-name", rs.getString("rname"));
                resDetail.put("owner-name", rs.getString("o_name"));
                resDetail.put("preference", pref);
                resDetail.put("city", rs.getString("city"));
                resDetail.put("state", "Karnataka");
                resDetail.put("address", rs.getString("address"));
                resDetail.put("gst", rs.getString("gst"));
                resDetail.put("contact", rs.getString("contact"));
                
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return resDetail;

    }
    
}
