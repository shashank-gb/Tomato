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
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
public class fetchFoodList {
    
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    HttpSession se = null;
    
    public fetchFoodList(HttpSession hs){
        
        try{

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "root");
                
                se = hs;

        }catch(Exception e){
            
            System.out.println(e);
            
        }
    }
    
    public ArrayList<foods> getAllFoods(String resName){
        
        ArrayList<foods> foodList = new ArrayList<>();
        
        try{
            String fType = null;
            String foodDetailsQuery = "SELECT * from food_details where r_id in (SELECT r.rid from restaurant r where rname = '"+resName+"');";
            System.out.println("SELECT * from food_details where r_id in (SELECT r.rid from restaurant r where rname = '"+resName+"');");
            st = con.createStatement();
            rs = st.executeQuery(foodDetailsQuery);
            
            while(rs.next()){
                foods food = new foods();
                
                food.setFoodName(rs.getString("f_name"));
                food.setFoodCost(rs.getDouble("cost"));
                food.setFoodDescription(rs.getString("description"));
                
                if(rs.getString("preference").equals("V")){
                    fType = "Veg";
                }else{
                    fType = "Non-veg";
                }
                
                food.setFoodPreference(fType);
                
                foodList.add(food);
            }
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        System.out.println(foodList);
        return foodList;
    }
    
}
