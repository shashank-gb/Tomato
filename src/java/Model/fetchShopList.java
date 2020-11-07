/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
/**
 *
 * @author SHASHANKgb
 */
public class fetchShopList {
    
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    HttpSession se = null;
    
    public fetchShopList(HttpSession hs){
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "root");
            
            se = hs;
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public  ArrayList<shops> getAllShops() {
        
        ArrayList<shops> shopList = new ArrayList<shops>();
        
        try{
            String resType = null;
            String resDetailsQuery = "SELECT r.rid, r.rname, r.preference, min(cost) as minCost, city FROM restaurant r INNER JOIN food_details f INNER JOIN location l ON r.rid = f.r_id and r.l_id = l.l_id GROUP BY r.rname";
            
            st = con.createStatement();
            rs = st.executeQuery(resDetailsQuery);
            
            while(rs.next()){
                
                double value = (Math.random() * (5 - 4)) + 4;
                DecimalFormat df = new DecimalFormat("#.#");
                String rating = df.format(value);
                
                shops shop = new shops();
                
                shop.setRes_id(rs.getInt("rid"));
                shop.setRes_name(rs.getString("rname"));
                
                if(rs.getString("preference").equals("V")){
                    resType = "Veg";
                }else{
                    resType = "Non-Veg";
                }
                shop.setRes_type(resType);
                shop.setMin_cost(rs.getDouble("minCost"));
                shop.setLocation(rs.getString("city"));
                shop.setRating(rating);
                
                shopList.add(shop);
                
            }
            
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        return shopList;
    }
    
}
