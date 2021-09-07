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
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
public class resAndDelReq {
    
    Connection con;
    HttpSession hs;
    Statement st;
    ResultSet rs;
    
    public resAndDelReq(HttpSession se){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
            
        }catch(Exception e){
            System.out.println(e);
        }
        hs = se;
    }
    
    public ArrayList getResRequests(int adminId){
        
        String query = "SELECT r.*,l.city FROM restaurant r\n" +
                       "JOIN location l ON l.l_id = r.l_id\n" +
                       "WHERE r.status = 'P' and l.city IN\n" +
                       "(SELECT city FROM location loc\n" +
                       "JOIN admin a ON a.l_id = loc.l_id WHERE aid = "+adminId+");";
        
        ArrayList<resAndDelPartner> resReqDetail = new ArrayList<>();
        
        try{
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()){
                
                resAndDelPartner resDel = new resAndDelPartner();
                
                resDel.setResId(rs.getInt("rid"));
                resDel.setResName(rs.getString("rname"));
                resDel.setResPreference(rs.getString("preference"));
                resDel.setResCity(rs.getString("city"));
                resDel.setResPinCode(rs.getInt("l_id"));
                resDel.setResOwner(rs.getString("o_name"));
                resDel.setResGST(rs.getString("gst"));
                resDel.setResContact(Long.parseLong(rs.getString("contact")));
                
                resReqDetail.add(resDel);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return resReqDetail;
    }
    
    public ArrayList getDelRequests(int adminId){
        
        String query = "SELECT d.*,l.city FROM delRequest d\n" +
                        "JOIN location l ON l.l_id = d.l_id\n" +
                        "WHERE d.status = 'P' and  l.city IN\n" +
                        "(SELECT city FROM location loc\n" +
                        "JOIN admin a ON a.l_id = loc.l_id WHERE aid = "+adminId+");";
        
        ArrayList<resAndDelPartner> delReqDetail = new ArrayList<>();
        
        try{
            
            st = con.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()){
                resAndDelPartner resDel = new resAndDelPartner();
                
                resDel.setDelId(rs.getInt("reqId"));
                resDel.setDelName(rs.getString("dp_name"));
                resDel.setDelEmail(rs.getString("email"));
                resDel.setDelCity(rs.getString("city"));
                resDel.setDelVehicle(rs.getString("vehichle"));
                
                delReqDetail.add(resDel);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return delReqDetail;
    }
    
}
