/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.fetchShopList;
import Model.shops;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SHASHANKgb
 */
@WebServlet(name = "Shops", urlPatterns = {"/Shops"})
public class fetchShopServer extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        fetchShopList fetchSL = new fetchShopList(session);
        
        try{

            ArrayList<shops> shopList = fetchSL.getAllShops();
            request.setAttribute("shopList", shopList);

            request.getRequestDispatcher("order-food.jsp").forward(request, response);

        }catch(Exception e){
            
            System.out.println(e);
            
        }
        
        
//        JSONObject json = new JSONObject();
//        JSONArray jArr = new JSONArray();
//        try {
//            if(request.getParameter("FetchShops") != null){
//
//                ArrayList<shops> shopList  = fetchSL.getAllShops();
//
//                if(shopList.size() > 0){
//
//                    Iterator<shops> iter = shopList.iterator();
//                    while(iter.hasNext()){
//
//
//
//                            shops shop = iter.next();
//                            JSONObject json1 = new JSONObject();
//                            json1.put("res_name", shop.getRes_name());
//                            json1.put("res_type", shop.getRes_type());
//                            jArr.put(json1);
//                            System.out.println(jArr);
//
//                        } 
//                        json.put("jsonarray", jArr);
//                        out.print(json);
//                        
//                    }else{
//                        
//                        json.put("jsonarray", "No data");
//                        out.print(json);
//                        
//                    }
//
//                }
//
//            }
//        catch (JSONException ex) {
//            Logger.getLogger(fetchShopServer.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
