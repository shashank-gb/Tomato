///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//import javax.servlet.http.HttpSession;
//
///**
// *
// * @author prajwal
// */
//public class orderDetails1 {
//    private Connection con;
//    HttpSession se;
//    Statement st = null;
//    ResultSet rs = null;
//    
//    public orderDetails1(HttpSession session ){
//         try {
//
//            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");
//           
//            se = session;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    
//    public void getOrderDetails(){
//        
//        String query = "SELECT o.c_id,i.quantity,f.f_name,u.username, o.o_id FROM orders o\n" +
//                       "JOIN ordered_items i ON o.o_id = i.o_id\n" +
//                       "JOIN food_details f ON i.f_id = f.f_id\n" +
//                       "JOIN user_register u ON u.uid = o.c_id\n" +
//                       "WHERE o.r_id = "+se.getAttribute("rid");
//        List<order> orderList = new ArrayList<>();
//        
//        try{
//            
//            st = con.createStatement();
//            rs = st.executeQuery(query);
//            
//            while(rs.next()){
//                order ord = new order();
//                ord.setQty(rs.getInt("quantity"));
//                ord.setFoodName(rs.getString("f_name"));
//                ord.setuName(rs.getString("username"));
//                ord.setoId(rs.getString("o_id"));
//                
//                
//                orderList.add(ord);
//            }
//            
//            Map<String, List<order>> orderGrouped;
//            orderGrouped = orderList.stream().collect(Collectors.groupingBy(w -> w.getoId()));
//            
//        }catch(Exception e){
//            System.out.println(e);
//        }
//        
//    }
//    
//}
