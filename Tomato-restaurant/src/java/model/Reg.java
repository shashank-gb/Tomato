/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author prajwal
 */
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class Reg {

    private Connection con;
    HttpSession se;
     Statement st = null;
     ResultSet rs = null;

    public Reg(HttpSession session) {
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
            se = session;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public String Reghotel( String name ,String email, String password) {
        
        String status = "";
        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();
           
            rs = st.executeQuery("select * from restaurant where email='" + email + "';");
            
            boolean b = rs.next();
            if (b) {
                status = "existed";
               
            } else {
               st.executeUpdate("insert into restaurant(email, password,rname) values('"+email+"','"+password+"','"+name+"');"); 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


 

    public String login(String email, String pass) {
        String status1 = "", id = "";
        String name = "", emails = "";

        try {
           
            st = con.createStatement();

            rs = st.executeQuery("select * from sookshmas1 where email='" + email + "' and password='" + pass + "';");
            boolean b = rs.next();
            if (b == true) {
                id = rs.getString("slno");
                name = rs.getString("name");
                se.setAttribute("uname", name);
                se.setAttribute("id", id);
                status1 = "success";
            } else {
                status1 = "failure";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status1;
    }
    public String logindeliveries(String email , String password){
        String pass=null;
        try{
            System.out.println("go");
         st = con.createStatement();
         rs=st.executeQuery("select * from delrequest where email='" + email + "' and password='" + password + "';");
         boolean b =rs.next();
         if(b==true){
             pass="sucess";
             System.out.println(pass);
         }
         else{
             pass="failure";
             System.out.println(pass);
         }
        }
        catch(Exception e){
            
        }
        return pass;
    }
  public void  sendReqAdm(String name, String email , String CITY , String vehicle,String pw1) {
      try{
          
            String query ="insert into delrequest(dp_name, email, city, vehichle,password) values('"+name+"','"+email+"','"+CITY+"','"+vehicle+"','"+pw1+"');";
            st = con.createStatement();
            st.executeUpdate(query);
               
      }
      catch(Exception e){
          e.printStackTrace();
      }
  }
  public String[] reslogin(String email , String password){
      
      String[] arr = new String[2];
      try{
         
         st = con.createStatement();
         rs=st.executeQuery("select * from restaurant where email='" + email + "' and password='" + password + "';");
         boolean b =rs.next();
         
         if(b==true){
            arr[0]="yes";
            se.setAttribute("rid", rs.getInt("rid"));
            se.setAttribute("uname",rs.getString("rname") );
            if(rs.getString("o_name")==null){
                arr[1]="restanurnt.jsp";
            }
            else{
                arr[1]="restaurantfood.jsp";
            }
         }
         else{
             System.out.println("false");
         }
        
      }
      catch(Exception e){
          System.out.println(e);
      }
      
      System.out.print(arr[0]+" "+arr[1]);
     return arr; 
  }
  public void addnewfood(String f_name,String pref,double cost, String descrption){
      try{
          
          st=con.createStatement();
          String query="insert into food_details (f_name,r_id,preference,cost,description) values('"+f_name+"',"+se.getAttribute("rid")+",'"+pref+"',"+cost+",'"+descrption+"');";
          st.executeUpdate(query); 

      }
      catch(Exception e){
          System.out.println(e); 
      }
  }
  public void deletefooditem(int fid ){
      try{
          st=con.createStatement();
          String query="delete from food_details where f_id="+fid;
          st.executeUpdate(query);
       }
      catch(Exception e){
          System.out.println(e);
  }
  }
  public void hotelreglast( String owner_name,String contact_number, String restaurant_city,String GSTIN, String address,String pref){
      try{
          st = con.createStatement(); 
          String query = "UPDATE restaurant SET preference = '"+pref+"',address='"+address+"',l_id= "+Integer.parseInt(restaurant_city)+",o_name='"+owner_name+"',gst='"+GSTIN+"',contact='"+contact_number+"' WHERE rid="+Integer.parseInt(se.getAttribute("rid").toString());
          st.executeUpdate(query);
      }
      catch(Exception e){
          System.out.println(e);
      }
  }
}

