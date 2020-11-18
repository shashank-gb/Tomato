/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.cartItems;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.json.Json;
import javax.json.JsonReaderFactory;
import javax.servlet.http.HttpSession;
/**
 *
 * @author SHASHANKgb
 */

@WebServlet(name = "Verify", urlPatterns = {"/Verify"})
public class cartServer extends HttpServlet {
    JsonReaderFactory readerFactory = Json.createReaderFactory(null);
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession se = request.getSession();
        try{
            
            String jsonString = request.getParameter("cartItems");
            String resId = request.getParameter("resId");
            String resName = request.getParameter("resName");
            System.out.println(jsonString);
            
            Gson gson = new Gson();
            String jsonOutput = jsonString;
            java.lang.reflect.Type listType = new TypeToken<List<cartItems>>(){}.getType();
            List<cartItems> cartItemsList = gson.fromJson(jsonOutput, listType);
            
            request.setAttribute("resId", resId);
            request.setAttribute("resName", resName);
            request.setAttribute("jsonString", jsonString);
            request.setAttribute("cartItemsList", cartItemsList);
            
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
            
        }catch(Exception e){
            System.out.println(e);
        }
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