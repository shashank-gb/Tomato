
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author prajwal
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import model.Reg;
import model.locIdLocCity;
import model.locationDetails;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // type of the response sent to the client or browser
        
        HttpSession session = request.getSession();
        Reg reg = new Reg(session);
        locationDetails locDetails = new locationDetails(session);
        try {
            if (request.getParameter("login") != null) {
                String email = request.getParameter("email");
                String pass = request.getParameter("pd");
                String status = reg.login(email, pass);
                if (status.equals("success")) {

                    RequestDispatcher rd1 = request.getRequestDispatcher("restanurnt.jsp");

                    rd1.forward(request, response);

                } else if (status.equals("failure")) {
                    request.setAttribute("status", "Login failed");
                    RequestDispatcher rd1 = request.getRequestDispatcher("index_1.jsp");
                    rd1.forward(request, response);
                }
            } else if (request.getParameter("apply") != null) {

                String name = request.getParameter("name");
                String Email1 = request.getParameter("email1");
                String city = request.getParameter("CITY");
                String vehicle = request.getParameter("vehicle");
                String password = request.getParameter("pw1");
                
                reg.sendReqAdm(name, Email1, city, vehicle,password);
                request.getRequestDispatcher("notification.jsp").forward(request, response);
            } else if (request.getParameter("ressubmit") != null) {

                String email = request.getParameter("emails");
                String password = request.getParameter("passwords");
                String name = request.getParameter("names");
                String go =reg.Reghotel(name, email, password);
                if(go=="existed"){
                  request.getRequestDispatcher("index_1.jsp").forward(request, response);  
                }
                   
                request.getRequestDispatcher("notification.jsp").forward(request, response);

            } 
            else if(request.getParameter("restsubmit") != null){
                String pref=null;
                String owner_name =request.getParameter("owner_name");
                String contact_number = request.getParameter("contact_number");
                String restaurant_city = request.getParameter("restaurant_city");
                String state = request.getParameter("state");
                String GSTIN = request.getParameter("GSTIN");
                String address = request.getParameter("Complete_Address");
                if(request.getParameter("pref").equals("veg")) pref="V";
                else if(request.getParameter("pref").equals("nonveg")) pref="N";
                else pref="B";
                
                System.out.println(owner_name+" "+contact_number+" "+restaurant_city+" "+state+" "+GSTIN+" "+address+" "+pref);
                reg.hotelreglast(owner_name,contact_number,restaurant_city,GSTIN,address,pref);
                request.getRequestDispatcher("restaurantfood.jsp").forward(request, response);
            }
            else if(request.getParameter("confirmfood")!= null){
                
                String f_name = request.getParameter("f_name");
                String pref = request.getParameter("preferences");
                String cost = request.getParameter("cost");
                double costs =Integer.parseInt(cost);
                String descrption = request.getParameter("desc");
                System.out.println("Result is: "+costs);
                reg.addnewfood(f_name,pref,costs,descrption);
                request.getRequestDispatcher("Alterfood.jsp").forward(request, response);
                
                
            }
            else if (request.getParameter("deliverylogin")!=null){
                String email = request.getParameter("email");
                String pass=request.getParameter("pd");
                
                reg.logindeliveries(email,pass);
            }
                else if (request.getParameter("signin") != null) {

                String email = request.getParameter("email");
                String pass = request.getParameter("password");

                String[] go = reg.reslogin(email, pass);
                
                if (go[0] == "yes") {
                    
                    ArrayList<locIdLocCity> cityNames = locDetails.getCityNames();
                    request.setAttribute("cityNames", cityNames);
                    
                    request.getRequestDispatcher(go[1]).forward(request, response);
                } else {
request.getRequestDispatcher("index_1.jsp").forward(request, response);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
