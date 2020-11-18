/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
public class orderSuccess {
    
    HttpSession se;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
        
    public orderSuccess(HttpSession session){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "root");
            se = session;
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public int storeOrder(String resId, String userId, String grandTot, String address){
        
        int rId = Integer.parseInt(resId);
        int uId = Integer.parseInt(userId);
        Double grandTotal = Double.parseDouble(grandTot);
        int id = 0;
        
        String[] generatedCol = {"ID"};
        String queryForOrders = "insert into orders values(0,?,?,10,?,?);";
        try{
            
            ps = con.prepareStatement(queryForOrders, generatedCol);
            
            ps.setInt(1, uId);
            ps.setInt(2, rId);
            ps.setDouble(3, grandTotal);
            ps.setString(4, address);
            
            ps.executeUpdate();
            
            rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                id = rs.getInt(1);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        return id;
    }
    
    public void storeOrderItemDetails(int oId, String cartItems){
        
        Gson gson = new Gson();
        Type listType = new TypeToken<List<cartItems>>(){}.getType();
        List<cartItems> cartItemsList = gson.fromJson(cartItems, listType);
        
        
        for(cartItems cartItem: cartItemsList){
            
            int fId = cartItem.getId();
            int qty = cartItem.getQty();
            Double cost = cartItem.getCost();
            
            String queryForOrderedItems = "insert into ordered_items values(0,?,?,?,?)";
            
            try{
                
                ps = con.prepareStatement(queryForOrderedItems);
                
                ps.setInt(1, oId);
                ps.setInt(2, fId);
                ps.setInt(3, qty);
                ps.setDouble(4, cost);
                
                ps.executeUpdate();
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
}
