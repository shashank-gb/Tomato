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

    public fetchFoodList(HttpSession hs) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "root");

            se = hs;

        } catch (Exception e) {

            System.out.println(e);

        }
    }
    
    public class restaurant {

        public String resName;
        public int resId;
        public String address;
        public char preference;
        public long pincode;
        public String city;
        
        public restaurant(String resName, char preference, long pincode, String address, String city){
            
            this.resName = resName;
            this.preference = preference;
            this.pincode = pincode;
            this.address = address;
            this.city = city;
        
            System.out.println(this.resName + " " + this.address + " " + this.pincode + " " + this.preference);
        }
        
        
        
    }

    public restaurant getRestaurantDetails(int resId) {
        
        restaurant res = null;
        try {
            String resDetailsQuery = "SELECT *,city from restaurant r inner join location l  on r.l_id = l.l_id where rid = "+resId+";";
            System.out.println(resDetailsQuery);
            
            st = con.createStatement();
            rs = st.executeQuery(resDetailsQuery);
            
            while (rs.next()) {
                
                String resName = rs.getString("rname");
                char preference = rs.getString("preference").charAt(0);
                long pincode = rs.getLong("l_id");
                String address = rs.getString("address");
                String city = rs.getString("city");
                
                res = new restaurant(resName, preference, pincode, address, city);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return res;
    }

    public ArrayList<foods> getAllFoods(String resName) {

        ArrayList<foods> foodList = new ArrayList<>();
        
        try {
            String fType = null;
            String foodDetailsQuery = "SELECT * from food_details where r_id in (SELECT r.rid from restaurant r where rname = '" + resName + "');";
            System.out.println("SELECT * from food_details where r_id in (SELECT r.rid from restaurant r where rname = '" + resName + "');");
            st = con.createStatement();
            rs = st.executeQuery(foodDetailsQuery);

            while (rs.next()) {
                foods food = new foods();

                food.setFoodId(rs.getInt("f_id"));
                food.setFoodName(rs.getString("f_name"));
                food.setFoodCost(rs.getDouble("cost"));
                food.setFoodDescription(rs.getString("description"));

                if (rs.getString("preference").equals("V")) {
                    fType = "Veg";
                } else {
                    fType = "Non-veg";
                }

                food.setFoodPreference(fType);

                foodList.add(food);
            }

        } catch (Exception e) {

            System.out.println(e);

        }
        System.out.println(foodList);
        return foodList;
    }

}

