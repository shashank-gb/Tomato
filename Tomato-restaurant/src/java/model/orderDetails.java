/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.servlet.http.HttpSession;

/**
 *
 * @author prajwal
 */
public class orderDetails {

    private Connection con;
    HttpSession se;
    Statement st = null;
    ResultSet rs = null;

    public orderDetails(HttpSession session) {
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tomato", "root", "");

            se = session;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<Integer, List<order>> getOrderDetails() {

        String query = "SELECT o.c_id,i.quantity,f.f_name,u.username,u.mob_no,o.del_address, o.o_id FROM orders o\n"
                + "JOIN ordered_items i ON o.o_id = i.o_id\n"
                + "JOIN food_details f ON i.f_id = f.f_id\n"
                + "JOIN user_register u ON u.uid = o.c_id\n"
                + "WHERE o.r_id = " + se.getAttribute("rid");
        List<order> orderList = new ArrayList<>();
        List<foodAndQty> foodAndQtyList = new ArrayList<>();

        Map<Integer, List<order>> map = null;
        Map<Integer, List<foodAndQty>> map1 = new HashMap<>();
        try {

            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                order ord = new order();
                ord.setQty(rs.getInt("quantity"));
                ord.setFoodName(rs.getString("f_name"));
                ord.setuName(rs.getString("username"));
                ord.setoId(rs.getInt("o_id"));
                ord.setPhoneNumber(rs.getString("mob_no"));
                ord.setAddress(rs.getString("del_address"));
                foodAndQty fQty = new foodAndQty();
                fQty.setFoodName(rs.getString("f_name"));
                fQty.setQuantity(rs.getInt("quantity"));
                orderList.add(ord);
                foodAndQtyList.add(fQty);
            }

//            Map<Integer, List<order>> map = orderList.stream()
//                    .sorted(Comparator.comparing(order::getoId))
//                    .collect(Collectors.groupingBy(ch -> ch.oId));
            map = new HashMap<>();
            for (foodAndQty ord : foodAndQtyList) {
                Integer key = ord.getOrderId();
                if (map1.containsKey(key)) {
                    List<foodAndQty> list = map1.get(key);
                    list.add(ord);
//                    System.out.println(list);
                }else{
                    List<foodAndQty> list = new ArrayList<>();
                    list.add(ord);
                    map1.put(key, list);
                    
                }
            }

            for (order ord : orderList) {
                Integer key = ord.getoId();
                if (map.containsKey(key)) {
                    List<order> list = map.get(key);
                    list.add(ord);
                } else {
                    List<order> list = new ArrayList<>();
                    list.add(ord);
                    map.put(key, list);
                }
            }

            for(Map.Entry<Integer, List<order>> o: map.entrySet()){
                for(order o1 : o.getValue()){
                    System.out.println(o.getKey()+" "+o1.getFoodName()+ " "+ o1.getQty());
                }
            }
//            for(Map.Entry<Integer, List<foodAndQty>> o: map1.entrySet()){
//                for(foodAndQty o1 : o.getValue()){
//                    System.out.println(o.getKey()+" "+o1.getFoodName()+ " "+ o1.getQuantity());
//                }
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }

}
